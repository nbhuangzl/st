<template>
  <div class="stock-k-line-container">
    <div v-for="item in stockNids" :key="item" class="stock-item">
           <!-- 图片下方的按钮组 -->
      <div class="button-group">
        <button @click="openDetailPage(item, 'day')">K线图</button>
        <button @click="openDetailPageFin(item, 'week')">利润表</button>

      </div>

            <div class="button-group">
        <button @click="collectPctMore(item)" > 多涨</button>
        <button @click="collectPctOne(item)" > 1涨</button>
                <button @click="collectDaliang(item)" > 首放量</button>
             <button @click="collectShape(item)" > 形态</button>
        <button @click="collectQiaoqiao(item)" > 慢慢涨</button>
        
      </div>
      <div >
          <button @click="collectST(item)" > ST</button>
          <button @click="collectBKGas(item)" > 燃气</button>
          <button @click="collectBKCell(item)" >电池</button>
          <button @click="collectBKElectric(item)" > 电力</button>
          <button @click="collectBKChemical(item)" > 化学品</button>   
          <button @click="collectBKChemicalraw(item)" >化学原料</button>    
          <button @click="collectBKCoal(item)" >煤炭</button>
          <button @click="collectBKPhotovoltaic(item)" >光伏电池</button>  
          <button @click="collectBKPhotovoltaicpowergeneration(item)" >光伏发电</button>  
           
 

      </div>
       <div  >
             <button @click="collectBKDatacenter(item)" >数据中心</button>
             <button @click="collectBKBond(item)" >证券</button>
             <button @click="collectBKBank(item)" >银行</button>
             <button @click="collectBKNonBank(item)" > 非银行金融</button>
        </div>
        <div  >
    
          <button @click="collectBKEducation(item)" >教育</button>
              <button @click="collectBKBroadcast(item)" > 广播电视</button>
          <button @click="collectBKEntertainment(item)" >文娱</button>
          <button @click="collectBKPaper(item)" > 造纸印刷</button>
        </div>
        <div  >
            <button @click="collectBKSteel(item)" > 钢铁</button>
            <button @click="collectBKCeramics(item)" > 陶瓷</button>
            <button @click="collectBKCommercialproperties(item)" > 商业物业管理</button>
            <button @click="collectBKGlass(item)" >玻璃</button>
            <button @click="collectBKBuild(item)" > 房产开发</button>
       
        </div>
    <div  >
          <button @click="collectBKRealestateservices(item)" >房产服务</button>
            <button @click="collectBKInfrastructure(item)" > 基础建设</button>
            <button @click="collectBKOtherbuildingmaterials(item)" > 其他建材</button>
            <button @click="collectBKBuildingconstruction(item)" > 建筑施工</button>
            <button @click="collectBKLightindustry(item)" >其他轻工</button>
            <button @click="collectBKDecoration(item)" >装饰</button>
    </div>
        <div  >
          <button @click="collectBKMaterial(item)" >新材料</button>
          <button @click="collectBKEquipment(item)" > 电子器件</button>

      
         
          <button @click="collectBKSemiconductor(item)" > 半导体</button>
         
       
    </div>
      <div  >

              <button @click="collectBKFood(item)" > 食品</button>
          <button @click="collectBKTour(item)" > 旅游</button>

          <button @click="collectBKEnvironment(item)" > 环保</button>
          
            
           
      </div>
      <div  >
                  <button @click="collectBKPesticide(item)" > 农药</button>
                           <button @click="collectBKAgriculture(item)" > 农业</button>
                           <button @click="collectBKTree(item)" > 林业</button>
          <button @click="collectBKSale(item)" > 零售，电商</button>
          
  
          
           
      </div>
      <div>
          <button @click="collectBKOther(item)" > 综合</button>
    
            
      </div>
      <div>

         <button @click="collectBKCommunication(item)" > 通信设备</button>
         <button @click="collectBKElequpiment(item)" > 输变电</button>
         <button @click="collectBKSpecialequpiment(item)" > 专用设备</button>
         <button @click="collectBKElectronicequipment(item)" >电子设备</button>
         <button @click="collectBKCommonequipment(item)" > 通用设备</button>
           <button @click="collectBKCNC(item)" > 数控机床</button>
      </div>
      <div>

        <button @click="collectBKAviationequipment(item)" >航空装备</button>
      </div>
    <div>
      <button @click="collectBKMilitaryindustry(item)" >军工</button>
      <button @click="collectBKPowerequipment(item)" >电源设备</button>
         
       
         <button @click="collectBKBearing(item)" > 轴承</button>
      
    </div>
      <div>
     
       <button @click="collectBKComputer(item)" > 互联网，传媒</button>
                  <button @click="collectBKMedium(item)" >媒体,游戏</button>
            <button @click="collectBKSoftware(item)" > 计算机软件</button>
                     <button @click="collectBKComputerhardware(item)" > 计算机硬件</button>   
                     <button @click="collectBKSatellite(item)" >卫星应用</button>   
                       
      </div>

      <div> <button @click="collectBKClothes(item)" > 服饰</button>
              <button @click="collectBKSyntheticfibersresins(item)" >纤维树脂</button>
        <button @click="collectBKWeave(item)" > 纺织</button>
        <button @click="collectBKSmallhome(item)" > 小家电</button>
        <button @click="collectBKConsumerelectronics(item)" > 消费电子</button>

         <button @click="collectBKLeisureservices(item)" >休闲服务</button>

      </div>
      <div>
 
        <button @click="collectBKPreciousmetal(item)" >贵金属</button>
                   <button @click="collectBKMetal(item)" >稀有金属</button>
                         <button @click="collectBKBasicmetal(item)" >基本金属</button>
      <button @click="collectBKMetalprd(item)" >金属制品</button>

         <button @click="collectBKElectricalmachinery(item)" >电机</button>
      </div>
           <div>
         <button @click="collectBKWine(item)" >酒水</button>
      
                 <button @click="collectBKMedicine(item)" > 医药商业</button>
                 <button @click="collectBKMedicalservice(item)" >医疗服务</button>
               <button @click="collectBKMedicalequipment(item)" > 医疗器械</button>
          <button @click="collectBKChemicalpharmaceuticals(item)" >化学制药</button>
          <button @click="collectBKBiopharmaceuticals(item)" >生物医药</button>
          <button @click="collectBKChinesemedicine(item)" >中药</button>

      </div>
    <div>
      <button @click="collectBKMarketingservices(item)" >营销服务</button>

      <button @click="collectBKBeverage(item)" >饮料</button>
      <button @click="collectBKHomefurnishing(item)" >家居</button>
      
        <button @click="collectBKAnimalhusbandry(item)" >畜牧业</button>

         <button @click="collectBKFishing(item)" >渔业</button>


    </div>
    <div>
       <button @click="collectBKPreciousli(item)" >稀有金属-锂</button>
       <button @click="collectBKBasicmetaltong(item)" >基本金属-铜</button>
       <button @click="collectBKRobot(item)" >机器人</button>
   
       
       <button @click="collectBKJewelry(item)" >首饰</button>

       <button @click="collectBKBasicMetalxi(item)" >锡</button>
       
    </div>
 
        <div>
             <button @click="collectBKCar(item)" > 汽车</button>
           <button @click="collectBKTrade(item)" > 贸易</button>
            <button @click="collectBKRubber(item)" > 橡胶制品</button>
          <button @click="collectBKTransport(item)" > 航空</button>
          <button @click="collectBKPort(item)" > 港口</button>
              <button @click="collectBKLogistics(item)" > 物流</button>
                 
          <button @click="collectBKRoad(item)" >公路铁路</button>
             
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
'000652','000711','000716','000737','000856','000863','002042','002140','002157','002173','002201','002459','600207','600408','603378'

//'002063','002065','002066','002072','002077','002079','002086','002093','002095','002097','002103','002104','002106','002115','002117','002119','002123','002129','002130','002137','002148','002152','002169','002174','002177','002178','002181','002183','002184','002185','002189','002193','002194','002195','002199','002201','002205','002210','002211','002212','002214','002229','002231','002232','002235','002238','002243','002246','002247','002248','002253','002261','002263','002265','002268','002272','002278','002279','002281','002290','002291','002296','002298','002309','002313','002316','002319','002331','002335','002336','002339','002343','002346','002347','002348','002351','002354','002355','002356','002366','002368','002369','002373','002376','002377','002380','002383','002387','002388','002389','002401','002405','002406','002410','002413','002414','002418','002423','002425','002426','002431','002436','002438','002446','002449','002456','002457','002459','002467','002474','002486','002490','002491'
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