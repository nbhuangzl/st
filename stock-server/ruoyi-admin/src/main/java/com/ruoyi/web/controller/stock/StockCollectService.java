package com.ruoyi.web.controller.stock;

import com.ruoyi.system.domain.StockCollect;
import com.ruoyi.system.mapper.StockCollectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class StockCollectService {


    public void collectBKgaixingsuliao(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKgaixingsuliao(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKgaixingsuliao(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKgaixingsuliao(stockCollect);
        }
    }
    public String[] getBKgaixingsuliao() {
        return stockCollectMapper.selectBKgaixingsuliao();
    }
    public void delBKgaixingsuliao(String tsCode) { stockCollectMapper.delBKgaixingsuliao(tsCode); }



    public void collectBKhechenshuzhi(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKhechenshuzhi(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKhechenshuzhi(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKhechenshuzhi(stockCollect);
        }
    }
    public String[] getBKhechenshuzhi() {
        return stockCollectMapper.selectBKhechenshuzhi();
    }
    public void delBKhechenshuzhi(String tsCode) { stockCollectMapper.delBKhechenshuzhi(tsCode); }



    public void collectBKmucailiao(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKmucailiao(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKmucailiao(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKmucailiao(stockCollect);
        }
    }
    public String[] getBKmucailiao() {
        return stockCollectMapper.selectBKmucailiao();
    }
    public void delBKmucailiao(String tsCode) { stockCollectMapper.delBKmucailiao(tsCode); }




    public void collectBKmojumoliao(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKmojumoliao(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKmojumoliao(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKmojumoliao(stockCollect);
        }
    }
    public String[] getBKmojumoliao() {
        return stockCollectMapper.selectBKmojumoliao();
    }
    public void delBKmojumoliao(String tsCode) { stockCollectMapper.delBKmojumoliao(tsCode); }

    public void collectBKfuliao(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKfuliao(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKfuliao(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKfuliao(stockCollect);
        }
    }
    public String[] getBKfuliao() {
        return stockCollectMapper.selectBKfuliao();
    }
    public void delBKfuliao(String tsCode) { stockCollectMapper.delBKfuliao(tsCode); }



    public void collectBKyinran(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKyinran(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKyinran(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKyinran(stockCollect);
        }
    }
    public String[] getBKyinran() {
        return stockCollectMapper.selectBKyinran();
    }
    public void delBKyinran(String tsCode) { stockCollectMapper.delBKyinran(tsCode); }



    public void collectBKcuizhiyingyongsoftware(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKcuizhiyingyongsoftware(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKcuizhiyingyongsoftware(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKcuizhiyingyongsoftware(stockCollect);
        }
    }
    public String[] getBKcuizhiyingyongsoftware() {
        return stockCollectMapper.selectBKcuizhiyingyongsoftware();
    }
    public void delBKcuizhiyingyongsoftware(String tsCode) { stockCollectMapper.delBKcuizhiyingyongsoftware(tsCode); }



    public void collectBKtiyu(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKtiyu(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKtiyu(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKtiyu(stockCollect);
        }
    }
    public String[] getBKtiyu() {
        return stockCollectMapper.selectBKtiyu();
    }
    public void delBKtiyu(String tsCode) { stockCollectMapper.delBKtiyu(tsCode); }





    public void collectBKdipanyufadongjikui(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKdipanyufadongjikui(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKdipanyufadongjikui(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKdipanyufadongjikui(stockCollect);
        }
    }
    public String[] getBKdipanyufadongjikui() {
        return stockCollectMapper.selectBKdipanyufadongjikui();
    }
    public void delBKdipanyufadongjikui(String tsCode) { stockCollectMapper.delBKdipanyufadongjikui(tsCode); }



    public void collectBKshanyongzhaikeche(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKshanyongzhaikeche(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKshanyongzhaikeche(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKshanyongzhaikeche(stockCollect);
        }
    }
    public String[] getBKshanyongzhaikeche() {
        return stockCollectMapper.selectBKshanyongzhaikeche();
    }
    public void delBKshanyongzhaikeche(String tsCode) { stockCollectMapper.delBKshanyongzhaikeche(tsCode); }



    public void collectBKshanyongzhaihuoche(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKshanyongzhaihuoche(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKshanyongzhaihuoche(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKshanyongzhaihuoche(stockCollect);
        }
    }
    public String[] getBKshanyongzhaihuoche() {
        return stockCollectMapper.selectBKshanyongzhaihuoche();
    }
    public void delBKshanyongzhaihuoche(String tsCode) { stockCollectMapper.delBKshanyongzhaihuoche(tsCode); }



    public void collectBKcizhuandiban(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKcizhuandiban(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKcizhuandiban(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKcizhuandiban(stockCollect);
        }
    }
    public String[] getBKcizhuandiban() {
        return stockCollectMapper.selectBKcizhuandiban();
    }
    public void delBKcizhuandiban(String tsCode) { stockCollectMapper.delBKcizhuandiban(tsCode); }



    public void collectBKtongxingwangluoshebei(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKtongxingwangluoshebei(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKtongxingwangluoshebei(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKtongxingwangluoshebei(stockCollect);
        }
    }
    public String[] getBKtongxingwangluoshebei() {
        return stockCollectMapper.selectBKtongxingwangluoshebei();
    }
    public void delBKtongxingwangluoshebei(String tsCode) { stockCollectMapper.delBKtongxingwangluoshebei(tsCode); }



    public void collectBKtongxingzhongduanjipeijian(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKtongxingzhongduanjipeijian(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKtongxingzhongduanjipeijian(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKtongxingzhongduanjipeijian(stockCollect);
        }
    }
    public String[] getBKtongxingzhongduanjipeijian() {
        return stockCollectMapper.selectBKtongxingzhongduanjipeijian();
    }
    public void delBKtongxingzhongduanjipeijian(String tsCode) { stockCollectMapper.delBKtongxingzhongduanjipeijian(tsCode); }




    public void collectBKtongxingxianlanpeitao(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKtongxingxianlanpeitao(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKtongxingxianlanpeitao(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKtongxingxianlanpeitao(stockCollect);
        }
    }
    public String[] getBKtongxingxianlanpeitao() {
        return stockCollectMapper.selectBKtongxingxianlanpeitao();
    }
    public void delBKtongxingxianlanpeitao(String tsCode) { stockCollectMapper.delBKtongxingxianlanpeitao(tsCode); }

    public void collectBKtongxinggongchengjifuwu(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKtongxinggongchengjifuwu(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKtongxinggongchengjifuwu(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKtongxinggongchengjifuwu(stockCollect);
        }
    }
    public String[] getBKtongxinggongchengjifuwu() {
        return stockCollectMapper.selectBKtongxinggongchengjifuwu();
    }
    public void delBKtongxinggongchengjifuwu(String tsCode) { stockCollectMapper.delBKtongxinggongchengjifuwu(tsCode); }



    public void collectBKtongxingyingyongzengzhi(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKtongxingyingyongzengzhi(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKtongxingyingyongzengzhi(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKtongxingyingyongzengzhi(stockCollect);
        }
    }
    public String[] getBKtongxingyingyongzengzhi() {
        return stockCollectMapper.selectBKtongxingyingyongzengzhi();
    }
    public void delBKtongxingyingyongzengzhi(String tsCode) { stockCollectMapper.delBKtongxingyingyongzengzhi(tsCode); }


    public void collectBKhanghaizhuangbei(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKhanghaizhuangbei(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKhanghaizhuangbei(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKhanghaizhuangbei(stockCollect);
        }
    }
    public String[] getBKhanghaizhuangbei() {
        return stockCollectMapper.selectBKhanghaizhuangbei();
    }
    public void delBKhanghaizhuangbei(String tsCode) { stockCollectMapper.delBKhanghaizhuangbei(tsCode); }




    public void collectBKdimianbingzhuang(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKdimianbingzhuang(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKdimianbingzhuang(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKdimianbingzhuang(stockCollect);
        }
    }
    public String[] getBKdimianbingzhuang() {
        return stockCollectMapper.selectBKdimianbingzhuang();
    }
    public void delBKdimianbingzhuang(String tsCode) { stockCollectMapper.delBKdimianbingzhuang(tsCode); }




    public void collectBKbkhangkongzhuangbei(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKbkhangkongzhuangbei(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKbkhangkongzhuangbei(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKbkhangkongzhuangbei(stockCollect);
        }
    }
    public String[] getBKbkhangkongzhuangbei() {
        return stockCollectMapper.selectBKbkhangkongzhuangbei();
    }
    public void delBKbkhangkongzhuangbei(String tsCode) { stockCollectMapper.delBKbkhangkongzhuangbei(tsCode); }





    public void collectBKmianfang(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKmianfang(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKmianfang(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKmianfang(stockCollect);
        }
    }
    public String[] getBKmianfang() {
        return stockCollectMapper.selectBKmianfang();
    }
    public void delBKmianfang(String tsCode) { stockCollectMapper.delBKmianfang(tsCode); }




    public void collectBKdingzhijiaju(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKdingzhijiaju(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKdingzhijiaju(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKdingzhijiaju(stockCollect);
        }
    }
    public String[] getBKdingzhijiaju() {
        return stockCollectMapper.selectBKdingzhijiaju();
    }
    public void delBKdingzhijiaju(String tsCode) { stockCollectMapper.delBKdingzhijiaju(tsCode); }



    public void collectBKym(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKym(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKym(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKym(stockCollect);
        }
    }
    public String[] getBKym() {
        return stockCollectMapper.selectBKym();
    }
    public void delBKym(String tsCode) { stockCollectMapper.delBKym(tsCode); }


    public void collectBKguiliaoguipian(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKguiliaoguipian(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKguiliaoguipian(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKguiliaoguipian(stockCollect);
        }
    }
    public String[] getBKguiliaoguipian() {
        return stockCollectMapper.selectBKguiliaoguipian();
    }
    public void delBKguiliaoguipian(String tsCode) { stockCollectMapper.delBKguiliaoguipian(tsCode); }



    public void collectBKguangfufucai(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKguangfufucai(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKguangfufucai(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKguangfufucai(stockCollect);
        }
    }
    public String[] getBKguangfufucai() {
        return stockCollectMapper.selectBKguangfufucai();
    }
    public void delBKguangfufucai(String tsCode) { stockCollectMapper.delBKguangfufucai(tsCode); }



    public void collectBKguangfujiagongshebei(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKguangfujiagongshebei(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKguangfujiagongshebei(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKguangfujiagongshebei(stockCollect);
        }
    }
    public String[] getBKguangfujiagongshebei() {
        return stockCollectMapper.selectBKguangfujiagongshebei();
    }
    public void delBKguangfujiagongshebei(String tsCode) { stockCollectMapper.delBKguangfujiagongshebei(tsCode); }


    public void collectBKnengyuanjingshugu(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKnengyuanjingshugu(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKnengyuanjingshugu(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKnengyuanjingshugu(stockCollect);
        }
    }
    public String[] getBKnengyuanjingshugu() {
        return stockCollectMapper.selectBKnengyuanjingshugu();
    }
    public void delBKnengyuanjingshugu(String tsCode) { stockCollectMapper.delBKnengyuanjingshugu(tsCode); }



    public void collectBKgongjiao(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKgongjiao(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKgongjiao(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKgongjiao(stockCollect);
        }
    }
    public String[] getBKgongjiao() {
        return stockCollectMapper.selectBKgongjiao();
    }
    public void delBKgongjiao(String tsCode) { stockCollectMapper.delBKgongjiao(tsCode); }



    public void collectBKgaosugonglu(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKgaosugonglu(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKgaosugonglu(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKgaosugonglu(stockCollect);
        }
    }
    public String[] getBKgaosugonglu() {
        return stockCollectMapper.selectBKgaosugonglu();
    }
    public void delBKgaosugonglu(String tsCode) { stockCollectMapper.delBKgaosugonglu(tsCode); }



    public void collectBKhangkongyunshu(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKhangkongyunshu(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKhangkongyunshu(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKhangkongyunshu(stockCollect);
        }
    }
    public String[] getBKhangkongyunshu() {
        return stockCollectMapper.selectBKhangkongyunshu();
    }
    public void delBKhangkongyunshu(String tsCode) { stockCollectMapper.delBKhangkongyunshu(tsCode); }



    public void collectBKhangyun(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKhangyun(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKhangyun(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKhangyun(stockCollect);
        }
    }
    public String[] getBKhangyun() {
        return stockCollectMapper.selectBKhangyun();
    }
    public void delBKhangyun(String tsCode) { stockCollectMapper.delBKhangyun(tsCode); }




    public void collectBKshipin(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKshipin(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKshipin(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKshipin(stockCollect);
        }
    }
    public String[] getBKshipin() {
        return stockCollectMapper.selectBKshipin();
    }
    public void delBKshipin(String tsCode) { stockCollectMapper.delBKshipin(tsCode); }



    public void collectBKfuzhuang(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKfuzhuang(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKfuzhuang(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKfuzhuang(stockCollect);
        }
    }
    public String[] getBKfuzhuang() {
        return stockCollectMapper.selectBKfuzhuang();
    }
    public void delBKfuzhuang(String tsCode) { stockCollectMapper.delBKfuzhuang(tsCode); }




    public void collectBKjiafang(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKjiafang(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKjiafang(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKjiafang(stockCollect);
        }
    }
    public String[] getBKjiafang() {
        return stockCollectMapper.selectBKjiafang();
    }
    public void delBKjiafang(String tsCode) { stockCollectMapper.delBKjiafang(tsCode); }



    public void collectBKhuazp(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKhuazp(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKhuazp(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKhuazp(stockCollect);
        }
    }
    public String[] getBKhuazp() {
        return stockCollectMapper.selectBKhuazp();
    }
    public void delBKhuazp(String tsCode) { stockCollectMapper.delBKhuazp(tsCode); }



    public void collectBKbingxi(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKbingxi(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKbingxi(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKbingxi(stockCollect);
        }
    }
    public String[] getBKbingxi() {
        return stockCollectMapper.selectBKbingxi();
    }
    public void delBKbingxi(String tsCode) { stockCollectMapper.delBKbingxi(tsCode); }





    public void collectBKjiadianparts(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKjiadianparts(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKjiadianparts(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKjiadianparts(stockCollect);
        }
    }
    public String[] getBKjiadianparts() {
        return stockCollectMapper.selectBKjiadianparts();
    }
    public void delBKjiadianparts(String tsCode) { stockCollectMapper.delBKjiadianparts(tsCode); }



    public void collectBKmeatzhiping(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKmeatzhiping(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKmeatzhiping(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKmeatzhiping(stockCollect);
        }
    }
    public String[] getBKmeatzhiping() {
        return stockCollectMapper.selectBKmeatzhiping();
    }
    public void delBKmeatzhiping(String tsCode) { stockCollectMapper.delBKmeatzhiping(tsCode); }




    public void collectBKxiuxianshiping(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKxiuxianshiping(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKxiuxianshiping(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKxiuxianshiping(stockCollect);
        }
    }
    public String[] getBKxiuxianshiping() {
        return stockCollectMapper.selectBKxiuxianshiping();
    }
    public void delBKxiuxianshiping(String tsCode) { stockCollectMapper.delBKxiuxianshiping(tsCode); }





    public void collectBKyujiagongfood(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKyujiagongfood(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKyujiagongfood(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKyujiagongfood(stockCollect);
        }
    }
    public String[] getBKyujiagongfood() {
        return stockCollectMapper.selectBKyujiagongfood();
    }
    public void delBKyujiagongfood(String tsCode) { stockCollectMapper.delBKyujiagongfood(tsCode); }




    public void collectBKtiaoweiping(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKtiaoweiping(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKtiaoweiping(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKtiaoweiping(stockCollect);
        }
    }
    public String[] getBKtiaoweiping() {
        return stockCollectMapper.selectBKtiaoweiping();
    }
    public void delBKtiaoweiping(String tsCode) { stockCollectMapper.delBKtiaoweiping(tsCode); }



    public void collectBKbeer(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKbeer(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKbeer(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKbeer(stockCollect);
        }
    }
    public String[] getBKbeer() {
        return stockCollectMapper.selectBKbeer();
    }
    public void delBKbeer(String tsCode) { stockCollectMapper.delBKbeer(tsCode); }



    public void collectBKluming(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKluming(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKluming(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKluming(stockCollect);
        }
    }
    public String[] getBKluming() {
        return stockCollectMapper.selectBKluming();
    }
    public void delBKluming(String tsCode) { stockCollectMapper.delBKluming(tsCode); }




    public void collectBKqitawine(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKqitawine(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKqitawine(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKqitawine(stockCollect);
        }
    }
    public String[] getBKqitawine() {
        return stockCollectMapper.selectBKqitawine();
    }
    public void delBKqitawine(String tsCode) { stockCollectMapper.delBKqitawine(tsCode); }




    public void collectBKruanyinliao(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKruanyinliao(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKruanyinliao(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKruanyinliao(stockCollect);
        }
    }
    public String[] getBKruanyinliao() {
        return stockCollectMapper.selectBKruanyinliao();
    }
    public void delBKruanyinliao(String tsCode) { stockCollectMapper.delBKruanyinliao(tsCode); }



    public void collectBKziranjingdian(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKziranjingdian(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKziranjingdian(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKziranjingdian(stockCollect);
        }
    }
    public String[] getBKziranjingdian() {
        return stockCollectMapper.selectBKziranjingdian();
    }
    public void delBKziranjingdian(String tsCode) { stockCollectMapper.delBKziranjingdian(tsCode); }



    public void collectBKlvyouzonghe(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKlvyouzonghe(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKlvyouzonghe(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKlvyouzonghe(stockCollect);
        }
    }
    public String[] getBKlvyouzonghe() {
        return stockCollectMapper.selectBKlvyouzonghe();
    }
    public void delBKlvyouzonghe(String tsCode) { stockCollectMapper.delBKlvyouzonghe(tsCode); }


    public void collectBKcanying(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKcanying(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKcanying(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKcanying(stockCollect);
        }
    }
    public String[] getBKcanying() {
        return stockCollectMapper.selectBKcanying();
    }
    public void delBKcanying(String tsCode) { stockCollectMapper.delBKcanying(tsCode); }



    public void collectBKjiudian(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKjiudian(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKjiudian(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKjiudian(stockCollect);
        }
    }
    public String[] getBKjiudian() {
        return stockCollectMapper.selectBKjiudian();
    }
    public void delBKjiudian(String tsCode) { stockCollectMapper.delBKjiudian(tsCode); }



    public void collectBKrengongjingdian(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKrengongjingdian(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKrengongjingdian(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKrengongjingdian(stockCollect);
        }
    }
    public String[] getBKrengongjingdian() {
        return stockCollectMapper.selectBKrengongjingdian();
    }
    public void delBKrengongjingdian(String tsCode) { stockCollectMapper.delBKrengongjingdian(tsCode); }





    public void collectBKzhuanyeliansuo(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKzhuanyeliansuo(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKzhuanyeliansuo(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKzhuanyeliansuo(stockCollect);
        }
    }
    public String[] getBKzhuanyeliansuo() {
        return stockCollectMapper.selectBKzhuanyeliansuo();
    }
    public void delBKzhuanyeliansuo(String tsCode) { stockCollectMapper.delBKzhuanyeliansuo(tsCode); }



    public void collectBKbaihuolingshou(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKbaihuolingshou(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKbaihuolingshou(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKbaihuolingshou(stockCollect);
        }
    }
    public String[] getBKbaihuolingshou() {
        return stockCollectMapper.selectBKbaihuolingshou();
    }
    public void delBKbaihuolingshou(String tsCode) { stockCollectMapper.delBKbaihuolingshou(tsCode); }




    public void collectBKshangyewuyejinying(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKshangyewuyejinying(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKshangyewuyejinying(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKshangyewuyejinying(stockCollect);
        }
    }
    public String[] getBKshangyewuyejinying() {
        return stockCollectMapper.selectBKshangyewuyejinying();
    }
    public void delBKshangyewuyejinying(String tsCode) { stockCollectMapper.delBKshangyewuyejinying(tsCode); }




    public void collectBKshubiandianshebei(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKshubiandianshebei(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKshubiandianshebei(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKshubiandianshebei(stockCollect);
        }
    }
    public String[] getBKshubiandianshebei() {
        return stockCollectMapper.selectBKshubiandianshebei();
    }
    public void delBKshubiandianshebei(String tsCode) { stockCollectMapper.delBKshubiandianshebei(tsCode); }



    public void collectBKxianlangpartsjiqita(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKxianlangpartsjiqita(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKxianlangpartsjiqita(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKxianlangpartsjiqita(stockCollect);
        }
    }
    public String[] getBKxianlangpartsjiqita() {
        return stockCollectMapper.selectBKxianlangpartsjiqita();
    }
    public void delBKxianlangpartsjiqita(String tsCode) { stockCollectMapper.delBKxianlangpartsjiqita(tsCode); }



    public void collectBKtiwaizhenduang(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKtiwaizhenduang(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKtiwaizhenduang(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKtiwaizhenduang(stockCollect);
        }
    }
    public String[] getBKtiwaizhenduang() {
        return stockCollectMapper.selectBKtiwaizhenduang();
    }
    public void delBKtiwaizhenduang(String tsCode) { stockCollectMapper.delBKtiwaizhenduang(tsCode); }


    public void collectBKyiliaohaocai(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKyiliaohaocai(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKyiliaohaocai(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKyiliaohaocai(stockCollect);
        }
    }
    public String[] getBKyiliaohaocai() {
        return stockCollectMapper.selectBKyiliaohaocai();
    }
    public void delBKyiliaohaocai(String tsCode) { stockCollectMapper.delBKyiliaohaocai(tsCode); }





    public void collectBKgongkongshebei(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKgongkongshebei(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKgongkongshebei(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKgongkongshebei(stockCollect);
        }
    }
    public String[] getBKgongkongshebei() {
        return stockCollectMapper.selectBKgongkongshebei();
    }
    public void delBKgongkongshebei(String tsCode) { stockCollectMapper.delBKgongkongshebei(tsCode); }



    public void collectBKjiguangshebei(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKjiguangshebei(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKjiguangshebei(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKjiguangshebei(stockCollect);
        }
    }
    public String[] getBKjiguangshebei() {
        return stockCollectMapper.selectBKjiguangshebei();
    }
    public void delBKjiguangshebei(String tsCode) { stockCollectMapper.delBKjiguangshebei(tsCode); }



    public void collectBKbkrobot(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKbkrobot(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKbkrobot(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKbkrobot(stockCollect);
        }
    }
    public String[] getBKbkrobot() {
        return stockCollectMapper.selectBKbkrobot();
    }
    public void delBKbkrobot(String tsCode) { stockCollectMapper.delBKbkrobot(tsCode); }




    public void collectBKbkqitacpushebei(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKbkqitacpushebei(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKbkqitacpushebei(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKbkqitacpushebei(stockCollect);
        }
    }
    public String[] getBKbkqitacpushebei() {
        return stockCollectMapper.selectBKbkqitacpushebei();
    }
    public void delBKbkqitacpushebei(String tsCode) { stockCollectMapper.delBKbkqitacpushebei(tsCode); }




    public void collectBKbknongyongjixie(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKbknongyongjixie(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKbknongyongjixie(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKbknongyongjixie(stockCollect);
        }
    }
    public String[] getBKbknongyongjixie() {
        return stockCollectMapper.selectBKbknongyongjixie();
    }
    public void delBKbknongyongjixie(String tsCode) { stockCollectMapper.delBKbknongyongjixie(tsCode); }

    public void collectBKfangzhifuzhuangshebei(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKfangzhifuzhuangshebei(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKfangzhifuzhuangshebei(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKfangzhifuzhuangshebei(stockCollect);
        }
    }
    public String[] getBKfangzhifuzhuangshebei() {
        return stockCollectMapper.selectBKfangzhifuzhuangshebei();
    }
    public void delBKfangzhifuzhuangshebei(String tsCode) { stockCollectMapper.delBKfangzhifuzhuangshebei(tsCode); }




    public void collectBKqitazhuanyongshebei(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKqitazhuanyongshebei(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKqitazhuanyongshebei(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKqitazhuanyongshebei(stockCollect);
        }
    }
    public String[] getBKqitazhuanyongshebei() {
        return stockCollectMapper.selectBKqitazhuanyongshebei();
    }
    public void delBKqitazhuanyongshebei(String tsCode) { stockCollectMapper.delBKqitazhuanyongshebei(tsCode); }




    public void collectBKlouyushebei(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKlouyushebei(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKlouyushebei(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKlouyushebei(stockCollect);
        }
    }
    public String[] getBKlouyushebei() {
        return stockCollectMapper.selectBKlouyushebei();
    }
    public void delBKlouyushebei(String tsCode) { stockCollectMapper.delBKlouyushebei(tsCode); }




    public void collectBKenergyjiheavyshebei(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKenergyjiheavyshebei(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKenergyjiheavyshebei(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKenergyjiheavyshebei(stockCollect);
        }
    }
    public String[] getBKenergyjiheavyshebei() {
        return stockCollectMapper.selectBKenergyjiheavyshebei();
    }
    public void delBKenergyjiheavyshebei(String tsCode) { stockCollectMapper.delBKenergyjiheavyshebei(tsCode); }




    public void collectBKmeitangkaicai(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKmeitangkaicai(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKmeitangkaicai(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKmeitangkaicai(stockCollect);
        }
    }
    public String[] getBKmeitangkaicai() {
        return stockCollectMapper.selectBKmeitangkaicai();
    }
    public void delBKmeitangkaicai(String tsCode) { stockCollectMapper.delBKmeitangkaicai(tsCode); }


    public void collectBKshiyoujiagong(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKshiyoujiagong(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKshiyoujiagong(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKshiyoujiagong(stockCollect);
        }
    }
    public String[] getBKshiyoujiagong() {
        return stockCollectMapper.selectBKshiyoujiagong();
    }
    public void delBKshiyoujiagong(String tsCode) { stockCollectMapper.delBKshiyoujiagong(tsCode); }


    public void collectBKyoufugongcheng(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKyoufugongcheng(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKyoufugongcheng(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKyoufugongcheng(stockCollect);
        }
    }
    public String[] getBKyoufugongcheng() {
        return stockCollectMapper.selectBKyoufugongcheng();
    }
    public void delBKyoufugongcheng(String tsCode) { stockCollectMapper.delBKyoufugongcheng(tsCode); }




    public void collectBKyouqikaicai(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKyouqikaicai(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKyouqikaicai(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKyouqikaicai(stockCollect);
        }
    }
    public String[] getBKyouqikaicai() {
        return stockCollectMapper.selectBKyouqikaicai();
    }
    public void delBKyouqikaicai(String tsCode) { stockCollectMapper.delBKyouqikaicai(tsCode); }



    public void collectBKxinnengyuanfadian(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKxinnengyuanfadian(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKxinnengyuanfadian(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKxinnengyuanfadian(stockCollect);
        }
    }
    public String[] getBKxinnengyuanfadian() {
        return stockCollectMapper.selectBKxinnengyuanfadian();
    }
    public void delBKxinnengyuanfadian(String tsCode) { stockCollectMapper.delBKxinnengyuanfadian(tsCode); }



    public void collectBKdiannengzonghefuwu(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKdiannengzonghefuwu(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKdiannengzonghefuwu(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKdiannengzonghefuwu(stockCollect);
        }
    }
    public String[] getBKdiannengzonghefuwu() {
        return stockCollectMapper.selectBKdiannengzonghefuwu();
    }
    public void delBKdiannengzonghefuwu(String tsCode) { stockCollectMapper.delBKdiannengzonghefuwu(tsCode); }




    public void collectBKhuodian(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKhuodian(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKhuodian(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKhuodian(stockCollect);
        }
    }
    public String[] getBKhuodian() {
        return stockCollectMapper.selectBKhuodian();
    }
    public void delBKhuodian(String tsCode) { stockCollectMapper.delBKhuodian(tsCode); }


    public void collectBKreli(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKreli(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKreli(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKreli(stockCollect);
        }
    }
    public String[] getBKreli() {
        return stockCollectMapper.selectBKreli();
    }
    public void delBKreli(String tsCode) { stockCollectMapper.delBKreli(tsCode); }




    public void collectBKshuidian(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKshuidian(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKshuidian(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKshuidian(stockCollect);
        }
    }
    public String[] getBKshuidian() {
        return stockCollectMapper.selectBKshuidian();
    }
    public void delBKshuidian(String tsCode) { stockCollectMapper.delBKshuidian(tsCode); }



    public void collectBKhuaxuezhijiyinli(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKhuaxuezhijiyinli(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKhuaxuezhijiyinli(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKhuaxuezhijiyinli(stockCollect);
        }
    }
    public String[] getBKhuaxuezhijiyinli() {
        return stockCollectMapper.selectBKhuaxuezhijiyinli();
    }
    public void delBKhuaxuezhijiyinli(String tsCode) { stockCollectMapper.delBKhuaxuezhijiyinli(tsCode); }



    public void collectBKhuaxuezhiji(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKhuaxuezhiji(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKhuaxuezhiji(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKhuaxuezhiji(stockCollect);
        }
    }
    public String[] getBKhuaxuezhiji() {
        return stockCollectMapper.selectBKhuaxuezhiji();
    }
    public void delBKhuaxuezhiji(String tsCode) { stockCollectMapper.delBKhuaxuezhiji(tsCode); }




    public void collectBKyuanliaoyao(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKyuanliaoyao(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKyuanliaoyao(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKyuanliaoyao(stockCollect);
        }
    }
    public String[] getBKyuanliaoyao() {
        return stockCollectMapper.selectBKyuanliaoyao();
    }
    public void delBKyuanliaoyao(String tsCode) { stockCollectMapper.delBKyuanliaoyao(tsCode); }




    public void collectBKqitashengwuzhip(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKqitashengwuzhip(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKqitashengwuzhip(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKqitashengwuzhip(stockCollect);
        }
    }
    public String[] getBKqitashengwuzhip() {
        return stockCollectMapper.selectBKqitashengwuzhip();
    }
    public void delBKqitashengwuzhip(String tsCode) { stockCollectMapper.delBKqitashengwuzhip(tsCode); }




    public void collectBKxueyezhip(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKxueyezhip(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKxueyezhip(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKxueyezhip(stockCollect);
        }
    }
    public String[] getBKxueyezhip() {
        return stockCollectMapper.selectBKxueyezhip();
    }
    public void delBKxueyezhip(String tsCode) { stockCollectMapper.delBKxueyezhip(tsCode); }





    public void collectBKyiyuan(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKyiyuan(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKyiyuan(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKyiyuan(stockCollect);
        }
    }
    public String[] getBKyiyuan() {
        return stockCollectMapper.selectBKyiyuan();
    }
    public void delBKyiyuan(String tsCode) { stockCollectMapper.delBKyiyuan(tsCode); }



    public void collectBKyiliaoyanfawaibao(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKyiliaoyanfawaibao(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKyiliaoyanfawaibao(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKyiliaoyanfawaibao(stockCollect);
        }
    }
    public String[] getBKyiliaoyanfawaibao() {
        return stockCollectMapper.selectBKyiliaoyanfawaibao();
    }
    public void delBKyiliaoyanfawaibao(String tsCode) { stockCollectMapper.delBKyiliaoyanfawaibao(tsCode); }



    public void collectBKwujiyan(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKwujiyan(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKwujiyan(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKwujiyan(stockCollect);
        }
    }
    public String[] getBKwujiyan() {
        return stockCollectMapper.selectBKwujiyan();
    }
    public void delBKwujiyan(String tsCode) { stockCollectMapper.delBKwujiyan(tsCode); }




    public void collectBKqitahuaxueraw(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKqitahuaxueraw(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKqitahuaxueraw(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKqitahuaxueraw(stockCollect);
        }
    }
    public String[] getBKqitahuaxueraw() {
        return stockCollectMapper.selectBKqitahuaxueraw();
    }
    public void delBKqitahuaxueraw(String tsCode) { stockCollectMapper.delBKqitahuaxueraw(tsCode); }




    public void collectBKtaibaifen(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKtaibaifen(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKtaibaifen(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKtaibaifen(stockCollect);
        }
    }
    public String[] getBKtaibaifen() {
        return stockCollectMapper.selectBKtaibaifen();
    }
    public void delBKtaibaifen(String tsCode) { stockCollectMapper.delBKtaibaifen(tsCode); }



    public void collectBKmeihuagong(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKmeihuagong(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKmeihuagong(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKmeihuagong(stockCollect);
        }
    }
    public String[] getBKmeihuagong() {
        return stockCollectMapper.selectBKmeihuagong();
    }
    public void delBKmeihuagong(String tsCode) { stockCollectMapper.delBKmeihuagong(tsCode); }



    public void collectBKlvjian(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKlvjian(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKlvjian(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKlvjian(stockCollect);
        }
    }
    public String[] getBKlvjian() {
        return stockCollectMapper.selectBKlvjian();
    }
    public void delBKlvjian(String tsCode) { stockCollectMapper.delBKlvjian(tsCode); }




    public void collectBKxiaofeidianziparts(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKxiaofeidianziparts(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKxiaofeidianziparts(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKxiaofeidianziparts(stockCollect);
        }
    }
    public String[] getBKxiaofeidianziparts() {
        return stockCollectMapper.selectBKxiaofeidianziparts();
    }
    public void delBKxiaofeidianziparts(String tsCode) { stockCollectMapper.delBKxiaofeidianziparts(tsCode); }




    public void collectBKbidongyuanjian(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKbidongyuanjian(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKbidongyuanjian(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKbidongyuanjian(stockCollect);
        }
    }
    public String[] getBKbidongyuanjian() {
        return stockCollectMapper.selectBKbidongyuanjian();
    }
    public void delBKbidongyuanjian(String tsCode) { stockCollectMapper.delBKbidongyuanjian(tsCode); }



    public void collectBKyinzhidianluban(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKyinzhidianluban(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKyinzhidianluban(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKyinzhidianluban(stockCollect);
        }
    }
    public String[] getBKyinzhidianluban() {
        return stockCollectMapper.selectBKyinzhidianluban();
    }
    public void delBKyinzhidianluban(String tsCode) { stockCollectMapper.delBKyinzhidianluban(tsCode); }


    public void collectBKlidianchi(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKlidianchi(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKlidianchi(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKlidianchi(stockCollect);
        }
    }
    public String[] getBKlidianchi() {
        return stockCollectMapper.selectBKlidianchi();
    }
    public void delBKlidianchi(String tsCode) { stockCollectMapper.delBKlidianchi(tsCode); }


    public void collectBKqitadianchi(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKqitadianchi(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKqitadianchi(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKqitadianchi(stockCollect);
        }
    }
    public String[] getBKqitadianchi() {
        return stockCollectMapper.selectBKqitadianchi();
    }
    public void delBKqitadianchi(String tsCode) { stockCollectMapper.delBKqitadianchi(tsCode); }




    public void collectBKdianchihuaxue(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKdianchihuaxue(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKdianchihuaxue(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKdianchihuaxue(stockCollect);
        }
    }
    public String[] getBKdianchihuaxue() {
        return stockCollectMapper.selectBKdianchihuaxue();
    }
    public void delBKdianchihuaxue(String tsCode) { stockCollectMapper.delBKdianchihuaxue(tsCode); }




    public void collectBKmianban(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKmianban(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKmianban(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKmianban(stockCollect);
        }
    }
    public String[] getBKmianban() {
        return stockCollectMapper.selectBKmianban();
    }
    public void delBKmianban(String tsCode) { stockCollectMapper.delBKmianban(tsCode); }




    public void collectBKled(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKled(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKled(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKled(stockCollect);
        }
    }
    public String[] getBKled() {
        return stockCollectMapper.selectBKled();
    }
    public void delBKled(String tsCode) { stockCollectMapper.delBKled(tsCode); }



    public void collectBKguanxueyuanjian(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKguanxueyuanjian(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKguanxueyuanjian(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKguanxueyuanjian(stockCollect);
        }
    }
    public String[] getBKguanxueyuanjian() {
        return stockCollectMapper.selectBKguanxueyuanjian();
    }
    public void delBKguanxueyuanjian(String tsCode) { stockCollectMapper.delBKguanxueyuanjian(tsCode); }



    public void collectBKyiyaoliutong(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKyiyaoliutong(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKyiyaoliutong(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKyiyaoliutong(stockCollect);
        }
    }
    public String[] getBKyiyaoliutong() {
        return stockCollectMapper.selectBKyiyaoliutong();
    }
    public void delBKyiyaoliutong(String tsCode) { stockCollectMapper.delBKyiyaoliutong(tsCode); }




    public void collectBKdanfei(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKdanfei(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKdanfei(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKdanfei(stockCollect);
        }
    }
    public String[] getBKdanfei() {
        return stockCollectMapper.selectBKdanfei();
    }
    public void delBKdanfei(String tsCode) { stockCollectMapper.delBKdanfei(tsCode); }




    public void collectBKnongyao(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKnongyao(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKnongyao(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKnongyao(stockCollect);
        }
    }
    public String[] getBKnongyao() {
        return stockCollectMapper.selectBKnongyao();
    }
    public void delBKnongyao(String tsCode) { stockCollectMapper.delBKnongyao(tsCode); }




    public void collectBKfuhefei(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKfuhefei(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKfuhefei(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKfuhefei(stockCollect);
        }
    }
    public String[] getBKfuhefei() {
        return stockCollectMapper.selectBKfuhefei();
    }
    public void delBKfuhefei(String tsCode) { stockCollectMapper.delBKfuhefei(tsCode); }




    public void collectBKlinhui(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKlinhui(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKlinhui(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKlinhui(stockCollect);
        }
    }
    public String[] getBKlinhui() {
        return stockCollectMapper.selectBKlinhui();
    }
    public void delBKlinhui(String tsCode) { stockCollectMapper.delBKlinhui(tsCode); }


    public void collectBKroujiyangzhi(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKroujiyangzhi(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKroujiyangzhi(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKroujiyangzhi(stockCollect);
        }
    }
    public String[] getBKroujiyangzhi() {
        return stockCollectMapper.selectBKroujiyangzhi();
    }
    public void delBKroujiyangzhi(String tsCode) { stockCollectMapper.delBKroujiyangzhi(tsCode); }



    public void collectBKshengzhuyangzhi(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKshengzhuyangzhi(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKshengzhuyangzhi(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKshengzhuyangzhi(stockCollect);
        }
    }
    public String[] getBKshengzhuyangzhi() {
        return stockCollectMapper.selectBKshengzhuyangzhi();
    }
    public void delBKshengzhuyangzhi(String tsCode) { stockCollectMapper.delBKshengzhuyangzhi(tsCode); }




    public void collectBKqitayangzhi(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKqitayangzhi(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKqitayangzhi(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKqitayangzhi(stockCollect);
        }
    }
    public String[] getBKqitayangzhi() {
        return stockCollectMapper.selectBKqitayangzhi();
    }
    public void delBKqitayangzhi(String tsCode) { stockCollectMapper.delBKqitayangzhi(tsCode); }


    public void collectBKshuichanyangzhi(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKshuichanyangzhi(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKshuichanyangzhi(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKshuichanyangzhi(stockCollect);
        }
    }
    public String[] getBKshuichanyangzhi() {
        return stockCollectMapper.selectBKshuichanyangzhi();
    }
    public void delBKshuichanyangzhi(String tsCode) { stockCollectMapper.delBKshuichanyangzhi(tsCode); }




    public void collectBKdongwubaojian(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKdongwubaojian(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKdongwubaojian(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKdongwubaojian(stockCollect);
        }
    }
    public String[] getBKdongwubaojian() {
        return stockCollectMapper.selectBKdongwubaojian();
    }
    public void delBKdongwubaojian(String tsCode) { stockCollectMapper.delBKdongwubaojian(tsCode); }


    public void collectBKlinye(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKlinye(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKlinye(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKlinye(stockCollect);
        }
    }
    public String[] getBKlinye() {
        return stockCollectMapper.selectBKlinye();
    }
    public void delBKlinye(String tsCode) { stockCollectMapper.delBKlinye(tsCode); }



    public void collectBKzhongzhishengchan(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKzhongzhishengchan(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKzhongzhishengchan(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKzhongzhishengchan(stockCollect);
        }
    }
    public String[] getBKzhongzhishengchan() {
        return stockCollectMapper.selectBKzhongzhishengchan();
    }
    public void delBKzhongzhishengchan(String tsCode) { stockCollectMapper.delBKzhongzhishengchan(tsCode); }

    public void collectBKqitazhongzhiye(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKqitazhongzhiye(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKqitazhongzhiye(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKqitazhongzhiye(stockCollect);
        }
    }
    public String[] getBKqitazhongzhiye() {
        return stockCollectMapper.selectBKqitazhongzhiye();
    }
    public void delBKqitazhongzhiye(String tsCode) { stockCollectMapper.delBKqitazhongzhiye(tsCode); }




    public void collectBKguoshujiagong(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKguoshujiagong(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKguoshujiagong(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKguoshujiagong(stockCollect);
        }
    }
    public String[] getBKguoshujiagong() {
        return stockCollectMapper.selectBKguoshujiagong();
    }
    public void delBKguoshujiagong(String tsCode) { stockCollectMapper.delBKguoshujiagong(tsCode); }



    public void collectBKshuichansiliao(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKshuichansiliao(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKshuichansiliao(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKshuichansiliao(stockCollect);
        }
    }
    public String[] getBKshuichansiliao() {
        return stockCollectMapper.selectBKshuichansiliao();
    }
    public void delBKshuichansiliao(String tsCode) { stockCollectMapper.delBKshuichansiliao(tsCode); }



    public void collectBKliangyoujiagong(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKliangyoujiagong(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKliangyoujiagong(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKliangyoujiagong(stockCollect);
        }
    }
    public String[] getBKliangyoujiagong() {
        return stockCollectMapper.selectBKliangyoujiagong();
    }
    public void delBKliangyoujiagong(String tsCode) { stockCollectMapper.delBKliangyoujiagong(tsCode); }



    public void collectBKqitanongchanpinjiagong(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKqitanongchanpinjiagong(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKqitanongchanpinjiagong(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKqitanongchanpinjiagong(stockCollect);
        }
    }
    public String[] getBKqitanongchanpinjiagong() {
        return stockCollectMapper.selectBKqitanongchanpinjiagong();
    }
    public void delBKqitanongchanpinjiagong(String tsCode) { stockCollectMapper.delBKqitanongchanpinjiagong(tsCode); }




    public void collectBKxuchusiliao(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKxuchusiliao(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKxuchusiliao(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKxuchusiliao(stockCollect);
        }
    }
    public String[] getBKxuchusiliao() {
        return stockCollectMapper.selectBKxuchusiliao();
    }
    public void delBKxuchusiliao(String tsCode) { stockCollectMapper.delBKxuchusiliao(tsCode); }


    public void collectBKanlun(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKanlun(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKanlun(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKanlun(stockCollect);
        }
    }
    public String[] getBKanlun() {
        return stockCollectMapper.selectBKanlun();
    }
    public void delBKanlun(String tsCode) { stockCollectMapper.delBKanlun(tsCode); }


    public void collectBKnianjiao(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKnianjiao(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKnianjiao(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKnianjiao(stockCollect);
        }
    }
    public String[] getBKnianjiao() {
        return stockCollectMapper.selectBKnianjiao();
    }
    public void delBKnianjiao(String tsCode) { stockCollectMapper.delBKnianjiao(tsCode); }



    public void collectBKdilun(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKdilun(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKdilun(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKdilun(stockCollect);
        }
    }
    public String[] getBKdilun() {
        return stockCollectMapper.selectBKdilun();
    }
    public void delBKdilun(String tsCode) { stockCollectMapper.delBKdilun(tsCode); }



    public void collectBKfuhuagong(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKfuhuagong(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKfuhuagong(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKfuhuagong(stockCollect);
        }
    }
    public String[] getBKfuhuagong() {
        return stockCollectMapper.selectBKfuhuagong();
    }
    public void delBKfuhuagong(String tsCode) { stockCollectMapper.delBKfuhuagong(tsCode); }

    public void collectBKyoujigui(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKyoujigui(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKyoujigui(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKyoujigui(stockCollect);
        }
    }
    public String[] getBKyoujigui() {
        return stockCollectMapper.selectBKyoujigui();
    }
    public void delBKyoujigui(String tsCode) { stockCollectMapper.delBKyoujigui(tsCode); }

    public void collectBKjuanzhi(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKjuanzhi(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKjuanzhi(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKjuanzhi(stockCollect);
        }
    }
    public String[] getBKjuanzhi() {
        return stockCollectMapper.selectBKjuanzhi();
    }
    public void delBKjuanzhi(String tsCode) { stockCollectMapper.delBKjuanzhi(tsCode); }



    public void collectBKminbaoyongpin(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKminbaoyongpin(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKminbaoyongpin(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKminbaoyongpin(stockCollect);
        }
    }
    public String[] getBKminbaoyongpin() {
        return stockCollectMapper.selectBKminbaoyongpin();
    }
    public void delBKminbaoyongpin(String tsCode) { stockCollectMapper.delBKminbaoyongpin(tsCode); }


    public void collectBKfanzhihuaxuepin(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKfanzhihuaxuepin(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKfanzhihuaxuepin(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKfanzhihuaxuepin(stockCollect);
        }
    }
    public String[] getBKfanzhihuaxuepin() {
        return stockCollectMapper.selectBKfanzhihuaxuepin();
    }
    public void delBKfanzhihuaxuepin(String tsCode) { stockCollectMapper.delBKfanzhihuaxuepin(tsCode); }



    public void collectBKfoodsiliaotianjiaji(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKfoodsiliaotianjiaji(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKfoodsiliaotianjiaji(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKfoodsiliaotianjiaji(stockCollect);
        }
    }
    public String[] getBKfoodsiliaotianjiaji() {
        return stockCollectMapper.selectBKfoodsiliaotianjiaji();
    }
    public void delBKfoodsiliaotianjiaji(String tsCode) { stockCollectMapper.delBKfoodsiliaotianjiaji(tsCode); }


    public void collectBKqitahuaxue(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKqitahuaxue(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKqitahuaxue(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKqitahuaxue(stockCollect);
        }
    }
    public String[] getBKqitahuaxue() {
        return stockCollectMapper.selectBKqitahuaxue();
    }
    public void delBKqitahuaxue(String tsCode) { stockCollectMapper.delBKqitahuaxue(tsCode); }


    public void collectBKotherjiaju(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKotherjiaju(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKotherjiaju(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKotherjiaju(stockCollect);
        }
    }
    public String[] getBKotherjiaju() {
        return stockCollectMapper.selectBKotherjiaju();
    }
    public void delBKotherjiaju(String tsCode) { stockCollectMapper.delBKotherjiaju(tsCode); }




    public void collectBKwenyuyongping(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKwenyuyongping(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKwenyuyongping(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKwenyuyongping(stockCollect);
        }
    }
    public String[] getBKwenyuyongping() {
        return stockCollectMapper.selectBKwenyuyongping();
    }
    public void delBKwenyuyongping(String tsCode) { stockCollectMapper.delBKwenyuyongping(tsCode); }


    public void collectBKbaozhuang(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKbaozhuang(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKbaozhuang(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKbaozhuang(stockCollect);
        }
    }
    public String[] getBKbaozhuang() {
        return stockCollectMapper.selectBKbaozhuang();
    }
    public void delBKbaozhuang(String tsCode) { stockCollectMapper.delBKbaozhuang(tsCode); }



    public void collectBKchuban(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKchuban(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKchuban(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKchuban(stockCollect);
        }
    }
    public String[] getBKchuban() {
        return stockCollectMapper.selectBKchuban();
    }
    public void delBKchuban(String tsCode) { stockCollectMapper.delBKchuban(tsCode); }



    public void collectBKguangaoyinxiao(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKguangaoyinxiao(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKguangaoyinxiao(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKguangaoyinxiao(stockCollect);
        }
    }
    public String[] getBKguangaoyinxiao() {
        return stockCollectMapper.selectBKguangaoyinxiao();
    }
    public void delBKguangaoyinxiao(String tsCode) { stockCollectMapper.delBKguangaoyinxiao(tsCode); }


    public void collectBKmonixinpiansheji(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKmonixinpiansheji(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKmonixinpiansheji(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKmonixinpiansheji(stockCollect);
        }
    }
    public String[] getBKmonixinpiansheji() {
        return stockCollectMapper.selectBKmonixinpiansheji();
    }
    public void delBKmonixinpiansheji(String tsCode) { stockCollectMapper.delBKmonixinpiansheji(tsCode); }


    public void collectBKbaodaotishebei(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKbaodaotishebei(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKbaodaotishebei(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKbaodaotishebei(stockCollect);
        }
    }
    public String[] getBKbaodaotishebei() {
        return stockCollectMapper.selectBKbaodaotishebei();
    }
    public void delBKbaodaotishebei(String tsCode) { stockCollectMapper.delBKbaodaotishebei(tsCode); }



    public void collectBKfenliqijian(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKfenliqijian(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKfenliqijian(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKfenliqijian(stockCollect);
        }
    }
    public String[] getBKfenliqijian() {
        return stockCollectMapper.selectBKfenliqijian();
    }
    public void delBKfenliqijian(String tsCode) { stockCollectMapper.delBKfenliqijian(tsCode); }

    public void collectBKjichengdianlutest(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKjichengdianlutest(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKjichengdianlutest(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKjichengdianlutest(stockCollect);
        }
    }
    public String[] getBKjichengdianlutest() {
        return stockCollectMapper.selectBKjichengdianlutest();
    }
    public void delBKjichengdianlutest(String tsCode) { stockCollectMapper.delBKjichengdianlutest(tsCode); }




    public void collectBKbandaoticailiao(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKbandaoticailiao(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKbandaoticailiao(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKbandaoticailiao(stockCollect);
        }
    }
    public String[] getBKbandaoticailiao() {
        return stockCollectMapper.selectBKbandaoticailiao();
    }
    public void delBKbandaoticailiao(String tsCode) { stockCollectMapper.delBKbandaoticailiao(tsCode); }



    public void collectBKshuzixinpian(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKshuzixinpian(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKshuzixinpian(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKshuzixinpian(stockCollect);
        }
    }
    public String[] getBKshuzixinpian() {
        return stockCollectMapper.selectBKshuzixinpian();
    }
    public void delBKshuzixinpian(String tsCode) { stockCollectMapper.delBKshuzixinpian(tsCode); }


    public void collectBKdaqizhili(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKdaqizhili(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKdaqizhili(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKdaqizhili(stockCollect);
        }
    }
    public String[] getBKdaqizhili() {
        return stockCollectMapper.selectBKdaqizhili();
    }
    public void delBKdaqizhili(String tsCode) { stockCollectMapper.delBKdaqizhili(tsCode); }



    public void collectBKgufei(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKgufei(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKgufei(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKgufei(stockCollect);
        }
    }
    public String[] getBKgufei() {
        return stockCollectMapper.selectBKgufei();
    }
    public void delBKgufei(String tsCode) { stockCollectMapper.delBKgufei(tsCode); }



    public void collectBKshuiwu(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKshuiwu(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKshuiwu(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKshuiwu(stockCollect);
        }
    }
    public String[] getBKshuiwu() {
        return stockCollectMapper.selectBKshuiwu();
    }
    public void delBKshuiwu(String tsCode) { stockCollectMapper.delBKshuiwu(tsCode); }



    public void collectBKzonghehuanjin(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKzonghehuanjin(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKzonghehuanjin(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKzonghehuanjin(stockCollect);
        }
    }
    public String[] getBKzonghehuanjin() {
        return stockCollectMapper.selectBKzonghehuanjin();
    }
    public void delBKzonghehuanjin(String tsCode) { stockCollectMapper.delBKzonghehuanjin(tsCode); }



    public void collectBKbkwu(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKbkwu(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKbkwu(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKbkwu(stockCollect);
        }
    }
    public String[] getBKbkwu() {
        return stockCollectMapper.selectBKbkwu();
    }
    public void delBKbkwu(String tsCode) { stockCollectMapper.delBKbkwu(tsCode); }


    public void collectBKbkqitaxiaojinshu(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKbkqitaxiaojinshu(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKbkqitaxiaojinshu(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKbkqitaxiaojinshu(stockCollect);
        }
    }
    public String[] getBKbkqitaxiaojinshu() {
        return stockCollectMapper.selectBKbkqitaxiaojinshu();
    }
    public void delBKbkqitaxiaojinshu(String tsCode) { stockCollectMapper.delBKbkqitaxiaojinshu(tsCode); }



    public void collectBKbkxitu(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKbkxitu(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKbkxitu(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKbkxitu(stockCollect);
        }
    }
    public String[] getBKbkxitu() {
        return stockCollectMapper.selectBKbkxitu();
    }
    public void delBKbkxitu(String tsCode) { stockCollectMapper.delBKbkxitu(tsCode); }


    public void collectBKbklv(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKbklv(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKbklv(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKbklv(stockCollect);
        }
    }
    public String[] getBKbklv() {
        return stockCollectMapper.selectBKbklv();
    }
    public void delBKbklv(String tsCode) { stockCollectMapper.delBKbklv(tsCode); }



    public void collectBKbktong(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKbktong(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKbktong(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKbktong(stockCollect);
        }
    }
    public String[] getBKbktong() {
        return stockCollectMapper.selectBKbktong();
    }
    public void delBKbktong(String tsCode) { stockCollectMapper.delBKbktong(tsCode); }



    public void collectBKbkjinshuzhipin(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKbkjinshuzhipin(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKbkjinshuzhipin(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKbkjinshuzhipin(stockCollect);
        }
    }
    public String[] getBKbkjinshuzhipin() {
        return stockCollectMapper.selectBKbkjinshuzhipin();
    }
    public void delBKbkjinshuzhipin(String tsCode) { stockCollectMapper.delBKbkjinshuzhipin(tsCode); }




    public void collectBKbkaircondition(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKbkaircondition(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKbkaircondition(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKbkaircondition(stockCollect);
        }
    }
    public String[] getBKbkaircondition() {
        return stockCollectMapper.selectBKbkaircondition();
    }
    public void delBKbkaircondition(String tsCode) { stockCollectMapper.delBKbkaircondition(tsCode); }



    public void collectBKbkcardianzidianqi(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKbkcardianzidianqi(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKbkcardianzidianqi(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKbkcardianzidianqi(stockCollect);
        }
    }
    public String[] getBKbkcardianzidianqi() {
        return stockCollectMapper.selectBKbkcardianzidianqi();
    }
    public void delBKbkcardianzidianqi(String tsCode) { stockCollectMapper.delBKbkcardianzidianqi(tsCode); }


    public void collectBKbkdipan(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKbkdipan(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKbkdipan(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKbkdipan(stockCollect);
        }
    }
    public String[] getBKbkdipan() {
        return stockCollectMapper.selectBKbkdipan();
    }
    public void delBKbkdipan(String tsCode) { stockCollectMapper.delBKbkdipan(tsCode); }


    public void collectBKbkluntai(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKbkluntai(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKbkluntai(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKbkluntai(stockCollect);
        }
    }
    public String[] getBKbkluntai() {
        return stockCollectMapper.selectBKbkluntai();
    }
    public void delBKbkluntai(String tsCode) { stockCollectMapper.delBKbkluntai(tsCode); }




    public void collectBKbkcheshen(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKbkcheshen(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKbkcheshen(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKbkcheshen(stockCollect);
        }
    }
    public String[] getBKbkcheshen() {
        return stockCollectMapper.selectBKbkcheshen();
    }
    public void delBKbkcheshen(String tsCode) { stockCollectMapper.delBKbkcheshen(tsCode); }


    public void collectBKbkcarservice02(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKbkcarservice02(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKbkcarservice02(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKbkcarservice02(stockCollect);
        }
    }
    public String[] getBKbkcarservice02() {
        return stockCollectMapper.selectBKbkcarservice02();
    }
    public void delBKbkcarservice02(String tsCode) { stockCollectMapper.delBKbkcarservice02(tsCode); }





    public void collectBKothercarparts(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKothercarparts(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKothercarparts(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKothercarparts(stockCollect);
        }
    }
    public String[] getBKothercarparts() {
        return stockCollectMapper.selectBKothercarparts();
    }
    public void delBKothercarparts(String tsCode) { stockCollectMapper.delBKothercarparts(tsCode); }



    public void collectBKtegang(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKtegang(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKtegang(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKtegang(stockCollect);
        }
    }
    public String[] getBKtegang() {
        return stockCollectMapper.selectBKtegang();
    }
    public void delBKtegang(String tsCode) { stockCollectMapper.delBKtegang(tsCode); }




    public void collectBKpugang(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKpugang(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKpugang(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKpugang(stockCollect);
        }
    }
    public String[] getBKpugang() {
        return stockCollectMapper.selectBKpugang();
    }
    public void delBKpugang(String tsCode) { stockCollectMapper.delBKpugang(tsCode); }



    public void collectBKpipe(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKpipe(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKpipe(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKpipe(stockCollect);
        }
    }
    public String[] getBKpipe() {
        return stockCollectMapper.selectBKpipe();
    }
    public void delBKpipe(String tsCode) { stockCollectMapper.delBKpipe(tsCode); }



    public void collectBKnaihuocailiao(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKnaihuocailiao(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKnaihuocailiao(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKnaihuocailiao(stockCollect);
        }
    }
    public String[] getBKnaihuocailiao() {
        return stockCollectMapper.selectBKnaihuocailiao();
    }
    public void delBKnaihuocailiao(String tsCode) { stockCollectMapper.delBKnaihuocailiao(tsCode); }



    public void collectBKzhuangshiyuanlin(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKzhuangshiyuanlin(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKzhuangshiyuanlin(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKzhuangshiyuanlin(stockCollect);
        }
    }
    public String[] getBKzhuangshiyuanlin() {
        return stockCollectMapper.selectBKzhuangshiyuanlin();
    }
    public void delBKzhuangshiyuanlin(String tsCode) { stockCollectMapper.delBKzhuangshiyuanlin(tsCode); }



    public void collectBKgongchengzixun(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKgongchengzixun(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKgongchengzixun(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKgongchengzixun(stockCollect);
        }
    }
    public String[] getBKgongchengzixun() {
        return stockCollectMapper.selectBKgongchengzixun();
    }
    public void delBKgongchengzixun(String tsCode) { stockCollectMapper.delBKgongchengzixun(tsCode); }



    public void collectBKjichujianshe(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKjichujianshe(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKjichujianshe(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKjichujianshe(stockCollect);
        }
    }
    public String[] getBKjichujianshe() {
        return stockCollectMapper.selectBKjichujianshe();
    }
    public void delBKjichujianshe(String tsCode) { stockCollectMapper.delBKjichujianshe(tsCode); }



    public void collectBKgangjiegou(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKgangjiegou(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKgangjiegou(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKgangjiegou(stockCollect);
        }
    }
    public String[] getBKgangjiegou() {
        return stockCollectMapper.selectBKgangjiegou();
    }
    public void delBKgangjiegou(String tsCode) { stockCollectMapper.delBKgangjiegou(tsCode); }


    public void collectBKShangyewuyeguanli(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKShangyewuyeguanli(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKShangyewuyeguanli(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKShangyewuyeguanli(stockCollect);
        }
    }
    public String[] getBKShangyewuyeguanli() {
        return stockCollectMapper.selectBKShangyewuyeguanli();
    }
    public void delBKShangyewuyeguanli(String tsCode) { stockCollectMapper.delBKShangyewuyeguanli(tsCode); }

    public void collectBKZhuzhaikaifa(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKZhuzhaikaifa(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKZhuzhaikaifa(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKZhuzhaikaifa(stockCollect);
        }
    }
    public String[] getBKZhuzhaikaifa() {
        return stockCollectMapper.selectBKZhuzhaikaifa();
    }
    public void delBKZhuzhaikaifa(String tsCode) { stockCollectMapper.delBKZhuzhaikaifa(tsCode); }



    public void collectBKShangyedichang(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKShangyedichang(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKShangyedichang(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKShangyedichang(stockCollect);
        }
    }
    public String[] getBKShangyedichang() {
        return stockCollectMapper.selectBKShangyedichang();
    }
    public void delBKShangyedichang(String tsCode) { stockCollectMapper.delBKShangyedichang(tsCode); }




    public void collectBKCement(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKCement(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKCement(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKCement(stockCollect);
        }
    }
    public String[] getBKCement() {
        return stockCollectMapper.selectBKCement();
    }
    public void delBKCement(String tsCode) { stockCollectMapper.delBKCement(tsCode); }



    public void collectBKPackageprint(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKPackageprint(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKPackageprint(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKPackageprint(stockCollect);
        }
    }
    public String[] getBKPackageprint() {
        return stockCollectMapper.selectBKPackageprint();
    }
    public void delBKPackageprint(String tsCode) { stockCollectMapper.delBKPackageprint(tsCode); }




    public void collectBKKitchenappliances(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKKitchenappliances(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKKitchenappliances(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKKitchenappliances(stockCollect);
        }
    }
    public String[] getBKKitchenappliances() {
        return stockCollectMapper.selectBKKitchenappliances();
    }
    public void delBKKitchenappliances(String tsCode) { stockCollectMapper.delBKKitchenappliances(tsCode); }



    public void collectBKCommunicationservices(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKCommunicationservices(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKCommunicationservices(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKCommunicationservices(stockCollect);
        }
    }
    public String[] getBKCommunicationservices() {
        return stockCollectMapper.selectBKCommunicationservices();
    }
    public void delBKCommunicationservices(String tsCode) { stockCollectMapper.delBKCommunicationservices(tsCode); }



    public void collectBKPowergridequipment(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKPowergridequipment(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKPowergridequipment(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKPowergridequipment(stockCollect);
        }
    }
    public String[] getBKPowergridequipment() {
        return stockCollectMapper.selectBKPowergridequipment();
    }
    public void delBKPowergridequipment(String tsCode) { stockCollectMapper.delBKPowergridequipment(tsCode); }


    public void collectBKPetroleumprocessingtrade(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKPetroleumprocessingtrade(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKPetroleumprocessingtrade(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKPetroleumprocessingtrade(stockCollect);
        }
    }
    public String[] getBKPetroleumprocessingtrade() {
        return stockCollectMapper.selectBKPetroleumprocessingtrade();
    }
    public void delBKPetroleumprocessingtrade(String tsCode) { stockCollectMapper.delBKPetroleumprocessingtrade(tsCode); }



    public void collectBKOthersocialservices(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKOthersocialservices(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKOthersocialservices(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKOthersocialservices(stockCollect);
        }
    }
    public String[] getBKOthersocialservices() {
        return stockCollectMapper.selectBKOthersocialservices();
    }
    public void delBKOthersocialservices(String tsCode) { stockCollectMapper.delBKOthersocialservices(tsCode); }





    public void collectBKCulturalmedia(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKCulturalmedia(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKCulturalmedia(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKCulturalmedia(stockCollect);
        }
    }
    public String[] getBKCulturalmedia() {
        return stockCollectMapper.selectBKCulturalmedia();
    }
    public void delBKCulturalmedia(String tsCode) { stockCollectMapper.delBKCulturalmedia(tsCode); }



    public void collectBKOpticaloptoelectronics(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKOpticaloptoelectronics(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKOpticaloptoelectronics(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKOpticaloptoelectronics(stockCollect);
        }
    }
    public String[] getBKOpticaloptoelectronics() {
        return stockCollectMapper.selectBKOpticaloptoelectronics();
    }
    public void delBKOpticaloptoelectronics(String tsCode) { stockCollectMapper.delBKOpticaloptoelectronics(tsCode); }


    public void collectBKElectronicchemicals(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKElectronicchemicals(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKElectronicchemicals(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKElectronicchemicals(stockCollect);
        }
    }
    public String[] getBKElectronicchemicals() {
        return stockCollectMapper.selectBKElectronicchemicals();
    }
    public void delBKElectronicchemicals(String tsCode) { stockCollectMapper.delBKElectronicchemicals(tsCode); }



    public void collectBKCinema(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKCinema(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKCinema(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKCinema(stockCollect);
        }
    }
    public String[] getBKCinema() {
        return stockCollectMapper.selectBKCinema();
    }
    public void delBKCinema(String tsCode) { stockCollectMapper.delBKCinema(tsCode); }




    public void collectBKAgriculturalchemicalproducts(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKAgriculturalchemicalproducts(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKAgriculturalchemicalproducts(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKAgriculturalchemicalproducts(stockCollect);
        }
    }
    public String[] getBKAgriculturalchemicalproducts() {
        return stockCollectMapper.selectBKAgriculturalchemicalproducts();
    }
    public void delBKAgriculturalchemicalproducts(String tsCode) { stockCollectMapper.delBKAgriculturalchemicalproducts(tsCode); }



    public void collectBKBreedingindustry(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKBreedingindustry(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKBreedingindustry(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKBreedingindustry(stockCollect);
        }
    }
    public String[] getBKBreedingindustry() {
        return stockCollectMapper.selectBKBreedingindustry();
    }
    public void delBKBreedingindustry(String tsCode) { stockCollectMapper.delBKBreedingindustry(tsCode); }




    public void collectBKConstructionmachinery(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKConstructionmachinery(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKConstructionmachinery(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKConstructionmachinery(stockCollect);
        }
    }
    public String[] getBKConstructionmachinery() {
        return stockCollectMapper.selectBKConstructionmachinery();
    }
    public void delBKConstructionmachinery(String tsCode) { stockCollectMapper.delBKConstructionmachinery(tsCode); }


    public void collectBKOilgasextractionservices(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKOilgasextractionservices(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKOilgasextractionservices(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKOilgasextractionservices(stockCollect);
        }
    }
    public String[] getBKOilgasextractionservices() {
        return stockCollectMapper.selectBKOilgasextractionservices();
    }
    public void delBKOilgasextractionservices(String tsCode) { stockCollectMapper.delBKOilgasextractionservices(tsCode); }



    public void collectBKWindequipment(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKWindequipment(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKWindequipment(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKWindequipment(stockCollect);
        }
    }
    public String[] getBKWindequipment() {
        return stockCollectMapper.selectBKWindequipment();
    }
    public void delBKWindequipment(String tsCode) { stockCollectMapper.delBKWindequipment(tsCode); }

    public void collectBKInternetecommerce(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKInternetecommerce(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKInternetecommerce(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKInternetecommerce(stockCollect);
        }
    }
    public String[] getBKInternetecommerce() {
        return stockCollectMapper.selectBKInternetecommerce();
    }
    public void delBKInternetecommerce(String tsCode) { stockCollectMapper.delBKInternetecommerce(tsCode); }




    public void collectBKProcessingagriculturalproducts(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKProcessingagriculturalproducts(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKProcessingagriculturalproducts(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKProcessingagriculturalproducts(stockCollect);
        }
    }
    public String[] getBKProcessingagriculturalproducts() {
        return stockCollectMapper.selectBKProcessingagriculturalproducts();
    }
    public void delBKProcessingagriculturalproducts(String tsCode) { stockCollectMapper.delBKProcessingagriculturalproducts(tsCode); }


    public void collectBKPhotovoltaicequipment(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKPhotovoltaicequipment(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKPhotovoltaicequipment(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKPhotovoltaicequipment(stockCollect);
        }
    }
    public String[] getBKPhotovoltaicequipment() {
        return stockCollectMapper.selectBKPhotovoltaicequipment();
    }
    public void delBKPhotovoltaicequipment(String tsCode) { stockCollectMapper.delBKPhotovoltaicequipment(tsCode); }


    public void collectBKTextilemanufacturing(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKTextilemanufacturing(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKTextilemanufacturing(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKTextilemanufacturing(stockCollect);
        }
    }
    public String[] getBKTextilemanufacturing() {
        return stockCollectMapper.selectBKTextilemanufacturing();
    }
    public void delBKTextilemanufacturing(String tsCode) { stockCollectMapper.delBKTextilemanufacturing(tsCode); }


    public void collectBKRailwayequipment(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKRailwayequipment(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKRailwayequipment(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKRailwayequipment(stockCollect);
        }
    }
    public String[] getBKRailwayequipment() {
        return stockCollectMapper.selectBKRailwayequipment();
    }
    public void delBKRailwayequipment(String tsCode) { stockCollectMapper.delBKRailwayequipment(tsCode); }



    public void collectBKCarservice(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKCarservice(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKCarservice(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKCarservice(stockCollect);
        }
    }
    public String[] getBKCarservice() {
        return stockCollectMapper.selectBKCarservice();
    }
    public void delBKCarservice(String tsCode) { stockCollectMapper.delBKCarservice(tsCode); }


    public void collectBKWhitesmallhold(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKWhitesmallhold(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKWhitesmallhold(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKWhitesmallhold(stockCollect);
        }
    }
    public String[] getBKWhitesmallhold() {
        return stockCollectMapper.selectBKWhitesmallhold();
    }
    public void delBKWhitesmallhold(String tsCode) { stockCollectMapper.delBKWhitesmallhold(tsCode); }

    public void collectBKPlasticprd(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKPlasticprd(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKPlasticprd(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKPlasticprd(stockCollect);
        }
    }
    public String[] getBKPlasticprd() {
        return stockCollectMapper.selectBKPlasticprd();
    }
    public void delBKPlasticprd(String tsCode) { stockCollectMapper.delBKPlasticprd(tsCode); }


    public void collectBKOtherelectronic(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKOtherelectronic(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKOtherelectronic(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKOtherelectronic(stockCollect);
        }
    }
    public String[] getBKOtherelectronic() {
        return stockCollectMapper.selectBKOtherelectronic();
    }
    public void delBKOtherelectronic(String tsCode) { stockCollectMapper.delBKOtherelectronic(tsCode); }




    public void collectBKEnvironmentequipment(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKEnvironmentequipment(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKEnvironmentequipment(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKEnvironmentequipment(stockCollect);
        }
    }
    public String[] getBKEnvironmentequipment() {
        return stockCollectMapper.selectBKEnvironmentequipment();
    }
    public void delBKEnvironmentequipment(String tsCode) { stockCollectMapper.delBKEnvironmentequipment(tsCode); }



    public void collectBKBrowngoods(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKBrowngoods(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKBrowngoods(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKBrowngoods(stockCollect);
        }
    }
    public String[] getBKBrowngoods() {
        return stockCollectMapper.selectBKBrowngoods();
    }
    public void delBKBrowngoods(String tsCode) { stockCollectMapper.delBKBrowngoods(tsCode); }



    public void collectBKCarparts(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKCarparts(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKCarparts(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKCarparts(stockCollect);
        }
    }
    public String[] getBKCarparts() {
        return stockCollectMapper.selectBKCarparts();
    }
    public void delBKCarparts(String tsCode) { stockCollectMapper.delBKCarparts(tsCode); }


    public void collectBKEnergymetal(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKEnergymetal(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKEnergymetal(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKEnergymetal(stockCollect);
        }
    }
    public String[] getBKEnergymetal() {
        return stockCollectMapper.selectBKEnergymetal();
    }
    public void delBKEnergymetal(String tsCode) { stockCollectMapper.delBKEnergymetal(tsCode); }



    public void collectBKAutoequipment(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKAutoequipment(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKAutoequipment(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKAutoequipment(stockCollect);
        }
    }
    public String[] getBKAutoequipment() {
        return stockCollectMapper.selectBKAutoequipment();
    }
    public void delBKAutoequipment(String tsCode) { stockCollectMapper.delBKAutoequipment(tsCode); }



    public void collectBKInsurance(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKInsurance(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKInsurance(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKInsurance(stockCollect);
        }
    }
    public String[] getBKInsurance() {
        return stockCollectMapper.selectBKInsurance();
    }
    public void delBKInsurance(String tsCode) { stockCollectMapper.delBKInsurance(tsCode); }

    public void collectBKItservice(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKItservice(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKItservice(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKItservice(stockCollect);
        }
    }
    public String[] getBKItservice() {
        return stockCollectMapper.selectBKItservice();
    }
    public void delBKItservice(String tsCode) { stockCollectMapper.delBKItservice(tsCode); }



    public void collectBKMilitaryelectronic(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKMilitaryelectronic(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKMilitaryelectronic(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKMilitaryelectronic(stockCollect);
        }
    }
    public String[] getBKMilitaryelectronic() {
        return stockCollectMapper.selectBKMilitaryelectronic();
    }
    public void delBKMilitaryelectronic(String tsCode) { stockCollectMapper.delBKMilitaryelectronic(tsCode); }


    public void collectBKAviationequipment(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKAviationequipment(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKAviationequipment(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKAviationequipment(stockCollect);
        }
    }
    public String[] getBKAviationequipment() {
        return stockCollectMapper.selectBKAviationequipment();
    }
    public void delBKAviationequipment(String tsCode) { stockCollectMapper.delBKAviationequipment(tsCode); }



    public void collectBKPhotovoltaicpowergeneration(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKPhotovoltaicpowergeneration(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKPhotovoltaicpowergeneration(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKPhotovoltaicpowergeneration(stockCollect);
        }
    }
    public String[] getBKPhotovoltaicpowergeneration() {
        return stockCollectMapper.selectBKPhotovoltaicpowergeneration();
    }
    public void delBKPhotovoltaicpowergeneration(String tsCode) { stockCollectMapper.delBKPhotovoltaicpowergeneration(tsCode); }



    public void collectBKSatellite(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKSatellite(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKSatellite(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKSatellite(stockCollect);
        }
    }
    public String[] getBKSatellite() {
        return stockCollectMapper.selectBKSatellite();
    }
    public void delBKSatellite(String tsCode) { stockCollectMapper.delBKSatellite(tsCode); }



    public void collectBKEntertainment(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKEntertainment(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKEntertainment(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKEntertainment(stockCollect);
        }
    }
    public String[] getBKEntertainment() {
        return stockCollectMapper.selectBKEntertainment();
    }
    public void delBKEntertainment(String tsCode) { stockCollectMapper.delBKEntertainment(tsCode); }

    public void collectBKDatacenter(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKDatacenter(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKDatacenter(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKDatacenter(stockCollect);
        }
    }
    public String[] getBKDatacenter() {
        return stockCollectMapper.selectBKDatacenter();
    }
    public void delBKDatacenter(String tsCode) { stockCollectMapper.delBKDatacenter(tsCode); }


    public void collectBKPort(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKPort(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKPort(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKPort(stockCollect);
        }
    }
    public String[] getBKPort() {
        return stockCollectMapper.selectBKPort();
    }
    public void delBKPort(String tsCode) { stockCollectMapper.delBKPort(tsCode); }


    public void collectBKBearing(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKBearing(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKBearing(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKBearing(stockCollect);
        }
    }
    public String[] getBKBearing() {
        return stockCollectMapper.selectBKBearing();
    }
    public void delBKBearing(String tsCode) { stockCollectMapper.delBKBearing(tsCode); }
    public void collectBKCNC(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKCNC(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKCNC(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKCNC(stockCollect);
        }
    }
    public String[] getBKCNC() {
        return stockCollectMapper.selectBKCNC();
    }
    public void delBKCNC(String tsCode) { stockCollectMapper.delBKCNC(tsCode); }


    public void collectBKElectronicequipment(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKElectronicequipment(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKElectronicequipment(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKElectronicequipment(stockCollect);
        }
    }
    public String[] getBKElectronicequipment() {
        return stockCollectMapper.selectBKElectronicequipment();
    }
    public void delBKElectronicequipment(String tsCode) { stockCollectMapper.delBKElectronicequipment(tsCode); }


    public void collectBKPowerequipment(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKPowerequipment(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKPowerequipment(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKPowerequipment(stockCollect);
        }
    }
    public String[] getBKPowerequipment() {
        return stockCollectMapper.selectBKPowerequipment();
    }
    public void delBKPowerequipment(String tsCode) { stockCollectMapper.delBKPowerequipment(tsCode); }



    public void collectBKMilitaryindustry(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKMilitaryindustry(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKMilitaryindustry(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKMilitaryindustry(stockCollect);
        }
    }
    public String[] getBKMilitaryindustry() {
        return stockCollectMapper.selectBKMilitaryindustry();
    }
    public void delBKMilitaryindustry(String tsCode) { stockCollectMapper.delBKMilitaryindustry(tsCode); }

    public void collectBKBasicMetalxi(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKBasicMetalxi(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKBasicMetalxi(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKBasicMetalxi(stockCollect);
        }
    }
    public String[] getBKBasicMetalxi() {
        return stockCollectMapper.selectBKBasicMetalxi();
    }
    public void delBKBasicMetalxi(String tsCode) { stockCollectMapper.delBKBasicMetalxi(tsCode); }

    public void collectBKCell(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKCell(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKCell(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKCell(stockCollect);
        }
    }
    public String[] getBKCell() {
        return stockCollectMapper.selectBKCell();
    }
    public void delBKCell(String tsCode) { stockCollectMapper.delBKCell(tsCode); }
    public void collectBKJewelry(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKJewelry(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKJewelry(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKJewelry(stockCollect);
        }
    }
    public String[] getBKJewelry() {
        return stockCollectMapper.selectBKJewelry();
    }
    public void delBKJewelry(String tsCode) { stockCollectMapper.delBKJewelry(tsCode); }


    public void collectBKGlass(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKGlass(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKGlass(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKGlass(stockCollect);
        }
    }
    public String[] getBKGlass() {
        return stockCollectMapper.selectBKGlass();
    }
    public void delBKGlass(String tsCode) { stockCollectMapper.delBKGlass(tsCode); }




    public void collectBKRealestateservices(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKRealestateservices(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKRealestateservices(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKRealestateservices(stockCollect);
        }
    }
    public String[] getBKRealestateservices() {
        return stockCollectMapper.selectBKRealestateservices();
    }
    public void delBKRealestateservices(String tsCode) { stockCollectMapper.delBKRealestateservices(tsCode); }


    public void collectBKBasicmetaltong(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKBasicmetaltong(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKBasicmetaltong(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKBasicmetaltong(stockCollect);
        }
    }
    public String[] getBKBasicmetaltong() {
        return stockCollectMapper.selectBKBasicmetaltong();
    }
    public void delBKBasicmetaltong(String tsCode) { stockCollectMapper.delBKBasicmetaltong(tsCode); }


    public void collectBKPreciousli(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKPreciousli(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKPreciousli(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKPreciousli(stockCollect);
        }
    }
    public String[] getBKPreciousli() {
        return stockCollectMapper.selectBKPreciousli();
    }
    public void delBKPreciousli(String tsCode) { stockCollectMapper.delBKPreciousli(tsCode); }




    public void collectBKMedicalservice(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKMedicalservice(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKMedicalservice(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKMedicalservice(stockCollect);
        }
    }
    public String[] getBKMedicalservice() {
        return stockCollectMapper.selectBKMedicalservice();
    }
    public void delBKMedicalservice(String tsCode) { stockCollectMapper.delBKMedicalservice(tsCode); }


    public void collectBKSyntheticfibersresins(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKSyntheticfibersresins(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKSyntheticfibersresins(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKSyntheticfibersresins(stockCollect);
        }
    }
    public String[] getBKSyntheticfibersresins() {
        return stockCollectMapper.selectBKSyntheticfibersresins();
    }
    public void delBKSyntheticfibersresins(String tsCode) { stockCollectMapper.delBKSyntheticfibersresins(tsCode); }


    public void collectBKHomefurnishing(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKHomefurnishing(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKHomefurnishing(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKHomefurnishing(stockCollect);
        }
    }
    public String[] getBKHomefurnishing() {
        return stockCollectMapper.selectBKHomefurnishing();
    }
    public void delBKHomefurnishing(String tsCode) { stockCollectMapper.delBKHomefurnishing(tsCode); }



    public void collectBKBeverage(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKBeverage(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKBeverage(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKBeverage(stockCollect);
        }
    }
    public String[] getBKBeverage() {
        return stockCollectMapper.selectBKBeverage();
    }
    public void delBKBeverage(String tsCode) { stockCollectMapper.delBKBeverage(tsCode); }



    public void collectBKMetalprd(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKMetalprd(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKMetalprd(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKMetalprd(stockCollect);
        }
    }
    public String[] getBKMetalprd() {
        return stockCollectMapper.selectBKMetalprd();
    }
    public void delBKMetalprd(String tsCode) { stockCollectMapper.delBKMetalprd(tsCode); }

    public void collectBKBasicmetal(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKBasicmetal(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKBasicmetal(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKBasicmetal(stockCollect);
        }
    }
    public String[] getBKBasicmetal() {
        return stockCollectMapper.selectBKBasicmetal();
    }
    public void delBKBasicmetal(String tsCode) { stockCollectMapper.delBKBasicmetal(tsCode); }
    public void collectBKMarketingservices(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKMarketingservices(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKMarketingservices(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKMarketingservices(stockCollect);
        }
    }
    public String[] getBKMarketingservices() {
        return stockCollectMapper.selectBKMarketingservices();
    }
    public void delBKMarketingservices(String tsCode) { stockCollectMapper.delBKMarketingservices(tsCode); }


    public void collectBKEducation(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKEducation(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKEducation(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKEducation(stockCollect);
        }
    }
    public String[] getBKEducation() {
        return stockCollectMapper.selectBKEducation();
    }
    public void delBKEducation(String tsCode) { stockCollectMapper.delBKEducation(tsCode); }



    public void collectBKChinesemedicine(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKChinesemedicine(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKChinesemedicine(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKChinesemedicine(stockCollect);
        }
    }
    public String[] getBKChinesemedicine() {
        return stockCollectMapper.selectBKChinesemedicine();
    }
    public void delBKChinesemedicine(String tsCode) { stockCollectMapper.delBKChinesemedicine(tsCode); }
    public void collectBKBiopharmaceuticals(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKBiopharmaceuticals(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKBiopharmaceuticals(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKBiopharmaceuticals(stockCollect);
        }
    }
    public String[] getBKBiopharmaceuticals() {
        return stockCollectMapper.selectBKBiopharmaceuticals();
    }
    public void delBKBiopharmaceuticals(String tsCode) { stockCollectMapper.delBKBiopharmaceuticals(tsCode); }


    public void collectBKChemicalpharmaceuticals(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKChemicalpharmaceuticals(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKChemicalpharmaceuticals(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKChemicalpharmaceuticals(stockCollect);
        }
    }
    public String[] getBKChemicalpharmaceuticals() {
        return stockCollectMapper.selectBKChemicalpharmaceuticals();
    }
    public void delBKChemicalpharmaceuticals(String tsCode) { stockCollectMapper.delBKChemicalpharmaceuticals(tsCode); }


    public void collectBKRoad(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKRoad(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKRoad(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKRoad(stockCollect);
        }
    }
    public String[] getBKRoad() {
        return stockCollectMapper.selectBKRoad();
    }
    public void delBKRoad(String tsCode) { stockCollectMapper.delBKRoad(tsCode); }

    @Autowired
    private StockCollectMapper stockCollectMapper;
    public void collectBKBank(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKBank(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKBank(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKBank(stockCollect);
        }
    }
    public String[] getBKBank() {
        return stockCollectMapper.selectBKBank();
    }
    public void delBKBank(String tsCode) { stockCollectMapper.delBKBank(tsCode); }


    public void collectBKWine(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKWine(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKWine(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKWine(stockCollect);
        }
    }
    public String[] getBKWine() {
        return stockCollectMapper.selectBKWine();
    }
    public void delBKWine(String tsCode) { stockCollectMapper.delBKWine(tsCode); }



    public void collectBKElectricalmachinery(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKElectricalmachinery(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKElectricalmachinery(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKElectricalmachinery(stockCollect);
        }
    }
    public String[] getBKElectricalmachinery() {
        return stockCollectMapper.selectBKElectricalmachinery();
    }
    public void delBKElectricalmachinery(String tsCode) { stockCollectMapper.delBKElectricalmachinery(tsCode); }


    public void collectBKFishing(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKFishing(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKFishing(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKFishing(stockCollect);
        }
    }
    public String[] getBKFishing() {
        return stockCollectMapper.selectBKFishing();
    }
    public void delBKFishing(String tsCode) { stockCollectMapper.delBKFishing(tsCode); }
    public void collectBKPhotovoltaic(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKPhotovoltaic(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKPhotovoltaic(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKPhotovoltaic(stockCollect);
        }
    }
    public String[] getBKPhotovoltaic() {
        return stockCollectMapper.selectBKPhotovoltaic();
    }
    public void delBKPhotovoltaic(String tsCode) { stockCollectMapper.delBKPhotovoltaic(tsCode); }


    public void collectBKCoal(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKCoal(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKCoal(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKCoal(stockCollect);
        }
    }
    public String[] getBKCoal() {
        return stockCollectMapper.selectBKCoal();
    }
    public void delBKCoal(String tsCode) { stockCollectMapper.delBKCoal(tsCode); }


    public void collectBKAnimalhusbandry(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKAnimalhusbandry(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKAnimalhusbandry(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKAnimalhusbandry(stockCollect);
        }
    }
    public String[] getBKAnimalhusbandry() {
        return stockCollectMapper.selectBKAnimalhusbandry();
    }
    public void delBKAnimalhusbandry(String tsCode) { stockCollectMapper.delBKAnimalhusbandry(tsCode); }

    public void collectBKDecoration(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKDecoration(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKDecoration(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKDecoration(stockCollect);
        }
    }
    public String[] getBKDecoration() {
        return stockCollectMapper.selectBKDecoration();
    }
    public void delBKDecoration(String tsCode) { stockCollectMapper.delBKDecoration(tsCode); }

    public void collectBKPreciousmetal(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKPreciousmetal(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKPreciousmetal(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKPreciousmetal(stockCollect);
        }
    }
    public String[] getBKPreciousmetal() {
        return stockCollectMapper.selectBKPreciousmetal();
    }
    public void delBKPreciousmetal(String tsCode) { stockCollectMapper.delBKPreciousmetal(tsCode); }


    public void collectBKChemicalraw(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKChemicalraw(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKChemicalraw(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKChemicalraw(stockCollect);
        }
    }
    public String[] getBKChemicalraw() {
        return stockCollectMapper.selectBKChemicalraw();
    }
    public void delBKChemicalraw(String tsCode) { stockCollectMapper.delBKChemicalraw(tsCode); }


    public void collectBKLightindustry(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKLightindustry(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKLightindustry(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKLightindustry(stockCollect);
        }
    }
    public String[] getBKLightindustry() {
        return stockCollectMapper.selectBKLightindustry();
    }
    public void delBKLightindustry(String tsCode) { stockCollectMapper.delBKLightindustry(tsCode); }

    public void collectBKLeisureservices(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKLeisureservices(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKLeisureservices(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKLeisureservices(stockCollect);
        }
    }
    public String[] getBKLeisureservices() {
        return stockCollectMapper.selectBKLeisureservices();
    }
    public void delBKLeisureservices(String tsCode) { stockCollectMapper.delBKLeisureservices(tsCode); }


    public void collectBKBond(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKBond(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKBond(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKBond(stockCollect);
        }
    }
    public String[] getBKBond() {
        return stockCollectMapper.selectBKBond();
    }
    public void delBKBond(String tsCode) { stockCollectMapper.delBKBond(tsCode); }

    public void collectBKMedium(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKMedium(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKMedium(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKMedium(stockCollect);
        }
    }
    public String[] getBKMedium() {
        return stockCollectMapper.selectBKMedium();
    }
    public void delBKMedium(String tsCode) { stockCollectMapper.delBKMedium(tsCode); }

    public void collectBKConsumerelectronics(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKConsumerelectronics(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKConsumerelectronics(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKConsumerelectronics(stockCollect);
        }
    }
    public String[] getBKConsumerelectronics() {
        return stockCollectMapper.selectBKConsumerelectronics();
    }
    public void delBKConsumerelectronics(String tsCode) { stockCollectMapper.delBKConsumerelectronics(tsCode); }



    public void collectBKSmallhome(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKSmallhome(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKSmallhome(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKSmallhome(stockCollect);
        }
    }
    public String[] getBKSmallhome() {
        return stockCollectMapper.selectBKSmallhome();
    }
    public void delBKSmallhome(String tsCode) { stockCollectMapper.delBKSmallhome(tsCode); }


    public void collectBKWeave(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKWeave(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKWeave(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKWeave(stockCollect);
        }
    }
    public String[] getBKWeave() {
        return stockCollectMapper.selectBKWeave();
    }
    public void delBKWeave(String tsCode) { stockCollectMapper.delBKWeave(tsCode); }

    public void collectBKMetal(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKMetal(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKMetal(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKMetal(stockCollect);
        }
    }
    public String[] getBKMetal() {
        return stockCollectMapper.selectBKMetal();
    }
    public void delBKMetal(String tsCode) { stockCollectMapper.delBKMetal(tsCode); }



    public void collectBKBuildingconstruction(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKBuildingconstruction(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKBuildingconstruction(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKBuildingconstruction(stockCollect);
        }
    }
    public String[] getBKBuildingconstruction() {
        return stockCollectMapper.selectBKBuildingconstruction();
    }
    public void delBKBuildingconstruction(String tsCode) { stockCollectMapper.delBKBuildingconstruction(tsCode); }



    public void collectBKRubber(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKRubber(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKRubber(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKRubber(stockCollect);
        }
    }
    public String[] getBKRubber() {
        return stockCollectMapper.selectBKRubber();
    }
    public void delBKRubber(String tsCode) { stockCollectMapper.delBKRubber(tsCode); }


    public void collectBKCommercialproperties(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKCommercialproperties(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKCommercialproperties(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKCommercialproperties(stockCollect);
        }
    }
    public String[] getBKCommercialproperties() {
        return stockCollectMapper.selectBKCommercialproperties();
    }
    public void delBKCommercialproperties(String tsCode) { stockCollectMapper.delBKCommercialproperties(tsCode); }




    public void collectBKOtherbuildingmaterials(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKOtherbuildingmaterials(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKOtherbuildingmaterials(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKOtherbuildingmaterials(stockCollect);
        }
    }
    public String[] getBKOtherbuildingmaterials() {
        return stockCollectMapper.selectBKOtherbuildingmaterials();
    }
    public void delBKOtherbuildingmaterials(String tsCode) { stockCollectMapper.delBKOtherbuildingmaterials(tsCode); }


    public void collectBKInfrastructure(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKInfrastructure(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKInfrastructure(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKInfrastructure(stockCollect);
        }
    }
    public String[] getBKInfrastructure() {
        return stockCollectMapper.selectBKInfrastructure();
    }
    public void delBKInfrastructure(String tsCode) { stockCollectMapper.delBKInfrastructure(tsCode); }




    public void collectBKSoftware(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKSoftware(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKSoftware(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKSoftware(stockCollect);
        }
    }
    public String[] getBKSoftware() {
        return stockCollectMapper.selectBKSoftware();
    }
    public void delBKSoftware(String tsCode) { stockCollectMapper.delBKSoftware(tsCode); }



    public void collectBKGas(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKGas(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKGas(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKGas(stockCollect);
        }
    }
    public String[] getBKGas() {
        return stockCollectMapper.selectBKGas();
    }
    public void delBKGas(String tsCode) { stockCollectMapper.delBKGas(tsCode); }



    public void collectBKMedicalequipment(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKMedicalequipment(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKMedicalequipment(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKMedicalequipment(stockCollect);
        }
    }
    public String[] getBKMedicalequipment() {
        return stockCollectMapper.selectBKMedicalequipment();
    }
    public void delBKMedicalequipment(String tsCode) { stockCollectMapper.delBKMedicalequipment(tsCode); }



    public void collectBKAgriculture(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKAgriculture(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKAgriculture(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKAgriculture(stockCollect);
        }
    }
    public String[] getBKAgriculture() {
        return stockCollectMapper.selectBKAgriculture();
    }
    public void delBKAgriculture(String tsCode) { stockCollectMapper.delBKAgriculture(tsCode); }


    public void collectBKComputerhardware(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKComputerhardware(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKComputerhardware(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKComputerhardware(stockCollect);
        }
    }
    public String[] getBKComputerhardware() {
        return stockCollectMapper.selectBKComputerhardware();
    }
    public void delBKComputerhardware(String tsCode) { stockCollectMapper.delBKComputerhardware(tsCode); }


    public void collectBKLogistics(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKLogistics(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKLogistics(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKLogistics(stockCollect);
        }
    }
    public String[] getBKLogistics() {
        return stockCollectMapper.selectBKLogistics();
    }
    public void delBKLogistics(String tsCode) { stockCollectMapper.delBKLogistics(tsCode); }


    public void collectBKCommonequipment(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKCommonequipment(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKCommonequipment(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKCommonequipment(stockCollect);
        }
    }
    public String[] getBKCommonequipment() {
        return stockCollectMapper.selectBKCommonequipment();
    }
    public void delBKCommonequipment(String tsCode) { stockCollectMapper.delBKCommonequipment(tsCode); }



    public void collectBKCeramics(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKCeramics(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKCeramics(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKCeramics(stockCollect);
        }
    }
    public String[] getBKCeramics() {
        return stockCollectMapper.selectBKCeramics();
    }
    public void delBKCeramics(String tsCode) { stockCollectMapper.delBKCeramics(tsCode); }



    public void collectBKSpecialequipment(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKSpecialequipment(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKSpecialequipment(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKSpecialequipment(stockCollect);
        }
    }
    public String[] getBKSpecialequipment() {
        return stockCollectMapper.selectBKSpecialequipment();
    }
    public void delBKSpecialequipment(String tsCode) { stockCollectMapper.delBKSpecialequipment(tsCode); }


    public void collectBKElequpiment(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKElequpiment(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKElequpiment(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKElequpiment(stockCollect);
        }
    }
    public String[] getBKElequpiment() {
        return stockCollectMapper.selectBKElequpiment();
    }
    public void delBKElequpiment(String tsCode) { stockCollectMapper.delBKElequpiment(tsCode); }


    public void collectBKTour(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKTour(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKTour(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKTour(stockCollect);
        }
    }
    public String[] getBKTour() {
        return stockCollectMapper.selectBKTour();
    }
    public void delBKTour(String tsCode) { stockCollectMapper.delBKTour(tsCode); }


    public void collectBKBroadcast(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKBroadcast(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKBroadcast(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKBroadcast(stockCollect);
        }
    }
    public String[] getBKBroadcast() {
        return stockCollectMapper.selectBKBroadcast();
    }
    public void delBKBroadcast(String tsCode) { stockCollectMapper.delBKBroadcast(tsCode); }




    public void collectBKTree(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKTree(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKTree(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKTree(stockCollect);
        }
    }
    public String[] getBKTree() {
        return stockCollectMapper.selectBKTree();
    }
    public void delBKTree(String tsCode) { stockCollectMapper.delBKTree(tsCode); }



    public void collectBKPesticide(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKPesticide(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKPesticide(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKPesticide(stockCollect);
        }
    }
    public String[] getBKPesticide() {
        return stockCollectMapper.selectBKPesticide();
    }
    public void delBKPesticide(String tsCode) { stockCollectMapper.delBKPesticide(tsCode); }



    public void collectBKClothes(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKClothes(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKClothes(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKClothes(stockCollect);
        }
    }
    public String[] getBKClothes() {
        return stockCollectMapper.selectBKClothes();
    }
    public void delBKClothes(String tsCode) { stockCollectMapper.delBKClothes(tsCode); }

    public void collectBKSale(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKSale(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKSale(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKSale(stockCollect);
        }
    }
    public String[] getBKSale() {
        return stockCollectMapper.selectBKSale();
    }
    public void delBKSale(String tsCode) { stockCollectMapper.delBKSale(tsCode); }



    public void collectBKNonBank(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKNonBank(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKNonBank(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKNonBank(stockCollect);
        }
    }
    public String[] getBKNonBank() {
        return stockCollectMapper.selectBKNonBank();
    }
    public void delBKNonBank(String tsCode) { stockCollectMapper.delBKNonBank(tsCode); }


    public void collectBKSteel(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKSteel(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKSteel(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKSteel(stockCollect);
        }
    }
    public String[] getBKSteel() {
        return stockCollectMapper.selectBKSteel();
    }
    public void delBKSteel(String tsCode) { stockCollectMapper.delBKSteel(tsCode); }



    public void collectBKChemical(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKChemical(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKChemical(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKChemical(stockCollect);
        }
    }
    public String[] getBKChemical() {
        return stockCollectMapper.selectBKChemical();
    }
    public void delBKChemical(String tsCode) { stockCollectMapper.delBKChemical(tsCode); }


    public void collectBKOther(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKOther(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKOther(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKOther(stockCollect);
        }
    }
    public String[] getBKOther() {
        return stockCollectMapper.selectBKOther();
    }
    public void delBKOther(String tsCode) { stockCollectMapper.delBKOther(tsCode); }


    public void collectBKPaper(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKPaper(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKPaper(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKPaper(stockCollect);
        }
    }
    public String[] getBKPaper() {
        return stockCollectMapper.selectBKPaper();
    }
    public void delBKPaper(String tsCode) { stockCollectMapper.delBKPaper(tsCode); }


    public void collectBKEnvironment(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKEnvironment(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKEnvironment(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKEnvironment(stockCollect);
        }
    }
    public String[] getBKEnvironment() {
        return stockCollectMapper.selectBKEnvironment();
    }
    public void delBKEnvironment(String tsCode) { stockCollectMapper.delBKEnvironment(tsCode); }

    public void collectBKEquipment(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKEquipment(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKEquipment(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKEquipment(stockCollect);
        }
    }
    public String[] getBKEquipment() {
        return stockCollectMapper.selectBKEquipment();
    }
    public void delBKEquipment(String tsCode) { stockCollectMapper.delBKEquipment(tsCode); }

    public void collectBKMaterial(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKMaterial(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKMaterial(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKMaterial(stockCollect);
        }
    }
    public String[] getBKMaterial() {
        return stockCollectMapper.selectBKMaterial();
    }
    public void delBKMaterial(String tsCode) { stockCollectMapper.delBKMaterial(tsCode); }



    public void collectBKCommunication(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKCommunication(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKCommunication(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKCommunication(stockCollect);
        }
    }
    public String[] getBKCommunication() {
        return stockCollectMapper.selectBKCommunication();
    }
    public void delBKCommunication(String tsCode) { stockCollectMapper.delBKCommunication(tsCode); }

    public void collectBKElectric(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKElectric(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKElectric(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKElectric(stockCollect);
        }
    }
    public String[] getBKElectric() {
        return stockCollectMapper.selectBKElectric();
    }
    public void delBKElectric(String tsCode) { stockCollectMapper.delBKElectric(tsCode); }

    public void collectBKTransport(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKTransport(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKTransport(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKTransport(stockCollect);
        }
    }
    public String[] getBKTransport() {
        return stockCollectMapper.selectBKTransport();
    }
    public void delBKTransport(String tsCode) { stockCollectMapper.delBKTransport(tsCode); }


    public void collectBKTrade(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKTrade(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKTrade(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKTrade(stockCollect);
        }
    }
    public String[] getBKTrade() {
        return stockCollectMapper.selectBKTrade();
    }
    public void delBKTrade(String tsCode) { stockCollectMapper.delBKTrade(tsCode); }


    public void collectBKCar(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKCar(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKCar(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKCar(stockCollect);
        }
    }
    public String[] getBKCar() {
        return stockCollectMapper.selectBKCar();
    }
    public void delBKCar(String tsCode) { stockCollectMapper.delBKCar(tsCode); }



    public void collectBKComputer(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKComputer(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKComputer(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKComputer(stockCollect);
        }
    }
    public String[] getBKComputer() {
        return stockCollectMapper.selectBKComputer();
    }
    public void delBKComputer(String tsCode) { stockCollectMapper.delBKComputer(tsCode); }


    public void collectBKSemiconductor(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKSemiconductor(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKSemiconductor(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKSemiconductor(stockCollect);
        }
    }
    public String[] getBKSemiconductor() {
        return stockCollectMapper.selectBKSemiconductor();
    }
    public void delBKSemiconductor(String tsCode) { stockCollectMapper.delBKSemiconductor(tsCode); }


    public void collectBKBuild(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKBuild(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKBuild(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKBuild(stockCollect);
        }
    }
    public String[] getBKBuild() {
        return stockCollectMapper.selectBKBuild();
    }
    public void delBKBuild(String tsCode) { stockCollectMapper.delBKBuild(tsCode); }


    public void collectBKFood(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKFood(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKFood(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKFood(stockCollect);
        }
    }
    public String[] getBKFood() {
        return stockCollectMapper.selectBKFood();
    }
    public void delBKFood(String tsCode) { stockCollectMapper.delBKFood(tsCode); }



    public void collectBKMedicine(String tsCode) {
        int count = stockCollectMapper.checkIfExistsBKMedicine(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateBKMedicine(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertBKMedicine(stockCollect);
        }
    }
    public String[] getBKMedicine() {
        return stockCollectMapper.selectBKMedicine();
    }
    public void delBKMedicine(String tsCode) { stockCollectMapper.delBKMedicine(tsCode); }









    public String getIsFavorite(String tsCode) {
        return stockCollectMapper.selectIsFavoriteByTsCode(tsCode);
    }

    public void collectPctMore(String tsCode) {
        int count = stockCollectMapper.checkIfExists(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.collectPctMore(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setIsPct10One("2");
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insert(stockCollect);
        }
    }

    public void collectPctOne(String tsCode) {
        int count = stockCollectMapper.checkIfExists(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.collectPctOne(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setIsPct10One("1");
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insert(stockCollect);
        }
    }

    public void collectDaliang(String tsCode) {
        int count = stockCollectMapper.checkIfExistsDaliang(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.collectDaliang(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setIsPct10One("1");
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertDaliang(stockCollect);
        }
    }

    public void collectST(String tsCode) {
        int count = stockCollectMapper.checkIfExistsST(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.collectUpdateST(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertST(stockCollect);
        }
    }

    public void collectQiaoqiao(String tsCode) {
        int count = stockCollectMapper.checkIfExistsQiaoqiao(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.collectUpdateQiaoqiao(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setIsPct10One("1");
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertQiaoqiao(stockCollect);
        }
    }

    public void collectWaitback(String tsCode) {
        int count = stockCollectMapper.checkIfExistsWaitback(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.collectUpdateWaitback(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertWaitback(stockCollect);
        }
    }


    public void collectShape(String tsCode) {
        int count = stockCollectMapper.checkIfExistsShape(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.collectUpdateShape(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertShape(stockCollect);
        }
    }


    public String[] getPctMore() {
        return stockCollectMapper.selectPctMore();
    }

    public String[] getPctOne() {
        return stockCollectMapper.selectPctOne();
    }

    public String[] getDaliang() {
        return stockCollectMapper.selectDaliang();
    }

    public String[] getST() {
        return stockCollectMapper.selectST();
    }

    public String[] getQiaoqiao() {
        return stockCollectMapper.selectQiaoqiao();
    }

    public String[] getWaitback() {
        return stockCollectMapper.selectWaitback();
    }




    public String[] getShape() {
        return stockCollectMapper.selectShape();
    }

    public void delPctOne(String tsCode) {
        stockCollectMapper.delPctOne(tsCode);
    }
    public void delPctMore(String tsCode) {
        stockCollectMapper.delPctMore(tsCode);
    }

    public void deleteCollectDaliang(String tsCode) {
        stockCollectMapper.cancelCollectDaliang(tsCode);
    }

    public void deleteCollectST(String tsCode) {
        stockCollectMapper.cancelCollectST(tsCode);
    }

    public void deleteCollectQiaoqiao(String tsCode) {
        stockCollectMapper.cancelCollectQiaoqiao(tsCode);
    }

    public void delWaitback(String tsCode) {
        stockCollectMapper.delWaitback(tsCode);
    }

    public void delShape(String tsCode) {
        stockCollectMapper.delShape(tsCode);
    }
    public void bkTop(String tsCode) {
        Date date = new Date();
        stockCollectMapper.bkTop(tsCode,date);
    }
    public void bkBottom(String tsCode) {
//        Calendar calendar = Calendar.getInstance();
//        calendar.add(Calendar.YEAR, -1);
//        calendar.add(Calendar.DATE, -1);
//        // 获取去年的今天的日期对象
//        Date lastYearToday = calendar.getTime();
//        stockCollectMapper.bkBottom(tsCode,lastYearToday);
        Date date = new Date();
        stockCollectMapper.bkTop(tsCode,date);
    }
    public void bkTopst(String tsCode) {
        Date date = new Date();
        stockCollectMapper.bkTopst(tsCode,date);
    }
    public void bkBottomst(String tsCode) {
//        Calendar calendar = Calendar.getInstance();
//        calendar.add(Calendar.YEAR, -1);
//        calendar.add(Calendar.DATE, -1);
//        // 获取去年的今天的日期对象
//        Date lastYearToday = calendar.getTime();
//        stockCollectMapper.bkBottomst(tsCode,lastYearToday);
        Date date = new Date();
        stockCollectMapper.bkTop(tsCode,date);
    }

    public void moveItemTop(String tsCode) {
        String flag = stockCollectMapper.selectFlagById(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrder(flag);
        StockCollect minStockCollect = stockCollectMapper.selectMinOrder(flag);
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() + 1;
                stockCollectMapper.updateSortOrder(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置顶
        stockCollectMapper.updateSortOrder(tsCode, minStockCollect.getSortOrder());
    }

    public void moveItemBottom(String tsCode) {
        String flag = stockCollectMapper.selectFlagById(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrder(flag);
        StockCollect maxStockCollect = stockCollectMapper.selectMaxOrder(flag);
        int bottomSortOrder = maxStockCollect.getSortOrder();
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() - 1;
                stockCollectMapper.updateSortOrder(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置底
        stockCollectMapper.updateSortOrder(tsCode, bottomSortOrder);
    }

    public void moveItemUp(String tsCode) {
        String flag = stockCollectMapper.selectFlagById(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrder(flag);

        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getTsCode().equals(tsCode)) {
                // 找到当前记录的索引
                int currentIndex = i;
                if (currentIndex > 0) {
                    // 交换当前记录和前一条记录的排序值
                    StockCollect current = allItems.get(currentIndex);
                    StockCollect previous = allItems.get(currentIndex - 1);
                    int tempSortOrder = current.getSortOrder();
                    current.setSortOrder(previous.getSortOrder());
                    previous.setSortOrder(tempSortOrder);

                    stockCollectMapper.updateSortOrder(current.getTsCode(), current.getSortOrder());
                    stockCollectMapper.updateSortOrder(previous.getTsCode(), previous.getSortOrder());
                }
                break;
            }
        }
    }



    public void moveItemTopym(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdym(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderym(flag);
        StockCollect minStockCollect = stockCollectMapper.selectMinOrderym(flag);
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() + 1;
                stockCollectMapper.updateSortOrderym(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置顶
        stockCollectMapper.updateSortOrderym(tsCode, minStockCollect.getSortOrder());
    }

    public void moveItemBottomym(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdym(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderym(flag);
        int bottomSortOrder = allItems.size();
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() - 1;
                stockCollectMapper.updateSortOrderym(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置底
        stockCollectMapper.updateSortOrderym(tsCode, bottomSortOrder);
    }

    public void moveItemUpym(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdym(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderym(flag);

        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getTsCode().equals(tsCode)) {
                // 找到当前记录的索引
                int currentIndex = i;
                if (currentIndex > 0) {
                    // 交换当前记录和前一条记录的排序值
                    StockCollect current = allItems.get(currentIndex);
                    StockCollect previous = allItems.get(currentIndex - 1);
                    int tempSortOrder = current.getSortOrder();
                    current.setSortOrder(previous.getSortOrder());
                    previous.setSortOrder(tempSortOrder);

                    stockCollectMapper.updateSortOrderym(current.getTsCode(), current.getSortOrder());
                    stockCollectMapper.updateSortOrderym(previous.getTsCode(), previous.getSortOrder());
                }
                break;
            }
        }
    }






    public void moveItemTopwaitback(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdwaitback(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderwaitback(flag);
        StockCollect minStockCollect = stockCollectMapper.selectMinOrderwaitback(flag);
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() + 1;
                stockCollectMapper.updateSortOrderwaitback(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置顶
        stockCollectMapper.updateSortOrderwaitback(tsCode, minStockCollect.getSortOrder());
    }

    public void moveItemBottomwaitback(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdwaitback(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderwaitback(flag);
        int bottomSortOrder = allItems.size();
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() - 1;
                stockCollectMapper.updateSortOrderwaitback(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置底
        stockCollectMapper.updateSortOrderwaitback(tsCode, bottomSortOrder);
    }

    public void moveItemUpwaitback(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdwaitback(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderwaitback(flag);

        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getTsCode().equals(tsCode)) {
                // 找到当前记录的索引
                int currentIndex = i;
                if (currentIndex > 0) {
                    // 交换当前记录和前一条记录的排序值
                    StockCollect current = allItems.get(currentIndex);
                    StockCollect previous = allItems.get(currentIndex - 1);
                    int tempSortOrder = current.getSortOrder();
                    current.setSortOrder(previous.getSortOrder());
                    previous.setSortOrder(tempSortOrder);

                    stockCollectMapper.updateSortOrderwaitback(current.getTsCode(), current.getSortOrder());
                    stockCollectMapper.updateSortOrderwaitback(previous.getTsCode(), previous.getSortOrder());
                }
                break;
            }
        }
    }

    public void collectZhuizong(String tsCode) {
        int count = stockCollectMapper.checkIfExistszhuizong(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updatezhuizong(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertzhuizong(stockCollect);
        }
    }
    public String[] getZhuizong() {
        return stockCollectMapper.selectzhuizong();
    }

    public String[] zanbuZhuizong() {
        return stockCollectMapper.selectzanbuZhuizong();
    }

    public void delZhuizong(String tsCode) { stockCollectMapper.delzhuizong(tsCode); }

    public void goonZhuizong(String tsCode) { stockCollectMapper.goonzhuizong(tsCode); }


    public void moveItemTopzhuizong(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdzhuizong(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderzhuizong(flag);
        StockCollect minStockCollect = stockCollectMapper.selectMinOrderzhuizong(flag);
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() + 1;
                stockCollectMapper.updateSortOrderzhuizong(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置顶
        stockCollectMapper.updateSortOrderzhuizong(tsCode, minStockCollect.getSortOrder());
    }

    public void moveItemBottomzhuizong(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdzhuizong(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderzhuizong(flag);
        StockCollect maxStockCollect = stockCollectMapper.selectMaxOrderzhuizong(flag);
        int bottomSortOrder = maxStockCollect.getSortOrder();
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() - 1;
                stockCollectMapper.updateSortOrderzhuizong(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置底
        stockCollectMapper.updateSortOrderzhuizong(tsCode, bottomSortOrder);
    }

    public void moveItemUpzhuizong(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdzhuizong(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderzhuizong(flag);

        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getTsCode().equals(tsCode)) {
                // 找到当前记录的索引
                int currentIndex = i;
                if (currentIndex > 0) {
                    // 交换当前记录和前一条记录的排序值
                    StockCollect current = allItems.get(currentIndex);
                    StockCollect previous = allItems.get(currentIndex - 1);
                    int tempSortOrder = current.getSortOrder();
                    current.setSortOrder(previous.getSortOrder());
                    previous.setSortOrder(tempSortOrder);

                    stockCollectMapper.updateSortOrderzhuizong(current.getTsCode(), current.getSortOrder());
                    stockCollectMapper.updateSortOrderzhuizong(previous.getTsCode(), previous.getSortOrder());
                }
                break;
            }
        }
    }





    public void moveItemToprengongzhineng(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdrengongzhineng(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderrengongzhineng(flag);
        StockCollect minStockCollect = stockCollectMapper.selectMinOrderrengongzhineng(flag);
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() + 1;
                stockCollectMapper.updateSortOrderrengongzhineng(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置顶
        stockCollectMapper.updateSortOrderrengongzhineng(tsCode, minStockCollect.getSortOrder());
    }

    public void moveItemBottomrengongzhineng(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdrengongzhineng(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderrengongzhineng(flag);
        StockCollect maxStockCollect = stockCollectMapper.selectMaxOrderrengongzhineng(flag);
        int bottomSortOrder = maxStockCollect.getSortOrder();

        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() - 1;
                stockCollectMapper.updateSortOrderrengongzhineng(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置底
        stockCollectMapper.updateSortOrderrengongzhineng(tsCode, bottomSortOrder);
    }

    public void moveItemUprengongzhineng(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdrengongzhineng(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderrengongzhineng(flag);

        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getTsCode().equals(tsCode)) {
                // 找到当前记录的索引
                int currentIndex = i;
                if (currentIndex > 0) {
                    // 交换当前记录和前一条记录的排序值
                    StockCollect current = allItems.get(currentIndex);
                    StockCollect previous = allItems.get(currentIndex - 1);
                    int tempSortOrder = current.getSortOrder();
                    current.setSortOrder(previous.getSortOrder());
                    previous.setSortOrder(tempSortOrder);

                    stockCollectMapper.updateSortOrderrengongzhineng(current.getTsCode(), current.getSortOrder());
                    stockCollectMapper.updateSortOrderrengongzhineng(previous.getTsCode(), previous.getSortOrder());
                }
                break;
            }
        }
    }
    public String[] getrengongzhineng() {
        return stockCollectMapper.selectrengongzhineng();
    }

    public void collectrengongzhineng(String tsCode) {
        int count = stockCollectMapper.checkIfExistsrengongzhineng(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.collectUpdaterengongzhineng(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertrengongzhineng(stockCollect);
        }
    }


    public void moveItemTopwuyeguanli(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdwuyeguanli(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderwuyeguanli(flag);
        StockCollect minStockCollect = stockCollectMapper.selectMinOrderwuyeguanli(flag);
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() + 1;
                stockCollectMapper.updateSortOrderwuyeguanli(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置顶
        stockCollectMapper.updateSortOrderwuyeguanli(tsCode, minStockCollect.getSortOrder());
    }

    public void moveItemBottomwuyeguanli(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdwuyeguanli(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderwuyeguanli(flag);
        StockCollect maxStockCollect = stockCollectMapper.selectMaxOrderwuyeguanli(flag);
        int bottomSortOrder = maxStockCollect.getSortOrder();
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() - 1;
                stockCollectMapper.updateSortOrderwuyeguanli(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置底
        stockCollectMapper.updateSortOrderwuyeguanli(tsCode, bottomSortOrder);
    }

    public void moveItemUpwuyeguanli(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdwuyeguanli(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderwuyeguanli(flag);

        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getTsCode().equals(tsCode)) {
                // 找到当前记录的索引
                int currentIndex = i;
                if (currentIndex > 0) {
                    // 交换当前记录和前一条记录的排序值
                    StockCollect current = allItems.get(currentIndex);
                    StockCollect previous = allItems.get(currentIndex - 1);
                    int tempSortOrder = current.getSortOrder();
                    current.setSortOrder(previous.getSortOrder());
                    previous.setSortOrder(tempSortOrder);

                    stockCollectMapper.updateSortOrderwuyeguanli(current.getTsCode(), current.getSortOrder());
                    stockCollectMapper.updateSortOrderwuyeguanli(previous.getTsCode(), previous.getSortOrder());
                }
                break;
            }
        }
    }
    public String[] getwuyeguanli() {
        return stockCollectMapper.selectwuyeguanli();
    }


    public void collectwuyeguanli(String tsCode) {
        int count = stockCollectMapper.checkIfExistswuyeguanli(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.collectUpdatewuyeguanli(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertwuyeguanli(stockCollect);
        }
    }




    public void moveItemTopxiangcunzhenxing(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdxiangcunzhenxing(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderxiangcunzhenxing(flag);
        StockCollect minStockCollect = stockCollectMapper.selectMinOrderxiangcunzhenxing(flag);
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() + 1;
                stockCollectMapper.updateSortOrderxiangcunzhenxing(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置顶
        stockCollectMapper.updateSortOrderxiangcunzhenxing(tsCode, minStockCollect.getSortOrder());
    }

    public void moveItemBottomxiangcunzhenxing(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdxiangcunzhenxing(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderxiangcunzhenxing(flag);
        StockCollect maxStockCollect = stockCollectMapper.selectMaxOrderxiangcunzhenxing(flag);
        int bottomSortOrder = maxStockCollect.getSortOrder();
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() - 1;
                stockCollectMapper.updateSortOrderxiangcunzhenxing(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置底
        stockCollectMapper.updateSortOrderxiangcunzhenxing(tsCode, bottomSortOrder);
    }

    public void moveItemUpxiangcunzhenxing(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdxiangcunzhenxing(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderxiangcunzhenxing(flag);

        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getTsCode().equals(tsCode)) {
                // 找到当前记录的索引
                int currentIndex = i;
                if (currentIndex > 0) {
                    // 交换当前记录和前一条记录的排序值
                    StockCollect current = allItems.get(currentIndex);
                    StockCollect previous = allItems.get(currentIndex - 1);
                    int tempSortOrder = current.getSortOrder();
                    current.setSortOrder(previous.getSortOrder());
                    previous.setSortOrder(tempSortOrder);

                    stockCollectMapper.updateSortOrderxiangcunzhenxing(current.getTsCode(), current.getSortOrder());
                    stockCollectMapper.updateSortOrderxiangcunzhenxing(previous.getTsCode(), previous.getSortOrder());
                }
                break;
            }
        }
    }
    public String[] getxiangcunzhenxing() {
        return stockCollectMapper.selectxiangcunzhenxing();
    }

    public void collectxiangcunzhenxing(String tsCode) {
        int count = stockCollectMapper.checkIfExistsxiangcunzhenxing(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.collectUpdatexiangcunzhenxing(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertxiangcunzhenxing(stockCollect);
        }
    }



    public void moveItemTopgnyiyuanall(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgnyiyuanall(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergnyiyuanall(flag);
        StockCollect minStockCollect = stockCollectMapper.selectMinOrdergnyiyuanall(flag);
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() + 1;
                stockCollectMapper.updateSortOrdergnyiyuanall(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置顶
        stockCollectMapper.updateSortOrdergnyiyuanall(tsCode, minStockCollect.getSortOrder());
    }

    public void moveItemBottomgnyiyuanall(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgnyiyuanall(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergnyiyuanall(flag);
        StockCollect maxStockCollect = stockCollectMapper.selectMaxOrdergnyiyuanall(flag);
        int bottomSortOrder = maxStockCollect.getSortOrder();
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() - 1;
                stockCollectMapper.updateSortOrdergnyiyuanall(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置底
        stockCollectMapper.updateSortOrdergnyiyuanall(tsCode, bottomSortOrder);
    }

    public void moveItemUpgnyiyuanall(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgnyiyuanall(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergnyiyuanall(flag);

        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getTsCode().equals(tsCode)) {
                // 找到当前记录的索引
                int currentIndex = i;
                if (currentIndex > 0) {
                    // 交换当前记录和前一条记录的排序值
                    StockCollect current = allItems.get(currentIndex);
                    StockCollect previous = allItems.get(currentIndex - 1);
                    int tempSortOrder = current.getSortOrder();
                    current.setSortOrder(previous.getSortOrder());
                    previous.setSortOrder(tempSortOrder);

                    stockCollectMapper.updateSortOrdergnyiyuanall(current.getTsCode(), current.getSortOrder());
                    stockCollectMapper.updateSortOrdergnyiyuanall(previous.getTsCode(), previous.getSortOrder());
                }
                break;
            }
        }
    }
    public String[] getgnyiyuanall() {
        return stockCollectMapper.selectgnyiyuanall();
    }

    public void collectgnyiyuanall(String tsCode) {
        int count = stockCollectMapper.checkIfExistsgnyiyuanall(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.collectUpdategnyiyuanall(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertgnyiyuanall(stockCollect);
        }
    }





    public void moveItemTopgnyiyaodianshanall(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgnyiyaodianshanall(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergnyiyaodianshanall(flag);
        StockCollect minStockCollect = stockCollectMapper.selectMinOrdergnyiyaodianshanall(flag);
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() + 1;
                stockCollectMapper.updateSortOrdergnyiyaodianshanall(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置顶
        stockCollectMapper.updateSortOrdergnyiyaodianshanall(tsCode, minStockCollect.getSortOrder());
    }

    public void moveItemBottomgnyiyaodianshanall(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgnyiyaodianshanall(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergnyiyaodianshanall(flag);
        StockCollect maxStockCollect = stockCollectMapper.selectMaxOrdergnyiyaodianshanall(flag);
        int bottomSortOrder = maxStockCollect.getSortOrder();
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() - 1;
                stockCollectMapper.updateSortOrdergnyiyaodianshanall(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置底
        stockCollectMapper.updateSortOrdergnyiyaodianshanall(tsCode, bottomSortOrder);
    }

    public void moveItemUpgnyiyaodianshanall(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgnyiyaodianshanall(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergnyiyaodianshanall(flag);

        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getTsCode().equals(tsCode)) {
                // 找到当前记录的索引
                int currentIndex = i;
                if (currentIndex > 0) {
                    // 交换当前记录和前一条记录的排序值
                    StockCollect current = allItems.get(currentIndex);
                    StockCollect previous = allItems.get(currentIndex - 1);
                    int tempSortOrder = current.getSortOrder();
                    current.setSortOrder(previous.getSortOrder());
                    previous.setSortOrder(tempSortOrder);

                    stockCollectMapper.updateSortOrdergnyiyaodianshanall(current.getTsCode(), current.getSortOrder());
                    stockCollectMapper.updateSortOrdergnyiyaodianshanall(previous.getTsCode(), previous.getSortOrder());
                }
                break;
            }
        }
    }
    public String[] getgnyiyaodianshanall() {
        return stockCollectMapper.selectgnyiyaodianshanall();
    }

    public void collectgnyiyaodianshanall(String tsCode) {
        int count = stockCollectMapper.checkIfExistsgnyiyaodianshanall(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.collectUpdategnyiyaodianshanall(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertgnyiyaodianshanall(stockCollect);
        }
    }



    public void moveItemTopgnliuganall(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgnliuganall(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergnliuganall(flag);
        StockCollect minStockCollect = stockCollectMapper.selectMinOrdergnliuganall(flag);
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                synchronized (flag) {
                    int newSortOrder = item.getSortOrder() + 1;
                    stockCollectMapper.updateSortOrdergnliuganall(item.getTsCode(), newSortOrder);
                }

            }
        }
        // 将目标记录置顶
        stockCollectMapper.updateSortOrdergnliuganall(tsCode, minStockCollect.getSortOrder());
    }

    public void moveItemBottomgnliuganall(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgnliuganall(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergnliuganall(flag);
        StockCollect maxStockCollect = stockCollectMapper.selectMaxOrdergnliuganall(flag);
        int bottomSortOrder = maxStockCollect.getSortOrder();
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                synchronized (flag) {
                    int newSortOrder = item.getSortOrder() - 1;
                    stockCollectMapper.updateSortOrdergnliuganall(item.getTsCode(), newSortOrder);
                }
            }
        }
        // 将目标记录置底
        stockCollectMapper.updateSortOrdergnliuganall(tsCode, bottomSortOrder);
    }

    public void moveItemUpgnliuganall(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgnliuganall(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergnliuganall(flag);

        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getTsCode().equals(tsCode)) {
                // 找到当前记录的索引
                int currentIndex = i;
                if (currentIndex > 0) {
                    // 交换当前记录和前一条记录的排序值
                    StockCollect current = allItems.get(currentIndex);
                    StockCollect previous = allItems.get(currentIndex - 1);
                    int tempSortOrder = current.getSortOrder();
                    current.setSortOrder(previous.getSortOrder());
                    previous.setSortOrder(tempSortOrder);

                    stockCollectMapper.updateSortOrdergnliuganall(current.getTsCode(), current.getSortOrder());
                    stockCollectMapper.updateSortOrdergnliuganall(previous.getTsCode(), previous.getSortOrder());
                }
                break;
            }
        }
    }
    public String[] getgnliuganall() {
        return stockCollectMapper.selectgnliuganall();
    }

    public void collectgnliuganall(String tsCode) {
        int count = stockCollectMapper.checkIfExistsgnliuganall(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.collectUpdategnliuganall(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertgnliuganall(stockCollect);
        }
    }


    public void moveItemTopgnchuantouall(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgnchuantouall(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergnchuantouall(flag);
        StockCollect minStockCollect = stockCollectMapper.selectMinOrdergnchuantouall(flag);
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                synchronized (flag) {
                    int newSortOrder = item.getSortOrder() + 1;
                    stockCollectMapper.updateSortOrdergnchuantouall(item.getTsCode(), newSortOrder);
                }

            }
        }
        // 将目标记录置顶
        stockCollectMapper.updateSortOrdergnchuantouall(tsCode, minStockCollect.getSortOrder());
    }

    public void moveItemBottomgnchuantouall(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgnchuantouall(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergnchuantouall(flag);
        StockCollect maxStockCollect = stockCollectMapper.selectMaxOrdergnchuantouall(flag);
        int bottomSortOrder = maxStockCollect.getSortOrder();
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                synchronized (flag) {
                    int newSortOrder = item.getSortOrder() - 1;
                    stockCollectMapper.updateSortOrdergnchuantouall(item.getTsCode(), newSortOrder);
                }
            }
        }
        // 将目标记录置底
        stockCollectMapper.updateSortOrdergnchuantouall(tsCode, bottomSortOrder);
    }

    public void moveItemUpgnchuantouall(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgnchuantouall(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergnchuantouall(flag);

        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getTsCode().equals(tsCode)) {
                // 找到当前记录的索引
                int currentIndex = i;
                if (currentIndex > 0) {
                    // 交换当前记录和前一条记录的排序值
                    StockCollect current = allItems.get(currentIndex);
                    StockCollect previous = allItems.get(currentIndex - 1);
                    int tempSortOrder = current.getSortOrder();
                    current.setSortOrder(previous.getSortOrder());
                    previous.setSortOrder(tempSortOrder);

                    stockCollectMapper.updateSortOrdergnchuantouall(current.getTsCode(), current.getSortOrder());
                    stockCollectMapper.updateSortOrdergnchuantouall(previous.getTsCode(), previous.getSortOrder());
                }
                break;
            }
        }
    }
    public String[] getgnchuantouall() {
        return stockCollectMapper.selectgnchuantouall();
    }

    public void collectgnchuantouall(String tsCode) {
        int count = stockCollectMapper.checkIfExistsgnchuantouall(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.collectUpdategnchuantouall(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertgnchuantouall(stockCollect);
        }
    }




    public void moveItemTopgntudiliuzhuang(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgntudiliuzhuang(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergntudiliuzhuang(flag);
        StockCollect minStockCollect = stockCollectMapper.selectMinOrdergntudiliuzhuang(flag);
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                synchronized (flag) {
                    int newSortOrder = item.getSortOrder() + 1;
                    stockCollectMapper.updateSortOrdergntudiliuzhuang(item.getTsCode(), newSortOrder);
                }

            }
        }
        // 将目标记录置顶
        stockCollectMapper.updateSortOrdergntudiliuzhuang(tsCode, minStockCollect.getSortOrder());
    }

    public void moveItemBottomgntudiliuzhuang(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgntudiliuzhuang(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergntudiliuzhuang(flag);
        StockCollect maxStockCollect = stockCollectMapper.selectMaxOrdergntudiliuzhuang(flag);
        int bottomSortOrder = maxStockCollect.getSortOrder();
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                synchronized (flag) {
                    int newSortOrder = item.getSortOrder() - 1;
                    stockCollectMapper.updateSortOrdergntudiliuzhuang(item.getTsCode(), newSortOrder);
                }
            }
        }
        // 将目标记录置底
        stockCollectMapper.updateSortOrdergntudiliuzhuang(tsCode, bottomSortOrder);
    }

    public void moveItemUpgntudiliuzhuang(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgntudiliuzhuang(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergntudiliuzhuang(flag);

        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getTsCode().equals(tsCode)) {
                // 找到当前记录的索引
                int currentIndex = i;
                if (currentIndex > 0) {
                    // 交换当前记录和前一条记录的排序值
                    StockCollect current = allItems.get(currentIndex);
                    StockCollect previous = allItems.get(currentIndex - 1);
                    int tempSortOrder = current.getSortOrder();
                    current.setSortOrder(previous.getSortOrder());
                    previous.setSortOrder(tempSortOrder);

                    stockCollectMapper.updateSortOrdergntudiliuzhuang(current.getTsCode(), current.getSortOrder());
                    stockCollectMapper.updateSortOrdergntudiliuzhuang(previous.getTsCode(), previous.getSortOrder());
                }
                break;
            }
        }
    }
    public String[] getgntudiliuzhuang() {
        return stockCollectMapper.selectgntudiliuzhuang();
    }

    public void collectgntudiliuzhuang(String tsCode) {
        int count = stockCollectMapper.checkIfExistsgntudiliuzhuang(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.collectUpdategntudiliuzhuang(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertgntudiliuzhuang(stockCollect);
        }
    }




    public void moveItemTopgnjiyincexuall(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgnjiyincexuall(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergnjiyincexuall(flag);
        StockCollect minStockCollect = stockCollectMapper.selectMinOrdergnjiyincexuall(flag);
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                synchronized (flag) {
                    int newSortOrder = item.getSortOrder() + 1;
                    stockCollectMapper.updateSortOrdergnjiyincexuall(item.getTsCode(), newSortOrder);
                }

            }
        }
        // 将目标记录置顶
        stockCollectMapper.updateSortOrdergnjiyincexuall(tsCode, minStockCollect.getSortOrder());
    }

    public void moveItemBottomgnjiyincexuall(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgnjiyincexuall(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergnjiyincexuall(flag);
        StockCollect maxStockCollect = stockCollectMapper.selectMaxOrdergnjiyincexuall(flag);
        int bottomSortOrder = maxStockCollect.getSortOrder();
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                synchronized (flag) {
                    int newSortOrder = item.getSortOrder() - 1;
                    stockCollectMapper.updateSortOrdergnjiyincexuall(item.getTsCode(), newSortOrder);
                }
            }
        }
        // 将目标记录置底
        stockCollectMapper.updateSortOrdergnjiyincexuall(tsCode, bottomSortOrder);
    }

    public void moveItemUpgnjiyincexuall(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgnjiyincexuall(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergnjiyincexuall(flag);

        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getTsCode().equals(tsCode)) {
                // 找到当前记录的索引
                int currentIndex = i;
                if (currentIndex > 0) {
                    // 交换当前记录和前一条记录的排序值
                    StockCollect current = allItems.get(currentIndex);
                    StockCollect previous = allItems.get(currentIndex - 1);
                    int tempSortOrder = current.getSortOrder();
                    current.setSortOrder(previous.getSortOrder());
                    previous.setSortOrder(tempSortOrder);

                    stockCollectMapper.updateSortOrdergnjiyincexuall(current.getTsCode(), current.getSortOrder());
                    stockCollectMapper.updateSortOrdergnjiyincexuall(previous.getTsCode(), previous.getSortOrder());
                }
                break;
            }
        }
    }
    public String[] getgnjiyincexuall() {
        return stockCollectMapper.selectgnjiyincexuall();
    }

    public void collectgnjiyincexuall(String tsCode) {
        int count = stockCollectMapper.checkIfExistsgnjiyincexuall(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.collectUpdategnjiyincexuall(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertgnjiyincexuall(stockCollect);
        }
    }


    public void moveItemTopgnlenglianwuliuall(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgnlenglianwuliuall(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergnlenglianwuliuall(flag);
        StockCollect minStockCollect = stockCollectMapper.selectMinOrdergnlenglianwuliuall(flag);
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                synchronized (flag) {
                    int newSortOrder = item.getSortOrder() + 1;
                    stockCollectMapper.updateSortOrdergnlenglianwuliuall(item.getTsCode(), newSortOrder);
                }

            }
        }
        // 将目标记录置顶
        stockCollectMapper.updateSortOrdergnlenglianwuliuall(tsCode, minStockCollect.getSortOrder());
    }

    public void moveItemBottomgnlenglianwuliuall(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgnlenglianwuliuall(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergnlenglianwuliuall(flag);
        StockCollect maxStockCollect = stockCollectMapper.selectMaxOrdergnlenglianwuliuall(flag);
        int bottomSortOrder = maxStockCollect.getSortOrder();
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                synchronized (flag) {
                    int newSortOrder = item.getSortOrder() - 1;
                    stockCollectMapper.updateSortOrdergnlenglianwuliuall(item.getTsCode(), newSortOrder);
                }
            }
        }
        // 将目标记录置底
        stockCollectMapper.updateSortOrdergnlenglianwuliuall(tsCode, bottomSortOrder);
    }

    public void moveItemUpgnlenglianwuliuall(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgnlenglianwuliuall(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergnlenglianwuliuall(flag);

        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getTsCode().equals(tsCode)) {
                // 找到当前记录的索引
                int currentIndex = i;
                if (currentIndex > 0) {
                    // 交换当前记录和前一条记录的排序值
                    StockCollect current = allItems.get(currentIndex);
                    StockCollect previous = allItems.get(currentIndex - 1);
                    int tempSortOrder = current.getSortOrder();
                    current.setSortOrder(previous.getSortOrder());
                    previous.setSortOrder(tempSortOrder);

                    stockCollectMapper.updateSortOrdergnlenglianwuliuall(current.getTsCode(), current.getSortOrder());
                    stockCollectMapper.updateSortOrdergnlenglianwuliuall(previous.getTsCode(), previous.getSortOrder());
                }
                break;
            }
        }
    }
    public String[] getgnlenglianwuliuall() {
        return stockCollectMapper.selectgnlenglianwuliuall();
    }

    public void collectgnlenglianwuliuall(String tsCode) {
        int count = stockCollectMapper.checkIfExistsgnlenglianwuliuall(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.collectUpdategnlenglianwuliuall(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertgnlenglianwuliuall(stockCollect);
        }
    }


    public void moveItemTopgnyanglaoall(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgnyanglaoall(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergnyanglaoall(flag);
        StockCollect minStockCollect = stockCollectMapper.selectMinOrdergnyanglaoall(flag);
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                synchronized (flag) {
                    int newSortOrder = item.getSortOrder() + 1;
                    stockCollectMapper.updateSortOrdergnyanglaoall(item.getTsCode(), newSortOrder);
                }

            }
        }
        // 将目标记录置顶
        stockCollectMapper.updateSortOrdergnyanglaoall(tsCode, minStockCollect.getSortOrder());
    }

    public void moveItemBottomgnyanglaoall(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgnyanglaoall(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergnyanglaoall(flag);
        StockCollect maxStockCollect = stockCollectMapper.selectMaxOrdergnyanglaoall(flag);
        int bottomSortOrder = maxStockCollect.getSortOrder();
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                synchronized (flag) {
                    int newSortOrder = item.getSortOrder() - 1;
                    stockCollectMapper.updateSortOrdergnyanglaoall(item.getTsCode(), newSortOrder);
                }
            }
        }
        // 将目标记录置底
        stockCollectMapper.updateSortOrdergnyanglaoall(tsCode, bottomSortOrder);
    }

    public void moveItemUpgnyanglaoall(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgnyanglaoall(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergnyanglaoall(flag);

        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getTsCode().equals(tsCode)) {
                // 找到当前记录的索引
                int currentIndex = i;
                if (currentIndex > 0) {
                    // 交换当前记录和前一条记录的排序值
                    StockCollect current = allItems.get(currentIndex);
                    StockCollect previous = allItems.get(currentIndex - 1);
                    int tempSortOrder = current.getSortOrder();
                    current.setSortOrder(previous.getSortOrder());
                    previous.setSortOrder(tempSortOrder);

                    stockCollectMapper.updateSortOrdergnyanglaoall(current.getTsCode(), current.getSortOrder());
                    stockCollectMapper.updateSortOrdergnyanglaoall(previous.getTsCode(), previous.getSortOrder());
                }
                break;
            }
        }
    }
    public String[] getgnyanglaoall() {
        return stockCollectMapper.selectgnyanglaoall();
    }

    public void collectgnyanglaoall(String tsCode) {
        int count = stockCollectMapper.checkIfExistsgnyanglaoall(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.collectUpdategnyanglaoall(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertgnyanglaoall(stockCollect);
        }
    }

    public void moveItemTopgnyangjiall(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgnyangjiall(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergnyangjiall(flag);
        StockCollect minStockCollect = stockCollectMapper.selectMinOrdergnyangjiall(flag);
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                synchronized (flag) {
                    int newSortOrder = item.getSortOrder() + 1;
                    stockCollectMapper.updateSortOrdergnyangjiall(item.getTsCode(), newSortOrder);
                }

            }
        }
        // 将目标记录置顶
        stockCollectMapper.updateSortOrdergnyangjiall(tsCode, minStockCollect.getSortOrder());
    }

    public void moveItemBottomgnyangjiall(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgnyangjiall(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergnyangjiall(flag);
        StockCollect maxStockCollect = stockCollectMapper.selectMaxOrdergnyangjiall(flag);
        int bottomSortOrder = maxStockCollect.getSortOrder();
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                synchronized (flag) {
                    int newSortOrder = item.getSortOrder() - 1;
                    stockCollectMapper.updateSortOrdergnyangjiall(item.getTsCode(), newSortOrder);
                }
            }
        }
        // 将目标记录置底
        stockCollectMapper.updateSortOrdergnyangjiall(tsCode, bottomSortOrder);
    }

    public void moveItemUpgnyangjiall(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgnyangjiall(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergnyangjiall(flag);

        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getTsCode().equals(tsCode)) {
                // 找到当前记录的索引
                int currentIndex = i;
                if (currentIndex > 0) {
                    // 交换当前记录和前一条记录的排序值
                    StockCollect current = allItems.get(currentIndex);
                    StockCollect previous = allItems.get(currentIndex - 1);
                    int tempSortOrder = current.getSortOrder();
                    current.setSortOrder(previous.getSortOrder());
                    previous.setSortOrder(tempSortOrder);

                    stockCollectMapper.updateSortOrdergnyangjiall(current.getTsCode(), current.getSortOrder());
                    stockCollectMapper.updateSortOrdergnyangjiall(previous.getTsCode(), previous.getSortOrder());
                }
                break;
            }
        }
    }
    public String[] getgnyangjiall() {
        return stockCollectMapper.selectgnyangjiall();
    }

    public void collectgnyangjiall(String tsCode) {
        int count = stockCollectMapper.checkIfExistsgnyangjiall(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.collectUpdategnyangjiall(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertgnyangjiall(stockCollect);
        }
    }
    public void moveItemTopgnyankeyiliao(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgnyankeyiliao(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergnyankeyiliao(flag);
        StockCollect minStockCollect = stockCollectMapper.selectMinOrdergnyankeyiliao(flag);
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                synchronized (flag) {
                    int newSortOrder = item.getSortOrder() + 1;
                    stockCollectMapper.updateSortOrdergnyankeyiliao(item.getTsCode(), newSortOrder);
                }

            }
        }
        // 将目标记录置顶
        stockCollectMapper.updateSortOrdergnyankeyiliao(tsCode, minStockCollect.getSortOrder());
    }

    public void moveItemBottomgnyankeyiliao(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgnyankeyiliao(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergnyankeyiliao(flag);
        StockCollect maxStockCollect = stockCollectMapper.selectMaxOrdergnyankeyiliao(flag);
        int bottomSortOrder = maxStockCollect.getSortOrder();
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                synchronized (flag) {
                    int newSortOrder = item.getSortOrder() - 1;
                    stockCollectMapper.updateSortOrdergnyankeyiliao(item.getTsCode(), newSortOrder);
                }
            }
        }
        // 将目标记录置底
        stockCollectMapper.updateSortOrdergnyankeyiliao(tsCode, bottomSortOrder);
    }

    public void moveItemUpgnyankeyiliao(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgnyankeyiliao(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergnyankeyiliao(flag);

        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getTsCode().equals(tsCode)) {
                // 找到当前记录的索引
                int currentIndex = i;
                if (currentIndex > 0) {
                    // 交换当前记录和前一条记录的排序值
                    StockCollect current = allItems.get(currentIndex);
                    StockCollect previous = allItems.get(currentIndex - 1);
                    int tempSortOrder = current.getSortOrder();
                    current.setSortOrder(previous.getSortOrder());
                    previous.setSortOrder(tempSortOrder);

                    stockCollectMapper.updateSortOrdergnyankeyiliao(current.getTsCode(), current.getSortOrder());
                    stockCollectMapper.updateSortOrdergnyankeyiliao(previous.getTsCode(), previous.getSortOrder());
                }
                break;
            }
        }
    }
    public String[] getgnyankeyiliao() {
        return stockCollectMapper.selectgnyankeyiliao();
    }

    public void collectgnyankeyiliao(String tsCode) {
        int count = stockCollectMapper.checkIfExistsgnyankeyiliao(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.collectUpdategnyankeyiliao(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertgnyankeyiliao(stockCollect);
        }
    }



    public void moveItemTopgnyehulitiall(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgnyehulitiall(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergnyehulitiall(flag);
        StockCollect minStockCollect = stockCollectMapper.selectMinOrdergnyehulitiall(flag);
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                synchronized (flag) {
                    int newSortOrder = item.getSortOrder() + 1;
                    stockCollectMapper.updateSortOrdergnyehulitiall(item.getTsCode(), newSortOrder);
                }

            }
        }
        // 将目标记录置顶
        stockCollectMapper.updateSortOrdergnyehulitiall(tsCode, minStockCollect.getSortOrder());
    }

    public void moveItemBottomgnyehulitiall(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgnyehulitiall(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergnyehulitiall(flag);
        StockCollect maxStockCollect = stockCollectMapper.selectMaxOrdergnyehulitiall(flag);
        int bottomSortOrder = maxStockCollect.getSortOrder();
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                synchronized (flag) {
                    int newSortOrder = item.getSortOrder() - 1;
                    stockCollectMapper.updateSortOrdergnyehulitiall(item.getTsCode(), newSortOrder);
                }
            }
        }
        // 将目标记录置底
        stockCollectMapper.updateSortOrdergnyehulitiall(tsCode, bottomSortOrder);
    }

    public void moveItemUpgnyehulitiall(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgnyehulitiall(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergnyehulitiall(flag);

        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getTsCode().equals(tsCode)) {
                // 找到当前记录的索引
                int currentIndex = i;
                if (currentIndex > 0) {
                    // 交换当前记录和前一条记录的排序值
                    StockCollect current = allItems.get(currentIndex);
                    StockCollect previous = allItems.get(currentIndex - 1);
                    int tempSortOrder = current.getSortOrder();
                    current.setSortOrder(previous.getSortOrder());
                    previous.setSortOrder(tempSortOrder);

                    stockCollectMapper.updateSortOrdergnyehulitiall(current.getTsCode(), current.getSortOrder());
                    stockCollectMapper.updateSortOrdergnyehulitiall(previous.getTsCode(), previous.getSortOrder());
                }
                break;
            }
        }
    }
    public String[] getgnyehulitiall() {
        return stockCollectMapper.selectgnyehulitiall();
    }

    public void collectgnyehulitiall(String tsCode) {
        int count = stockCollectMapper.checkIfExistsgnyehulitiall(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.collectUpdategnyehulitiall(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertgnyehulitiall(stockCollect);
        }
    }





    public void moveItemTopgnyancaoall(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgnyancaoall(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergnyancaoall(flag);
        StockCollect minStockCollect = stockCollectMapper.selectMinOrdergnyancaoall(flag);
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                synchronized (flag) {
                    int newSortOrder = item.getSortOrder() + 1;
                    stockCollectMapper.updateSortOrdergnyancaoall(item.getTsCode(), newSortOrder);
                }

            }
        }
        // 将目标记录置顶
        stockCollectMapper.updateSortOrdergnyancaoall(tsCode, minStockCollect.getSortOrder());
    }

    public void moveItemBottomgnyancaoall(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgnyancaoall(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergnyancaoall(flag);
        StockCollect maxStockCollect = stockCollectMapper.selectMaxOrdergnyancaoall(flag);
        int bottomSortOrder = maxStockCollect.getSortOrder();
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                synchronized (flag) {
                    int newSortOrder = item.getSortOrder() - 1;
                    stockCollectMapper.updateSortOrdergnyancaoall(item.getTsCode(), newSortOrder);
                }
            }
        }
        // 将目标记录置底
        stockCollectMapper.updateSortOrdergnyancaoall(tsCode, bottomSortOrder);
    }

    public void moveItemUpgnyancaoall(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgnyancaoall(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergnyancaoall(flag);

        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getTsCode().equals(tsCode)) {
                // 找到当前记录的索引
                int currentIndex = i;
                if (currentIndex > 0) {
                    // 交换当前记录和前一条记录的排序值
                    StockCollect current = allItems.get(currentIndex);
                    StockCollect previous = allItems.get(currentIndex - 1);
                    int tempSortOrder = current.getSortOrder();
                    current.setSortOrder(previous.getSortOrder());
                    previous.setSortOrder(tempSortOrder);

                    stockCollectMapper.updateSortOrdergnyancaoall(current.getTsCode(), current.getSortOrder());
                    stockCollectMapper.updateSortOrdergnyancaoall(previous.getTsCode(), previous.getSortOrder());
                }
                break;
            }
        }
    }
    public String[] getgnyancaoall() {
        return stockCollectMapper.selectgnyancaoall();
    }

    public void collectgnyancaoall(String tsCode) {
        int count = stockCollectMapper.checkIfExistsgnyancaoall(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.collectUpdategnyancaoall(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertgnyancaoall(stockCollect);
        }
    }


    public void moveItemTopgnyakeyiliaoall(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgnyakeyiliaoall(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergnyakeyiliaoall(flag);
        StockCollect minStockCollect = stockCollectMapper.selectMinOrdergnyakeyiliaoall(flag);
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                synchronized (flag) {
                    int newSortOrder = item.getSortOrder() + 1;
                    stockCollectMapper.updateSortOrdergnyakeyiliaoall(item.getTsCode(), newSortOrder);
                }

            }
        }
        // 将目标记录置顶
        stockCollectMapper.updateSortOrdergnyakeyiliaoall(tsCode, minStockCollect.getSortOrder());
    }

    public void moveItemBottomgnyakeyiliaoall(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgnyakeyiliaoall(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergnyakeyiliaoall(flag);
        StockCollect maxStockCollect = stockCollectMapper.selectMaxOrdergnyakeyiliaoall(flag);
        int bottomSortOrder = maxStockCollect.getSortOrder();
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                synchronized (flag) {
                    int newSortOrder = item.getSortOrder() - 1;
                    stockCollectMapper.updateSortOrdergnyakeyiliaoall(item.getTsCode(), newSortOrder);
                }
            }
        }
        // 将目标记录置底
        stockCollectMapper.updateSortOrdergnyakeyiliaoall(tsCode, bottomSortOrder);
    }

    public void moveItemUpgnyakeyiliaoall(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgnyakeyiliaoall(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergnyakeyiliaoall(flag);

        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getTsCode().equals(tsCode)) {
                // 找到当前记录的索引
                int currentIndex = i;
                if (currentIndex > 0) {
                    // 交换当前记录和前一条记录的排序值
                    StockCollect current = allItems.get(currentIndex);
                    StockCollect previous = allItems.get(currentIndex - 1);
                    int tempSortOrder = current.getSortOrder();
                    current.setSortOrder(previous.getSortOrder());
                    previous.setSortOrder(tempSortOrder);

                    stockCollectMapper.updateSortOrdergnyakeyiliaoall(current.getTsCode(), current.getSortOrder());
                    stockCollectMapper.updateSortOrdergnyakeyiliaoall(previous.getTsCode(), previous.getSortOrder());
                }
                break;
            }
        }
    }
    public String[] getgnyakeyiliaoall() {
        return stockCollectMapper.selectgnyakeyiliaoall();
    }

    public void collectgnyakeyiliaoall(String tsCode) {
        int count = stockCollectMapper.checkIfExistsgnyakeyiliaoall(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.collectUpdategnyakeyiliaoall(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertgnyakeyiliaoall(stockCollect);
        }
    }


    public void moveItemTopgnzhinengyiliaoall(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgnzhinengyiliaoall(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergnzhinengyiliaoall(flag);
        StockCollect minStockCollect = stockCollectMapper.selectMinOrdergnzhinengyiliaoall(flag);
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                synchronized (flag) {
                    int newSortOrder = item.getSortOrder() + 1;
                    stockCollectMapper.updateSortOrdergnzhinengyiliaoall(item.getTsCode(), newSortOrder);
                }

            }
        }
        // 将目标记录置顶
        stockCollectMapper.updateSortOrdergnzhinengyiliaoall(tsCode, minStockCollect.getSortOrder());
    }

    public void moveItemBottomgnzhinengyiliaoall(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgnzhinengyiliaoall(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergnzhinengyiliaoall(flag);
        StockCollect maxStockCollect = stockCollectMapper.selectMaxOrdergnzhinengyiliaoall(flag);
        int bottomSortOrder = maxStockCollect.getSortOrder();
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                synchronized (flag) {
                    int newSortOrder = item.getSortOrder() - 1;
                    stockCollectMapper.updateSortOrdergnzhinengyiliaoall(item.getTsCode(), newSortOrder);
                }
            }
        }
        // 将目标记录置底
        stockCollectMapper.updateSortOrdergnzhinengyiliaoall(tsCode, bottomSortOrder);
    }

    public void moveItemUpgnzhinengyiliaoall(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgnzhinengyiliaoall(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergnzhinengyiliaoall(flag);

        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getTsCode().equals(tsCode)) {
                // 找到当前记录的索引
                int currentIndex = i;
                if (currentIndex > 0) {
                    // 交换当前记录和前一条记录的排序值
                    StockCollect current = allItems.get(currentIndex);
                    StockCollect previous = allItems.get(currentIndex - 1);
                    int tempSortOrder = current.getSortOrder();
                    current.setSortOrder(previous.getSortOrder());
                    previous.setSortOrder(tempSortOrder);

                    stockCollectMapper.updateSortOrdergnzhinengyiliaoall(current.getTsCode(), current.getSortOrder());
                    stockCollectMapper.updateSortOrdergnzhinengyiliaoall(previous.getTsCode(), previous.getSortOrder());
                }
                break;
            }
        }
    }
    public String[] getgnzhinengyiliaoall() {
        return stockCollectMapper.selectgnzhinengyiliaoall();
    }

    public void collectgnzhinengyiliaoall(String tsCode) {
        int count = stockCollectMapper.checkIfExistsgnzhinengyiliaoall(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.collectUpdategnzhinengyiliaoall(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertgnzhinengyiliaoall(stockCollect);
        }
    }




    public void moveItemTopgnchongzudanbaiall(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgnchongzudanbaiall(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergnchongzudanbaiall(flag);
        StockCollect minStockCollect = stockCollectMapper.selectMinOrdergnchongzudanbaiall(flag);
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                synchronized (flag) {
                    int newSortOrder = item.getSortOrder() + 1;
                    stockCollectMapper.updateSortOrdergnchongzudanbaiall(item.getTsCode(), newSortOrder);
                }

            }
        }
        // 将目标记录置顶
        stockCollectMapper.updateSortOrdergnchongzudanbaiall(tsCode, minStockCollect.getSortOrder());
    }

    public void moveItemBottomgnchongzudanbaiall(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgnchongzudanbaiall(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergnchongzudanbaiall(flag);
        StockCollect maxStockCollect = stockCollectMapper.selectMaxOrdergnchongzudanbaiall(flag);
        int bottomSortOrder = maxStockCollect.getSortOrder();
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                synchronized (flag) {
                    int newSortOrder = item.getSortOrder() - 1;
                    stockCollectMapper.updateSortOrdergnchongzudanbaiall(item.getTsCode(), newSortOrder);
                }
            }
        }
        // 将目标记录置底
        stockCollectMapper.updateSortOrdergnchongzudanbaiall(tsCode, bottomSortOrder);
    }

    public void moveItemUpgnchongzudanbaiall(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgnchongzudanbaiall(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergnchongzudanbaiall(flag);

        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getTsCode().equals(tsCode)) {
                // 找到当前记录的索引
                int currentIndex = i;
                if (currentIndex > 0) {
                    // 交换当前记录和前一条记录的排序值
                    StockCollect current = allItems.get(currentIndex);
                    StockCollect previous = allItems.get(currentIndex - 1);
                    int tempSortOrder = current.getSortOrder();
                    current.setSortOrder(previous.getSortOrder());
                    previous.setSortOrder(tempSortOrder);

                    stockCollectMapper.updateSortOrdergnchongzudanbaiall(current.getTsCode(), current.getSortOrder());
                    stockCollectMapper.updateSortOrdergnchongzudanbaiall(previous.getTsCode(), previous.getSortOrder());
                }
                break;
            }
        }
    }
    public String[] getgnchongzudanbaiall() {
        return stockCollectMapper.selectgnchongzudanbaiall();
    }

    public void collectgnchongzudanbaiall(String tsCode) {
        int count = stockCollectMapper.checkIfExistsgnchongzudanbaiall(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.collectUpdategnchongzudanbaiall(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertgnchongzudanbaiall(stockCollect);
        }
    }

    public void moveItemTopgnzaixianjiaoyuall(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgnzaixianjiaoyuall(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergnzaixianjiaoyuall(flag);
        StockCollect minStockCollect = stockCollectMapper.selectMinOrdergnzaixianjiaoyuall(flag);
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                synchronized (flag) {
                    int newSortOrder = item.getSortOrder() + 1;
                    stockCollectMapper.updateSortOrdergnzaixianjiaoyuall(item.getTsCode(), newSortOrder);
                }

            }
        }
        // 将目标记录置顶
        stockCollectMapper.updateSortOrdergnzaixianjiaoyuall(tsCode, minStockCollect.getSortOrder());
    }

    public void moveItemBottomgnzaixianjiaoyuall(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgnzaixianjiaoyuall(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergnzaixianjiaoyuall(flag);
        StockCollect maxStockCollect = stockCollectMapper.selectMaxOrdergnzaixianjiaoyuall(flag);
        int bottomSortOrder = maxStockCollect.getSortOrder();
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                synchronized (flag) {
                    int newSortOrder = item.getSortOrder() - 1;
                    stockCollectMapper.updateSortOrdergnzaixianjiaoyuall(item.getTsCode(), newSortOrder);
                }
            }
        }
        // 将目标记录置底
        stockCollectMapper.updateSortOrdergnzaixianjiaoyuall(tsCode, bottomSortOrder);
    }

    public void moveItemUpgnzaixianjiaoyuall(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgnzaixianjiaoyuall(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergnzaixianjiaoyuall(flag);

        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getTsCode().equals(tsCode)) {
                // 找到当前记录的索引
                int currentIndex = i;
                if (currentIndex > 0) {
                    // 交换当前记录和前一条记录的排序值
                    StockCollect current = allItems.get(currentIndex);
                    StockCollect previous = allItems.get(currentIndex - 1);
                    int tempSortOrder = current.getSortOrder();
                    current.setSortOrder(previous.getSortOrder());
                    previous.setSortOrder(tempSortOrder);

                    stockCollectMapper.updateSortOrdergnzaixianjiaoyuall(current.getTsCode(), current.getSortOrder());
                    stockCollectMapper.updateSortOrdergnzaixianjiaoyuall(previous.getTsCode(), previous.getSortOrder());
                }
                break;
            }
        }
    }
    public String[] getgnzaixianjiaoyuall() {
        return stockCollectMapper.selectgnzaixianjiaoyuall();
    }

    public void collectgnzaixianjiaoyuall(String tsCode) {
        int count = stockCollectMapper.checkIfExistsgnzaixianjiaoyuall(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.collectUpdategnzaixianjiaoyuall(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertgnzaixianjiaoyuall(stockCollect);
        }
    }


    public void moveItemTopgnzhiyejiaoyuall(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgnzhiyejiaoyuall(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergnzhiyejiaoyuall(flag);
        StockCollect minStockCollect = stockCollectMapper.selectMinOrdergnzhiyejiaoyuall(flag);
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                synchronized (flag) {
                    int newSortOrder = item.getSortOrder() + 1;
                    stockCollectMapper.updateSortOrdergnzhiyejiaoyuall(item.getTsCode(), newSortOrder);
                }

            }
        }
        // 将目标记录置顶
        stockCollectMapper.updateSortOrdergnzhiyejiaoyuall(tsCode, minStockCollect.getSortOrder());
    }

    public void moveItemBottomgnzhiyejiaoyuall(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgnzhiyejiaoyuall(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergnzhiyejiaoyuall(flag);
        StockCollect maxStockCollect = stockCollectMapper.selectMaxOrdergnzhiyejiaoyuall(flag);
        int bottomSortOrder = maxStockCollect.getSortOrder();
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                synchronized (flag) {
                    int newSortOrder = item.getSortOrder() - 1;
                    stockCollectMapper.updateSortOrdergnzhiyejiaoyuall(item.getTsCode(), newSortOrder);
                }
            }
        }
        // 将目标记录置底
        stockCollectMapper.updateSortOrdergnzhiyejiaoyuall(tsCode, bottomSortOrder);
    }

    public void moveItemUpgnzhiyejiaoyuall(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgnzhiyejiaoyuall(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergnzhiyejiaoyuall(flag);

        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getTsCode().equals(tsCode)) {
                // 找到当前记录的索引
                int currentIndex = i;
                if (currentIndex > 0) {
                    // 交换当前记录和前一条记录的排序值
                    StockCollect current = allItems.get(currentIndex);
                    StockCollect previous = allItems.get(currentIndex - 1);
                    int tempSortOrder = current.getSortOrder();
                    current.setSortOrder(previous.getSortOrder());
                    previous.setSortOrder(tempSortOrder);

                    stockCollectMapper.updateSortOrdergnzhiyejiaoyuall(current.getTsCode(), current.getSortOrder());
                    stockCollectMapper.updateSortOrdergnzhiyejiaoyuall(previous.getTsCode(), previous.getSortOrder());
                }
                break;
            }
        }
    }
    public String[] getgnzhiyejiaoyuall() {
        return stockCollectMapper.selectgnzhiyejiaoyuall();
    }

    public void collectgnzhiyejiaoyuall(String tsCode) {
        int count = stockCollectMapper.checkIfExistsgnzhiyejiaoyuall(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.collectUpdategnzhiyejiaoyuall(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertgnzhiyejiaoyuall(stockCollect);
        }
    }


    public void moveItemTopgnxiaomigainianall(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgnxiaomigainianall(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergnxiaomigainianall(flag);
        StockCollect minStockCollect = stockCollectMapper.selectMinOrdergnxiaomigainianall(flag);
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                synchronized (flag) {
                    int newSortOrder = item.getSortOrder() + 1;
                    stockCollectMapper.updateSortOrdergnxiaomigainianall(item.getTsCode(), newSortOrder);
                }

            }
        }
        // 将目标记录置顶
        stockCollectMapper.updateSortOrdergnxiaomigainianall(tsCode, minStockCollect.getSortOrder());
    }

    public void moveItemBottomgnxiaomigainianall(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgnxiaomigainianall(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergnxiaomigainianall(flag);
        StockCollect maxStockCollect = stockCollectMapper.selectMaxOrdergnxiaomigainianall(flag);
        int bottomSortOrder = maxStockCollect.getSortOrder();
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                synchronized (flag) {
                    int newSortOrder = item.getSortOrder() - 1;
                    stockCollectMapper.updateSortOrdergnxiaomigainianall(item.getTsCode(), newSortOrder);
                }
            }
        }
        // 将目标记录置底
        stockCollectMapper.updateSortOrdergnxiaomigainianall(tsCode, bottomSortOrder);
    }

    public void moveItemUpgnxiaomigainianall(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgnxiaomigainianall(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergnxiaomigainianall(flag);

        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getTsCode().equals(tsCode)) {
                // 找到当前记录的索引
                int currentIndex = i;
                if (currentIndex > 0) {
                    // 交换当前记录和前一条记录的排序值
                    StockCollect current = allItems.get(currentIndex);
                    StockCollect previous = allItems.get(currentIndex - 1);
                    int tempSortOrder = current.getSortOrder();
                    current.setSortOrder(previous.getSortOrder());
                    previous.setSortOrder(tempSortOrder);

                    stockCollectMapper.updateSortOrdergnxiaomigainianall(current.getTsCode(), current.getSortOrder());
                    stockCollectMapper.updateSortOrdergnxiaomigainianall(previous.getTsCode(), previous.getSortOrder());
                }
                break;
            }
        }
    }
    public String[] getgnxiaomigainianall() {
        return stockCollectMapper.selectgnxiaomigainianall();
    }

    public void collectgnxiaomigainianall(String tsCode) {
        int count = stockCollectMapper.checkIfExistsgnxiaomigainianall(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.collectUpdategnxiaomigainianall(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertgnxiaomigainianall(stockCollect);
        }
    }



    public void moveItemTopgnxiaodujiall(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgnxiaodujiall(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergnxiaodujiall(flag);
        StockCollect minStockCollect = stockCollectMapper.selectMinOrdergnxiaodujiall(flag);
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                synchronized (flag) {
                    int newSortOrder = item.getSortOrder() + 1;
                    stockCollectMapper.updateSortOrdergnxiaodujiall(item.getTsCode(), newSortOrder);
                }

            }
        }
        // 将目标记录置顶
        stockCollectMapper.updateSortOrdergnxiaodujiall(tsCode, minStockCollect.getSortOrder());
    }

    public void moveItemBottomgnxiaodujiall(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgnxiaodujiall(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergnxiaodujiall(flag);
        StockCollect maxStockCollect = stockCollectMapper.selectMaxOrdergnxiaodujiall(flag);
        int bottomSortOrder = maxStockCollect.getSortOrder();
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                synchronized (flag) {
                    int newSortOrder = item.getSortOrder() - 1;
                    stockCollectMapper.updateSortOrdergnxiaodujiall(item.getTsCode(), newSortOrder);
                }
            }
        }
        // 将目标记录置底
        stockCollectMapper.updateSortOrdergnxiaodujiall(tsCode, bottomSortOrder);
    }

    public void moveItemUpgnxiaodujiall(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgnxiaodujiall(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergnxiaodujiall(flag);

        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getTsCode().equals(tsCode)) {
                // 找到当前记录的索引
                int currentIndex = i;
                if (currentIndex > 0) {
                    // 交换当前记录和前一条记录的排序值
                    StockCollect current = allItems.get(currentIndex);
                    StockCollect previous = allItems.get(currentIndex - 1);
                    int tempSortOrder = current.getSortOrder();
                    current.setSortOrder(previous.getSortOrder());
                    previous.setSortOrder(tempSortOrder);

                    stockCollectMapper.updateSortOrdergnxiaodujiall(current.getTsCode(), current.getSortOrder());
                    stockCollectMapper.updateSortOrdergnxiaodujiall(previous.getTsCode(), previous.getSortOrder());
                }
                break;
            }
        }
    }
    public String[] getgnxiaodujiall() {
        return stockCollectMapper.selectgnxiaodujiall();
    }

    public void collectgnxiaodujiall(String tsCode) {
        int count = stockCollectMapper.checkIfExistsgnxiaodujiall(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.collectUpdategnxiaodujiall(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertgnxiaodujiall(stockCollect);
        }
    }


    public void moveItemTopgnweishengsuall(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgnweishengsuall(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergnweishengsuall(flag);
        StockCollect minStockCollect = stockCollectMapper.selectMinOrdergnweishengsuall(flag);
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                synchronized (flag) {
                    int newSortOrder = item.getSortOrder() + 1;
                    stockCollectMapper.updateSortOrdergnweishengsuall(item.getTsCode(), newSortOrder);
                }

            }
        }
        // 将目标记录置顶
        stockCollectMapper.updateSortOrdergnweishengsuall(tsCode, minStockCollect.getSortOrder());
    }

    public void moveItemBottomgnweishengsuall(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgnweishengsuall(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergnweishengsuall(flag);
        StockCollect maxStockCollect = stockCollectMapper.selectMaxOrdergnweishengsuall(flag);
        int bottomSortOrder = maxStockCollect.getSortOrder();
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                synchronized (flag) {
                    int newSortOrder = item.getSortOrder() - 1;
                    stockCollectMapper.updateSortOrdergnweishengsuall(item.getTsCode(), newSortOrder);
                }
            }
        }
        // 将目标记录置底
        stockCollectMapper.updateSortOrdergnweishengsuall(tsCode, bottomSortOrder);
    }

    public void moveItemUpgnweishengsuall(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdgnweishengsuall(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrdergnweishengsuall(flag);

        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getTsCode().equals(tsCode)) {
                // 找到当前记录的索引
                int currentIndex = i;
                if (currentIndex > 0) {
                    // 交换当前记录和前一条记录的排序值
                    StockCollect current = allItems.get(currentIndex);
                    StockCollect previous = allItems.get(currentIndex - 1);
                    int tempSortOrder = current.getSortOrder();
                    current.setSortOrder(previous.getSortOrder());
                    previous.setSortOrder(tempSortOrder);

                    stockCollectMapper.updateSortOrdergnweishengsuall(current.getTsCode(), current.getSortOrder());
                    stockCollectMapper.updateSortOrdergnweishengsuall(previous.getTsCode(), previous.getSortOrder());
                }
                break;
            }
        }
    }
    public String[] getgnweishengsuall() {
        return stockCollectMapper.selectgnweishengsuall();
    }

    public void collectgnweishengsuall(String tsCode) {
        int count = stockCollectMapper.checkIfExistsgnweishengsuall(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.collectUpdategnweishengsuall(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertgnweishengsuall(stockCollect);
        }
    }


    public void collectZhuizongnlyx(String tsCode) {
        int count = stockCollectMapper.checkIfExistsZhuizongnlyx(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateZhuizongnlyx(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertZhuizongnlyx(stockCollect);
        }
    }
    public String[] getZhuizongnlyx() {
        return stockCollectMapper.selectZhuizongnlyx();
    }

    public String[] zanbuZhuizongnlyx() {
        return stockCollectMapper.selectzanbuZhuizongnlyx();
    }

    public void delZhuizongnlyx(String tsCode) { stockCollectMapper.delZhuizongnlyx(tsCode); }

    public void goonZhuizongnlyx(String tsCode) { stockCollectMapper.goonZhuizongnlyx(tsCode); }


    public void moveItemTopZhuizongnlyx(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongnlyx(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongnlyx(flag);
        StockCollect minStockCollect = stockCollectMapper.selectMinOrderZhuizongnlyx(flag);
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() + 1;
                stockCollectMapper.updateSortOrderZhuizongnlyx(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置顶
        stockCollectMapper.updateSortOrderZhuizongnlyx(tsCode, minStockCollect.getSortOrder());
    }

    public void moveItemBottomZhuizongnlyx(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongnlyx(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongnlyx(flag);
        StockCollect maxStockCollect = stockCollectMapper.selectMaxOrderZhuizongnlyx(flag);
        int bottomSortOrder = maxStockCollect.getSortOrder();
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() - 1;
                stockCollectMapper.updateSortOrderZhuizongnlyx(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置底
        stockCollectMapper.updateSortOrderZhuizongnlyx(tsCode, bottomSortOrder);
    }

    public void moveItemUpZhuizongnlyx(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongnlyx(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongnlyx(flag);

        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getTsCode().equals(tsCode)) {
                // 找到当前记录的索引
                int currentIndex = i;
                if (currentIndex > 0) {
                    // 交换当前记录和前一条记录的排序值
                    StockCollect current = allItems.get(currentIndex);
                    StockCollect previous = allItems.get(currentIndex - 1);
                    int tempSortOrder = current.getSortOrder();
                    current.setSortOrder(previous.getSortOrder());
                    previous.setSortOrder(tempSortOrder);

                    stockCollectMapper.updateSortOrderZhuizongnlyx(current.getTsCode(), current.getSortOrder());
                    stockCollectMapper.updateSortOrderZhuizongnlyx(previous.getTsCode(), previous.getSortOrder());
                }
                break;
            }
        }
    }




    public void collectZhuizongny(String tsCode) {
        int count = stockCollectMapper.checkIfExistsZhuizongny(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateZhuizongny(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertZhuizongny(stockCollect);
        }
    }
    public String[] getZhuizongny() {
        return stockCollectMapper.selectZhuizongny();
    }

    public String[] zanbuZhuizongny() {
        return stockCollectMapper.selectzanbuZhuizongny();
    }

    public void delZhuizongny(String tsCode) { stockCollectMapper.delZhuizongny(tsCode); }

    public void goonZhuizongny(String tsCode) { stockCollectMapper.goonZhuizongny(tsCode); }


    public void moveItemTopZhuizongny(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongny(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongny(flag);
        StockCollect minStockCollect = stockCollectMapper.selectMinOrderZhuizongny(flag);
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() + 1;
                stockCollectMapper.updateSortOrderZhuizongny(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置顶
        stockCollectMapper.updateSortOrderZhuizongny(tsCode, minStockCollect.getSortOrder());
    }

    public void moveItemBottomZhuizongny(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongny(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongny(flag);
        StockCollect maxStockCollect = stockCollectMapper.selectMaxOrderZhuizongny(flag);
        int bottomSortOrder = maxStockCollect.getSortOrder();
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() - 1;
                stockCollectMapper.updateSortOrderZhuizongny(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置底
        stockCollectMapper.updateSortOrderZhuizongny(tsCode, bottomSortOrder);
    }

    public void moveItemUpZhuizongny(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongny(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongny(flag);

        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getTsCode().equals(tsCode)) {
                // 找到当前记录的索引
                int currentIndex = i;
                if (currentIndex > 0) {
                    // 交换当前记录和前一条记录的排序值
                    StockCollect current = allItems.get(currentIndex);
                    StockCollect previous = allItems.get(currentIndex - 1);
                    int tempSortOrder = current.getSortOrder();
                    current.setSortOrder(previous.getSortOrder());
                    previous.setSortOrder(tempSortOrder);

                    stockCollectMapper.updateSortOrderZhuizongny(current.getTsCode(), current.getSortOrder());
                    stockCollectMapper.updateSortOrderZhuizongny(previous.getTsCode(), previous.getSortOrder());
                }
                break;
            }
        }
    }




    public void collectZhuizongjtys(String tsCode) {
        int count = stockCollectMapper.checkIfExistsZhuizongjtys(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateZhuizongjtys(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertZhuizongjtys(stockCollect);
        }
    }
    public String[] getZhuizongjtys() {
        return stockCollectMapper.selectZhuizongjtys();
    }

    public String[] zanbuZhuizongjtys() {
        return stockCollectMapper.selectzanbuZhuizongjtys();
    }

    public void delZhuizongjtys(String tsCode) { stockCollectMapper.delZhuizongjtys(tsCode); }

    public void goonZhuizongjtys(String tsCode) { stockCollectMapper.goonZhuizongjtys(tsCode); }


    public void moveItemTopZhuizongjtys(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongjtys(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongjtys(flag);
        StockCollect minStockCollect = stockCollectMapper.selectMinOrderZhuizongjtys(flag);
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() + 1;
                stockCollectMapper.updateSortOrderZhuizongjtys(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置顶
        stockCollectMapper.updateSortOrderZhuizongjtys(tsCode, minStockCollect.getSortOrder());
    }

    public void moveItemBottomZhuizongjtys(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongjtys(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongjtys(flag);
        StockCollect maxStockCollect = stockCollectMapper.selectMaxOrderZhuizongjtys(flag);
        int bottomSortOrder = maxStockCollect.getSortOrder();
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() - 1;
                stockCollectMapper.updateSortOrderZhuizongjtys(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置底
        stockCollectMapper.updateSortOrderZhuizongjtys(tsCode, bottomSortOrder);
    }

    public void moveItemUpZhuizongjtys(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongjtys(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongjtys(flag);

        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getTsCode().equals(tsCode)) {
                // 找到当前记录的索引
                int currentIndex = i;
                if (currentIndex > 0) {
                    // 交换当前记录和前一条记录的排序值
                    StockCollect current = allItems.get(currentIndex);
                    StockCollect previous = allItems.get(currentIndex - 1);
                    int tempSortOrder = current.getSortOrder();
                    current.setSortOrder(previous.getSortOrder());
                    previous.setSortOrder(tempSortOrder);

                    stockCollectMapper.updateSortOrderZhuizongjtys(current.getTsCode(), current.getSortOrder());
                    stockCollectMapper.updateSortOrderZhuizongjtys(previous.getTsCode(), previous.getSortOrder());
                }
                break;
            }
        }
    }







    public void collectZhuizongqiche(String tsCode) {
        int count = stockCollectMapper.checkIfExistsZhuizongqiche(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateZhuizongqiche(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertZhuizongqiche(stockCollect);
        }
    }
    public String[] getZhuizongqiche() {
        return stockCollectMapper.selectZhuizongqiche();
    }

    public String[] zanbuZhuizongqiche() {
        return stockCollectMapper.selectzanbuZhuizongqiche();
    }

    public void delZhuizongqiche(String tsCode) { stockCollectMapper.delZhuizongqiche(tsCode); }

    public void goonZhuizongqiche(String tsCode) { stockCollectMapper.goonZhuizongqiche(tsCode); }


    public void moveItemTopZhuizongqiche(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongqiche(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongqiche(flag);
        StockCollect minStockCollect = stockCollectMapper.selectMinOrderZhuizongqiche(flag);
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() + 1;
                stockCollectMapper.updateSortOrderZhuizongqiche(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置顶
        stockCollectMapper.updateSortOrderZhuizongqiche(tsCode, minStockCollect.getSortOrder());
    }

    public void moveItemBottomZhuizongqiche(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongqiche(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongqiche(flag);
        StockCollect maxStockCollect = stockCollectMapper.selectMaxOrderZhuizongqiche(flag);
        int bottomSortOrder = maxStockCollect.getSortOrder();
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() - 1;
                stockCollectMapper.updateSortOrderZhuizongqiche(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置底
        stockCollectMapper.updateSortOrderZhuizongqiche(tsCode, bottomSortOrder);
    }

    public void moveItemUpZhuizongqiche(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongqiche(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongqiche(flag);

        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getTsCode().equals(tsCode)) {
                // 找到当前记录的索引
                int currentIndex = i;
                if (currentIndex > 0) {
                    // 交换当前记录和前一条记录的排序值
                    StockCollect current = allItems.get(currentIndex);
                    StockCollect previous = allItems.get(currentIndex - 1);
                    int tempSortOrder = current.getSortOrder();
                    current.setSortOrder(previous.getSortOrder());
                    previous.setSortOrder(tempSortOrder);

                    stockCollectMapper.updateSortOrderZhuizongqiche(current.getTsCode(), current.getSortOrder());
                    stockCollectMapper.updateSortOrderZhuizongqiche(previous.getTsCode(), previous.getSortOrder());
                }
                break;
            }
        }
    }



    public void collectZhuizonggt(String tsCode) {
        int count = stockCollectMapper.checkIfExistsZhuizonggt(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateZhuizonggt(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertZhuizonggt(stockCollect);
        }
    }
    public String[] getZhuizonggt() {
        return stockCollectMapper.selectZhuizonggt();
    }

    public String[] zanbuZhuizonggt() {
        return stockCollectMapper.selectzanbuZhuizonggt();
    }

    public void delZhuizonggt(String tsCode) { stockCollectMapper.delZhuizonggt(tsCode); }

    public void goonZhuizonggt(String tsCode) { stockCollectMapper.goonZhuizonggt(tsCode); }


    public void moveItemTopZhuizonggt(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizonggt(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizonggt(flag);
        StockCollect minStockCollect = stockCollectMapper.selectMinOrderZhuizonggt(flag);
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() + 1;
                stockCollectMapper.updateSortOrderZhuizonggt(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置顶
        stockCollectMapper.updateSortOrderZhuizonggt(tsCode, minStockCollect.getSortOrder());
    }

    public void moveItemBottomZhuizonggt(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizonggt(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizonggt(flag);
        StockCollect maxStockCollect = stockCollectMapper.selectMaxOrderZhuizonggt(flag);
        int bottomSortOrder = maxStockCollect.getSortOrder();
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() - 1;
                stockCollectMapper.updateSortOrderZhuizonggt(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置底
        stockCollectMapper.updateSortOrderZhuizonggt(tsCode, bottomSortOrder);
    }

    public void moveItemUpZhuizonggt(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizonggt(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizonggt(flag);

        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getTsCode().equals(tsCode)) {
                // 找到当前记录的索引
                int currentIndex = i;
                if (currentIndex > 0) {
                    // 交换当前记录和前一条记录的排序值
                    StockCollect current = allItems.get(currentIndex);
                    StockCollect previous = allItems.get(currentIndex - 1);
                    int tempSortOrder = current.getSortOrder();
                    current.setSortOrder(previous.getSortOrder());
                    previous.setSortOrder(tempSortOrder);

                    stockCollectMapper.updateSortOrderZhuizonggt(current.getTsCode(), current.getSortOrder());
                    stockCollectMapper.updateSortOrderZhuizonggt(previous.getTsCode(), previous.getSortOrder());
                }
                break;
            }
        }
    }




    public void collectZhuizongjinshu(String tsCode) {
        int count = stockCollectMapper.checkIfExistsZhuizongjinshu(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateZhuizongjinshu(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertZhuizongjinshu(stockCollect);
        }
    }
    public String[] getZhuizongjinshu() {
        return stockCollectMapper.selectZhuizongjinshu();
    }

    public String[] zanbuZhuizongjinshu() {
        return stockCollectMapper.selectzanbuZhuizongjinshu();
    }

    public void delZhuizongjinshu(String tsCode) { stockCollectMapper.delZhuizongjinshu(tsCode); }

    public void goonZhuizongjinshu(String tsCode) { stockCollectMapper.goonZhuizongjinshu(tsCode); }


    public void moveItemTopZhuizongjinshu(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongjinshu(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongjinshu(flag);
        StockCollect minStockCollect = stockCollectMapper.selectMinOrderZhuizongjinshu(flag);
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() + 1;
                stockCollectMapper.updateSortOrderZhuizongjinshu(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置顶
        stockCollectMapper.updateSortOrderZhuizongjinshu(tsCode, minStockCollect.getSortOrder());
    }

    public void moveItemBottomZhuizongjinshu(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongjinshu(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongjinshu(flag);
        StockCollect maxStockCollect = stockCollectMapper.selectMaxOrderZhuizongjinshu(flag);
        int bottomSortOrder = maxStockCollect.getSortOrder();
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() - 1;
                stockCollectMapper.updateSortOrderZhuizongjinshu(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置底
        stockCollectMapper.updateSortOrderZhuizongjinshu(tsCode, bottomSortOrder);
    }

    public void moveItemUpZhuizongjinshu(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongjinshu(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongjinshu(flag);

        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getTsCode().equals(tsCode)) {
                // 找到当前记录的索引
                int currentIndex = i;
                if (currentIndex > 0) {
                    // 交换当前记录和前一条记录的排序值
                    StockCollect current = allItems.get(currentIndex);
                    StockCollect previous = allItems.get(currentIndex - 1);
                    int tempSortOrder = current.getSortOrder();
                    current.setSortOrder(previous.getSortOrder());
                    previous.setSortOrder(tempSortOrder);

                    stockCollectMapper.updateSortOrderZhuizongjinshu(current.getTsCode(), current.getSortOrder());
                    stockCollectMapper.updateSortOrderZhuizongjinshu(previous.getTsCode(), previous.getSortOrder());
                }
                break;
            }
        }
    }




    public void collectZhuizonghuaxuezhiping(String tsCode) {
        int count = stockCollectMapper.checkIfExistsZhuizonghuaxuezhiping(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateZhuizonghuaxuezhiping(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertZhuizonghuaxuezhiping(stockCollect);
        }
    }
    public String[] getZhuizonghuaxuezhiping() {
        return stockCollectMapper.selectZhuizonghuaxuezhiping();
    }

    public String[] zanbuZhuizonghuaxuezhiping() {
        return stockCollectMapper.selectzanbuZhuizonghuaxuezhiping();
    }

    public void delZhuizonghuaxuezhiping(String tsCode) { stockCollectMapper.delZhuizonghuaxuezhiping(tsCode); }

    public void goonZhuizonghuaxuezhiping(String tsCode) { stockCollectMapper.goonZhuizonghuaxuezhiping(tsCode); }


    public void moveItemTopZhuizonghuaxuezhiping(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizonghuaxuezhiping(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizonghuaxuezhiping(flag);
        StockCollect minStockCollect = stockCollectMapper.selectMinOrderZhuizonghuaxuezhiping(flag);
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() + 1;
                stockCollectMapper.updateSortOrderZhuizonghuaxuezhiping(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置顶
        stockCollectMapper.updateSortOrderZhuizonghuaxuezhiping(tsCode, minStockCollect.getSortOrder());
    }

    public void moveItemBottomZhuizonghuaxuezhiping(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizonghuaxuezhiping(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizonghuaxuezhiping(flag);
        StockCollect maxStockCollect = stockCollectMapper.selectMaxOrderZhuizonghuaxuezhiping(flag);
        int bottomSortOrder = maxStockCollect.getSortOrder();
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() - 1;
                stockCollectMapper.updateSortOrderZhuizonghuaxuezhiping(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置底
        stockCollectMapper.updateSortOrderZhuizonghuaxuezhiping(tsCode, bottomSortOrder);
    }

    public void moveItemUpZhuizonghuaxuezhiping(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizonghuaxuezhiping(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizonghuaxuezhiping(flag);

        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getTsCode().equals(tsCode)) {
                // 找到当前记录的索引
                int currentIndex = i;
                if (currentIndex > 0) {
                    // 交换当前记录和前一条记录的排序值
                    StockCollect current = allItems.get(currentIndex);
                    StockCollect previous = allItems.get(currentIndex - 1);
                    int tempSortOrder = current.getSortOrder();
                    current.setSortOrder(previous.getSortOrder());
                    previous.setSortOrder(tempSortOrder);

                    stockCollectMapper.updateSortOrderZhuizonghuaxuezhiping(current.getTsCode(), current.getSortOrder());
                    stockCollectMapper.updateSortOrderZhuizonghuaxuezhiping(previous.getTsCode(), previous.getSortOrder());
                }
                break;
            }
        }
    }







    public void collectZhuizongtongxing(String tsCode) {
        int count = stockCollectMapper.checkIfExistsZhuizongtongxing(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateZhuizongtongxing(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertZhuizongtongxing(stockCollect);
        }
    }
    public String[] getZhuizongtongxing() {
        return stockCollectMapper.selectZhuizongtongxing();
    }

    public String[] zanbuZhuizongtongxing() {
        return stockCollectMapper.selectzanbuZhuizongtongxing();
    }

    public void delZhuizongtongxing(String tsCode) { stockCollectMapper.delZhuizongtongxing(tsCode); }

    public void goonZhuizongtongxing(String tsCode) { stockCollectMapper.goonZhuizongtongxing(tsCode); }


    public void moveItemTopZhuizongtongxing(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongtongxing(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongtongxing(flag);
        StockCollect minStockCollect = stockCollectMapper.selectMinOrderZhuizongtongxing(flag);
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() + 1;
                stockCollectMapper.updateSortOrderZhuizongtongxing(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置顶
        stockCollectMapper.updateSortOrderZhuizongtongxing(tsCode, minStockCollect.getSortOrder());
    }

    public void moveItemBottomZhuizongtongxing(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongtongxing(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongtongxing(flag);
        StockCollect maxStockCollect = stockCollectMapper.selectMaxOrderZhuizongtongxing(flag);
        int bottomSortOrder = maxStockCollect.getSortOrder();
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() - 1;
                stockCollectMapper.updateSortOrderZhuizongtongxing(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置底
        stockCollectMapper.updateSortOrderZhuizongtongxing(tsCode, bottomSortOrder);
    }

    public void moveItemUpZhuizongtongxing(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongtongxing(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongtongxing(flag);

        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getTsCode().equals(tsCode)) {
                // 找到当前记录的索引
                int currentIndex = i;
                if (currentIndex > 0) {
                    // 交换当前记录和前一条记录的排序值
                    StockCollect current = allItems.get(currentIndex);
                    StockCollect previous = allItems.get(currentIndex - 1);
                    int tempSortOrder = current.getSortOrder();
                    current.setSortOrder(previous.getSortOrder());
                    previous.setSortOrder(tempSortOrder);

                    stockCollectMapper.updateSortOrderZhuizongtongxing(current.getTsCode(), current.getSortOrder());
                    stockCollectMapper.updateSortOrderZhuizongtongxing(previous.getTsCode(), previous.getSortOrder());
                }
                break;
            }
        }
    }






    public void collectZhuizongwenhua(String tsCode) {
        int count = stockCollectMapper.checkIfExistsZhuizongwenhua(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateZhuizongwenhua(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertZhuizongwenhua(stockCollect);
        }
    }
    public String[] getZhuizongwenhua() {
        return stockCollectMapper.selectZhuizongwenhua();
    }

    public String[] zanbuZhuizongwenhua() {
        return stockCollectMapper.selectzanbuZhuizongwenhua();
    }

    public void delZhuizongwenhua(String tsCode) { stockCollectMapper.delZhuizongwenhua(tsCode); }

    public void goonZhuizongwenhua(String tsCode) { stockCollectMapper.goonZhuizongwenhua(tsCode); }


    public void moveItemTopZhuizongwenhua(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongwenhua(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongwenhua(flag);
        StockCollect minStockCollect = stockCollectMapper.selectMinOrderZhuizongwenhua(flag);
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() + 1;
                stockCollectMapper.updateSortOrderZhuizongwenhua(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置顶
        stockCollectMapper.updateSortOrderZhuizongwenhua(tsCode, minStockCollect.getSortOrder());
    }

    public void moveItemBottomZhuizongwenhua(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongwenhua(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongwenhua(flag);
        StockCollect maxStockCollect = stockCollectMapper.selectMaxOrderZhuizongwenhua(flag);
        int bottomSortOrder = maxStockCollect.getSortOrder();
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() - 1;
                stockCollectMapper.updateSortOrderZhuizongwenhua(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置底
        stockCollectMapper.updateSortOrderZhuizongwenhua(tsCode, bottomSortOrder);
    }

    public void moveItemUpZhuizongwenhua(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongwenhua(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongwenhua(flag);

        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getTsCode().equals(tsCode)) {
                // 找到当前记录的索引
                int currentIndex = i;
                if (currentIndex > 0) {
                    // 交换当前记录和前一条记录的排序值
                    StockCollect current = allItems.get(currentIndex);
                    StockCollect previous = allItems.get(currentIndex - 1);
                    int tempSortOrder = current.getSortOrder();
                    current.setSortOrder(previous.getSortOrder());
                    previous.setSortOrder(tempSortOrder);

                    stockCollectMapper.updateSortOrderZhuizongwenhua(current.getTsCode(), current.getSortOrder());
                    stockCollectMapper.updateSortOrderZhuizongwenhua(previous.getTsCode(), previous.getSortOrder());
                }
                break;
            }
        }
    }





    public void collectZhuizongchuanmei(String tsCode) {
        int count = stockCollectMapper.checkIfExistsZhuizongchuanmei(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateZhuizongchuanmei(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertZhuizongchuanmei(stockCollect);
        }
    }
    public String[] getZhuizongchuanmei() {
        return stockCollectMapper.selectZhuizongchuanmei();
    }

    public String[] zanbuZhuizongchuanmei() {
        return stockCollectMapper.selectzanbuZhuizongchuanmei();
    }

    public void delZhuizongchuanmei(String tsCode) { stockCollectMapper.delZhuizongchuanmei(tsCode); }

    public void goonZhuizongchuanmei(String tsCode) { stockCollectMapper.goonZhuizongchuanmei(tsCode); }


    public void moveItemTopZhuizongchuanmei(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongchuanmei(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongchuanmei(flag);
        StockCollect minStockCollect = stockCollectMapper.selectMinOrderZhuizongchuanmei(flag);
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() + 1;
                stockCollectMapper.updateSortOrderZhuizongchuanmei(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置顶
        stockCollectMapper.updateSortOrderZhuizongchuanmei(tsCode, minStockCollect.getSortOrder());
    }

    public void moveItemBottomZhuizongchuanmei(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongchuanmei(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongchuanmei(flag);
        StockCollect maxStockCollect = stockCollectMapper.selectMaxOrderZhuizongchuanmei(flag);
        int bottomSortOrder = maxStockCollect.getSortOrder();
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() - 1;
                stockCollectMapper.updateSortOrderZhuizongchuanmei(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置底
        stockCollectMapper.updateSortOrderZhuizongchuanmei(tsCode, bottomSortOrder);
    }

    public void moveItemUpZhuizongchuanmei(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongchuanmei(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongchuanmei(flag);

        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getTsCode().equals(tsCode)) {
                // 找到当前记录的索引
                int currentIndex = i;
                if (currentIndex > 0) {
                    // 交换当前记录和前一条记录的排序值
                    StockCollect current = allItems.get(currentIndex);
                    StockCollect previous = allItems.get(currentIndex - 1);
                    int tempSortOrder = current.getSortOrder();
                    current.setSortOrder(previous.getSortOrder());
                    previous.setSortOrder(tempSortOrder);

                    stockCollectMapper.updateSortOrderZhuizongchuanmei(current.getTsCode(), current.getSortOrder());
                    stockCollectMapper.updateSortOrderZhuizongchuanmei(previous.getTsCode(), previous.getSortOrder());
                }
                break;
            }
        }
    }









    public void collectZhuizongjinrong(String tsCode) {
        int count = stockCollectMapper.checkIfExistsZhuizongjinrong(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateZhuizongjinrong(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertZhuizongjinrong(stockCollect);
        }
    }
    public String[] getZhuizongjinrong() {
        return stockCollectMapper.selectZhuizongjinrong();
    }

    public String[] zanbuZhuizongjinrong() {
        return stockCollectMapper.selectzanbuZhuizongjinrong();
    }

    public void delZhuizongjinrong(String tsCode) { stockCollectMapper.delZhuizongjinrong(tsCode); }

    public void goonZhuizongjinrong(String tsCode) { stockCollectMapper.goonZhuizongjinrong(tsCode); }


    public void moveItemTopZhuizongjinrong(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongjinrong(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongjinrong(flag);
        StockCollect minStockCollect = stockCollectMapper.selectMinOrderZhuizongjinrong(flag);
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() + 1;
                stockCollectMapper.updateSortOrderZhuizongjinrong(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置顶
        stockCollectMapper.updateSortOrderZhuizongjinrong(tsCode, minStockCollect.getSortOrder());
    }

    public void moveItemBottomZhuizongjinrong(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongjinrong(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongjinrong(flag);
        StockCollect maxStockCollect = stockCollectMapper.selectMaxOrderZhuizongjinrong(flag);
        int bottomSortOrder = maxStockCollect.getSortOrder();
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() - 1;
                stockCollectMapper.updateSortOrderZhuizongjinrong(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置底
        stockCollectMapper.updateSortOrderZhuizongjinrong(tsCode, bottomSortOrder);
    }

    public void moveItemUpZhuizongjinrong(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongjinrong(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongjinrong(flag);

        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getTsCode().equals(tsCode)) {
                // 找到当前记录的索引
                int currentIndex = i;
                if (currentIndex > 0) {
                    // 交换当前记录和前一条记录的排序值
                    StockCollect current = allItems.get(currentIndex);
                    StockCollect previous = allItems.get(currentIndex - 1);
                    int tempSortOrder = current.getSortOrder();
                    current.setSortOrder(previous.getSortOrder());
                    previous.setSortOrder(tempSortOrder);

                    stockCollectMapper.updateSortOrderZhuizongjinrong(current.getTsCode(), current.getSortOrder());
                    stockCollectMapper.updateSortOrderZhuizongjinrong(previous.getTsCode(), previous.getSortOrder());
                }
                break;
            }
        }
    }





    public void collectZhuizongzonghe(String tsCode) {
        int count = stockCollectMapper.checkIfExistsZhuizongzonghe(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateZhuizongzonghe(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertZhuizongzonghe(stockCollect);
        }
    }
    public String[] getZhuizongzonghe() {
        return stockCollectMapper.selectZhuizongzonghe();
    }

    public String[] zanbuZhuizongzonghe() {
        return stockCollectMapper.selectzanbuZhuizongzonghe();
    }

    public void delZhuizongzonghe(String tsCode) { stockCollectMapper.delZhuizongzonghe(tsCode); }

    public void goonZhuizongzonghe(String tsCode) { stockCollectMapper.goonZhuizongzonghe(tsCode); }


    public void moveItemTopZhuizongzonghe(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongzonghe(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongzonghe(flag);
        StockCollect minStockCollect = stockCollectMapper.selectMinOrderZhuizongzonghe(flag);
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() + 1;
                stockCollectMapper.updateSortOrderZhuizongzonghe(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置顶
        stockCollectMapper.updateSortOrderZhuizongzonghe(tsCode, minStockCollect.getSortOrder());
    }

    public void moveItemBottomZhuizongzonghe(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongzonghe(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongzonghe(flag);
        StockCollect maxStockCollect = stockCollectMapper.selectMaxOrderZhuizongzonghe(flag);
        int bottomSortOrder = maxStockCollect.getSortOrder();
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() - 1;
                stockCollectMapper.updateSortOrderZhuizongzonghe(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置底
        stockCollectMapper.updateSortOrderZhuizongzonghe(tsCode, bottomSortOrder);
    }

    public void moveItemUpZhuizongzonghe(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongzonghe(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongzonghe(flag);

        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getTsCode().equals(tsCode)) {
                // 找到当前记录的索引
                int currentIndex = i;
                if (currentIndex > 0) {
                    // 交换当前记录和前一条记录的排序值
                    StockCollect current = allItems.get(currentIndex);
                    StockCollect previous = allItems.get(currentIndex - 1);
                    int tempSortOrder = current.getSortOrder();
                    current.setSortOrder(previous.getSortOrder());
                    previous.setSortOrder(tempSortOrder);

                    stockCollectMapper.updateSortOrderZhuizongzonghe(current.getTsCode(), current.getSortOrder());
                    stockCollectMapper.updateSortOrderZhuizongzonghe(previous.getTsCode(), previous.getSortOrder());
                }
                break;
            }
        }
    }


    public void collectZhuizonghuanjin(String tsCode) {
        int count = stockCollectMapper.checkIfExistsZhuizonghuanjin(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateZhuizonghuanjin(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertZhuizonghuanjin(stockCollect);
        }
    }
    public String[] getZhuizonghuanjin() {
        return stockCollectMapper.selectZhuizonghuanjin();
    }

    public String[] zanbuZhuizonghuanjin() {
        return stockCollectMapper.selectzanbuZhuizonghuanjin();
    }

    public void delZhuizonghuanjin(String tsCode) { stockCollectMapper.delZhuizonghuanjin(tsCode); }

    public void goonZhuizonghuanjin(String tsCode) { stockCollectMapper.goonZhuizonghuanjin(tsCode); }


    public void moveItemTopZhuizonghuanjin(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizonghuanjin(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizonghuanjin(flag);
        StockCollect minStockCollect = stockCollectMapper.selectMinOrderZhuizonghuanjin(flag);
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() + 1;
                stockCollectMapper.updateSortOrderZhuizonghuanjin(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置顶
        stockCollectMapper.updateSortOrderZhuizonghuanjin(tsCode, minStockCollect.getSortOrder());
    }

    public void moveItemBottomZhuizonghuanjin(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizonghuanjin(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizonghuanjin(flag);
        StockCollect maxStockCollect = stockCollectMapper.selectMaxOrderZhuizonghuanjin(flag);
        int bottomSortOrder = maxStockCollect.getSortOrder();
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() - 1;
                stockCollectMapper.updateSortOrderZhuizonghuanjin(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置底
        stockCollectMapper.updateSortOrderZhuizonghuanjin(tsCode, bottomSortOrder);
    }

    public void moveItemUpZhuizonghuanjin(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizonghuanjin(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizonghuanjin(flag);

        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getTsCode().equals(tsCode)) {
                // 找到当前记录的索引
                int currentIndex = i;
                if (currentIndex > 0) {
                    // 交换当前记录和前一条记录的排序值
                    StockCollect current = allItems.get(currentIndex);
                    StockCollect previous = allItems.get(currentIndex - 1);
                    int tempSortOrder = current.getSortOrder();
                    current.setSortOrder(previous.getSortOrder());
                    previous.setSortOrder(tempSortOrder);

                    stockCollectMapper.updateSortOrderZhuizonghuanjin(current.getTsCode(), current.getSortOrder());
                    stockCollectMapper.updateSortOrderZhuizonghuanjin(previous.getTsCode(), previous.getSortOrder());
                }
                break;
            }
        }
    }




    public void collectZhuizonggongye(String tsCode) {
        int count = stockCollectMapper.checkIfExistsZhuizonggongye(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateZhuizonggongye(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertZhuizonggongye(stockCollect);
        }
    }
    public String[] getZhuizonggongye() {
        return stockCollectMapper.selectZhuizonggongye();
    }

    public String[] zanbuZhuizonggongye() {
        return stockCollectMapper.selectzanbuZhuizonggongye();
    }

    public void delZhuizonggongye(String tsCode) { stockCollectMapper.delZhuizonggongye(tsCode); }

    public void goonZhuizonggongye(String tsCode) { stockCollectMapper.goonZhuizonggongye(tsCode); }


    public void moveItemTopZhuizonggongye(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizonggongye(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizonggongye(flag);
        StockCollect minStockCollect = stockCollectMapper.selectMinOrderZhuizonggongye(flag);
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() + 1;
                stockCollectMapper.updateSortOrderZhuizonggongye(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置顶
        stockCollectMapper.updateSortOrderZhuizonggongye(tsCode, minStockCollect.getSortOrder());
    }

    public void moveItemBottomZhuizonggongye(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizonggongye(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizonggongye(flag);
        StockCollect maxStockCollect = stockCollectMapper.selectMaxOrderZhuizonggongye(flag);
        int bottomSortOrder = maxStockCollect.getSortOrder();
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() - 1;
                stockCollectMapper.updateSortOrderZhuizonggongye(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置底
        stockCollectMapper.updateSortOrderZhuizonggongye(tsCode, bottomSortOrder);
    }

    public void moveItemUpZhuizonggongye(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizonggongye(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizonggongye(flag);

        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getTsCode().equals(tsCode)) {
                // 找到当前记录的索引
                int currentIndex = i;
                if (currentIndex > 0) {
                    // 交换当前记录和前一条记录的排序值
                    StockCollect current = allItems.get(currentIndex);
                    StockCollect previous = allItems.get(currentIndex - 1);
                    int tempSortOrder = current.getSortOrder();
                    current.setSortOrder(previous.getSortOrder());
                    previous.setSortOrder(tempSortOrder);

                    stockCollectMapper.updateSortOrderZhuizonggongye(current.getTsCode(), current.getSortOrder());
                    stockCollectMapper.updateSortOrderZhuizonggongye(previous.getTsCode(), previous.getSortOrder());
                }
                break;
            }
        }
    }




    public void collectZhuizongyiyao(String tsCode) {
        int count = stockCollectMapper.checkIfExistsZhuizongyiyao(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateZhuizongyiyao(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertZhuizongyiyao(stockCollect);
        }
    }
    public String[] getZhuizongyiyao() {
        return stockCollectMapper.selectZhuizongyiyao();
    }

    public String[] zanbuZhuizongyiyao() {
        return stockCollectMapper.selectzanbuZhuizongyiyao();
    }

    public void delZhuizongyiyao(String tsCode) { stockCollectMapper.delZhuizongyiyao(tsCode); }

    public void goonZhuizongyiyao(String tsCode) { stockCollectMapper.goonZhuizongyiyao(tsCode); }


    public void moveItemTopZhuizongyiyao(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongyiyao(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongyiyao(flag);
        StockCollect minStockCollect = stockCollectMapper.selectMinOrderZhuizongyiyao(flag);
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() + 1;
                stockCollectMapper.updateSortOrderZhuizongyiyao(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置顶
        stockCollectMapper.updateSortOrderZhuizongyiyao(tsCode, minStockCollect.getSortOrder());
    }

    public void moveItemBottomZhuizongyiyao(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongyiyao(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongyiyao(flag);
        StockCollect maxStockCollect = stockCollectMapper.selectMaxOrderZhuizongyiyao(flag);
        int bottomSortOrder = maxStockCollect.getSortOrder();
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() - 1;
                stockCollectMapper.updateSortOrderZhuizongyiyao(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置底
        stockCollectMapper.updateSortOrderZhuizongyiyao(tsCode, bottomSortOrder);
    }

    public void moveItemUpZhuizongyiyao(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongyiyao(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongyiyao(flag);

        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getTsCode().equals(tsCode)) {
                // 找到当前记录的索引
                int currentIndex = i;
                if (currentIndex > 0) {
                    // 交换当前记录和前一条记录的排序值
                    StockCollect current = allItems.get(currentIndex);
                    StockCollect previous = allItems.get(currentIndex - 1);
                    int tempSortOrder = current.getSortOrder();
                    current.setSortOrder(previous.getSortOrder());
                    previous.setSortOrder(tempSortOrder);

                    stockCollectMapper.updateSortOrderZhuizongyiyao(current.getTsCode(), current.getSortOrder());
                    stockCollectMapper.updateSortOrderZhuizongyiyao(previous.getTsCode(), previous.getSortOrder());
                }
                break;
            }
        }
    }




    public void collectZhuizongjungong(String tsCode) {
        int count = stockCollectMapper.checkIfExistsZhuizongjungong(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateZhuizongjungong(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertZhuizongjungong(stockCollect);
        }
    }
    public String[] getZhuizongjungong() {
        return stockCollectMapper.selectZhuizongjungong();
    }

    public String[] zanbuZhuizongjungong() {
        return stockCollectMapper.selectzanbuZhuizongjungong();
    }

    public void delZhuizongjungong(String tsCode) { stockCollectMapper.delZhuizongjungong(tsCode); }

    public void goonZhuizongjungong(String tsCode) { stockCollectMapper.goonZhuizongjungong(tsCode); }


    public void moveItemTopZhuizongjungong(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongjungong(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongjungong(flag);
        StockCollect minStockCollect = stockCollectMapper.selectMinOrderZhuizongjungong(flag);
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() + 1;
                stockCollectMapper.updateSortOrderZhuizongjungong(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置顶
        stockCollectMapper.updateSortOrderZhuizongjungong(tsCode, minStockCollect.getSortOrder());
    }

    public void moveItemBottomZhuizongjungong(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongjungong(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongjungong(flag);
        StockCollect maxStockCollect = stockCollectMapper.selectMaxOrderZhuizongjungong(flag);
        int bottomSortOrder = maxStockCollect.getSortOrder();
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() - 1;
                stockCollectMapper.updateSortOrderZhuizongjungong(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置底
        stockCollectMapper.updateSortOrderZhuizongjungong(tsCode, bottomSortOrder);
    }

    public void moveItemUpZhuizongjungong(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongjungong(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongjungong(flag);

        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getTsCode().equals(tsCode)) {
                // 找到当前记录的索引
                int currentIndex = i;
                if (currentIndex > 0) {
                    // 交换当前记录和前一条记录的排序值
                    StockCollect current = allItems.get(currentIndex);
                    StockCollect previous = allItems.get(currentIndex - 1);
                    int tempSortOrder = current.getSortOrder();
                    current.setSortOrder(previous.getSortOrder());
                    previous.setSortOrder(tempSortOrder);

                    stockCollectMapper.updateSortOrderZhuizongjungong(current.getTsCode(), current.getSortOrder());
                    stockCollectMapper.updateSortOrderZhuizongjungong(previous.getTsCode(), previous.getSortOrder());
                }
                break;
            }
        }
    }







    public void collectZhuizongdianziguangxue(String tsCode) {
        int count = stockCollectMapper.checkIfExistsZhuizongdianziguangxue(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateZhuizongdianziguangxue(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertZhuizongdianziguangxue(stockCollect);
        }
    }
    public String[] getZhuizongdianziguangxue() {
        return stockCollectMapper.selectZhuizongdianziguangxue();
    }

    public String[] zanbuZhuizongdianziguangxue() {
        return stockCollectMapper.selectzanbuZhuizongdianziguangxue();
    }

    public void delZhuizongdianziguangxue(String tsCode) { stockCollectMapper.delZhuizongdianziguangxue(tsCode); }

    public void goonZhuizongdianziguangxue(String tsCode) { stockCollectMapper.goonZhuizongdianziguangxue(tsCode); }


    public void moveItemTopZhuizongdianziguangxue(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongdianziguangxue(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongdianziguangxue(flag);
        StockCollect minStockCollect = stockCollectMapper.selectMinOrderZhuizongdianziguangxue(flag);
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() + 1;
                stockCollectMapper.updateSortOrderZhuizongdianziguangxue(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置顶
        stockCollectMapper.updateSortOrderZhuizongdianziguangxue(tsCode, minStockCollect.getSortOrder());
    }

    public void moveItemBottomZhuizongdianziguangxue(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongdianziguangxue(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongdianziguangxue(flag);
        StockCollect maxStockCollect = stockCollectMapper.selectMaxOrderZhuizongdianziguangxue(flag);
        int bottomSortOrder = maxStockCollect.getSortOrder();
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() - 1;
                stockCollectMapper.updateSortOrderZhuizongdianziguangxue(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置底
        stockCollectMapper.updateSortOrderZhuizongdianziguangxue(tsCode, bottomSortOrder);
    }

    public void moveItemUpZhuizongdianziguangxue(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongdianziguangxue(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongdianziguangxue(flag);

        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getTsCode().equals(tsCode)) {
                // 找到当前记录的索引
                int currentIndex = i;
                if (currentIndex > 0) {
                    // 交换当前记录和前一条记录的排序值
                    StockCollect current = allItems.get(currentIndex);
                    StockCollect previous = allItems.get(currentIndex - 1);
                    int tempSortOrder = current.getSortOrder();
                    current.setSortOrder(previous.getSortOrder());
                    previous.setSortOrder(tempSortOrder);

                    stockCollectMapper.updateSortOrderZhuizongdianziguangxue(current.getTsCode(), current.getSortOrder());
                    stockCollectMapper.updateSortOrderZhuizongdianziguangxue(previous.getTsCode(), previous.getSortOrder());
                }
                break;
            }
        }
    }





    public void collectZhuizongshebei(String tsCode) {
        int count = stockCollectMapper.checkIfExistsZhuizongshebei(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateZhuizongshebei(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertZhuizongshebei(stockCollect);
        }
    }
    public String[] getZhuizongshebei() {
        return stockCollectMapper.selectZhuizongshebei();
    }

    public String[] zanbuZhuizongshebei() {
        return stockCollectMapper.selectzanbuZhuizongshebei();
    }

    public void delZhuizongshebei(String tsCode) { stockCollectMapper.delZhuizongshebei(tsCode); }

    public void goonZhuizongshebei(String tsCode) { stockCollectMapper.goonZhuizongshebei(tsCode); }


    public void moveItemTopZhuizongshebei(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongshebei(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongshebei(flag);
        StockCollect minStockCollect = stockCollectMapper.selectMinOrderZhuizongshebei(flag);
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() + 1;
                stockCollectMapper.updateSortOrderZhuizongshebei(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置顶
        stockCollectMapper.updateSortOrderZhuizongshebei(tsCode, minStockCollect.getSortOrder());
    }

    public void moveItemBottomZhuizongshebei(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongshebei(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongshebei(flag);
        StockCollect maxStockCollect = stockCollectMapper.selectMaxOrderZhuizongshebei(flag);
        int bottomSortOrder = maxStockCollect.getSortOrder();
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() - 1;
                stockCollectMapper.updateSortOrderZhuizongshebei(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置底
        stockCollectMapper.updateSortOrderZhuizongshebei(tsCode, bottomSortOrder);
    }

    public void moveItemUpZhuizongshebei(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongshebei(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongshebei(flag);

        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getTsCode().equals(tsCode)) {
                // 找到当前记录的索引
                int currentIndex = i;
                if (currentIndex > 0) {
                    // 交换当前记录和前一条记录的排序值
                    StockCollect current = allItems.get(currentIndex);
                    StockCollect previous = allItems.get(currentIndex - 1);
                    int tempSortOrder = current.getSortOrder();
                    current.setSortOrder(previous.getSortOrder());
                    previous.setSortOrder(tempSortOrder);

                    stockCollectMapper.updateSortOrderZhuizongshebei(current.getTsCode(), current.getSortOrder());
                    stockCollectMapper.updateSortOrderZhuizongshebei(previous.getTsCode(), previous.getSortOrder());
                }
                break;
            }
        }
    }









    public void collectZhuizongfangdichang(String tsCode) {
        int count = stockCollectMapper.checkIfExistsZhuizongfangdichang(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateZhuizongfangdichang(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertZhuizongfangdichang(stockCollect);
        }
    }
    public String[] getZhuizongfangdichang() {
        return stockCollectMapper.selectZhuizongfangdichang();
    }

    public String[] zanbuZhuizongfangdichang() {
        return stockCollectMapper.selectzanbuZhuizongfangdichang();
    }

    public void delZhuizongfangdichang(String tsCode) { stockCollectMapper.delZhuizongfangdichang(tsCode); }

    public void goonZhuizongfangdichang(String tsCode) { stockCollectMapper.goonZhuizongfangdichang(tsCode); }


    public void moveItemTopZhuizongfangdichang(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongfangdichang(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongfangdichang(flag);
        StockCollect minStockCollect = stockCollectMapper.selectMinOrderZhuizongfangdichang(flag);
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() + 1;
                stockCollectMapper.updateSortOrderZhuizongfangdichang(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置顶
        stockCollectMapper.updateSortOrderZhuizongfangdichang(tsCode, minStockCollect.getSortOrder());
    }

    public void moveItemBottomZhuizongfangdichang(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongfangdichang(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongfangdichang(flag);
        StockCollect maxStockCollect = stockCollectMapper.selectMaxOrderZhuizongfangdichang(flag);
        int bottomSortOrder = maxStockCollect.getSortOrder();
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() - 1;
                stockCollectMapper.updateSortOrderZhuizongfangdichang(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置底
        stockCollectMapper.updateSortOrderZhuizongfangdichang(tsCode, bottomSortOrder);
    }

    public void moveItemUpZhuizongfangdichang(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongfangdichang(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongfangdichang(flag);

        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getTsCode().equals(tsCode)) {
                // 找到当前记录的索引
                int currentIndex = i;
                if (currentIndex > 0) {
                    // 交换当前记录和前一条记录的排序值
                    StockCollect current = allItems.get(currentIndex);
                    StockCollect previous = allItems.get(currentIndex - 1);
                    int tempSortOrder = current.getSortOrder();
                    current.setSortOrder(previous.getSortOrder());
                    previous.setSortOrder(tempSortOrder);

                    stockCollectMapper.updateSortOrderZhuizongfangdichang(current.getTsCode(), current.getSortOrder());
                    stockCollectMapper.updateSortOrderZhuizongfangdichang(previous.getTsCode(), previous.getSortOrder());
                }
                break;
            }
        }
    }








    public void collectZhuizonghulianwang(String tsCode) {
        int count = stockCollectMapper.checkIfExistsZhuizonghulianwang(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateZhuizonghulianwang(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertZhuizonghulianwang(stockCollect);
        }
    }
    public String[] getZhuizonghulianwang() {
        return stockCollectMapper.selectZhuizonghulianwang();
    }

    public String[] zanbuZhuizonghulianwang() {
        return stockCollectMapper.selectzanbuZhuizonghulianwang();
    }

    public void delZhuizonghulianwang(String tsCode) { stockCollectMapper.delZhuizonghulianwang(tsCode); }

    public void goonZhuizonghulianwang(String tsCode) { stockCollectMapper.goonZhuizonghulianwang(tsCode); }


    public void moveItemTopZhuizonghulianwang(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizonghulianwang(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizonghulianwang(flag);
        StockCollect minStockCollect = stockCollectMapper.selectMinOrderZhuizonghulianwang(flag);
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() + 1;
                stockCollectMapper.updateSortOrderZhuizonghulianwang(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置顶
        stockCollectMapper.updateSortOrderZhuizonghulianwang(tsCode, minStockCollect.getSortOrder());
    }

    public void moveItemBottomZhuizonghulianwang(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizonghulianwang(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizonghulianwang(flag);
        StockCollect maxStockCollect = stockCollectMapper.selectMaxOrderZhuizonghulianwang(flag);
        int bottomSortOrder = maxStockCollect.getSortOrder();
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() - 1;
                stockCollectMapper.updateSortOrderZhuizonghulianwang(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置底
        stockCollectMapper.updateSortOrderZhuizonghulianwang(tsCode, bottomSortOrder);
    }

    public void moveItemUpZhuizonghulianwang(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizonghulianwang(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizonghulianwang(flag);

        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getTsCode().equals(tsCode)) {
                // 找到当前记录的索引
                int currentIndex = i;
                if (currentIndex > 0) {
                    // 交换当前记录和前一条记录的排序值
                    StockCollect current = allItems.get(currentIndex);
                    StockCollect previous = allItems.get(currentIndex - 1);
                    int tempSortOrder = current.getSortOrder();
                    current.setSortOrder(previous.getSortOrder());
                    previous.setSortOrder(tempSortOrder);

                    stockCollectMapper.updateSortOrderZhuizonghulianwang(current.getTsCode(), current.getSortOrder());
                    stockCollectMapper.updateSortOrderZhuizonghulianwang(previous.getTsCode(), previous.getSortOrder());
                }
                break;
            }
        }
    }



    public void collectZhuizongmeironghuli(String tsCode) {
        int count = stockCollectMapper.checkIfExistsZhuizongmeironghuli(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateZhuizongmeironghuli(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertZhuizongmeironghuli(stockCollect);
        }
    }
    public String[] getZhuizongmeironghuli() {
        return stockCollectMapper.selectZhuizongmeironghuli();
    }

    public String[] zanbuZhuizongmeironghuli() {
        return stockCollectMapper.selectzanbuZhuizongmeironghuli();
    }

    public void delZhuizongmeironghuli(String tsCode) { stockCollectMapper.delZhuizongmeironghuli(tsCode); }

    public void goonZhuizongmeironghuli(String tsCode) { stockCollectMapper.goonZhuizongmeironghuli(tsCode); }


    public void moveItemTopZhuizongmeironghuli(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongmeironghuli(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongmeironghuli(flag);
        StockCollect minStockCollect = stockCollectMapper.selectMinOrderZhuizongmeironghuli(flag);
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() + 1;
                stockCollectMapper.updateSortOrderZhuizongmeironghuli(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置顶
        stockCollectMapper.updateSortOrderZhuizongmeironghuli(tsCode, minStockCollect.getSortOrder());
    }

    public void moveItemBottomZhuizongmeironghuli(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongmeironghuli(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongmeironghuli(flag);
        StockCollect maxStockCollect = stockCollectMapper.selectMaxOrderZhuizongmeironghuli(flag);
        int bottomSortOrder = maxStockCollect.getSortOrder();
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() - 1;
                stockCollectMapper.updateSortOrderZhuizongmeironghuli(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置底
        stockCollectMapper.updateSortOrderZhuizongmeironghuli(tsCode, bottomSortOrder);
    }

    public void moveItemUpZhuizongmeironghuli(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongmeironghuli(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongmeironghuli(flag);

        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getTsCode().equals(tsCode)) {
                // 找到当前记录的索引
                int currentIndex = i;
                if (currentIndex > 0) {
                    // 交换当前记录和前一条记录的排序值
                    StockCollect current = allItems.get(currentIndex);
                    StockCollect previous = allItems.get(currentIndex - 1);
                    int tempSortOrder = current.getSortOrder();
                    current.setSortOrder(previous.getSortOrder());
                    previous.setSortOrder(tempSortOrder);

                    stockCollectMapper.updateSortOrderZhuizongmeironghuli(current.getTsCode(), current.getSortOrder());
                    stockCollectMapper.updateSortOrderZhuizongmeironghuli(previous.getTsCode(), previous.getSortOrder());
                }
                break;
            }
        }
    }










    public void collectZhuizongcanyinyinshi(String tsCode) {
        int count = stockCollectMapper.checkIfExistsZhuizongcanyinyinshi(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateZhuizongcanyinyinshi(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertZhuizongcanyinyinshi(stockCollect);
        }
    }
    public String[] getZhuizongcanyinyinshi() {
        return stockCollectMapper.selectZhuizongcanyinyinshi();
    }

    public String[] zanbuZhuizongcanyinyinshi() {
        return stockCollectMapper.selectzanbuZhuizongcanyinyinshi();
    }

    public void delZhuizongcanyinyinshi(String tsCode) { stockCollectMapper.delZhuizongcanyinyinshi(tsCode); }

    public void goonZhuizongcanyinyinshi(String tsCode) { stockCollectMapper.goonZhuizongcanyinyinshi(tsCode); }


    public void moveItemTopZhuizongcanyinyinshi(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongcanyinyinshi(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongcanyinyinshi(flag);
        StockCollect minStockCollect = stockCollectMapper.selectMinOrderZhuizongcanyinyinshi(flag);
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() + 1;
                stockCollectMapper.updateSortOrderZhuizongcanyinyinshi(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置顶
        stockCollectMapper.updateSortOrderZhuizongcanyinyinshi(tsCode, minStockCollect.getSortOrder());
    }

    public void moveItemBottomZhuizongcanyinyinshi(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongcanyinyinshi(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongcanyinyinshi(flag);
        StockCollect maxStockCollect = stockCollectMapper.selectMaxOrderZhuizongcanyinyinshi(flag);
        int bottomSortOrder = maxStockCollect.getSortOrder();
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() - 1;
                stockCollectMapper.updateSortOrderZhuizongcanyinyinshi(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置底
        stockCollectMapper.updateSortOrderZhuizongcanyinyinshi(tsCode, bottomSortOrder);
    }

    public void moveItemUpZhuizongcanyinyinshi(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongcanyinyinshi(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongcanyinyinshi(flag);

        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getTsCode().equals(tsCode)) {
                // 找到当前记录的索引
                int currentIndex = i;
                if (currentIndex > 0) {
                    // 交换当前记录和前一条记录的排序值
                    StockCollect current = allItems.get(currentIndex);
                    StockCollect previous = allItems.get(currentIndex - 1);
                    int tempSortOrder = current.getSortOrder();
                    current.setSortOrder(previous.getSortOrder());
                    previous.setSortOrder(tempSortOrder);

                    stockCollectMapper.updateSortOrderZhuizongcanyinyinshi(current.getTsCode(), current.getSortOrder());
                    stockCollectMapper.updateSortOrderZhuizongcanyinyinshi(previous.getTsCode(), previous.getSortOrder());
                }
                break;
            }
        }
    }


    public void collectZhuizonglvyoujiudian(String tsCode) {
        int count = stockCollectMapper.checkIfExistsZhuizonglvyoujiudian(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateZhuizonglvyoujiudian(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertZhuizonglvyoujiudian(stockCollect);
        }
    }
    public String[] getZhuizonglvyoujiudian() {
        return stockCollectMapper.selectZhuizonglvyoujiudian();
    }

    public String[] zanbuZhuizonglvyoujiudian() {
        return stockCollectMapper.selectzanbuZhuizonglvyoujiudian();
    }

    public void delZhuizonglvyoujiudian(String tsCode) { stockCollectMapper.delZhuizonglvyoujiudian(tsCode); }

    public void goonZhuizonglvyoujiudian(String tsCode) { stockCollectMapper.goonZhuizonglvyoujiudian(tsCode); }


    public void moveItemTopZhuizonglvyoujiudian(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizonglvyoujiudian(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizonglvyoujiudian(flag);
        StockCollect minStockCollect = stockCollectMapper.selectMinOrderZhuizonglvyoujiudian(flag);
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() + 1;
                stockCollectMapper.updateSortOrderZhuizonglvyoujiudian(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置顶
        stockCollectMapper.updateSortOrderZhuizonglvyoujiudian(tsCode, minStockCollect.getSortOrder());
    }

    public void moveItemBottomZhuizonglvyoujiudian(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizonglvyoujiudian(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizonglvyoujiudian(flag);
        StockCollect maxStockCollect = stockCollectMapper.selectMaxOrderZhuizonglvyoujiudian(flag);
        int bottomSortOrder = maxStockCollect.getSortOrder();
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() - 1;
                stockCollectMapper.updateSortOrderZhuizonglvyoujiudian(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置底
        stockCollectMapper.updateSortOrderZhuizonglvyoujiudian(tsCode, bottomSortOrder);
    }

    public void moveItemUpZhuizonglvyoujiudian(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizonglvyoujiudian(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizonglvyoujiudian(flag);

        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getTsCode().equals(tsCode)) {
                // 找到当前记录的索引
                int currentIndex = i;
                if (currentIndex > 0) {
                    // 交换当前记录和前一条记录的排序值
                    StockCollect current = allItems.get(currentIndex);
                    StockCollect previous = allItems.get(currentIndex - 1);
                    int tempSortOrder = current.getSortOrder();
                    current.setSortOrder(previous.getSortOrder());
                    previous.setSortOrder(tempSortOrder);

                    stockCollectMapper.updateSortOrderZhuizonglvyoujiudian(current.getTsCode(), current.getSortOrder());
                    stockCollectMapper.updateSortOrderZhuizonglvyoujiudian(previous.getTsCode(), previous.getSortOrder());
                }
                break;
            }
        }
    }




    public void collectZhuizongfuzhuangjiafang(String tsCode) {
        int count = stockCollectMapper.checkIfExistsZhuizongfuzhuangjiafang(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateZhuizongfuzhuangjiafang(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertZhuizongfuzhuangjiafang(stockCollect);
        }
    }
    public String[] getZhuizongfuzhuangjiafang() {
        return stockCollectMapper.selectZhuizongfuzhuangjiafang();
    }

    public String[] zanbuZhuizongfuzhuangjiafang() {
        return stockCollectMapper.selectzanbuZhuizongfuzhuangjiafang();
    }

    public void delZhuizongfuzhuangjiafang(String tsCode) { stockCollectMapper.delZhuizongfuzhuangjiafang(tsCode); }

    public void goonZhuizongfuzhuangjiafang(String tsCode) { stockCollectMapper.goonZhuizongfuzhuangjiafang(tsCode); }


    public void moveItemTopZhuizongfuzhuangjiafang(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongfuzhuangjiafang(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongfuzhuangjiafang(flag);
        StockCollect minStockCollect = stockCollectMapper.selectMinOrderZhuizongfuzhuangjiafang(flag);
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() + 1;
                stockCollectMapper.updateSortOrderZhuizongfuzhuangjiafang(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置顶
        stockCollectMapper.updateSortOrderZhuizongfuzhuangjiafang(tsCode, minStockCollect.getSortOrder());
    }

    public void moveItemBottomZhuizongfuzhuangjiafang(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongfuzhuangjiafang(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongfuzhuangjiafang(flag);
        StockCollect maxStockCollect = stockCollectMapper.selectMaxOrderZhuizongfuzhuangjiafang(flag);
        int bottomSortOrder = maxStockCollect.getSortOrder();
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() - 1;
                stockCollectMapper.updateSortOrderZhuizongfuzhuangjiafang(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置底
        stockCollectMapper.updateSortOrderZhuizongfuzhuangjiafang(tsCode, bottomSortOrder);
    }

    public void moveItemUpZhuizongfuzhuangjiafang(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongfuzhuangjiafang(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongfuzhuangjiafang(flag);

        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getTsCode().equals(tsCode)) {
                // 找到当前记录的索引
                int currentIndex = i;
                if (currentIndex > 0) {
                    // 交换当前记录和前一条记录的排序值
                    StockCollect current = allItems.get(currentIndex);
                    StockCollect previous = allItems.get(currentIndex - 1);
                    int tempSortOrder = current.getSortOrder();
                    current.setSortOrder(previous.getSortOrder());
                    previous.setSortOrder(tempSortOrder);

                    stockCollectMapper.updateSortOrderZhuizongfuzhuangjiafang(current.getTsCode(), current.getSortOrder());
                    stockCollectMapper.updateSortOrderZhuizongfuzhuangjiafang(previous.getTsCode(), previous.getSortOrder());
                }
                break;
            }
        }
    }


    public void collectZhuizongjiajuyongpin(String tsCode) {
        int count = stockCollectMapper.checkIfExistsZhuizongjiajuyongpin(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateZhuizongjiajuyongpin(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertZhuizongjiajuyongpin(stockCollect);
        }
    }
    public String[] getZhuizongjiajuyongpin() {
        return stockCollectMapper.selectZhuizongjiajuyongpin();
    }

    public String[] zanbuZhuizongjiajuyongpin() {
        return stockCollectMapper.selectzanbuZhuizongjiajuyongpin();
    }

    public void delZhuizongjiajuyongpin(String tsCode) { stockCollectMapper.delZhuizongjiajuyongpin(tsCode); }

    public void goonZhuizongjiajuyongpin(String tsCode) { stockCollectMapper.goonZhuizongjiajuyongpin(tsCode); }


    public void moveItemTopZhuizongjiajuyongpin(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongjiajuyongpin(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongjiajuyongpin(flag);
        StockCollect minStockCollect = stockCollectMapper.selectMinOrderZhuizongjiajuyongpin(flag);
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() + 1;
                stockCollectMapper.updateSortOrderZhuizongjiajuyongpin(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置顶
        stockCollectMapper.updateSortOrderZhuizongjiajuyongpin(tsCode, minStockCollect.getSortOrder());
    }

    public void moveItemBottomZhuizongjiajuyongpin(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongjiajuyongpin(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongjiajuyongpin(flag);
        StockCollect maxStockCollect = stockCollectMapper.selectMaxOrderZhuizongjiajuyongpin(flag);
        int bottomSortOrder = maxStockCollect.getSortOrder();
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() - 1;
                stockCollectMapper.updateSortOrderZhuizongjiajuyongpin(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置底
        stockCollectMapper.updateSortOrderZhuizongjiajuyongpin(tsCode, bottomSortOrder);
    }

    public void moveItemUpZhuizongjiajuyongpin(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongjiajuyongpin(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongjiajuyongpin(flag);

        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getTsCode().equals(tsCode)) {
                // 找到当前记录的索引
                int currentIndex = i;
                if (currentIndex > 0) {
                    // 交换当前记录和前一条记录的排序值
                    StockCollect current = allItems.get(currentIndex);
                    StockCollect previous = allItems.get(currentIndex - 1);
                    int tempSortOrder = current.getSortOrder();
                    current.setSortOrder(previous.getSortOrder());
                    previous.setSortOrder(tempSortOrder);

                    stockCollectMapper.updateSortOrderZhuizongjiajuyongpin(current.getTsCode(), current.getSortOrder());
                    stockCollectMapper.updateSortOrderZhuizongjiajuyongpin(previous.getTsCode(), previous.getSortOrder());
                }
                break;
            }
        }
    }





    public void collectZhuizongjiadian(String tsCode) {
        int count = stockCollectMapper.checkIfExistsZhuizongjiadian(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateZhuizongjiadian(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertZhuizongjiadian(stockCollect);
        }
    }
    public String[] getZhuizongjiadian() {
        return stockCollectMapper.selectZhuizongjiadian();
    }

    public String[] zanbuZhuizongjiadian() {
        return stockCollectMapper.selectzanbuZhuizongjiadian();
    }

    public void delZhuizongjiadian(String tsCode) { stockCollectMapper.delZhuizongjiadian(tsCode); }

    public void goonZhuizongjiadian(String tsCode) { stockCollectMapper.goonZhuizongjiadian(tsCode); }


    public void moveItemTopZhuizongjiadian(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongjiadian(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongjiadian(flag);
        StockCollect minStockCollect = stockCollectMapper.selectMinOrderZhuizongjiadian(flag);
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() + 1;
                stockCollectMapper.updateSortOrderZhuizongjiadian(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置顶
        stockCollectMapper.updateSortOrderZhuizongjiadian(tsCode, minStockCollect.getSortOrder());
    }

    public void moveItemBottomZhuizongjiadian(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongjiadian(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongjiadian(flag);
        StockCollect maxStockCollect = stockCollectMapper.selectMaxOrderZhuizongjiadian(flag);
        int bottomSortOrder = maxStockCollect.getSortOrder();
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() - 1;
                stockCollectMapper.updateSortOrderZhuizongjiadian(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置底
        stockCollectMapper.updateSortOrderZhuizongjiadian(tsCode, bottomSortOrder);
    }

    public void moveItemUpZhuizongjiadian(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongjiadian(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongjiadian(flag);

        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getTsCode().equals(tsCode)) {
                // 找到当前记录的索引
                int currentIndex = i;
                if (currentIndex > 0) {
                    // 交换当前记录和前一条记录的排序值
                    StockCollect current = allItems.get(currentIndex);
                    StockCollect previous = allItems.get(currentIndex - 1);
                    int tempSortOrder = current.getSortOrder();
                    current.setSortOrder(previous.getSortOrder());
                    previous.setSortOrder(tempSortOrder);

                    stockCollectMapper.updateSortOrderZhuizongjiadian(current.getTsCode(), current.getSortOrder());
                    stockCollectMapper.updateSortOrderZhuizongjiadian(previous.getTsCode(), previous.getSortOrder());
                }
                break;
            }
        }
    }


    public void collectZhuizonglingshou(String tsCode) {
        int count = stockCollectMapper.checkIfExistsZhuizonglingshou(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateZhuizonglingshou(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertZhuizonglingshou(stockCollect);
        }
    }
    public String[] getZhuizonglingshou() {
        return stockCollectMapper.selectZhuizonglingshou();
    }

    public String[] zanbuZhuizonglingshou() {
        return stockCollectMapper.selectzanbuZhuizonglingshou();
    }

    public void delZhuizonglingshou(String tsCode) { stockCollectMapper.delZhuizonglingshou(tsCode); }

    public void goonZhuizonglingshou(String tsCode) { stockCollectMapper.goonZhuizonglingshou(tsCode); }


    public void moveItemTopZhuizonglingshou(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizonglingshou(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizonglingshou(flag);
        StockCollect minStockCollect = stockCollectMapper.selectMinOrderZhuizonglingshou(flag);
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() + 1;
                stockCollectMapper.updateSortOrderZhuizonglingshou(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置顶
        stockCollectMapper.updateSortOrderZhuizonglingshou(tsCode, minStockCollect.getSortOrder());
    }

    public void moveItemBottomZhuizonglingshou(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizonglingshou(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizonglingshou(flag);
        StockCollect maxStockCollect = stockCollectMapper.selectMaxOrderZhuizonglingshou(flag);
        int bottomSortOrder = maxStockCollect.getSortOrder();
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() - 1;
                stockCollectMapper.updateSortOrderZhuizonglingshou(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置底
        stockCollectMapper.updateSortOrderZhuizonglingshou(tsCode, bottomSortOrder);
    }

    public void moveItemUpZhuizonglingshou(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizonglingshou(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizonglingshou(flag);

        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getTsCode().equals(tsCode)) {
                // 找到当前记录的索引
                int currentIndex = i;
                if (currentIndex > 0) {
                    // 交换当前记录和前一条记录的排序值
                    StockCollect current = allItems.get(currentIndex);
                    StockCollect previous = allItems.get(currentIndex - 1);
                    int tempSortOrder = current.getSortOrder();
                    current.setSortOrder(previous.getSortOrder());
                    previous.setSortOrder(tempSortOrder);

                    stockCollectMapper.updateSortOrderZhuizonglingshou(current.getTsCode(), current.getSortOrder());
                    stockCollectMapper.updateSortOrderZhuizonglingshou(previous.getTsCode(), previous.getSortOrder());
                }
                break;
            }
        }
    }





    public void collectZhuizonghuaxueyuanliao(String tsCode) {
        int count = stockCollectMapper.checkIfExistsZhuizonghuaxueyuanliao(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateZhuizonghuaxueyuanliao(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertZhuizonghuaxueyuanliao(stockCollect);
        }
    }
    public String[] getZhuizonghuaxueyuanliao() {
        return stockCollectMapper.selectZhuizonghuaxueyuanliao();
    }

    public String[] zanbuZhuizonghuaxueyuanliao() {
        return stockCollectMapper.selectzanbuZhuizonghuaxueyuanliao();
    }

    public void delZhuizonghuaxueyuanliao(String tsCode) { stockCollectMapper.delZhuizonghuaxueyuanliao(tsCode); }

    public void goonZhuizonghuaxueyuanliao(String tsCode) { stockCollectMapper.goonZhuizonghuaxueyuanliao(tsCode); }


    public void moveItemTopZhuizonghuaxueyuanliao(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizonghuaxueyuanliao(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizonghuaxueyuanliao(flag);
        StockCollect minStockCollect = stockCollectMapper.selectMinOrderZhuizonghuaxueyuanliao(flag);
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() + 1;
                stockCollectMapper.updateSortOrderZhuizonghuaxueyuanliao(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置顶
        stockCollectMapper.updateSortOrderZhuizonghuaxueyuanliao(tsCode, minStockCollect.getSortOrder());
    }

    public void moveItemBottomZhuizonghuaxueyuanliao(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizonghuaxueyuanliao(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizonghuaxueyuanliao(flag);
        StockCollect maxStockCollect = stockCollectMapper.selectMaxOrderZhuizonghuaxueyuanliao(flag);
        int bottomSortOrder = maxStockCollect.getSortOrder();
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() - 1;
                stockCollectMapper.updateSortOrderZhuizonghuaxueyuanliao(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置底
        stockCollectMapper.updateSortOrderZhuizonghuaxueyuanliao(tsCode, bottomSortOrder);
    }

    public void moveItemUpZhuizonghuaxueyuanliao(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizonghuaxueyuanliao(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizonghuaxueyuanliao(flag);

        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getTsCode().equals(tsCode)) {
                // 找到当前记录的索引
                int currentIndex = i;
                if (currentIndex > 0) {
                    // 交换当前记录和前一条记录的排序值
                    StockCollect current = allItems.get(currentIndex);
                    StockCollect previous = allItems.get(currentIndex - 1);
                    int tempSortOrder = current.getSortOrder();
                    current.setSortOrder(previous.getSortOrder());
                    previous.setSortOrder(tempSortOrder);

                    stockCollectMapper.updateSortOrderZhuizonghuaxueyuanliao(current.getTsCode(), current.getSortOrder());
                    stockCollectMapper.updateSortOrderZhuizonghuaxueyuanliao(previous.getTsCode(), previous.getSortOrder());
                }
                break;
            }
        }
    }





    public void collectZhuizonghuaxuexianwei(String tsCode) {
        int count = stockCollectMapper.checkIfExistsZhuizonghuaxuexianwei(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateZhuizonghuaxuexianwei(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertZhuizonghuaxuexianwei(stockCollect);
        }
    }
    public String[] getZhuizonghuaxuexianwei() {
        return stockCollectMapper.selectZhuizonghuaxuexianwei();
    }

    public String[] zanbuZhuizonghuaxuexianwei() {
        return stockCollectMapper.selectzanbuZhuizonghuaxuexianwei();
    }

    public void delZhuizonghuaxuexianwei(String tsCode) { stockCollectMapper.delZhuizonghuaxuexianwei(tsCode); }

    public void goonZhuizonghuaxuexianwei(String tsCode) { stockCollectMapper.goonZhuizonghuaxuexianwei(tsCode); }


    public void moveItemTopZhuizonghuaxuexianwei(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizonghuaxuexianwei(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizonghuaxuexianwei(flag);
        StockCollect minStockCollect = stockCollectMapper.selectMinOrderZhuizonghuaxuexianwei(flag);
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() + 1;
                stockCollectMapper.updateSortOrderZhuizonghuaxuexianwei(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置顶
        stockCollectMapper.updateSortOrderZhuizonghuaxuexianwei(tsCode, minStockCollect.getSortOrder());
    }

    public void moveItemBottomZhuizonghuaxuexianwei(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizonghuaxuexianwei(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizonghuaxuexianwei(flag);
        StockCollect maxStockCollect = stockCollectMapper.selectMaxOrderZhuizonghuaxuexianwei(flag);
        int bottomSortOrder = maxStockCollect.getSortOrder();
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() - 1;
                stockCollectMapper.updateSortOrderZhuizonghuaxuexianwei(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置底
        stockCollectMapper.updateSortOrderZhuizonghuaxuexianwei(tsCode, bottomSortOrder);
    }

    public void moveItemUpZhuizonghuaxuexianwei(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizonghuaxuexianwei(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizonghuaxuexianwei(flag);

        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getTsCode().equals(tsCode)) {
                // 找到当前记录的索引
                int currentIndex = i;
                if (currentIndex > 0) {
                    // 交换当前记录和前一条记录的排序值
                    StockCollect current = allItems.get(currentIndex);
                    StockCollect previous = allItems.get(currentIndex - 1);
                    int tempSortOrder = current.getSortOrder();
                    current.setSortOrder(previous.getSortOrder());
                    previous.setSortOrder(tempSortOrder);

                    stockCollectMapper.updateSortOrderZhuizonghuaxuexianwei(current.getTsCode(), current.getSortOrder());
                    stockCollectMapper.updateSortOrderZhuizonghuaxuexianwei(previous.getTsCode(), previous.getSortOrder());
                }
                break;
            }
        }
    }




    public void collectZhuizongbandaoti(String tsCode) {
        int count = stockCollectMapper.checkIfExistsZhuizongbandaoti(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateZhuizongbandaoti(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertZhuizongbandaoti(stockCollect);
        }
    }
    public String[] getZhuizongbandaoti() {
        return stockCollectMapper.selectZhuizongbandaoti();
    }

    public String[] zanbuZhuizongbandaoti() {
        return stockCollectMapper.selectzanbuZhuizongbandaoti();
    }

    public void delZhuizongbandaoti(String tsCode) { stockCollectMapper.delZhuizongbandaoti(tsCode); }

    public void goonZhuizongbandaoti(String tsCode) { stockCollectMapper.goonZhuizongbandaoti(tsCode); }


    public void moveItemTopZhuizongbandaoti(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongbandaoti(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongbandaoti(flag);
        StockCollect minStockCollect = stockCollectMapper.selectMinOrderZhuizongbandaoti(flag);
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() + 1;
                stockCollectMapper.updateSortOrderZhuizongbandaoti(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置顶
        stockCollectMapper.updateSortOrderZhuizongbandaoti(tsCode, minStockCollect.getSortOrder());
    }

    public void moveItemBottomZhuizongbandaoti(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongbandaoti(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongbandaoti(flag);
        StockCollect maxStockCollect = stockCollectMapper.selectMaxOrderZhuizongbandaoti(flag);
        int bottomSortOrder = maxStockCollect.getSortOrder();
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() - 1;
                stockCollectMapper.updateSortOrderZhuizongbandaoti(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置底
        stockCollectMapper.updateSortOrderZhuizongbandaoti(tsCode, bottomSortOrder);
    }

    public void moveItemUpZhuizongbandaoti(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongbandaoti(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongbandaoti(flag);

        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getTsCode().equals(tsCode)) {
                // 找到当前记录的索引
                int currentIndex = i;
                if (currentIndex > 0) {
                    // 交换当前记录和前一条记录的排序值
                    StockCollect current = allItems.get(currentIndex);
                    StockCollect previous = allItems.get(currentIndex - 1);
                    int tempSortOrder = current.getSortOrder();
                    current.setSortOrder(previous.getSortOrder());
                    previous.setSortOrder(tempSortOrder);

                    stockCollectMapper.updateSortOrderZhuizongbandaoti(current.getTsCode(), current.getSortOrder());
                    stockCollectMapper.updateSortOrderZhuizongbandaoti(previous.getTsCode(), previous.getSortOrder());
                }
                break;
            }
        }
    }




    public void collectZhuizongbaozhuanyinshua(String tsCode) {
        int count = stockCollectMapper.checkIfExistsZhuizongbaozhuanyinshua(tsCode);
        if (count > 0) {
            // 如果记录存在，执行更新操作
            stockCollectMapper.updateZhuizongbaozhuanyinshua(tsCode);
        } else {
            // 如果记录不存在，执行插入操作
            StockCollect stockCollect = new StockCollect();
            stockCollect.setTsCode(tsCode);
            stockCollect.setCreateDate(LocalDateTime.now()); // 设置当前时间为创建日期
            stockCollectMapper.insertZhuizongbaozhuanyinshua(stockCollect);
        }
    }
    public String[] getZhuizongbaozhuanyinshua() {
        return stockCollectMapper.selectZhuizongbaozhuanyinshua();
    }

    public String[] zanbuZhuizongbaozhuanyinshua() {
        return stockCollectMapper.selectzanbuZhuizongbaozhuanyinshua();
    }

    public void delZhuizongbaozhuanyinshua(String tsCode) { stockCollectMapper.delZhuizongbaozhuanyinshua(tsCode); }

    public void goonZhuizongbaozhuanyinshua(String tsCode) { stockCollectMapper.goonZhuizongbaozhuanyinshua(tsCode); }


    public void moveItemTopZhuizongbaozhuanyinshua(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongbaozhuanyinshua(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongbaozhuanyinshua(flag);
        StockCollect minStockCollect = stockCollectMapper.selectMinOrderZhuizongbaozhuanyinshua(flag);
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() + 1;
                stockCollectMapper.updateSortOrderZhuizongbaozhuanyinshua(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置顶
        stockCollectMapper.updateSortOrderZhuizongbaozhuanyinshua(tsCode, minStockCollect.getSortOrder());
    }

    public void moveItemBottomZhuizongbaozhuanyinshua(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongbaozhuanyinshua(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongbaozhuanyinshua(flag);
        StockCollect maxStockCollect = stockCollectMapper.selectMaxOrderZhuizongbaozhuanyinshua(flag);
        int bottomSortOrder = maxStockCollect.getSortOrder();
        // 更新其他记录的排序值
        for (StockCollect item : allItems) {
            if (!item.getTsCode().equals(tsCode)) {
                int newSortOrder = item.getSortOrder() - 1;
                stockCollectMapper.updateSortOrderZhuizongbaozhuanyinshua(item.getTsCode(), newSortOrder);
            }
        }
        // 将目标记录置底
        stockCollectMapper.updateSortOrderZhuizongbaozhuanyinshua(tsCode, bottomSortOrder);
    }

    public void moveItemUpZhuizongbaozhuanyinshua(String tsCode) {
        String flag = stockCollectMapper.selectFlagByIdZhuizongbaozhuanyinshua(tsCode);
        // 获取所有记录
        List<StockCollect> allItems = stockCollectMapper.selectAllWithSortOrderZhuizongbaozhuanyinshua(flag);

        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getTsCode().equals(tsCode)) {
                // 找到当前记录的索引
                int currentIndex = i;
                if (currentIndex > 0) {
                    // 交换当前记录和前一条记录的排序值
                    StockCollect current = allItems.get(currentIndex);
                    StockCollect previous = allItems.get(currentIndex - 1);
                    int tempSortOrder = current.getSortOrder();
                    current.setSortOrder(previous.getSortOrder());
                    previous.setSortOrder(tempSortOrder);

                    stockCollectMapper.updateSortOrderZhuizongbaozhuanyinshua(current.getTsCode(), current.getSortOrder());
                    stockCollectMapper.updateSortOrderZhuizongbaozhuanyinshua(previous.getTsCode(), previous.getSortOrder());
                }
                break;
            }
        }
    }




}