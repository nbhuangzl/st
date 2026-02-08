<template>
  <div class="stock-k-line-container">
    <div v-for="item in stockNids" :key="item" class="stock-item">
           <!-- 图片下方的按钮组 -->
      <div class="button-group">
        <button @click="openDetailPage(item, 'day')">K线图1</button>
        <button @click="openDetailPageFin(item, 'week')">利润表</button>

      </div>

            
       
        

       
          
      <img :src="getImageUrl(item)" alt="Stock K-Line" class="k-line-image"  @click="openDetailPageImg(item)" />

    </div>
  </div>
</template>

<script setup>
import { ref } from 'vue';
import axios from 'axios'; // 引入axios进行HTTP请求
import { getToken } from '@/utils/auth'

const baseURL = import.meta.env.VITE_APP_BASE_API



const stockNids = ref([

// 关注
'000533','002201','002140','002157','000633','600493',

 '002383', 
 '002189',   
 '002885','000501',
'002083', 
'002173','002011','000665', '000586','002459','000863','000652',
'000678','000856',
'000881','000035',

'002644','002692','600008',
'600207','600333','600408','600816','603378','002600',
'600490','000716','000536','000737','000563',
'000711','000810','000037','000055','000420','000620',
'000630','000632','600207','600307',
'000821','600094','600928','000564','002042','002041',
'002729','000009','001210','603587','601121','002390','603233','003030',
'002458','002644'

 ]);

 
 

 

 

 
 
 

 

 
const favoriteStatus = ref({});
const isFavorite = (item) => {
  console.log(favoriteStatus)
  return favoriteStatus.value[item] === '0'
  
  }


const getImageUrl = (nid) => {
  let primaryUrl = "";
  // 0.000001
  //   return `https://webquotepic.eastmoney.com/GetPic.aspx?nid=0.${nid}&ImageType=kl`;
  // 1.600000
  if (nid.startsWith('00')) {
     primaryUrl = `https://webquotepic.eastmoney.com/GetPic.aspx?nid=0.${nid}&ImageType=kl`;
  } else {
     primaryUrl = `https://webquotepic.eastmoney.com/GetPic.aspx?nid=1.${nid}&ImageType=kl`;
  }
   
  return primaryUrl;
};

const openDetailPage = (nid, period) => {
  let baseUrl = "";
   if (nid.startsWith('00')) {
    baseUrl = 'https://quote.eastmoney.com/sz';
   } else {
    baseUrl = 'https://quote.eastmoney.com/sh';
   }

    let detailUrl = `${baseUrl}${nid}`+`.html#fullScreenChart`;
  window.open(detailUrl, '_blank');
};
 
const openDetailPageFin = (nid) => {
  const baseUrl = 'https://emweb.eastmoney.com/pc_extendf10/reportchart.html?code=';
  let detailUrl1 = "";
  if (nid.startsWith('00')) {
      detailUrl1 = `${baseUrl}${nid}.SZ&date=2024-06-30#/detail`;
  } else {
      detailUrl1 = `${baseUrl}${nid}.SH&date=2024-06-30#/detail`;
  }
  window.open(detailUrl1, '_blank');
};


const openDetailPageImg = (nid) => {
  const baseUrl = 'https://emweb.eastmoney.com/pc_extendf10/reportchart.html?code=';
  let detailUrl1 = "";
  if (nid.startsWith('00')) {
      detailUrl1 = `${baseUrl}${nid}.SZ&date=2024-06-30#/detail`;
  } else {
      detailUrl1 = `${baseUrl}${nid}.SH&date=2024-06-30#/detail`;
  }
   
  window.open(detailUrl1, '_blank');
};





</script>

<style scoped>
.stock-k-line-container {
  display: flex;
  flex-wrap: wrap;
  gap: 10px;
}

.stock-item {
  display: flex;
  flex-direction: column;
  align-items: center;
}

.k-line-image {
  width: 100%;
  height: auto;
  cursor: pointer;
}

.button-group {
  display: flex;
  gap: 10px;
  margin-top: 10px;
  justify-content: left; /* 使按钮居中显示 */
}



button {
  padding: 3px 6px;
  font-size: 12px;
  cursor: pointer;
  /* background-color: white;   */
  border: 1px solid #ccc; /* 添加边框 */
  color: black; /* 设置文本颜色 */
}
button:hover {
  background-color: #f0f0f0; /* 鼠标悬停时的背景颜色 */
}
.is-favorite {
  background-color: green;
}

</style>