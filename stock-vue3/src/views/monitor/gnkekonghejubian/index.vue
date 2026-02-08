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

// 持仓股
'002611','600105' 

 ]);

const collectBKAviationequipment = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKAviationequipment', { tsCode: item }, {
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

const collectBKPhotovoltaicpowergeneration = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKPhotovoltaicpowergeneration', { tsCode: item }, {
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
const collectBKSatellite = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKSatellite', { tsCode: item }, {
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
const collectBKEntertainment = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKEntertainment', { tsCode: item }, {
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

const collectBKDatacenter = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKDatacenter', { tsCode: item }, {
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

const collectBKPort = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKPort', { tsCode: item }, {
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
const collectBKBearing = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKBearing', { tsCode: item }, {
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

const collectBKCNC = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKCNC', { tsCode: item }, {
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

const collectBKElectronicequipment = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKElectronicequipment', { tsCode: item }, {
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
const collectBKPowerequipment = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKPowerequipment', { tsCode: item }, {
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

const collectBKMilitaryindustry = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKMilitaryindustry', { tsCode: item }, {
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
const collectBKBasicMetalxi = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKBasicMetalxi', { tsCode: item }, {
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

const collectBKCell = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKCell', { tsCode: item }, {
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

const collectBKJewelry = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKJewelry', { tsCode: item }, {
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

const collectBKGlass = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKGlass', { tsCode: item }, {
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
const collectBKRealestateservices = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKRealestateservices', { tsCode: item }, {
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

const collectBKRobot = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKRobot', { tsCode: item }, {
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

const collectBKBasicmetaltong = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKBasicmetaltong', { tsCode: item }, {
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
const collectBKPreciousli = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKPreciousli', { tsCode: item }, {
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

const collectBKMedicalservice = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKMedicalservice', { tsCode: item }, {
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

const collectBKBeverage = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKBeverage', { tsCode: item }, {
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

const collectBKSyntheticfibersresins = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKSyntheticfibersresins', { tsCode: item }, {
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
const collectBKHomefurnishing = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKHomefurnishing', { tsCode: item }, {
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

		
const collectBKMetalprd = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKMetalprd', { tsCode: item }, {
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
const collectBKBasicmetal = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKBasicmetal', { tsCode: item }, {
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



const collectBKMarketingservices = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKMarketingservices', { tsCode: item }, {
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

const collectBKEducation = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKEducation', { tsCode: item }, {
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

const collectBKChinesemedicine = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKChinesemedicine', { tsCode: item }, {
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

const collectBKRoad = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKRoad', { tsCode: item }, {
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
const collectBKBiopharmaceuticals = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKBiopharmaceuticals', { tsCode: item }, {
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
const collectBKChemicalpharmaceuticals = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKChemicalpharmaceuticals', { tsCode: item }, {
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

const collectBKBank = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKBank', { tsCode: item }, {
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
const collectBKWine = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKWine', { tsCode: item }, {
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

const collectBKFishing = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKFishing', { tsCode: item }, {
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
const collectBKElectricalmachinery = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKElectricalmachinery', { tsCode: item }, {
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


const collectBKPhotovoltaic = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKPhotovoltaic', { tsCode: item }, {
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


const collectBKCoal = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKCoal', { tsCode: item }, {
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
const collectBKAnimalhusbandry = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKAnimalhusbandry', { tsCode: item }, {
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

const collectBKDecoration = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKDecoration', { tsCode: item }, {
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

const collectBKPreciousmetal = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKPreciousmetal', { tsCode: item }, {
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

const collectBKLightindustry = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKLightindustry', { tsCode: item }, {
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
const collectBKChemicalraw = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKChemicalraw', { tsCode: item }, {
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
const collectBKLeisureservices = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKLeisureservices', { tsCode: item }, {
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
const collectBKBond = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKBond', { tsCode: item }, {
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
const collectBKMedium = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKMedium', { tsCode: item }, {
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
const collectPctMore = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectPctMore', { tsCode: item }, {
      headers: {
        'Authorization': `Bearer ${token}` // 添加JWT Token到请求头
      }
    });
    favoriteStatus.value[item] = response.data;
  } catch (error) {
    if (error.response && error.response.status === 401) {
      console.error('认证失败，请检查你的认证信息。');
    } else {
      console.error('收藏失败:', error);
    }
  }
};
// 收藏股票的方法
const collectStockPctOne = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectPctOne', { tsCode: item }, {
      headers: {
        'Authorization': `Bearer ${token}` // 添加JWT Token到请求头
      }
    });
    favoriteStatus.value[item] = response.data;
  } catch (error) {
    if (error.response && error.response.status === 401) {
      console.error('认证失败，请检查你的认证信息。');
    } else {
      console.error('收藏失败:', error);
    }
  }
};
  // 收藏股票的方法
const collectDaliang = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectDaliang', { tsCode: item }, {
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
const collectST = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectSt', { tsCode: item }, {
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
const collectQiaoqiao = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectQiaoqiao', { tsCode: item }, {
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


  // 收藏股票的方法
const collectShape= async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectShape', { tsCode: item }, {
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

const collectBKMedicine= async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKMedicine', { tsCode: item }, {
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

const collectBKFood= async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKFood', { tsCode: item }, {
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
const collectBKBuild= async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKBuild', { tsCode: item }, {
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


const collectBKSemiconductor= async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKSemiconductor', { tsCode: item }, {
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

const collectBKComputer= async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKComputer', { tsCode: item }, {
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

const collectBKCar= async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKCar', { tsCode: item }, {
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



const collectBKTrade= async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKTrade', { tsCode: item }, {
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
const collectBKTransport= async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKTransport', { tsCode: item }, {
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

const collectBKElectric= async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKElectric', { tsCode: item }, {
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
const collectBKCommunication= async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKCommunication', { tsCode: item }, {
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


const collectBKMaterial= async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKMaterial', { tsCode: item }, {
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

const collectBKEquipment= async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKEquipment', { tsCode: item }, {
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

const collectBKEnvironment= async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKEnvironment', { tsCode: item }, {
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

const collectBKPaper= async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKPaper', { tsCode: item }, {
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

const collectBKOther= async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKOther', { tsCode: item }, {
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


const collectBKChemical= async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKChemical', { tsCode: item }, {
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


const collectBKSteel= async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKSteel', { tsCode: item }, {
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

const collectBKNonBank= async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKNonBank', { tsCode: item }, {
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

const collectBKSale= async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKSale', { tsCode: item }, {
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


const collectBKClothes= async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKClothes', { tsCode: item }, {
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




const collectBKPesticide= async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKPesticide', { tsCode: item }, {
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

const collectBKTree= async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKTree', { tsCode: item }, {
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

const collectBKBroadcast= async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKBroadcast', { tsCode: item }, {
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

const collectBKTour= async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKTour', { tsCode: item }, {
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
const collectBKElequpiment= async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKElequipment', { tsCode: item }, {
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

const collectBKSpecialequpiment= async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKSpecialequipment', { tsCode: item }, {
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

const collectBKCeramics = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKCeramics', { tsCode: item }, {
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


const collectBKCommonequipment = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKCommonequipment', { tsCode: item }, {
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

const collectBKLogistics = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKLogistics', { tsCode: item }, {
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

const collectBKComputerhardware = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKComputerhardware', { tsCode: item }, {
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


const collectBKAgriculture = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKAgriculture', { tsCode: item }, {
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

const collectBKMedicalequipment = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKMedicalequipment', { tsCode: item }, {
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
const collectBKGas = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKGas', { tsCode: item }, {
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

const collectBKSoftware = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKSoftware', { tsCode: item }, {
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




const collectBKInfrastructure = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKInfrastructure', { tsCode: item }, {
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

const collectBKOtherbuildingmaterials = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKOtherbuildingmaterials', { tsCode: item }, {
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

const collectBKCommercialproperties = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKCommercialproperties', { tsCode: item }, {
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

const collectBKRubber = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKRubber', { tsCode: item }, {
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

const collectBKBuildingconstruction = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKBuildingconstruction', { tsCode: item }, {
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


const collectBKMetal = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKMetal', { tsCode: item }, {
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

const collectBKWeave = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKWeave', { tsCode: item }, {
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

const collectBKConsumerelectronics = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKConsumerelectronics', { tsCode: item }, {
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


const collectBKSmallhome = async (item) => {
  try {
    const token = getToken(); // 获取JWT Token
    const response = await axios.post('/dev-api/common/stock/collectBKSmallhome', { tsCode: item }, {
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