<template>
  <div class="stock-k-line-container">
    <div v-for="item in stockNids" :key="item" class="stock-item">
           <!-- 图片下方的按钮组 -->
      <div class="button-group">
        <button @click="openDetailPage(item, 'day')">K线图</button>
        <button @click="openDetailPageFin(item, 'week')">利润表</button>
        <button @click="collectWaitback(item)" > 红利</button>
        <button @click="top(item)">top</button>
        <button @click="bottom(item)">bottom</button>
 
				 <button @click="moveup(item)">moveup</button>
         <button @click="collectZhuizong(item)" >跟踪</button>
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

const stockNids = ref([]);

const fetchStockNids = async () => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.get('/dev-api/common/stock/info/BKqitahuaxue', {
      headers: {
        'Authorization': `Bearer ${token}` // 添加JWT Token到请求头
      }
    });

    stockNids.value = response.data;
  } catch (error) {
    console.error('Failed to fetch stock NIDs:', error);
  }
};

onMounted(fetchStockNids);
const moveup= async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/moveUp', { tsCode: item }, {
      headers: {
        'Authorization': `Bearer ${token}` // 添加JWT Token到请求头
      }
    });
 
  } catch (error) {
    if (error.response && error.response.status === 401) {
      console.error('认证失败，请检查你的认证信息。');
    } else {
      console.error('收藏失败:', error);
    }
  }
}

const getImageUrl = (nid) => {

  let primaryUrl = "";
  // 0.000001
  //   return `https://webquotepic.eastmoney.com/GetPic.aspx?nid=0.${nid}&ImageType=kl`;
  // 1.600000
  if (nid.startsWith('00')) {
     console.log(nid.startsWith('00'))
     primaryUrl = `https://webquotepic.eastmoney.com/GetPic.aspx?nid=0.${nid}&ImageType=kl`;
  } else {
     primaryUrl = `https://webquotepic.eastmoney.com/GetPic.aspx?nid=1.${nid}&ImageType=kl`;
  }
  return primaryUrl;
};

const openDetailPage = (nid, period) => {
 
   
  const baseUrl = 'https://quote.eastmoney.com/'
  // const baseUrl = 'https://quote.eastmoney.com/sh';
  let detailUrl = "";
  if (nid.startsWith('00')) {
      detailUrl = `${baseUrl}`+'sz'+`${nid}`+`.html#fullScreenChart`;
  } else {
      detailUrl = `${baseUrl}`+'sh'+`${nid}`+`.html#fullScreenChart`;
  }
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



const collectZhuizong= async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectZhuizonghuaxuezhiping', { tsCode: item }, {
      headers: {
        'Authorization': `Bearer ${token}` // 添加JWT Token到请求头
      }
    });
 
  } catch (error) {
    if (error.response && error.response.status === 401) {
      console.error('认证失败，请检查你的认证信息。');
    } else {
      console.error('收藏失败:', error);
    }
  }
}
  // 收藏股票的方法
const collectWaitback = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectWaitback', { tsCode: item }, {
      headers: {
        'Authorization': `Bearer ${token}` // 添加JWT Token到请求头
      }
    });
 
  } catch (error) {
    if (error.response && error.response.status === 401) {
      console.error('认证失败，请检查你的认证信息。');
    } else {
      console.error('收藏失败:', error);
    }
  }
}

const top = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/collect/bkTop', { tsCode: item }, {
      headers: {
        'Authorization': `Bearer ${token}` // 添加JWT Token到请求头
      }
    });
    console.log(response.data);
  } catch (error) {
    if (error.response && error.response.status === 401) {
      console.error('认证失败，请检查你的认证信息。');
    } else {
      console.error('收藏失败:', error);
    }
  }
};
const bottom = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/collect/bkBottom', { tsCode: item }, {
      headers: {
        'Authorization': `Bearer ${token}` // 添加JWT Token到请求头
      }
    });
    console.log(response.data);
  } catch (error) {
    if (error.response && error.response.status === 401) {
      console.error('认证失败，请检查你的认证信息。');
    } else {
      console.error('收藏失败:', error);
    }
  }
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
  padding: 2px 6px;
  font-size: 12px;
  cursor: pointer;
  background-color: white; /* 设置按钮背景颜色为白色 */
  border: 1px solid #ccc; /* 添加边框 */
  color: black; /* 设置文本颜色 */
}
button:hover {
  background-color: #f0f0f0; /* 鼠标悬停时的背景颜色 */
}
</style>  
   
