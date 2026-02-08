<template>
  <div class="stock-k-line-container">
    <div v-for="item in stockNids" :key="item" class="stock-item">
           <!-- 图片下方的按钮组 -->
      <div class="button-group">
        <button @click="top(item)">top</button> 
        <button @click="openDetailPage(item, 'day')">K线图</button>
        <button @click="openDetailPageFin(item, 'week')">利润表</button>
        
        <button @click="collectWaitback(item)" > 红利</button>

        <button @click="delZhuizongny(item)">暂不追</button>

      </div>
      <!-- K线图显示区域 - 第一行 -->
      <div class="k-line-images-container">
        <!-- 5分钟K线 -->
        <!-- <div class="k-line-image-wrapper">
          <div class="k-line-title">5分钟</div>
          <img :src="getImageUrl(item, '5min')" alt="5分钟K线" class="k-line-image" @click="openDetailPageImg(item)" />
        </div> -->
        <!-- 60分钟K线 -->
        <!-- <div class="k-line-image-wrapper">
          <div class="k-line-title">60分钟</div>
          <img :src="getImageUrl(item, '60min')" alt="60分钟K线" class="k-line-image" @click="openDetailPageImg(item)" />
        </div> -->
        <!-- 日K线 -->
        <div class="k-line-image-wrapper">
          <div class="k-line-title">日K线</div>
          <img :src="getImageUrl(item, 'day')" alt="日K线" class="k-line-image" @click="openDetailPageImg(item)" />
        </div>
      </div>
      <!-- 第二行K线图 -->
      <!-- <div class="k-line-images-container"> -->
        <!-- 周K线 -->
        <!-- <div class="k-line-image-wrapper">
          <div class="k-line-title">周K线</div>
          <img :src="getImageUrl(item, 'week')" alt="周K线" class="k-line-image" @click="openDetailPageImg(item)" />
        </div> -->
        <!-- 月K线 -->
        <!-- <div class="k-line-image-wrapper">
          <div class="k-line-title">月K线</div>
          <img :src="getImageUrl(item, 'month')" alt="月K线" class="k-line-image" @click="openDetailPageImg(item)" />
        </div> -->
        <!-- 年K线 -->
        <!-- <div class="k-line-image-wrapper">
          <div class="k-line-title">年K线</div>
          <img :src="getImageUrl(item, 'year')" alt="年K线" class="k-line-image" @click="openDetailPageImg(item)" />
        </div> -->
      <!-- </div> -->
    </div>
  </div>
</template>

<script setup>
import { ref, onMounted } from 'vue';
import axios from 'axios'; // 引入axios进行HTTP请求
import { getToken } from '@/utils/auth'

const baseURL = import.meta.env.VITE_APP_BASE_API

const stockNids = ref([]);

// 获取年K线URL - 使用外部嵌入方式
const getYearlyKLineUrl = (nid) => {
  const market = nid.startsWith('00') ? 'sz' : 'sh';
  return `https://quotes.sina.cn/stock/timeline?symbol=${market}${nid}&page=kchart&timeframe=year1`;
};

const moveup= async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/moveUpZhuizongny', { tsCode: item }, {
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
const collectZhuizongny= async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectZhuizongny', { tsCode: item }, {
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

const delZhuizongny= async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/delZhuizongny', { tsCode: item }, {
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

 

const fetchStockNids = async () => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.get('/dev-api/common/stock/info/Zhuizongny', {
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

const getImageUrl = (nid, period = 'day') => {
  let primaryUrl = "";
  let marketPrefix = nid.startsWith('00') ? '0.' : '1.';
  
  // 根据周期确定参数
  if (period === '5min') {
    // 5分钟K线
    primaryUrl = `https://webquotepic.eastmoney.com/GetPic.aspx?nid=${marketPrefix}${nid}&imageType=r&EF=5`;
  } else if (period === '15min') {
    // 15分钟K线
    primaryUrl = `https://webquotepic.eastmoney.com/GetPic.aspx?nid=${marketPrefix}${nid}&imageType=r&EF=15`;
  } else if (period === '60min') {
    // 60分钟K线
    primaryUrl = `https://webquotepic.eastmoney.com/GetPic.aspx?nid=${marketPrefix}${nid}&imageType=r&EF=60`;
  } else if (period === 'day') {
    // 日K线
    primaryUrl = `https://webquotepic.eastmoney.com/GetPic.aspx?nid=${marketPrefix}${nid}&imageType=K`;
  } else if (period === 'week') {
    // 周K线
    primaryUrl = `https://webquotepic.eastmoney.com/GetPic.aspx?nid=${marketPrefix}${nid}&imageType=K&type=W`;
  } else if (period === 'month') {
    // 月K线
    primaryUrl = `https://webquotepic.eastmoney.com/GetPic.aspx?nid=${marketPrefix}${nid}&imageType=K&type=M`;
  } else if (period === 'year') {
    // 年K线 - 采用一个新方法，使用完全不同的API地址
    const marketCode = nid.startsWith('00') ? 'sz' : 'sh';
    primaryUrl = `https://image.sinajs.cn/newchart/v5/usstock/min_yearly/${marketCode}${nid}.gif`;
  } else if (period === 'macd') {
    // MACD技术指标
    primaryUrl = `https://webquotepic.eastmoney.com/GetPic.aspx?nid=${marketPrefix}${nid}&imageType=macd`;
  }
  
  console.log(`生成的URL(${period}): ${primaryUrl}`); // 添加日志输出URL
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


const cancelCollectStock = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/collect/delBKAgriculturalchemicalproducts', { tsCode: item }, {
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
const top = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectZhuizongny', { tsCode: item }, {
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
    const response = await axios.post('/dev-api/common/collect/bkBottomZhuizongny', { tsCode: item }, {
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
  margin-bottom: 20px;
  width: 100%;
}

.k-line-images-container {
  display: flex;
  flex-direction: row;
  gap: 10px;
  width: 100%;
  justify-content: space-between;
  margin-top: 10px;
}

.k-line-image-wrapper {
  display: flex;
  flex-direction: column;
  align-items: center;
  flex: 1;
}

.k-line-title {
  font-size: 14px;
  font-weight: bold;
  margin-bottom: 5px;
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

.k-line-iframe {
  width: 100%;
  height: 300px;
  border: none;
}
</style>  
   

