package com.ruoyi.web.controller.common;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.system.domain.StockCollect;
import com.ruoyi.web.controller.stock.StockCollectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import com.ruoyi.common.config.RuoYiConfig;
import com.ruoyi.common.constant.Constants;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.file.FileUploadUtils;
import com.ruoyi.common.utils.file.FileUtils;
import com.ruoyi.framework.config.ServerConfig;

/**
 * 通用请求处理
 * 
 * @author ruoyi
 */
@RestController
@RequestMapping("/common")
public class CommonController
{
    private static final Logger log = LoggerFactory.getLogger(CommonController.class);


    @PostMapping("/stock/collectBKgaixingsuliao")
    public String collectBKgaixingsuliao(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKgaixingsuliao(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKgaixingsuliao")
    public String[] getBKgaixingsuliao() {
        return stockCollectService.getBKgaixingsuliao();
    }
    @PostMapping("/collect/delBKgaixingsuliao")
    public ResponseEntity<?> delBKgaixingsuliao(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKgaixingsuliao(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }




    @PostMapping("/stock/collectBKhechenshuzhi")
    public String collectBKhechenshuzhi(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKhechenshuzhi(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKhechenshuzhi")
    public String[] getBKhechenshuzhi() {
        return stockCollectService.getBKhechenshuzhi();
    }
    @PostMapping("/collect/delBKhechenshuzhi")
    public ResponseEntity<?> delBKhechenshuzhi(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKhechenshuzhi(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKmucailiao")
    public String collectBKmucailiao(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKmucailiao(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKmucailiao")
    public String[] getBKmucailiao() {
        return stockCollectService.getBKmucailiao();
    }
    @PostMapping("/collect/delBKmucailiao")
    public ResponseEntity<?> delBKmucailiao(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKmucailiao(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectBKmojumoliao")
    public String collectBKmojumoliao(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKmojumoliao(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKmojumoliao")
    public String[] getBKmojumoliao() {
        return stockCollectService.getBKmojumoliao();
    }
    @PostMapping("/collect/delBKmojumoliao")
    public ResponseEntity<?> delBKmojumoliao(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKmojumoliao(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKfuliao")
    public String collectBKfuliao(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKfuliao(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKfuliao")
    public String[] getBKfuliao() {
        return stockCollectService.getBKfuliao();
    }
    @PostMapping("/collect/delBKfuliao")
    public ResponseEntity<?> delBKfuliao(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKfuliao(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKyinran")
    public String collectBKyinran(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKyinran(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKyinran")
    public String[] getBKyinran() {
        return stockCollectService.getBKyinran();
    }
    @PostMapping("/collect/delBKyinran")
    public ResponseEntity<?> delBKyinran(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKyinran(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectBKcuizhiyingyongsoftware")
    public String collectBKcuizhiyingyongsoftware(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKcuizhiyingyongsoftware(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKcuizhiyingyongsoftware")
    public String[] getBKcuizhiyingyongsoftware() {
        return stockCollectService.getBKcuizhiyingyongsoftware();
    }
    @PostMapping("/collect/delBKcuizhiyingyongsoftware")
    public ResponseEntity<?> delBKcuizhiyingyongsoftware(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKcuizhiyingyongsoftware(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKtiyu")
    public String collectBKtiyu(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKtiyu(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKtiyu")
    public String[] getBKtiyu() {
        return stockCollectService.getBKtiyu();
    }
    @PostMapping("/collect/delBKtiyu")
    public ResponseEntity<?> delBKtiyu(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKtiyu(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKdipanyufadongjikui")
    public String collectBKdipanyufadongjikui(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKdipanyufadongjikui(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKdipanyufadongjikui")
    public String[] getBKdipanyufadongjikui() {
        return stockCollectService.getBKdipanyufadongjikui();
    }
    @PostMapping("/collect/delBKdipanyufadongjikui")
    public ResponseEntity<?> delBKdipanyufadongjikui(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKdipanyufadongjikui(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKshanyongzhaikeche")
    public String collectBKshanyongzhaikeche(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKshanyongzhaikeche(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKshanyongzhaikeche")
    public String[] getBKshanyongzhaikeche() {
        return stockCollectService.getBKshanyongzhaikeche();
    }
    @PostMapping("/collect/delBKshanyongzhaikeche")
    public ResponseEntity<?> delBKshanyongzhaikeche(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKshanyongzhaikeche(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKshanyongzhaihuoche")
    public String collectBKshanyongzhaihuoche(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKshanyongzhaihuoche(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKshanyongzhaihuoche")
    public String[] getBKshanyongzhaihuoche() {
        return stockCollectService.getBKshanyongzhaihuoche();
    }
    @PostMapping("/collect/delBKshanyongzhaihuoche")
    public ResponseEntity<?> delBKshanyongzhaihuoche(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKshanyongzhaihuoche(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }




    @PostMapping("/stock/collectBKcizhuandiban")
    public String collectBKcizhuandiban(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKcizhuandiban(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKcizhuandiban")
    public String[] getBKcizhuandiban() {
        return stockCollectService.getBKcizhuandiban();
    }
    @PostMapping("/collect/delBKcizhuandiban")
    public ResponseEntity<?> delBKcizhuandiban(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKcizhuandiban(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKtongxingwangluoshebei")
    public String collectBKtongxingwangluoshebei(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKtongxingwangluoshebei(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKtongxingwangluoshebei")
    public String[] getBKtongxingwangluoshebei() {
        return stockCollectService.getBKtongxingwangluoshebei();
    }
    @PostMapping("/collect/delBKtongxingwangluoshebei")
    public ResponseEntity<?> delBKtongxingwangluoshebei(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKtongxingwangluoshebei(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKtongxingzhongduanjipeijian")
    public String collectBKtongxingzhongduanjipeijian(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKtongxingzhongduanjipeijian(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKtongxingzhongduanjipeijian")
    public String[] getBKtongxingzhongduanjipeijian() {
        return stockCollectService.getBKtongxingzhongduanjipeijian();
    }
    @PostMapping("/collect/delBKtongxingzhongduanjipeijian")
    public ResponseEntity<?> delBKtongxingzhongduanjipeijian(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKtongxingzhongduanjipeijian(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKtongxingxianlanpeitao")
    public String collectBKtongxingxianlanpeitao(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKtongxingxianlanpeitao(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKtongxingxianlanpeitao")
    public String[] getBKtongxingxianlanpeitao() {
        return stockCollectService.getBKtongxingxianlanpeitao();
    }
    @PostMapping("/collect/delBKtongxingxianlanpeitao")
    public ResponseEntity<?> delBKtongxingxianlanpeitao(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKtongxingxianlanpeitao(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }




    @PostMapping("/stock/collectBKtongxinggongchengjifuwu")
    public String collectBKtongxinggongchengjifuwu(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKtongxinggongchengjifuwu(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKtongxinggongchengjifuwu")
    public String[] getBKtongxinggongchengjifuwu() {
        return stockCollectService.getBKtongxinggongchengjifuwu();
    }
    @PostMapping("/collect/delBKtongxinggongchengjifuwu")
    public ResponseEntity<?> delBKtongxinggongchengjifuwu(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKtongxinggongchengjifuwu(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKtongxingyingyongzengzhi")
    public String collectBKtongxingyingyongzengzhi(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKtongxingyingyongzengzhi(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKtongxingyingyongzengzhi")
    public String[] getBKtongxingyingyongzengzhi() {
        return stockCollectService.getBKtongxingyingyongzengzhi();
    }
    @PostMapping("/collect/delBKtongxingyingyongzengzhi")
    public ResponseEntity<?> delBKtongxingyingyongzengzhi(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKtongxingyingyongzengzhi(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKhanghaizhuangbei")
    public String collectBKhanghaizhuangbei(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKhanghaizhuangbei(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKhanghaizhuangbei")
    public String[] getBKhanghaizhuangbei() {
        return stockCollectService.getBKhanghaizhuangbei();
    }
    @PostMapping("/collect/delBKhanghaizhuangbei")
    public ResponseEntity<?> delBKhanghaizhuangbei(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKhanghaizhuangbei(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKdimianbingzhuang")
    public String collectBKdimianbingzhuang(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKdimianbingzhuang(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKdimianbingzhuang")
    public String[] getBKdimianbingzhuang() {
        return stockCollectService.getBKdimianbingzhuang();
    }
    @PostMapping("/collect/delBKdimianbingzhuang")
    public ResponseEntity<?> delBKdimianbingzhuang(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKdimianbingzhuang(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }




    @PostMapping("/stock/collectBKhangkongzhuangbei")
    public String collectBKbkhangkongzhuangbei(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKbkhangkongzhuangbei(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKhangkongzhuangbei")
    public String[] getBKbkhangkongzhuangbei() {
        return stockCollectService.getBKbkhangkongzhuangbei();
    }
    @PostMapping("/collect/delBKhangkongzhuangbei")
    public ResponseEntity<?> delBKbkhangkongzhuangbei(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKbkhangkongzhuangbei(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }




    @PostMapping("/stock/collectBKmianfang")
    public String collectBKmianfang(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKmianfang(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKmianfang")
    public String[] getBKmianfang() {
        return stockCollectService.getBKmianfang();
    }
    @PostMapping("/collect/delBKmianfang")
    public ResponseEntity<?> delBKmianfang(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKmianfang(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKdingzhijiaju")
    public String collectBKdingzhijiaju(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKdingzhijiaju(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKdingzhijiaju")
    public String[] getBKdingzhijiaju() {
        return stockCollectService.getBKdingzhijiaju();
    }
    @PostMapping("/collect/delBKdingzhijiaju")
    public ResponseEntity<?> delBKdingzhijiaju(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKdingzhijiaju(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKym")
    public String collectBKym(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKym(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKym")
    public String[] getBKym() {
        return stockCollectService.getBKym();
    }
    @PostMapping("/collect/delBKym")
    public ResponseEntity<?> delBKym(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKym(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectBKguiliaoguipian")
    public String collectBKguiliaoguipian(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKguiliaoguipian(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKguiliaoguipian")
    public String[] getBKguiliaoguipian() {
        return stockCollectService.getBKguiliaoguipian();
    }
    @PostMapping("/collect/delBKguiliaoguipian")
    public ResponseEntity<?> delBKguiliaoguipian(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKguiliaoguipian(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKguangfufucai")
    public String collectBKguangfufucai(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKguangfufucai(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKguangfufucai")
    public String[] getBKguangfufucai() {
        return stockCollectService.getBKguangfufucai();
    }
    @PostMapping("/collect/delBKguangfufucai")
    public ResponseEntity<?> delBKguangfufucai(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKguangfufucai(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKguangfujiagongshebei")
    public String collectBKguangfujiagongshebei(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKguangfujiagongshebei(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKguangfujiagongshebei")
    public String[] getBKguangfujiagongshebei() {
        return stockCollectService.getBKguangfujiagongshebei();
    }
    @PostMapping("/collect/delBKguangfujiagongshebei")
    public ResponseEntity<?> delBKguangfujiagongshebei(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKguangfujiagongshebei(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKnengyuanjingshugu")
    public String collectBKnengyuanjingshugu(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKnengyuanjingshugu(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKnengyuanjingshugu")
    public String[] getBKnengyuanjingshugu() {
        return stockCollectService.getBKnengyuanjingshugu();
    }
    @PostMapping("/collect/delBKnengyuanjingshugu")
    public ResponseEntity<?> delBKnengyuanjingshugu(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKnengyuanjingshugu(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKgongjiao")
    public String collectBKgongjiao(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKgongjiao(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKgongjiao")
    public String[] getBKgongjiao() {
        return stockCollectService.getBKgongjiao();
    }
    @PostMapping("/collect/delBKgongjiao")
    public ResponseEntity<?> delBKgongjiao(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKgongjiao(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKgaosugonglu")
    public String collectBKgaosugonglu(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKgaosugonglu(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKgaosugonglu")
    public String[] getBKgaosugonglu() {
        return stockCollectService.getBKgaosugonglu();
    }
    @PostMapping("/collect/delBKgaosugonglu")
    public ResponseEntity<?> delBKgaosugonglu(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKgaosugonglu(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKhangkongyunshu")
    public String collectBKhangkongyunshu(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKhangkongyunshu(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKhangkongyunshu")
    public String[] getBKhangkongyunshu() {
        return stockCollectService.getBKhangkongyunshu();
    }
    @PostMapping("/collect/delBKhangkongyunshu")
    public ResponseEntity<?> delBKhangkongyunshu(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKhangkongyunshu(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }




    @PostMapping("/stock/collectBKhangyun")
    public String collectBKhangyun(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKhangyun(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKhangyun")
    public String[] getBKhangyun() {
        return stockCollectService.getBKhangyun();
    }
    @PostMapping("/collect/delBKhangyun")
    public ResponseEntity<?> delBKhangyun(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKhangyun(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/collect/bkTopgnyiyuanall")
    public ResponseEntity<?> moveItemTopgnyiyuanall(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemTopgnyiyuanall(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkBottomgnyiyuanall")
    public ResponseEntity<?> moveItemBottomgnyiyuanall(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemBottomgnyiyuanall(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("stock/moveUpgnyiyuanall")
    public ResponseEntity<?> moveItemUpgnyiyuanall(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemUpgnyiyuanall(ts_code);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/stock/info/gnyiyuanall")
    public String[] getgnyiyuanall() {
        return stockCollectService.getgnyiyuanall();
    }

    @PostMapping("/stock/collectgnyiyuanall")
    public String collectgnyiyuanall(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectgnyiyuanall(tsCode);

        return "";
    }


    @PostMapping("/stock/collectBKshipin")
    public String collectBKshipin(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKshipin(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKshipin")
    public String[] getBKshipin() {
        return stockCollectService.getBKshipin();
    }
    @PostMapping("/collect/delBKshipin")
    public ResponseEntity<?> delBKshipin(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKshipin(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKfuzhuang")
    public String collectBKfuzhuang(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKfuzhuang(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKfuzhuang")
    public String[] getBKfuzhuang() {
        return stockCollectService.getBKfuzhuang();
    }
    @PostMapping("/collect/delBKfuzhuang")
    public ResponseEntity<?> delBKfuzhuang(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKfuzhuang(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKjiafang")
    public String collectBKjiafang(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKjiafang(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKjiafang")
    public String[] getBKjiafang() {
        return stockCollectService.getBKjiafang();
    }
    @PostMapping("/collect/delBKjiafang")
    public ResponseEntity<?> delBKjiafang(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKjiafang(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKhuazp")
    public String collectBKhuazp(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKhuazp(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKhuazp")
    public String[] getBKhuazp() {
        return stockCollectService.getBKhuazp();
    }
    @PostMapping("/collect/delBKhuazp")
    public ResponseEntity<?> delBKhuazp(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKhuazp(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKbingxi")
    public String collectBKbingxi(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKbingxi(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKbingxi")
    public String[] getBKbingxi() {
        return stockCollectService.getBKbingxi();
    }
    @PostMapping("/collect/delBKbingxi")
    public ResponseEntity<?> delBKbingxi(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKbingxi(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKjiadianparts")
    public String collectBKjiadianparts(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKjiadianparts(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKjiadianparts")
    public String[] getBKjiadianparts() {
        return stockCollectService.getBKjiadianparts();
    }
    @PostMapping("/collect/delBKjiadianparts")
    public ResponseEntity<?> delBKjiadianparts(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKjiadianparts(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKmeatzhiping")
    public String collectBKmeatzhiping(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKmeatzhiping(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKmeatzhiping")
    public String[] getBKmeatzhiping() {
        return stockCollectService.getBKmeatzhiping();
    }
    @PostMapping("/collect/delBKmeatzhiping")
    public ResponseEntity<?> delBKmeatzhiping(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKmeatzhiping(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKxiuxianshiping")
    public String collectBKxiuxianshiping(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKxiuxianshiping(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKxiuxianshiping")
    public String[] getBKxiuxianshiping() {
        return stockCollectService.getBKxiuxianshiping();
    }
    @PostMapping("/collect/delBKxiuxianshiping")
    public ResponseEntity<?> delBKxiuxianshiping(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKxiuxianshiping(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKyujiagongfood")
    public String collectBKyujiagongfood(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKyujiagongfood(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKyujiagongfood")
    public String[] getBKyujiagongfood() {
        return stockCollectService.getBKyujiagongfood();
    }
    @PostMapping("/collect/delBKyujiagongfood")
    public ResponseEntity<?> delBKyujiagongfood(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKyujiagongfood(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKtiaoweiping")
    public String collectBKtiaoweiping(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKtiaoweiping(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKtiaoweiping")
    public String[] getBKtiaoweiping() {
        return stockCollectService.getBKtiaoweiping();
    }
    @PostMapping("/collect/delBKtiaoweiping")
    public ResponseEntity<?> delBKtiaoweiping(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKtiaoweiping(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKbeer")
    public String collectBKbeer(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKbeer(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKbeer")
    public String[] getBKbeer() {
        return stockCollectService.getBKbeer();
    }
    @PostMapping("/collect/delBKbeer")
    public ResponseEntity<?> delBKbeer(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKbeer(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKluming")
    public String collectBKluming(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKluming(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKluming")
    public String[] getBKluming() {
        return stockCollectService.getBKluming();
    }
    @PostMapping("/collect/delBKluming")
    public ResponseEntity<?> delBKluming(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKluming(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKqitawine")
    public String collectBKqitawine(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKqitawine(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKqitawine")
    public String[] getBKqitawine() {
        return stockCollectService.getBKqitawine();
    }
    @PostMapping("/collect/delBKqitawine")
    public ResponseEntity<?> delBKqitawine(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKqitawine(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKruanyinliao")
    public String collectBKruanyinliao(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKruanyinliao(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKruanyinliao")
    public String[] getBKruanyinliao() {
        return stockCollectService.getBKruanyinliao();
    }
    @PostMapping("/collect/delBKruanyinliao")
    public ResponseEntity<?> delBKruanyinliao(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKruanyinliao(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKziranjingdian")
    public String collectBKziranjingdian(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKziranjingdian(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKziranjingdian")
    public String[] getBKziranjingdian() {
        return stockCollectService.getBKziranjingdian();
    }
    @PostMapping("/collect/delBKziranjingdian")
    public ResponseEntity<?> delBKziranjingdian(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKziranjingdian(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectBKlvyouzonghe")
    public String collectBKlvyouzonghe(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKlvyouzonghe(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKlvyouzonghe")
    public String[] getBKlvyouzonghe() {
        return stockCollectService.getBKlvyouzonghe();
    }
    @PostMapping("/collect/delBKlvyouzonghe")
    public ResponseEntity<?> delBKlvyouzonghe(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKlvyouzonghe(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKcanying")
    public String collectBKcanying(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKcanying(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKcanying")
    public String[] getBKcanying() {
        return stockCollectService.getBKcanying();
    }
    @PostMapping("/collect/delBKcanying")
    public ResponseEntity<?> delBKcanying(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKcanying(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKjiudian")
    public String collectBKjiudian(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKjiudian(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKjiudian")
    public String[] getBKjiudian() {
        return stockCollectService.getBKjiudian();
    }
    @PostMapping("/collect/delBKjiudian")
    public ResponseEntity<?> delBKjiudian(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKjiudian(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }




    @PostMapping("/stock/collectBKrengongjingdian")
    public String collectBKrengongjingdian(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKrengongjingdian(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKrengongjingdian")
    public String[] getBKrengongjingdian() {
        return stockCollectService.getBKrengongjingdian();
    }
    @PostMapping("/collect/delBKrengongjingdian")
    public ResponseEntity<?> delBKrengongjingdian(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKrengongjingdian(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKzhuanyeliansuo")
    public String collectBKzhuanyeliansuo(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKzhuanyeliansuo(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKzhuanyeliansuo")
    public String[] getBKzhuanyeliansuo() {
        return stockCollectService.getBKzhuanyeliansuo();
    }
    @PostMapping("/collect/delBKzhuanyeliansuo")
    public ResponseEntity<?> delBKzhuanyeliansuo(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKzhuanyeliansuo(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKbaihuolingshou")
    public String collectBKbaihuolingshou(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKbaihuolingshou(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKbaihuolingshou")
    public String[] getBKbaihuolingshou() {
        return stockCollectService.getBKbaihuolingshou();
    }
    @PostMapping("/collect/delBKbaihuolingshou")
    public ResponseEntity<?> delBKbaihuolingshou(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKbaihuolingshou(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKshangyewuyejinying")
    public String collectBKshangyewuyejinying(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKshangyewuyejinying(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKshangyewuyejinying")
    public String[] getBKshangyewuyejinying() {
        return stockCollectService.getBKshangyewuyejinying();
    }
    @PostMapping("/collect/delBKshangyewuyejinying")
    public ResponseEntity<?> delBKshangyewuyejinying(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKshangyewuyejinying(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKshubiandianshebei")
    public String collectBKshubiandianshebei(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKshubiandianshebei(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKshubiandianshebei")
    public String[] getBKshubiandianshebei() {
        return stockCollectService.getBKshubiandianshebei();
    }
    @PostMapping("/collect/delBKshubiandianshebei")
    public ResponseEntity<?> delBKshubiandianshebei(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKshubiandianshebei(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKxianlangpartsjiqita")
    public String collectBKxianlangpartsjiqita(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKxianlangpartsjiqita(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKxianlangpartsjiqita")
    public String[] getBKxianlangpartsjiqita() {
        return stockCollectService.getBKxianlangpartsjiqita();
    }
    @PostMapping("/collect/delBKxianlangpartsjiqita")
    public ResponseEntity<?> delBKxianlangpartsjiqita(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKxianlangpartsjiqita(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKtiwaizhenduang")
    public String collectBKtiwaizhenduang(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKtiwaizhenduang(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKtiwaizhenduang")
    public String[] getBKtiwaizhenduang() {
        return stockCollectService.getBKtiwaizhenduang();
    }
    @PostMapping("/collect/delBKtiwaizhenduang")
    public ResponseEntity<?> delBKtiwaizhenduang(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKtiwaizhenduang(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKyiliaohaocai")
    public String collectBKyiliaohaocai(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKyiliaohaocai(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKyiliaohaocai")
    public String[] getBKyiliaohaocai() {
        return stockCollectService.getBKyiliaohaocai();
    }
    @PostMapping("/collect/delBKyiliaohaocai")
    public ResponseEntity<?> delBKyiliaohaocai(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKyiliaohaocai(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKgongkongshebei")
    public String collectBKgongkongshebei(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKgongkongshebei(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKgongkongshebei")
    public String[] getBKgongkongshebei() {
        return stockCollectService.getBKgongkongshebei();
    }
    @PostMapping("/collect/delBKgongkongshebei")
    public ResponseEntity<?> delBKgongkongshebei(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKgongkongshebei(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKjiguangshebei")
    public String collectBKjiguangshebei(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKjiguangshebei(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKjiguangshebei")
    public String[] getBKjiguangshebei() {
        return stockCollectService.getBKjiguangshebei();
    }
    @PostMapping("/collect/delBKjiguangshebei")
    public ResponseEntity<?> delBKjiguangshebei(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKjiguangshebei(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }




    @PostMapping("/stock/collectBKbkrobot")
    public String collectBKbkrobot(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKbkrobot(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKbkrobot")
    public String[] getBKbkrobot() {
        return stockCollectService.getBKbkrobot();
    }
    @PostMapping("/collect/delBKbkrobot")
    public ResponseEntity<?> delBKbkrobot(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKbkrobot(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKbkqitacpushebei")
    public String collectBKbkqitacpushebei(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKbkqitacpushebei(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKbkqitacpushebei")
    public String[] getBKbkqitacpushebei() {
        return stockCollectService.getBKbkqitacpushebei();
    }
    @PostMapping("/collect/delBKbkqitacpushebei")
    public ResponseEntity<?> delBKbkqitacpushebei(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKbkqitacpushebei(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }





    @PostMapping("/stock/collectBKbknongyongjixie")
    public String collectBKbknongyongjixie(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKbknongyongjixie(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKbknongyongjixie")
    public String[] getBKbknongyongjixie() {
        return stockCollectService.getBKbknongyongjixie();
    }
    @PostMapping("/collect/delBKbknongyongjixie")
    public ResponseEntity<?> delBKbknongyongjixie(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKbknongyongjixie(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKfangzhifuzhuangshebei")
    public String collectBKfangzhifuzhuangshebei(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKfangzhifuzhuangshebei(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKfangzhifuzhuangshebei")
    public String[] getBKfangzhifuzhuangshebei() {
        return stockCollectService.getBKfangzhifuzhuangshebei();
    }
    @PostMapping("/collect/delBKfangzhifuzhuangshebei")
    public ResponseEntity<?> delBKfangzhifuzhuangshebei(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKfangzhifuzhuangshebei(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }




    @PostMapping("/stock/collectBKqitazhuanyongshebei")
    public String collectBKqitazhuanyongshebei(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKqitazhuanyongshebei(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKqitazhuanyongshebei")
    public String[] getBKqitazhuanyongshebei() {
        return stockCollectService.getBKqitazhuanyongshebei();
    }
    @PostMapping("/collect/delBKqitazhuanyongshebei")
    public ResponseEntity<?> delBKqitazhuanyongshebei(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKqitazhuanyongshebei(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }




    @PostMapping("/stock/collectBKlouyushebei")
    public String collectBKlouyushebei(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKlouyushebei(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKlouyushebei")
    public String[] getBKlouyushebei() {
        return stockCollectService.getBKlouyushebei();
    }
    @PostMapping("/collect/delBKlouyushebei")
    public ResponseEntity<?> delBKlouyushebei(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKlouyushebei(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }





    @PostMapping("/stock/collectBKenergyjiheavyshebei")
    public String collectBKenergyjiheavyshebei(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKenergyjiheavyshebei(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKenergyjiheavyshebei")
    public String[] getBKenergyjiheavyshebei() {
        return stockCollectService.getBKenergyjiheavyshebei();
    }
    @PostMapping("/collect/delBKenergyjiheavyshebei")
    public ResponseEntity<?> delBKenergyjiheavyshebei(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKenergyjiheavyshebei(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKmeitangkaicai")
    public String collectBKmeitangkaicai(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKmeitangkaicai(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKmeitangkaicai")
    public String[] getBKmeitangkaicai() {
        return stockCollectService.getBKmeitangkaicai();
    }
    @PostMapping("/collect/delBKmeitangkaicai")
    public ResponseEntity<?> delBKmeitangkaicai(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKmeitangkaicai(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectBKshiyoujiagong")
    public String collectBKshiyoujiagong(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKshiyoujiagong(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKshiyoujiagong")
    public String[] getBKshiyoujiagong() {
        return stockCollectService.getBKshiyoujiagong();
    }
    @PostMapping("/collect/delBKshiyoujiagong")
    public ResponseEntity<?> delBKshiyoujiagong(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKshiyoujiagong(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }




    @PostMapping("/stock/collectBKyoufugongcheng")
    public String collectBKyoufugongcheng(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKyoufugongcheng(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKyoufugongcheng")
    public String[] getBKyoufugongcheng() {
        return stockCollectService.getBKyoufugongcheng();
    }
    @PostMapping("/collect/delBKyoufugongcheng")
    public ResponseEntity<?> delBKyoufugongcheng(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKyoufugongcheng(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKyouqikaicai")
    public String collectBKyouqikaicai(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKyouqikaicai(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKyouqikaicai")
    public String[] getBKyouqikaicai() {
        return stockCollectService.getBKyouqikaicai();
    }
    @PostMapping("/collect/delBKyouqikaicai")
    public ResponseEntity<?> delBKyouqikaicai(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKyouqikaicai(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }




    @PostMapping("/stock/collectBKxinnengyuanfadian")
    public String collectBKxinnengyuanfadian(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKxinnengyuanfadian(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKxinnengyuanfadian")
    public String[] getBKxinnengyuanfadian() {
        return stockCollectService.getBKxinnengyuanfadian();
    }
    @PostMapping("/collect/delBKxinnengyuanfadian")
    public ResponseEntity<?> delBKxinnengyuanfadian(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKxinnengyuanfadian(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }





    @PostMapping("/stock/collectBKdiannengzonghefuwu")
    public String collectBKdiannengzonghefuwu(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKdiannengzonghefuwu(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKdiannengzonghefuwu")
    public String[] getBKdiannengzonghefuwu() {
        return stockCollectService.getBKdiannengzonghefuwu();
    }
    @PostMapping("/collect/delBKdiannengzonghefuwu")
    public ResponseEntity<?> delBKdiannengzonghefuwu(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKdiannengzonghefuwu(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }




    @PostMapping("/stock/collectBKhuodian")
    public String collectBKhuodian(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKhuodian(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKhuodian")
    public String[] getBKhuodian() {
        return stockCollectService.getBKhuodian();
    }
    @PostMapping("/collect/delBKhuodian")
    public ResponseEntity<?> delBKhuodian(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKhuodian(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKreli")
    public String collectBKreli(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKreli(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKreli")
    public String[] getBKreli() {
        return stockCollectService.getBKreli();
    }
    @PostMapping("/collect/delBKreli")
    public ResponseEntity<?> delBKreli(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKreli(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKshuidian")
    public String collectBKshuidian(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKshuidian(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKshuidian")
    public String[] getBKshuidian() {
        return stockCollectService.getBKshuidian();
    }
    @PostMapping("/collect/delBKshuidian")
    public ResponseEntity<?> delBKshuidian(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKshuidian(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKhuaxuezhijiyinli")
    public String collectBKhuaxuezhijiyinli(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKhuaxuezhijiyinli(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKhuaxuezhijiyinli")
    public String[] getBKhuaxuezhijiyinli() {
        return stockCollectService.getBKhuaxuezhijiyinli();
    }
    @PostMapping("/collect/delBKhuaxuezhijiyinli")
    public ResponseEntity<?> delBKhuaxuezhijiyinli(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKhuaxuezhijiyinli(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKhuaxuezhiji")
    public String collectBKhuaxuezhiji(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKhuaxuezhiji(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKhuaxuezhiji")
    public String[] getBKhuaxuezhiji() {
        return stockCollectService.getBKhuaxuezhiji();
    }
    @PostMapping("/collect/delBKhuaxuezhiji")
    public ResponseEntity<?> delBKhuaxuezhiji(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKhuaxuezhiji(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKyuanliaoyao")
    public String collectBKyuanliaoyao(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKyuanliaoyao(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKyuanliaoyao")
    public String[] getBKyuanliaoyao() {
        return stockCollectService.getBKyuanliaoyao();
    }
    @PostMapping("/collect/delBKyuanliaoyao")
    public ResponseEntity<?> delBKyuanliaoyao(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKyuanliaoyao(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKqitashengwuzhip")
    public String collectBKqitashengwuzhip(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKqitashengwuzhip(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKqitashengwuzhip")
    public String[] getBKqitashengwuzhip() {
        return stockCollectService.getBKqitashengwuzhip();
    }
    @PostMapping("/collect/delBKqitashengwuzhip")
    public ResponseEntity<?> delBKqitashengwuzhip(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKqitashengwuzhip(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }




    @PostMapping("/stock/collectBKxueyezhip")
    public String collectBKxueyezhip(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKxueyezhip(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKxueyezhip")
    public String[] getBKxueyezhip() {
        return stockCollectService.getBKxueyezhip();
    }
    @PostMapping("/collect/delBKxueyezhip")
    public ResponseEntity<?> delBKxueyezhip(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKxueyezhip(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKyiyuan")
    public String collectBKyiyuan(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKyiyuan(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKyiyuan")
    public String[] getBKyiyuan() {
        return stockCollectService.getBKyiyuan();
    }
    @PostMapping("/collect/delBKyiyuan")
    public ResponseEntity<?> delBKyiyuan(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKyiyuan(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKyiliaoyanfawaibao")
    public String collectBKyiliaoyanfawaibao(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKyiliaoyanfawaibao(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKyiliaoyanfawaibao")
    public String[] getBKyiliaoyanfawaibao() {
        return stockCollectService.getBKyiliaoyanfawaibao();
    }
    @PostMapping("/collect/delBKyiliaoyanfawaibao")
    public ResponseEntity<?> delBKyiliaoyanfawaibao(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKyiliaoyanfawaibao(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKwujiyan")
    public String collectBKwujiyan(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKwujiyan(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKwujiyan")
    public String[] getBKwujiyan() {
        return stockCollectService.getBKwujiyan();
    }
    @PostMapping("/collect/delBKwujiyan")
    public ResponseEntity<?> delBKwujiyan(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKwujiyan(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKqitahuaxueraw")
    public String collectBKqitahuaxueraw(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKqitahuaxueraw(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKqitahuaxueraw")
    public String[] getBKqitahuaxueraw() {
        return stockCollectService.getBKqitahuaxueraw();
    }
    @PostMapping("/collect/delBKqitahuaxueraw")
    public ResponseEntity<?> delBKqitahuaxueraw(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKqitahuaxueraw(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKtaibaifen")
    public String collectBKtaibaifen(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKtaibaifen(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKtaibaifen")
    public String[] getBKtaibaifen() {
        return stockCollectService.getBKtaibaifen();
    }
    @PostMapping("/collect/delBKtaibaifen")
    public ResponseEntity<?> delBKtaibaifen(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKtaibaifen(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKmeihuagong")
    public String collectBKmeihuagong(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKmeihuagong(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKmeihuagong")
    public String[] getBKmeihuagong() {
        return stockCollectService.getBKmeihuagong();
    }
    @PostMapping("/collect/delBKmeihuagong")
    public ResponseEntity<?> delBKmeihuagong(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKmeihuagong(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKlvjian")
    public String collectBKlvjian(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKlvjian(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKlvjian")
    public String[] getBKlvjian() {
        return stockCollectService.getBKlvjian();
    }
    @PostMapping("/collect/delBKlvjian")
    public ResponseEntity<?> delBKlvjian(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKlvjian(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKxiaofeidianziparts")
    public String collectBKxiaofeidianziparts(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKxiaofeidianziparts(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKxiaofeidianziparts")
    public String[] getBKxiaofeidianziparts() {
        return stockCollectService.getBKxiaofeidianziparts();
    }
    @PostMapping("/collect/delBKxiaofeidianziparts")
    public ResponseEntity<?> delBKxiaofeidianziparts(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKxiaofeidianziparts(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }




    @PostMapping("/stock/collectBKbidongyuanjian")
    public String collectBKbidongyuanjian(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKbidongyuanjian(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKbidongyuanjian")
    public String[] getBKbidongyuanjian() {
        return stockCollectService.getBKbidongyuanjian();
    }
    @PostMapping("/collect/delBKbidongyuanjian")
    public ResponseEntity<?> delBKbidongyuanjian(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKbidongyuanjian(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKyinzhidianluban")
    public String collectBKyinzhidianluban(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKyinzhidianluban(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKyinzhidianluban")
    public String[] getBKyinzhidianluban() {
        return stockCollectService.getBKyinzhidianluban();
    }
    @PostMapping("/collect/delBKyinzhidianluban")
    public ResponseEntity<?> delBKyinzhidianluban(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKyinzhidianluban(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKlidianchi")
    public String collectBKlidianchi(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKlidianchi(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKlidianchi")
    public String[] getBKlidianchi() {
        return stockCollectService.getBKlidianchi();
    }
    @PostMapping("/collect/delBKlidianchi")
    public ResponseEntity<?> delBKlidianchi(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKlidianchi(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKqitadianchi")
    public String collectBKqitadianchi(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKqitadianchi(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKqitadianchi")
    public String[] getBKqitadianchi() {
        return stockCollectService.getBKqitadianchi();
    }
    @PostMapping("/collect/delBKqitadianchi")
    public ResponseEntity<?> delBKqitadianchi(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKqitadianchi(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKdianchihuaxue")
    public String collectBKdianchihuaxue(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKdianchihuaxue(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKdianchihuaxue")
    public String[] getBKdianchihuaxue() {
        return stockCollectService.getBKdianchihuaxue();
    }
    @PostMapping("/collect/delBKdianchihuaxue")
    public ResponseEntity<?> delBKdianchihuaxue(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKdianchihuaxue(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKmianban")
    public String collectBKmianban(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKmianban(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKmianban")
    public String[] getBKmianban() {
        return stockCollectService.getBKmianban();
    }
    @PostMapping("/collect/delBKmianban")
    public ResponseEntity<?> delBKmianban(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKmianban(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectBKled")
    public String collectBKled(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKled(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKled")
    public String[] getBKled() {
        return stockCollectService.getBKled();
    }
    @PostMapping("/collect/delBKled")
    public ResponseEntity<?> delBKled(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKled(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectBKguanxueyuanjian")
    public String collectBKguanxueyuanjian(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKguanxueyuanjian(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKguanxueyuanjian")
    public String[] getBKguanxueyuanjian() {
        return stockCollectService.getBKguanxueyuanjian();
    }
    @PostMapping("/collect/delBKguanxueyuanjian")
    public ResponseEntity<?> delBKguanxueyuanjian(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKguanxueyuanjian(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKyiyaoliutong")
    public String collectBKyiyaoliutong(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKyiyaoliutong(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKyiyaoliutong")
    public String[] getBKyiyaoliutong() {
        return stockCollectService.getBKyiyaoliutong();
    }
    @PostMapping("/collect/delBKyiyaoliutong")
    public ResponseEntity<?> delBKyiyaoliutong(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKyiyaoliutong(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKdanfei")
    public String collectBKdanfei(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKdanfei(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKdanfei")
    public String[] getBKdanfei() {
        return stockCollectService.getBKdanfei();
    }
    @PostMapping("/collect/delBKdanfei")
    public ResponseEntity<?> delBKdanfei(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKdanfei(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }





    @PostMapping("/stock/collectBKnongyao")
    public String collectBKnongyao(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKnongyao(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKnongyao")
    public String[] getBKnongyao() {
        return stockCollectService.getBKnongyao();
    }
    @PostMapping("/collect/delBKnongyao")
    public ResponseEntity<?> delBKnongyao(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKnongyao(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }




    @PostMapping("/stock/collectBKfuhefei")
    public String collectBKfuhefei(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKfuhefei(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKfuhefei")
    public String[] getBKfuhefei() {
        return stockCollectService.getBKfuhefei();
    }
    @PostMapping("/collect/delBKfuhefei")
    public ResponseEntity<?> delBKfuhefei(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKfuhefei(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKlinhui")
    public String collectBKlinhui(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKlinhui(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKlinhui")
    public String[] getBKlinhui() {
        return stockCollectService.getBKlinhui();
    }
    @PostMapping("/collect/delBKlinhui")
    public ResponseEntity<?> delBKlinhui(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKlinhui(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }




    @PostMapping("/stock/collectBKroujiyangzhi")
    public String collectBKroujiyangzhi(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKroujiyangzhi(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKroujiyangzhi")
    public String[] getBKroujiyangzhi() {
        return stockCollectService.getBKroujiyangzhi();
    }
    @PostMapping("/collect/delBKroujiyangzhi")
    public ResponseEntity<?> delBKroujiyangzhi(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKroujiyangzhi(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKshengzhuyangzhi")
    public String collectBKshengzhuyangzhi(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKshengzhuyangzhi(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKshengzhuyangzhi")
    public String[] getBKshengzhuyangzhi() {
        return stockCollectService.getBKshengzhuyangzhi();
    }
    @PostMapping("/collect/delBKshengzhuyangzhi")
    public ResponseEntity<?> delBKshengzhuyangzhi(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKshengzhuyangzhi(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKqitayangzhi")
    public String collectBKqitayangzhi(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKqitayangzhi(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKqitayangzhi")
    public String[] getBKqitayangzhi() {
        return stockCollectService.getBKqitayangzhi();
    }
    @PostMapping("/collect/delBKqitayangzhi")
    public ResponseEntity<?> delBKqitayangzhi(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKqitayangzhi(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKshuichanyangzhi")
    public String collectBKshuichanyangzhi(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKshuichanyangzhi(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKshuichanyangzhi")
    public String[] getBKshuichanyangzhi() {
        return stockCollectService.getBKshuichanyangzhi();
    }
    @PostMapping("/collect/delBKshuichanyangzhi")
    public ResponseEntity<?> delBKshuichanyangzhi(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKshuichanyangzhi(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }




    @PostMapping("/stock/collectBKdongwubaojian")
    public String collectBKdongwubaojian(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKdongwubaojian(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKdongwubaojian")
    public String[] getBKdongwubaojian() {
        return stockCollectService.getBKdongwubaojian();
    }
    @PostMapping("/collect/delBKdongwubaojian")
    public ResponseEntity<?> delBKdongwubaojian(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKdongwubaojian(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKlinye")
    public String collectBKlinye(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKlinye(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKlinye")
    public String[] getBKlinye() {
        return stockCollectService.getBKlinye();
    }
    @PostMapping("/collect/delBKlinye")
    public ResponseEntity<?> delBKlinye(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKlinye(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKzhongzhishengchan")
    public String collectBKzhongzhishengchan(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKzhongzhishengchan(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKzhongzhishengchan")
    public String[] getBKzhongzhishengchan() {
        return stockCollectService.getBKzhongzhishengchan();
    }
    @PostMapping("/collect/delBKzhongzhishengchan")
    public ResponseEntity<?> delBKzhongzhishengchan(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKzhongzhishengchan(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }




    @PostMapping("/stock/collectBKqitazhongzhiye")
    public String collectBKqitazhongzhiye(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKqitazhongzhiye(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKqitazhongzhiye")
    public String[] getBKqitazhongzhiye() {
        return stockCollectService.getBKqitazhongzhiye();
    }
    @PostMapping("/collect/delBKqitazhongzhiye")
    public ResponseEntity<?> delBKqitazhongzhiye(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKqitazhongzhiye(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKguoshujiagong")
    public String collectBKguoshujiagong(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKguoshujiagong(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKguoshujiagong")
    public String[] getBKguoshujiagong() {
        return stockCollectService.getBKguoshujiagong();
    }
    @PostMapping("/collect/delBKguoshujiagong")
    public ResponseEntity<?> delBKguoshujiagong(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKguoshujiagong(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKshuichansiliao")
    public String collectBKshuichansiliao(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKshuichansiliao(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKshuichansiliao")
    public String[] getBKshuichansiliao() {
        return stockCollectService.getBKshuichansiliao();
    }
    @PostMapping("/collect/delBKshuichansiliao")
    public ResponseEntity<?> delBKshuichansiliao(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKshuichansiliao(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectBKliangyoujiagong")
    public String collectBKliangyoujiagong(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKliangyoujiagong(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKliangyoujiagong")
    public String[] getBKliangyoujiagong() {
        return stockCollectService.getBKliangyoujiagong();
    }
    @PostMapping("/collect/delBKliangyoujiagong")
    public ResponseEntity<?> delBKliangyoujiagong(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKliangyoujiagong(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKqitanongchanpinjiagong")
    public String collectBKqitanongchanpinjiagong(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKqitanongchanpinjiagong(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKqitanongchanpinjiagong")
    public String[] getBKqitanongchanpinjiagong() {
        return stockCollectService.getBKqitanongchanpinjiagong();
    }
    @PostMapping("/collect/delBKqitanongchanpinjiagong")
    public ResponseEntity<?> delBKqitanongchanpinjiagong(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKqitanongchanpinjiagong(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKxuchusiliao")
    public String collectBKxuchusiliao(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKxuchusiliao(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKxuchusiliao")
    public String[] getBKxuchusiliao() {
        return stockCollectService.getBKxuchusiliao();
    }
    @PostMapping("/collect/delBKxuchusiliao")
    public ResponseEntity<?> delBKxuchusiliao(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKxuchusiliao(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKanlun")
    public String collectBKanlun(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKanlun(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKanlun")
    public String[] getBKanlun() {
        return stockCollectService.getBKanlun();
    }
    @PostMapping("/collect/delBKanlun")
    public ResponseEntity<?> delBKanlun(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKanlun(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKnianjiao")
    public String collectBKnianjiao(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKnianjiao(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKnianjiao")
    public String[] getBKnianjiao() {
        return stockCollectService.getBKnianjiao();
    }
    @PostMapping("/collect/delBKnianjiao")
    public ResponseEntity<?> delBKnianjiao(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKnianjiao(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectBKdilun")
    public String collectBKdilun(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKdilun(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKdilun")
    public String[] getBKdilun() {
        return stockCollectService.getBKdilun();
    }
    @PostMapping("/collect/delBKdilun")
    public ResponseEntity<?> delBKdilun(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKdilun(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKyoujigui")
    public String collectBKyoujigui(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKyoujigui(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKyoujigui")
    public String[] getBKyoujigui() {
        return stockCollectService.getBKyoujigui();
    }
    @PostMapping("/collect/delBKyoujigui")
    public ResponseEntity<?> delBKyoujigui(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKyoujigui(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectBKfuhuagong")
    public String collectBKfuhuagong(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKfuhuagong(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKfuhuagong")
    public String[] getBKfuhuagong() {
        return stockCollectService.getBKfuhuagong();
    }
    @PostMapping("/collect/delBKfuhuagong")
    public ResponseEntity<?> delBKfuhuagong(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKfuhuagong(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKjuanzhi")
    public String collectBKjuanzhi(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKjuanzhi(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKjuanzhi")
    public String[] getBKjuanzhi() {
        return stockCollectService.getBKjuanzhi();
    }
    @PostMapping("/collect/delBKjuanzhi")
    public ResponseEntity<?> delBKjuanzhi(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKjuanzhi(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectBKminbaoyongpin")
    public String collectBKminbaoyongpin(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKminbaoyongpin(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKminbaoyongpin")
    public String[] getBKminbaoyongpin() {
        return stockCollectService.getBKminbaoyongpin();
    }
    @PostMapping("/collect/delBKminbaoyongpin")
    public ResponseEntity<?> delBKminbaoyongpin(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKminbaoyongpin(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectBKfanzhihuaxuepin")
    public String collectBKfanzhihuaxuepin(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKfanzhihuaxuepin(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKfanzhihuaxuepin")
    public String[] getBKfanzhihuaxuepin() {
        return stockCollectService.getBKfanzhihuaxuepin();
    }
    @PostMapping("/collect/delBKfanzhihuaxuepin")
    public ResponseEntity<?> delBKfanzhihuaxuepin(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKfanzhihuaxuepin(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKfoodsiliaotianjiaji")
    public String collectBKfoodsiliaotianjiaji(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKfoodsiliaotianjiaji(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKfoodsiliaotianjiaji")
    public String[] getBKfoodsiliaotianjiaji() {
        return stockCollectService.getBKfoodsiliaotianjiaji();
    }
    @PostMapping("/collect/delBKfoodsiliaotianjiaji")
    public ResponseEntity<?> delBKfoodsiliaotianjiaji(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKfoodsiliaotianjiaji(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKqitahuaxue")
    public String collectBKqitahuaxue(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKqitahuaxue(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKqitahuaxue")
    public String[] getBKqitahuaxue() {
        return stockCollectService.getBKqitahuaxue();
    }
    @PostMapping("/collect/delBKqitahuaxue")
    public ResponseEntity<?> delBKqitahuaxue(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKqitahuaxue(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectBKotherjiaju")
    public String collectBKotherjiaju(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKotherjiaju(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKotherjiaju")
    public String[] getBKotherjiaju() {
        return stockCollectService.getBKotherjiaju();
    }
    @PostMapping("/collect/delBKotherjiaju")
    public ResponseEntity<?> delBKotherjiaju(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKotherjiaju(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }




    @PostMapping("/stock/collectBKwenyuyongping")
    public String collectBKwenyuyongping(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKwenyuyongping(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKwenyuyongping")
    public String[] getBKwenyuyongping() {
        return stockCollectService.getBKwenyuyongping();
    }
    @PostMapping("/collect/delBKwenyuyongping")
    public ResponseEntity<?> delBKwenyuyongping(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKwenyuyongping(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKbaozhuang")
    public String collectBKbaozhuang(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKbaozhuang(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKbaozhuang")
    public String[] getBKbaozhuang() {
        return stockCollectService.getBKbaozhuang();
    }
    @PostMapping("/collect/delBKbaozhuang")
    public ResponseEntity<?> delBKbaozhuang(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKbaozhuang(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKchuban")
    public String collectBKchuban(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKchuban(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKchuban")
    public String[] getBKchuban() {
        return stockCollectService.getBKchuban();
    }
    @PostMapping("/collect/delBKchuban")
    public ResponseEntity<?> delBKchuban(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKchuban(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKguangaoyinxiao")
    public String collectBKguangaoyinxiao(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKguangaoyinxiao(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKguangaoyinxiao")
    public String[] getBKguangaoyinxiao() {
        return stockCollectService.getBKguangaoyinxiao();
    }
    @PostMapping("/collect/delBKguangaoyinxiao")
    public ResponseEntity<?> delBKguangaoyinxiao(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKguangaoyinxiao(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKmonixinpiansheji")
    public String collectBKmonixinpiansheji(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKmonixinpiansheji(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKmonixinpiansheji")
    public String[] getBKmonixinpiansheji() {
        return stockCollectService.getBKmonixinpiansheji();
    }
    @PostMapping("/collect/delBKmonixinpiansheji")
    public ResponseEntity<?> delBKmonixinpiansheji(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKmonixinpiansheji(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKbaodaotishebei")
    public String collectBKbaodaotishebei(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKbaodaotishebei(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKbaodaotishebei")
    public String[] getBKbaodaotishebei() {
        return stockCollectService.getBKbaodaotishebei();
    }
    @PostMapping("/collect/delBKbaodaotishebei")
    public ResponseEntity<?> delBKbaodaotishebei(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKbaodaotishebei(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKfenliqijian")
    public String collectBKfenliqijian(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKfenliqijian(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKfenliqijian")
    public String[] getBKfenliqijian() {
        return stockCollectService.getBKfenliqijian();
    }
    @PostMapping("/collect/delBKfenliqijian")
    public ResponseEntity<?> delBKfenliqijian(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKfenliqijian(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKjichengdianlutest")
    public String collectBKjichengdianlutest(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKjichengdianlutest(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKjichengdianlutest")
    public String[] getBKjichengdianlutest() {
        return stockCollectService.getBKjichengdianlutest();
    }
    @PostMapping("/collect/delBKjichengdianlutest")
    public ResponseEntity<?> delBKjichengdianlutest(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKjichengdianlutest(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKbandaoticailiao")
    public String collectBKbandaoticailiao(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKbandaoticailiao(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKbandaoticailiao")
    public String[] getBKbandaoticailiao() {
        return stockCollectService.getBKbandaoticailiao();
    }
    @PostMapping("/collect/delBKbandaoticailiao")
    public ResponseEntity<?> delBKbandaoticailiao(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKbandaoticailiao(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKshuzixinpian")
    public String collectBKshuzixinpian(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKshuzixinpian(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKshuzixinpian")
    public String[] getBKshuzixinpian() {
        return stockCollectService.getBKshuzixinpian();
    }
    @PostMapping("/collect/delBKshuzixinpian")
    public ResponseEntity<?> delBKshuzixinpian(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKshuzixinpian(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKdaqizhili")
    public String collectBKdaqizhili(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKdaqizhili(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKdaqizhili")
    public String[] getBKdaqizhili() {
        return stockCollectService.getBKdaqizhili();
    }
    @PostMapping("/collect/delBKdaqizhili")
    public ResponseEntity<?> delBKdaqizhili(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKdaqizhili(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKgufei")
    public String collectBKgufei(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKgufei(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKgufei")
    public String[] getBKgufei() {
        return stockCollectService.getBKgufei();
    }
    @PostMapping("/collect/delBKgufei")
    public ResponseEntity<?> delBKgufei(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKgufei(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKshuiwu")
    public String collectBKshuiwu(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKshuiwu(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKshuiwu")
    public String[] getBKshuiwu() {
        return stockCollectService.getBKshuiwu();
    }
    @PostMapping("/collect/delBKshuiwu")
    public ResponseEntity<?> delBKshuiwu(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKshuiwu(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKzonghehuanjin")
    public String collectBKzonghehuanjin(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKzonghehuanjin(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKzonghehuanjin")
    public String[] getBKzonghehuanjin() {
        return stockCollectService.getBKzonghehuanjin();
    }
    @PostMapping("/collect/delBKzonghehuanjin")
    public ResponseEntity<?> delBKzonghehuanjin(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKzonghehuanjin(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectBKbkwu")
    public String collectBKbkwu(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKbkwu(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKbkwu")
    public String[] getBKbkwu() {
        return stockCollectService.getBKbkwu();
    }
    @PostMapping("/collect/delBKbkwu")
    public ResponseEntity<?> delBKbkwu(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKbkwu(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKbkqitaxiaojinshu")
    public String collectBKbkqitaxiaojinshu(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKbkqitaxiaojinshu(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKbkqitaxiaojinshu")
    public String[] getBKbkqitaxiaojinshu() {
        return stockCollectService.getBKbkqitaxiaojinshu();
    }
    @PostMapping("/collect/delBKbkqitaxiaojinshu")
    public ResponseEntity<?> delBKbkqitaxiaojinshu(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKbkqitaxiaojinshu(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKbkxitu")
    public String collectBKbkxitu(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKbkxitu(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKbkxitu")
    public String[] getBKbkxitu() {
        return stockCollectService.getBKbkxitu();
    }
    @PostMapping("/collect/delBKbkxitu")
    public ResponseEntity<?> delBKbkxitu(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKbkxitu(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKbklv")
    public String collectBKbklv(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKbklv(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKbklv")
    public String[] getBKbklv() {
        return stockCollectService.getBKbklv();
    }
    @PostMapping("/collect/delBKbklv")
    public ResponseEntity<?> delBKbklv(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKbklv(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectBKbktong")
    public String collectBKbktong(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKbktong(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKbktong")
    public String[] getBKbktong() {
        return stockCollectService.getBKbktong();
    }
    @PostMapping("/collect/delBKbktong")
    public ResponseEntity<?> delBKbktong(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKbktong(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }
    @PostMapping("/stock/collectBKbkjinshuzhipin")
    public String collectBKbkjinshuzhipin(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKbkjinshuzhipin(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKbkjinshuzhipin")
    public String[] getBKbkjinshuzhipin() {
        return stockCollectService.getBKbkjinshuzhipin();
    }
    @PostMapping("/collect/delBKbkjinshuzhipin")
    public ResponseEntity<?> delBKbkjinshuzhipin(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKbkjinshuzhipin(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKbkaircondition")
    public String collectBKbkaircondition(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKbkaircondition(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKbkaircondition")
    public String[] getBKbkaircondition() {
        return stockCollectService.getBKbkaircondition();
    }
    @PostMapping("/collect/delBKbkaircondition")
    public ResponseEntity<?> delBKbkaircondition(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKbkaircondition(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKbkcardianzidianqi")
    public String collectBKbkcardianzidianqi(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKbkcardianzidianqi(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKbkcardianzidianqi")
    public String[] getBKbkcardianzidianqi() {
        return stockCollectService.getBKbkcardianzidianqi();
    }
    @PostMapping("/collect/delBKbkcardianzidianqi")
    public ResponseEntity<?> delBKbkcardianzidianqi(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKbkcardianzidianqi(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectBKbkdipan")
    public String collectBKbkdipan(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKbkdipan(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKbkdipan")
    public String[] getBKbkdipan() {
        return stockCollectService.getBKbkdipan();
    }
    @PostMapping("/collect/delBKbkdipan")
    public ResponseEntity<?> delBKbkdipan(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKbkdipan(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKbkluntai")
    public String collectBKbkluntai(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKbkluntai(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKbkluntai")
    public String[] getBKbkluntai() {
        return stockCollectService.getBKbkluntai();
    }
    @PostMapping("/collect/delBKbkluntai")
    public ResponseEntity<?> delBKbkluntai(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKbkluntai(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKbkcheshen")
    public String collectBKbkcheshen(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKbkcheshen(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKbkcheshen")
    public String[] getBKbkcheshen() {
        return stockCollectService.getBKbkcheshen();
    }
    @PostMapping("/collect/delBKbkcheshen")
    public ResponseEntity<?> delBKbkcheshen(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKbkcheshen(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKbkcarservice02")
    public String collectBKbkcarservice02(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKbkcarservice02(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKbkcarservice02")
    public String[] getBKbkcarservice02() {
        return stockCollectService.getBKbkcarservice02();
    }
    @PostMapping("/collect/delBKbkcarservice02")
    public ResponseEntity<?> delBKbkcarservice02(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKbkcarservice02(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKothercarparts")
    public String collectBKothercarparts(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKothercarparts(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKothercarparts")
    public String[] getBKothercarparts() {
        return stockCollectService.getBKothercarparts();
    }
    @PostMapping("/collect/delBKothercarparts")
    public ResponseEntity<?> delBKothercarparts(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKothercarparts(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectBKtegang")
    public String collectBKtegang(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKtegang(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKtegang")
    public String[] getBKtegang() {
        return stockCollectService.getBKtegang();
    }
    @PostMapping("/collect/delBKtegang")
    public ResponseEntity<?> delBKtegang(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKtegang(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKpugang")
    public String collectBKpugang(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKpugang(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKpugang")
    public String[] getBKpugang() {
        return stockCollectService.getBKpugang();
    }
    @PostMapping("/collect/delBKpugang")
    public ResponseEntity<?> delBKpugang(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKpugang(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKpipe")
    public String collectBKpipe(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKpipe(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKpipe")
    public String[] getBKpipe() {
        return stockCollectService.getBKpipe();
    }
    @PostMapping("/collect/delBKpipe")
    public ResponseEntity<?> delBKpipe(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKpipe(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKnaihuocailiao")
    public String collectBKnaihuocailiao(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKnaihuocailiao(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKnaihuocailiao")
    public String[] getBKnaihuocailiao() {
        return stockCollectService.getBKnaihuocailiao();
    }
    @PostMapping("/collect/delBKnaihuocailiao")
    public ResponseEntity<?> delBKnaihuocailiao(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKnaihuocailiao(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKzhuangshiyuanlin")
    public String collectBKzhuangshiyuanlin(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKzhuangshiyuanlin(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKzhuangshiyuanlin")
    public String[] getBKzhuangshiyuanlin() {
        return stockCollectService.getBKzhuangshiyuanlin();
    }
    @PostMapping("/collect/delBKzhuangshiyuanlin")
    public ResponseEntity<?> delBKzhuangshiyuanlin(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKzhuangshiyuanlin(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectBKgongchengzixun")
    public String collectBKgongchengzixun(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKgongchengzixun(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKgongchengzixun")
    public String[] getBKgongchengzixun() {
        return stockCollectService.getBKgongchengzixun();
    }
    @PostMapping("/collect/delBKgongchengzixun")
    public ResponseEntity<?> delBKgongchengzixun(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKgongchengzixun(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKjichujianshe")
    public String collectBKjichujianshe(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKjichujianshe(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKjichujianshe")
    public String[] getBKjichujianshe() {
        return stockCollectService.getBKjichujianshe();
    }
    @PostMapping("/collect/delBKjichujianshe")
    public ResponseEntity<?> delBKjichujianshe(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKjichujianshe(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectBKgangjiegou")
    public String collectBKgangjiegou(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKgangjiegou(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKgangjiegou")
    public String[] getBKgangjiegou() {
        return stockCollectService.getBKgangjiegou();
    }
    @PostMapping("/collect/delBKgangjiegou")
    public ResponseEntity<?> delBKgangjiegou(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKgangjiegou(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKShangyewuyeguanli")
    public String collectBKShangyewuyeguanli(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKShangyewuyeguanli(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKShangyewuyeguanli")
    public String[] getBKShangyewuyeguanli() {
        return stockCollectService.getBKShangyewuyeguanli();
    }
    @PostMapping("/collect/delBKShangyewuyeguanli")
    public ResponseEntity<?> delBKShangyewuyeguanli(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKShangyewuyeguanli(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }
    @PostMapping("/stock/collectBKZhuzhaikaifa")
    public String collectBKZhuzhaikaifa(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKZhuzhaikaifa(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKZhuzhaikaifa")
    public String[] getBKZhuzhaikaifa() {
        return stockCollectService.getBKZhuzhaikaifa();
    }
    @PostMapping("/collect/delBKZhuzhaikaifa")
    public ResponseEntity<?> delBKZhuzhaikaifa(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKZhuzhaikaifa(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKShangyedichang")
    public String collectBKShangyedichang(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKShangyedichang(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKShangyedichang")
    public String[] getBKShangyedichang() {
        return stockCollectService.getBKShangyedichang();
    }
    @PostMapping("/collect/delBKShangyedichang")
    public ResponseEntity<?> delBKShangyedichang(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKShangyedichang(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKCement")
    public String collectBKCement(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKCement(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKCement")
    public String[] getBKCement() {
        return stockCollectService.getBKCement();
    }
    @PostMapping("/collect/delBKCement")
    public ResponseEntity<?> delBKCement(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKCement(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKPackageprint")
    public String collectBKPackageprint(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKPackageprint(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKPackageprint")
    public String[] getBKPackageprint() {
        return stockCollectService.getBKPackageprint();
    }
    @PostMapping("/collect/delBKPackageprint")
    public ResponseEntity<?> delBKPackageprint(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKPackageprint(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKKitchenappliances")
    public String collectBKKitchenappliances(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKKitchenappliances(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKKitchenappliances")
    public String[] getBKKitchenappliances() {
        return stockCollectService.getBKKitchenappliances();
    }
    @PostMapping("/collect/delBKKitchenappliances")
    public ResponseEntity<?> delBKKitchenappliances(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKKitchenappliances(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKCommunicationservices")
    public String collectBKCommunicationservices(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKCommunicationservices(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKCommunicationservices")
    public String[] getBKCommunicationservices() {
        return stockCollectService.getBKCommunicationservices();
    }
    @PostMapping("/collect/delBKCommunicationservices")
    public ResponseEntity<?> delBKCommunicationservices(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKCommunicationservices(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKPowergridequipment")
    public String collectBKPowergridequipment(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKPowergridequipment(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKPowergridequipment")
    public String[] getBKPowergridequipment() {
        return stockCollectService.getBKPowergridequipment();
    }
    @PostMapping("/collect/delBKPowergridequipment")
    public ResponseEntity<?> delBKPowergridequipment(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKPowergridequipment(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKPetroleumprocessingtrade")
    public String collectBKPetroleumprocessingtrade(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKPetroleumprocessingtrade(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKPetroleumprocessingtrade")
    public String[] getBKPetroleumprocessingtrade() {
        return stockCollectService.getBKPetroleumprocessingtrade();
    }
    @PostMapping("/collect/delBKPetroleumprocessingtrade")
    public ResponseEntity<?> delBKPetroleumprocessingtrade(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKPetroleumprocessingtrade(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKOthersocialservices")
    public String collectBKOthersocialservices(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKOthersocialservices(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKOthersocialservices")
    public String[] getBKOthersocialservices() {
        return stockCollectService.getBKOthersocialservices();
    }
    @PostMapping("/collect/delBKOthersocialservices")
    public ResponseEntity<?> delBKOthersocialservices(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKOthersocialservices(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }




    @PostMapping("/stock/collectBKCulturalmedia")
    public String collectBKCulturalmedia(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKCulturalmedia(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKCulturalmedia")
    public String[] getBKCulturalmedia() {
        return stockCollectService.getBKCulturalmedia();
    }
    @PostMapping("/collect/delBKCulturalmedia")
    public ResponseEntity<?> delBKCulturalmedia(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKCulturalmedia(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKOpticaloptoelectronics")
    public String collectBKOpticaloptoelectronics(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKOpticaloptoelectronics(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKOpticaloptoelectronics")
    public String[] getBKOpticaloptoelectronics() {
        return stockCollectService.getBKOpticaloptoelectronics();
    }
    @PostMapping("/collect/delBKOpticaloptoelectronics")
    public ResponseEntity<?> delBKOpticaloptoelectronics(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKOpticaloptoelectronics(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectBKElectronicchemicals")
    public String collectBKElectronicchemicals(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKElectronicchemicals(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKElectronicchemicals")
    public String[] getBKElectronicchemicals() {
        return stockCollectService.getBKElectronicchemicals();
    }
    @PostMapping("/collect/delBKElectronicchemicals")
    public ResponseEntity<?> delBKElectronicchemicals(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKElectronicchemicals(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKCinema")
    public String collectBKCinema(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKCinema(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKCinema")
    public String[] getBKCinema() {
        return stockCollectService.getBKCinema();
    }
    @PostMapping("/collect/delBKCinema")
    public ResponseEntity<?> delBKCinema(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKCinema(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKAgriculturalchemicalproducts")
    public String collectBKAgriculturalchemicalproducts(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKAgriculturalchemicalproducts(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKAgriculturalchemicalproducts")
    public String[] getBKAgriculturalchemicalproducts() {
        return stockCollectService.getBKAgriculturalchemicalproducts();
    }
    @PostMapping("/collect/delBKAgriculturalchemicalproducts")
    public ResponseEntity<?> delBKAgriculturalchemicalproducts(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKAgriculturalchemicalproducts(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKBreedingindustry")
    public String collectBKBreedingindustry(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKBreedingindustry(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKBreedingindustry")
    public String[] getBKBreedingindustry() {
        return stockCollectService.getBKBreedingindustry();
    }
    @PostMapping("/collect/delBKBreedingindustry")
    public ResponseEntity<?> delBKBreedingindustry(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKBreedingindustry(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKConstructionmachinery")
    public String collectBKConstructionmachinery(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKConstructionmachinery(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKConstructionmachinery")
    public String[] getBKConstructionmachinery() {
        return stockCollectService.getBKConstructionmachinery();
    }
    @PostMapping("/collect/delBKConstructionmachinery")
    public ResponseEntity<?> delBKConstructionmachinery(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKConstructionmachinery(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectBKOilgasextractionservices")
    public String collectBKOilgasextractionservices(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKOilgasextractionservices(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKOilgasextractionservices")
    public String[] getBKOilgasextractionservices() {
        return stockCollectService.getBKOilgasextractionservices();
    }
    @PostMapping("/collect/delBKOilgasextractionservices")
    public ResponseEntity<?> delBKOilgasextractionservices(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKOilgasextractionservices(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKWindequipment")
    public String collectBKWindequipment(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKWindequipment(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKWindequipment")
    public String[] getBKWindequipment() {
        return stockCollectService.getBKWindequipment();
    }
    @PostMapping("/collect/delBKWindequipment")
    public ResponseEntity<?> delBKWindequipment(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKWindequipment(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKInternetecommerce")
    public String collectBKInternetecommerce(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKInternetecommerce(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKInternetecommerce")
    public String[] getBKInternetecommerce() {
        return stockCollectService.getBKInternetecommerce();
    }
    @PostMapping("/collect/delBKInternetecommerce")
    public ResponseEntity<?> delBKInternetecommerce(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKInternetecommerce(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKProcessingagriculturalproducts")
    public String collectBKProcessingagriculturalproducts(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKProcessingagriculturalproducts(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKProcessingagriculturalproducts")
    public String[] getBKProcessingagriculturalproducts() {
        return stockCollectService.getBKProcessingagriculturalproducts();
    }
    @PostMapping("/collect/delBKProcessingagriculturalproducts")
    public ResponseEntity<?> delBKProcessingagriculturalproducts(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKProcessingagriculturalproducts(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKPhotovoltaicequipment")
    public String collectBKPhotovoltaicequipment(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKPhotovoltaicequipment(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKPhotovoltaicequipment")
    public String[] getBKPhotovoltaicequipment() {
        return stockCollectService.getBKPhotovoltaicequipment();
    }
    @PostMapping("/collect/delBKPhotovoltaicequipment")
    public ResponseEntity<?> delBKPhotovoltaicequipment(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKPhotovoltaicequipment(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectBKTextilemanufacturing")
    public String collectBKTextilemanufacturing(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKTextilemanufacturing(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKTextilemanufacturing")
    public String[] getBKTextilemanufacturing() {
        return stockCollectService.getBKTextilemanufacturing();
    }
    @PostMapping("/collect/delBKTextilemanufacturing")
    public ResponseEntity<?> delBKTextilemanufacturing(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKTextilemanufacturing(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectBKRailwayequipment")
    public String collectBKRailwayequipment(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKRailwayequipment(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKRailwayequipment")
    public String[] getBKRailwayequipment() {
        return stockCollectService.getBKRailwayequipment();
    }
    @PostMapping("/collect/delBKRailwayequipment")
    public ResponseEntity<?> delBKRailwayequipment(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKRailwayequipment(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKCarservice")
    public String collectBKCarservice(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKCarservice(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKCarservice")
    public String[] getBKCarservice() {
        return stockCollectService.getBKCarservice();
    }
    @PostMapping("/collect/delBKCarservice")
    public ResponseEntity<?> delBKCarservice(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKCarservice(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectBKWhitesmallhold")
    public String collectBKWhitesmallhold(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKWhitesmallhold(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKWhitesmallhold")
    public String[] getBKWhitesmallhold() {
        return stockCollectService.getBKWhitesmallhold();
    }
    @PostMapping("/collect/delBKWhitesmallhold")
    public ResponseEntity<?> delBKWhitesmallhold(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKWhitesmallhold(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKPlasticprd")
    public String collectBKPlasticprd(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKPlasticprd(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKPlasticprd")
    public String[] getBKPlasticprd() {
        return stockCollectService.getBKPlasticprd();
    }
    @PostMapping("/collect/delBKPlasticprd")
    public ResponseEntity<?> delBKPlasticprd(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKPlasticprd(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKOtherelectronic")
    public String collectBKOtherelectronic(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKOtherelectronic(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKOtherelectronic")
    public String[] getBKOtherelectronic() {
        return stockCollectService.getBKOtherelectronic();
    }
    @PostMapping("/collect/delBKOtherelectronic")
    public ResponseEntity<?> delBKOtherelectronic(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKOtherelectronic(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKEnvironmentequipment")
    public String collectBKEnvironmentequipment(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKEnvironmentequipment(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKEnvironmentequipment")
    public String[] getBKEnvironmentequipment() {
        return stockCollectService.getBKEnvironmentequipment();
    }
    @PostMapping("/collect/delBKEnvironmentequipment")
    public ResponseEntity<?> delBKEnvironmentequipment(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKEnvironmentequipment(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKBrowngoods")
    public String collectBKBrowngoods(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKBrowngoods(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKBrowngoods")
    public String[] getBKBrowngoods() {
        return stockCollectService.getBKBrowngoods();
    }
    @PostMapping("/collect/delBKBrowngoods")
    public ResponseEntity<?> delBKBrowngoods(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKBrowngoods(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKCarparts")
    public String collectBKCarparts(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKCarparts(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKCarparts")
    public String[] getBKCarparts() {
        return stockCollectService.getBKCarparts();
    }
    @PostMapping("/collect/delBKCarparts")
    public ResponseEntity<?> delBKCarparts(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKCarparts(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKEnergymetal")
    public String collectBKEnergymetal(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKEnergymetal(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKEnergymetal")
    public String[] getBKEnergymetal() {
        return stockCollectService.getBKEnergymetal();
    }
    @PostMapping("/collect/delBKEnergymetal")
    public ResponseEntity<?> delBKEnergymetal(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKEnergymetal(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKAutoequipment")
    public String collectBKAutoequipment(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKAutoequipment(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKAutoequipment")
    public String[] getBKAutoequipment() {
        return stockCollectService.getBKAutoequipment();
    }
    @PostMapping("/collect/delBKAutoequipment")
    public ResponseEntity<?> delBKAutoequipment(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKAutoequipment(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKInsurance")
    public String collectBKInsurance(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKInsurance(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKInsurance")
    public String[] getBKInsurance() {
        return stockCollectService.getBKInsurance();
    }
    @PostMapping("/collect/delBKInsurance")
    public ResponseEntity<?> delBKInsurance(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKInsurance(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectBKItservice")
    public String collectBKItservice(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKItservice(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKItservice")
    public String[] getBKItservice() {
        return stockCollectService.getBKItservice();
    }
    @PostMapping("/collect/delBKItservice")
    public ResponseEntity<?> delBKItservice(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKItservice(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKMilitaryelectronic")
    public String collectBKMilitaryelectronic(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKMilitaryelectronic(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKMilitaryelectronic")
    public String[] getBKMilitaryelectronic() {
        return stockCollectService.getBKMilitaryelectronic();
    }
    @PostMapping("/collect/delBKMilitaryelectronic")
    public ResponseEntity<?> delBKMilitaryelectronic(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKMilitaryelectronic(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectBKAviationequipment")
    public String collectBKAviationequipment(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKAviationequipment(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKAviationequipment")
    public String[] getBKAviationequipment() {
        return stockCollectService.getBKAviationequipment();
    }
    @PostMapping("/collect/delBKAviationequipment")
    public ResponseEntity<?> delBKAviationequipment(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKAviationequipment(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectBKPhotovoltaicpowergeneration")
    public String collectBKPhotovoltaicpowergeneration(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKPhotovoltaicpowergeneration(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKPhotovoltaicpowergeneration")
    public String[] getBKPhotovoltaicpowergeneration() {
        return stockCollectService.getBKPhotovoltaicpowergeneration();
    }
    @PostMapping("/collect/delBKPhotovoltaicpowergeneration")
    public ResponseEntity<?> delBKPhotovoltaicpowergeneration(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKPhotovoltaicpowergeneration(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKSatellite")
    public String collectBKSatellite(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKSatellite(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKSatellite")
    public String[] getBKSatellite() {
        return stockCollectService.getBKSatellite();
    }
    @PostMapping("/collect/delBKSatellite")
    public ResponseEntity<?> delBKSatellite(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKSatellite(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKEntertainment")
    public String collectBKEntertainment(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKEntertainment(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKEntertainment")
    public String[] getBKEntertainment() {
        return stockCollectService.getBKEntertainment();
    }
    @PostMapping("/collect/delBKEntertainment")
    public ResponseEntity<?> delBKEntertainment(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKEntertainment(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKDatacenter")
    public String collectBKDatacenter(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKDatacenter(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKDatacenter")
    public String[] getBKDatacenter() {
        return stockCollectService.getBKDatacenter();
    }
    @PostMapping("/collect/delBKDatacenter")
    public ResponseEntity<?> delBKDatacenter(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKDatacenter(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKPort")
    public String collectBKPort(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKPort(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKPort")
    public String[] getBKPort() {
        return stockCollectService.getBKPort();
    }
    @PostMapping("/collect/delBKPort")
    public ResponseEntity<?> delBKPort(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKPort(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectBKBearing")
    public String collectBKBearing(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKBearing(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKBearing")
    public String[] getBKBearing() {
        return stockCollectService.getBKBearing();
    }
    @PostMapping("/collect/delBKBearing")
    public ResponseEntity<?> delBKBearing(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKBearing(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectBKCNC")
    public String collectBKCNC(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKCNC(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKCNC")
    public String[] getBKCNC() {
        return stockCollectService.getBKCNC();
    }
    @PostMapping("/collect/delBKCNC")
    public ResponseEntity<?> delBKCNC(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKCNC(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectBKElectronicequipment")
    public String collectBKElectronicequipment(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKElectronicequipment(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKElectronicequipment")
    public String[] getBKElectronicequipment() {
        return stockCollectService.getBKElectronicequipment();
    }
    @PostMapping("/collect/delBKElectronicequipment")
    public ResponseEntity<?> delBKElectronicequipment(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKElectronicequipment(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectBKPowerequipment")
    public String collectBKPowerequipment(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKPowerequipment(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKPowerequipment")
    public String[] getBKPowerequipment() {
        return stockCollectService.getBKPowerequipment();
    }
    @PostMapping("/collect/delBKPowerequipment")
    public ResponseEntity<?> delBKPowerequipment(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKPowerequipment(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKMilitaryindustry")
    public String collectBKMilitaryindustry(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKMilitaryindustry(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKMilitaryindustry")
    public String[] getBKMilitaryindustry() {
        return stockCollectService.getBKMilitaryindustry();
    }
    @PostMapping("/collect/delBKMilitaryindustry")
    public ResponseEntity<?> delBKMilitaryindustry(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKMilitaryindustry(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectBKBasicMetalxi")
    public String collectBKBasicMetalxi(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKBasicMetalxi(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKBasicMetalxi")
    public String[] getBKBasicMetalxi() {
        return stockCollectService.getBKBasicMetalxi();
    }
    @PostMapping("/collect/delBKBasicMetalxi")
    public ResponseEntity<?> delBKBasicMetalxi(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKBasicMetalxi(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectBKCell")
    public String collectBKCell(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKCell(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKCell")
    public String[] getBKCell() {
        return stockCollectService.getBKCell();
    }
    @PostMapping("/collect/delBKCell")
    public ResponseEntity<?> delBKCell(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKCell(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectBKJewelry")
    public String collectBKJewelry(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKJewelry(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKJewelry")
    public String[] getBKJewelry() {
        return stockCollectService.getBKJewelry();
    }
    @PostMapping("/collect/delBKJewelry")
    public ResponseEntity<?> delBKJewelry(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKJewelry(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKGlass")
    public String collectBKGlass(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKGlass(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKGlass")
    public String[] getBKGlass() {
        return stockCollectService.getBKGlass();
    }
    @PostMapping("/collect/delBKGlass")
    public ResponseEntity<?> delBKGlass(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKGlass(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectBKRealestateservices")
    public String collectBKRealestateservices(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKRealestateservices(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKRealestateservices")
    public String[] getBKRealestateservices() {
        return stockCollectService.getBKRealestateservices();
    }
    @PostMapping("/collect/delBKRealestateservices")
    public ResponseEntity<?> delBKRealestateservices(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKRealestateservices(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }




    @PostMapping("/stock/collectBKBasicmetaltong")
    public String collectBKBasicmetaltong(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKBasicmetaltong(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKBasicmetaltong")
    public String[] getBKBasicmetaltong() {
        return stockCollectService.getBKBasicmetaltong();
    }
    @PostMapping("/collect/delBKBasicmetaltong")
    public ResponseEntity<?> delBKBasicmetaltong(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKBasicmetaltong(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKPreciousli")
    public String collectBKPreciousli(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKPreciousli(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKPreciousli")
    public String[] getBKPreciousli() {
        return stockCollectService.getBKPreciousli();
    }
    @PostMapping("/collect/delBKPreciousli")
    public ResponseEntity<?> delBKPreciousli(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKPreciousli(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKMedicalservice")
    public String collectBKMedicalservice(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKMedicalservice(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKMedicalservice")
    public String[] getBKMedicalservice() {
        return stockCollectService.getBKMedicalservice();
    }
    @PostMapping("/collect/delBKMedicalservice")
    public ResponseEntity<?> delBKMedicalservice(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKMedicalservice(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectBKSyntheticfibersresins")
    public String collectBKSyntheticfibersresins(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKSyntheticfibersresins(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKSyntheticfibersresins")
    public String[] getBKSyntheticfibersresins() {
        return stockCollectService.getBKSyntheticfibersresins();
    }
    @PostMapping("/collect/delBKSyntheticfibersresins")
    public ResponseEntity<?> delBKSyntheticfibersresins(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKSyntheticfibersresins(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectBKHomefurnishing")
    public String collectBKHomefurnishing(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKHomefurnishing(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKHomefurnishing")
    public String[] getBKHomefurnishing() {
        return stockCollectService.getBKHomefurnishing();
    }
    @PostMapping("/collect/delBKHomefurnishing")
    public ResponseEntity<?> delBKHomefurnishing(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKHomefurnishing(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKBeverage")
    public String collectBKBeverage(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKBeverage(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKBeverage")
    public String[] getBKBeverage() {
        return stockCollectService.getBKBeverage();
    }
    @PostMapping("/collect/delBKBeverage")
    public ResponseEntity<?> delBKBeverage(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKBeverage(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKMetalprd")
    public String collectBKMetalprd(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKMetalprd(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKMetalprd")
    public String[] getBKMetalprd() {
        return stockCollectService.getBKMetalprd();
    }
    @PostMapping("/collect/delBKMetalprd")
    public ResponseEntity<?> delBKMetalprd(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKMetalprd(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKBasicmetal")
    public String collectBKBasicmetal(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKBasicmetal(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKBasicmetal")
    public String[] getBKBasicmetal() {
        return stockCollectService.getBKBasicmetal();
    }
    @PostMapping("/collect/delBKBasicmetal")
    public ResponseEntity<?> delBKBasicmetal(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKBasicmetal(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKMarketingservices")
    public String collectBKMarketingservices(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKMarketingservices(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKMarketingservices")
    public String[] getBKMarketingservices() {
        return stockCollectService.getBKMarketingservices();
    }
    @PostMapping("/collect/delBKMarketingservices")
    public ResponseEntity<?> delBKMarketingservices(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKMarketingservices(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKEducation")
    public String collectBKEducation(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKEducation(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKEducation")
    public String[] getBKEducation() {
        return stockCollectService.getBKEducation();
    }
    @PostMapping("/collect/delBKEducation")
    public ResponseEntity<?> delBKEducation(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKEducation(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }
    @PostMapping("/stock/collectBKChinesemedicine")
    public String collectBKChinesemedicine(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKChinesemedicine(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKChinesemedicine")
    public String[] getBKChinesemedicine() {
        return stockCollectService.getBKChinesemedicine();
    }
    @PostMapping("/collect/delBKChinesemedicine")
    public ResponseEntity<?> delBKChinesemedicine(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKChinesemedicine(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKBiopharmaceuticals")
    public String collectBKBiopharmaceuticals(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKBiopharmaceuticals(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKBiopharmaceuticals")
    public String[] getBKBiopharmaceuticals() {
        return stockCollectService.getBKBiopharmaceuticals();
    }
    @PostMapping("/collect/delBKBiopharmaceuticals")
    public ResponseEntity<?> delBKBiopharmaceuticals(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKBiopharmaceuticals(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKChemicalpharmaceuticals")
    public String collectBKChemicalpharmaceuticals(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKChemicalpharmaceuticals(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKChemicalpharmaceuticals")
    public String[] getBKChemicalpharmaceuticals() {
        return stockCollectService.getBKChemicalpharmaceuticals();
    }
    @PostMapping("/collect/delBKChemicalpharmaceuticals")
    public ResponseEntity<?> delBKChemicalpharmaceuticals(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKChemicalpharmaceuticals(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKRoad")
    public String collectBKRoad(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKRoad(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKRoad")
    public String[] getBKRoad() {
        return stockCollectService.getBKRoad();
    }
    @PostMapping("/collect/delBKRoad")
    public ResponseEntity<?> delBKRoad(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKRoad(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKBank")
    public String collectBKBank(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKBank(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKBank")
    public String[] getBKBank() {
        return stockCollectService.getBKBank();
    }
    @PostMapping("/collect/delBKBank")
    public ResponseEntity<?> delBKBank(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKBank(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectBKWine")
    public String collectBKWine(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKWine(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKWine")
    public String[] getBKWine() {
        return stockCollectService.getBKWine();
    }
    @PostMapping("/collect/delBKWine")
    public ResponseEntity<?> delBKWine(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKWine(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectBKElectricalmachinery")
    public String collectBKElectricalmachinery(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKElectricalmachinery(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKElectricalmachinery")
    public String[] getBKElectricalmachinery() {
        return stockCollectService.getBKElectricalmachinery();
    }
    @PostMapping("/collect/delBKElectricalmachinery")
    public ResponseEntity<?> delBKElectricalmachinery(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKElectricalmachinery(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectBKFishing")
    public String collectBKFishing(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKFishing(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKFishing")
    public String[] getBKFishing() {
        return stockCollectService.getBKFishing();
    }
    @PostMapping("/collect/delBKFishing")
    public ResponseEntity<?> delBKFishing(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKFishing(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @Autowired
    private ServerConfig serverConfig;
    @PostMapping("/stock/collectBKPhotovoltaic")
    public String collectBKPhotovoltaic(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKPhotovoltaic(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKPhotovoltaic")
    public String[] getBKPhotovoltaic() {
        return stockCollectService.getBKPhotovoltaic();
    }
    @PostMapping("/collect/delBKPhotovoltaic")
    public ResponseEntity<?> delBKPhotovoltaic(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKPhotovoltaic(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKCoal")
    public String collectBKCoal(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKCoal(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKCoal")
    public String[] getBKCoal() {
        return stockCollectService.getBKCoal();
    }
    @PostMapping("/collect/delBKCoal")
    public ResponseEntity<?> delBKCoal(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKCoal(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectBKAnimalhusbandry")
    public String collectBKAnimalhusbandry(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKAnimalhusbandry(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKAnimalhusbandry")
    public String[] getBKAnimalhusbandry() {
        return stockCollectService.getBKAnimalhusbandry();
    }
    @PostMapping("/collect/delBKAnimalhusbandry")
    public ResponseEntity<?> delBKAnimalhusbandry(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKAnimalhusbandry(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKDecoration")
    public String collectBKDecoration(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKDecoration(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKDecoration")
    public String[] getBKDecoration() {
        return stockCollectService.getBKDecoration();
    }
    @PostMapping("/collect/delBKDecoration")
    public ResponseEntity<?> delBKDecoration(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKDecoration(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    private static final String FILE_DELIMETER = ",";
    @PostMapping("/stock/collectBKPreciousmetal")
    public String collectBKPreciousmetal(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKPreciousmetal(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKPreciousmetal")
    public String[] getBKPreciousmetal() {
        return stockCollectService.getBKPreciousmetal();
    }
    @PostMapping("/collect/delBKPreciousmetal")
    public ResponseEntity<?> delBKPreciousmetal(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKPreciousmetal(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectBKChemicalraw")
    public String collectBKChemicalraw(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKChemicalraw(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKChemicalraw")
    public String[] getBKChemicalraw() {
        return stockCollectService.getBKChemicalraw();
    }
    @PostMapping("/collect/delBKChemicalraw")
    public ResponseEntity<?> delBKChemicalraw(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKChemicalraw(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKLightindustry")
    public String collectBKLightindustry(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKLightindustry(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKLightindustry")
    public String[] getBKLightindustry() {
        return stockCollectService.getBKLightindustry();
    }
    @PostMapping("/collect/delBKLightindustry")
    public ResponseEntity<?> delBKLightindustry(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKLightindustry(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKLeisureservices")
    public String collectBKLeisureservices(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKLeisureservices(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKLeisureservices")
    public String[] getBKLeisureservices() {
        return stockCollectService.getBKLeisureservices();
    }
    @PostMapping("/collect/delBKLeisureservices")
    public ResponseEntity<?> delBKLeisureservices(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKLeisureservices(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKBond")
    public String collectBKBond(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKBond(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKBond")
    public String[] getBKBond() {
        return stockCollectService.getBKBond();
    }
    @PostMapping("/collect/delBKBond")
    public ResponseEntity<?> delBKBond(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKBond(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectBKMedium")
    public String collectBKMedium(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKMedium(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKMedium")
    public String[] getBKMedium() {
        return stockCollectService.getBKMedium();
    }
    @PostMapping("/collect/delBKMedium")
    public ResponseEntity<?> delBKMedium(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKMedium(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKConsumerelectronics")
    public String collectBKConsumerelectronics(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKConsumerelectronics(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKConsumerelectronics")
    public String[] getBKConsumerelectronics() {
        return stockCollectService.getBKConsumerelectronics();
    }
    @PostMapping("/collect/delBKConsumerelectronics")
    public ResponseEntity<?> delBKConsumerelectronics(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKConsumerelectronics(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKSmallhome")
    public String collectBKSmallhome(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKSmallhome(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKSmallhome")
    public String[] getBKSmallhome() {
        return stockCollectService.getBKSmallhome();
    }
    @PostMapping("/collect/delBKSmallhome")
    public ResponseEntity<?> delBKSmallhome(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKSmallhome(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKWeave")
    public String collectBKWeave(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKWeave(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKWeave")
    public String[] getBKWeave() {
        return stockCollectService.getBKWeave();
    }
    @PostMapping("/collect/delBKWeave")
    public ResponseEntity<?> delBKWeave(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKWeave(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKMetal")
    public String collectBKMetal(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKMetal(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKMetal")
    public String[] getBKMetal() {
        return stockCollectService.getBKMetal();
    }
    @PostMapping("/collect/delBKMetal")
    public ResponseEntity<?> delBKMetal(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKMetal(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKBuildingconstruction")
    public String collectBKBuildingconstruction(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKBuildingconstruction(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKBuildingconstruction")
    public String[] getBKBuildingconstruction() {
        return stockCollectService.getBKBuildingconstruction();
    }
    @PostMapping("/collect/delBKBuildingconstruction")
    public ResponseEntity<?> delBKBuildingconstruction(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKBuildingconstruction(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectBKRubber")
    public String collectBKRubber(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKRubber(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKRubber")
    public String[] getBKRubber() {
        return stockCollectService.getBKRubber();
    }
    @PostMapping("/collect/delBKRubber")
    public ResponseEntity<?> delBKRubber(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKRubber(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectBKCommercialproperties")
    public String collectBKCommercialproperties(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKCommercialproperties(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKCommercialproperties")
    public String[] getBKCommercialproperties() {
        return stockCollectService.getBKCommercialproperties();
    }
    @PostMapping("/collect/delBKCommercialproperties")
    public ResponseEntity<?> delBKCommercialproperties(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKCommercialproperties(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKOtherbuildingmaterials")
    public String collectBKOtherbuildingmaterials(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKOtherbuildingmaterials(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKOtherbuildingmaterials")
    public String[] getBKOtherbuildingmaterials() {
        return stockCollectService.getBKOtherbuildingmaterials();
    }
    @PostMapping("/collect/delBKOtherbuildingmaterials")
    public ResponseEntity<?> delBKOtherbuildingmaterials(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKOtherbuildingmaterials(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKInfrastructure")
    public String collectBKInfrastructure(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKInfrastructure(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKInfrastructure")
    public String[] getBKInfrastructure() {
        return stockCollectService.getBKInfrastructure();
    }
    @PostMapping("/collect/delBKInfrastructure")
    public ResponseEntity<?> delBKInfrastructure(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKInfrastructure(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKSoftware")
    public String collectBKSoftware(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKSoftware(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKSoftware")
    public String[] getBKSoftware() {
        return stockCollectService.getBKSoftware();
    }
    @PostMapping("/collect/delBKSoftware")
    public ResponseEntity<?> delBKSoftware(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKSoftware(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @Autowired
    private StockCollectService stockCollectService;

    @PostMapping("/stock/collectBKGas")
    public String collectBKGas(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKGas(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKGas")
    public String[] getBKGas() {
        return stockCollectService.getBKGas();
    }
    @PostMapping("/collect/delBKGas")
    public ResponseEntity<?> delBKGas(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKGas(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKMedicalequipment")
    public String collectBKMedicalequipment(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKMedicalequipment(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKMedicalequipment")
    public String[] getBKMedicalequipment() {
        return stockCollectService.getBKMedicalequipment();
    }
    @PostMapping("/collect/delBKMedicalequipment")
    public ResponseEntity<?> delBKMedicalequipment(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKMedicalequipment(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }




    @PostMapping("/stock/collectBKAgriculture")
    public String collectBKAgriculture(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKAgriculture(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKAgriculture")
    public String[] getBKAgriculture() {
        return stockCollectService.getBKAgriculture();
    }
    @PostMapping("/collect/delBKAgriculture")
    public ResponseEntity<?> delBKAgriculture(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKAgriculture(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKComputerhardware")
    public String collectBKComputerhardware(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKComputerhardware(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKComputerhardware")
    public String[] getBKComputerhardware() {
        return stockCollectService.getBKComputerhardware();
    }
    @PostMapping("/collect/delBKComputerhardware")
    public ResponseEntity<?> delBKComputerhardware(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKComputerhardware(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectBKLogistics")
    public String collectBKLogistics(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKLogistics(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKLogistics")
    public String[] getBKLogistics() {
        return stockCollectService.getBKLogistics();
    }
    @PostMapping("/collect/delBKLogistics")
    public ResponseEntity<?> delBKLogistics(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKLogistics(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKCommonequipment")
    public String collectBKCommonequipment(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKCommonequipment(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKCommonequipment")
    public String[] getBKCommonequipment() {
        return stockCollectService.getBKCommonequipment();
    }
    @PostMapping("/collect/delBKCommonequipment")
    public ResponseEntity<?> delBKCommonequipment(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKCommonequipment(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKCeramics")
    public String collectBKCeramics(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKCeramics(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKCeramics")
    public String[] getBKCeramics() {
        return stockCollectService.getBKCeramics();
    }
    @PostMapping("/collect/delBKCeramics")
    public ResponseEntity<?> delBKCeramics(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKCeramics(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKSpecialequipment")
    public String collectBKSpecialequipment(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKSpecialequipment(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKSpecialequipment")
    public String[] getBKSpecialequipment() {
        return stockCollectService.getBKSpecialequipment();
    }
    @PostMapping("/collect/delBKSpecialequipment")
    public ResponseEntity<?> delBKSpecialequipment(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKSpecialequipment(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }




    @PostMapping("/stock/collectBKElequipment")
    public String collectBKElequpiment(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKElequpiment(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKElequipment")
    public String[] getBKElequpiment() {
        return stockCollectService.getBKElequpiment();
    }
    @PostMapping("/collect/delBKElequipment")
    public ResponseEntity<?> delBKElequpiment(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKElequpiment(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKTour")
    public String collectBKTour(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKTour(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKTour")
    public String[] getBKTour() {
        return stockCollectService.getBKTour();
    }
    @PostMapping("/collect/delBKTour")
    public ResponseEntity<?> delBKTour(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKTour(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKBroadcast")
    public String collectBKBroadcast(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKBroadcast(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKBroadcast")
    public String[] getBKBroadcast() {
        return stockCollectService.getBKBroadcast();
    }
    @PostMapping("/collect/delBKBroadcast")
    public ResponseEntity<?> delBKBroadcast(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKBroadcast(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKTree")
    public String collectBKTree(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKTree(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKTree")
    public String[] getBKTree() {
        return stockCollectService.getBKTree();
    }
    @PostMapping("/collect/delBKTree")
    public ResponseEntity<?> delBKTree(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKTree(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKPesticide")
    public String collectBKPesticide(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKPesticide(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKPesticide")
    public String[] getBKPesticide() {
        return stockCollectService.getBKPesticide();
    }
    @PostMapping("/collect/delBKPesticide")
    public ResponseEntity<?> delBKPesticide(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKPesticide(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectBKClothes")
    public String collectBKClothes(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKClothes(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKClothes")
    public String[] getBKClothes() {
        return stockCollectService.getBKClothes();
    }
    @PostMapping("/collect/delBKClothes")
    public ResponseEntity<?> delBKClothes(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKClothes(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectBKSale")
    public String collectBKSale(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKSale(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKSale")
    public String[] getBKSale() {
        return stockCollectService.getBKSale();
    }
    @PostMapping("/collect/delBKSale")
    public ResponseEntity<?> delBKSale(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKSale(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKNonBank")
    public String collectBKNonBank(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKNonBank(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKNonBank")
    public String[] getBKNonBank() {
        return stockCollectService.getBKNonBank();
    }
    @PostMapping("/collect/delBKNonBank")
    public ResponseEntity<?> delBKNonBank(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKNonBank(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKSteel")
    public String collectBKSteel(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKSteel(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKSteel")
    public String[] getBKSteel() {
        return stockCollectService.getBKSteel();
    }
    @PostMapping("/collect/delBKSteel")
    public ResponseEntity<?> delBKSteel(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKSteel(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKChemical")
    public String collectBKChemical(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKChemical(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKChemical")
    public String[] getBKChemical() {
        return stockCollectService.getBKChemical();
    }
    @PostMapping("/collect/delBKChemical")
    public ResponseEntity<?> delBKChemical(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKChemical(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKOther")
    public String collectBKOther(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKOther(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKOther")
    public String[] getBKOther() {
        return stockCollectService.getBKOther();
    }
    @PostMapping("/collect/delBKOther")
    public ResponseEntity<?> delBKOther(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKOther(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectBKPaper")
    public String collectBKPaper(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKPaper(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKPaper")
    public String[] getBKPaper() {
        return stockCollectService.getBKPaper();
    }
    @PostMapping("/collect/delBKPaper")
    public ResponseEntity<?> delBKPaper(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKPaper(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKEnvironment")
    public String collectBKEnvironment(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKEnvironment(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKEnvironment")
    public String[] getBKEnvironment() {
        return stockCollectService.getBKEnvironment();
    }
    @PostMapping("/collect/delBKEnvironment")
    public ResponseEntity<?> delBKEnvironment(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKEnvironment(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectBKEquipment")
    public String collectBKEquipment(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKEquipment(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKEquipment")
    public String[] getBKEquipment() {
        return stockCollectService.getBKEquipment();
    }
    @PostMapping("/collect/delBKEquipment")
    public ResponseEntity<?> delBKEquipment(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKEquipment(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectBKMaterial")
    public String collectBKMaterial(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKMaterial(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKMaterial")
    public String[] getBKMaterial() {
        return stockCollectService.getBKMaterial();
    }
    @PostMapping("/collect/delBKMaterial")
    public ResponseEntity<?> delBKMaterial(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKMaterial(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKCommunication")
    public String collectBKCommunication(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKCommunication(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKCommunication")
    public String[] getBKCommunication() {
        return stockCollectService.getBKCommunication();
    }
    @PostMapping("/collect/delBKCommunication")
    public ResponseEntity<?> delBKCommunication(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKCommunication(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKElectric")
    public String collectBKElectric(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKElectric(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKElectric")
    public String[] getBKElectric() {
        return stockCollectService.getBKElectric();
    }
    @PostMapping("/collect/delBKElectric")
    public ResponseEntity<?> delBKElectric(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKElectric(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKTransport")
    public String collectBKTransport(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKTransport(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKTransport")
    public String[] getBKTransport() {
        return stockCollectService.getBKTransport();
    }
    @PostMapping("/collect/delBKTransport")
    public ResponseEntity<?> delBKTransport(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKTransport(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectBKTrade")
    public String collectBKTrade(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKTrade(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKTrade")
    public String[] getBKTrade() {
        return stockCollectService.getBKTrade();
    }
    @PostMapping("/collect/delBKTrade")
    public ResponseEntity<?> delBKTrade(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKTrade(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKCar")
    public String collectBKCar(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKCar(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKCar")
    public String[] getBKCar() {
        return stockCollectService.getBKCar();
    }
    @PostMapping("/collect/delBKCar")
    public ResponseEntity<?> delBKCar(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKCar(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKComputer")
    public String collectBKComputer(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKComputer(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKComputer")
    public String[] getBKComputer() {
        return stockCollectService.getBKComputer();
    }
    @PostMapping("/collect/delBKComputer")
    public ResponseEntity<?> delBKComputer(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKComputer(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKSemiconductor")
    public String collectBKSemiconductor(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKSemiconductor(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKSemiconductor")
    public String[] getBKSemiconductor() {
        return stockCollectService.getBKSemiconductor();
    }
    @PostMapping("/collect/delBKSemiconductor")
    public ResponseEntity<?> delBKSemiconductor(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKSemiconductor(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/stock/collectBKBuild")
    public String collectBKBuild(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKBuild(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKBuild")
    public String[] getBKBuild() {
        return stockCollectService.getBKBuild();
    }
    @PostMapping("/collect/delBKBuild")
    public ResponseEntity<?> delBKBuild(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKBuild(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKFood")
    public String collectBKFood(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKFood(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKFood")
    public String[] getBKFood() {
        return stockCollectService.getBKFood();
    }
    @PostMapping("/collect/delBKFood")
    public ResponseEntity<?> delBKFood(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKFood(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }



    @PostMapping("/stock/collectBKMedicine")
    public String collectBKMedicine(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectBKMedicine(tsCode);
        return "";
    }
    @GetMapping("/stock/info/BKMedicine")
    public String[] getBKMedicine() {
        return stockCollectService.getBKMedicine();
    }
    @PostMapping("/collect/delBKMedicine")
    public ResponseEntity<?> delBKMediciness(@RequestBody StockCollect stockCollect) {
        stockCollectService.delBKMedicine(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }






    @PostMapping("/stock/collectPctMore")
    public String collectPctMore(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectPctMore(tsCode);
        String res = stockCollectService.getIsFavorite(tsCode);
        return res;
    }
    @PostMapping("/stock/collectPctOne")
    public String collectPctOne(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectPctOne(tsCode);

        return "";
    }
    @PostMapping("/stock/collectDaliang")
    public String collectDaliang(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectDaliang(tsCode);

        return "";
    }

    @PostMapping("/stock/collectQiaoqiao")
    public String collectQiaoqiao(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectQiaoqiao(tsCode);

        return "";
    }

    @PostMapping("/stock/collectSt")
    public String collectSt(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectST(tsCode);

        return "";
    }


    @PostMapping("/stock/collectWaitback")
    public String collectWaitback(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectWaitback(tsCode);

        return "";
    }


    @PostMapping("/stock/collectShape")
    public String collectShape(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectShape(tsCode);

        return "";
    }


    @GetMapping("/stock/info/daliang")
    public String[] getStockNids() {
        return stockCollectService.getDaliang();
    }

    @GetMapping("/stock/info/pctone")
    public String[] getPctOne() {
        return stockCollectService.getPctOne();
    }

    @GetMapping("/stock/info/pctmore")
    public String[] getPctMore() {
        return stockCollectService.getPctMore();
    }

    @GetMapping("/stock/info/st")
    public String[] getST() {
        return stockCollectService.getST();
    }

    @GetMapping("/stock/info/qiaoqiao")
    public String[] getQiaoqiao() {
        return stockCollectService.getQiaoqiao();
    }

    @GetMapping("/stock/info/waitback")
    public String[] getWaitback() {
        return stockCollectService.getWaitback();
    }


    @GetMapping("/stock/info/shape")
    public String[] getShape() {
        return stockCollectService.getShape();
    }

    @PostMapping("/collect/delPctOne")
    public ResponseEntity<?> delPctone(@RequestBody StockCollect stockCollect) {
        stockCollectService.delPctOne(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/delPctMore")
    public ResponseEntity<?> delpctone(@RequestBody StockCollect stockCollect) {
        stockCollectService.delPctMore(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/deldaliang")
    public ResponseEntity<?> deldaliang(@RequestBody StockCollect stockCollect) {
        stockCollectService.deleteCollectDaliang(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/delst")
    public ResponseEntity<?> delst(@RequestBody StockCollect stockCollect) {
        stockCollectService.deleteCollectST(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/delQiaoqiao")
    public ResponseEntity<?> delqiaoqiao(@RequestBody StockCollect stockCollect) {
        stockCollectService.deleteCollectQiaoqiao(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/delWaitback")
    public ResponseEntity<?> delWaitback(@RequestBody StockCollect stockCollect) {
        stockCollectService.delWaitback(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/delShape")
    public ResponseEntity<?> delShape(@RequestBody StockCollect stockCollect) {
        stockCollectService.delShape(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }





    /**
     * 通用下载请求
     * 
     * @param fileName 文件名称
     * @param delete 是否删除
     */
    @GetMapping("/download")
    public void fileDownload(String fileName, Boolean delete, HttpServletResponse response, HttpServletRequest request)
    {
        try
        {
            if (!FileUtils.checkAllowDownload(fileName))
            {
                throw new Exception(StringUtils.format("文件名称({})非法，不允许下载。 ", fileName));
            }
            String realFileName = System.currentTimeMillis() + fileName.substring(fileName.indexOf("_") + 1);
            String filePath = RuoYiConfig.getDownloadPath() + fileName;

            response.setContentType(MediaType.APPLICATION_OCTET_STREAM_VALUE);
            FileUtils.setAttachmentResponseHeader(response, realFileName);
            FileUtils.writeBytes(filePath, response.getOutputStream());
            if (delete)
            {
                FileUtils.deleteFile(filePath);
            }
        }
        catch (Exception e)
        {
            log.error("下载文件失败", e);
        }
    }

    /**
     * 通用上传请求（单个）
     */
    @PostMapping("/upload")
    public AjaxResult uploadFile(MultipartFile file) throws Exception
    {
        try
        {
            // 上传文件路径
            String filePath = RuoYiConfig.getUploadPath();
            // 上传并返回新文件名称
            String fileName = FileUploadUtils.upload(filePath, file);
            String url = serverConfig.getUrl() + fileName;
            AjaxResult ajax = AjaxResult.success();
            ajax.put("url", url);
            ajax.put("fileName", fileName);
            ajax.put("newFileName", FileUtils.getName(fileName));
            ajax.put("originalFilename", file.getOriginalFilename());
            return ajax;
        }
        catch (Exception e)
        {
            return AjaxResult.error(e.getMessage());
        }
    }

    /**
     * 通用上传请求（多个）
     */
    @PostMapping("/uploads")
    public AjaxResult uploadFiles(List<MultipartFile> files) throws Exception
    {
        try
        {
            // 上传文件路径
            String filePath = RuoYiConfig.getUploadPath();
            List<String> urls = new ArrayList<String>();
            List<String> fileNames = new ArrayList<String>();
            List<String> newFileNames = new ArrayList<String>();
            List<String> originalFilenames = new ArrayList<String>();
            for (MultipartFile file : files)
            {
                // 上传并返回新文件名称
                String fileName = FileUploadUtils.upload(filePath, file);
                String url = serverConfig.getUrl() + fileName;
                urls.add(url);
                fileNames.add(fileName);
                newFileNames.add(FileUtils.getName(fileName));
                originalFilenames.add(file.getOriginalFilename());
            }
            AjaxResult ajax = AjaxResult.success();
            ajax.put("urls", StringUtils.join(urls, FILE_DELIMETER));
            ajax.put("fileNames", StringUtils.join(fileNames, FILE_DELIMETER));
            ajax.put("newFileNames", StringUtils.join(newFileNames, FILE_DELIMETER));
            ajax.put("originalFilenames", StringUtils.join(originalFilenames, FILE_DELIMETER));
            return ajax;
        }
        catch (Exception e)
        {
            return AjaxResult.error(e.getMessage());
        }
    }

    /**
     * 本地资源通用下载
     */
    @GetMapping("/download/resource")
    public void resourceDownload(String resource, HttpServletRequest request, HttpServletResponse response)
            throws Exception
    {
        try
        {
            if (!FileUtils.checkAllowDownload(resource))
            {
                throw new Exception(StringUtils.format("资源文件({})非法，不允许下载。 ", resource));
            }
            // 本地资源路径
            String localPath = RuoYiConfig.getProfile();
            // 数据库资源地址
            String downloadPath = localPath + StringUtils.substringAfter(resource, Constants.RESOURCE_PREFIX);
            // 下载名称
            String downloadName = StringUtils.substringAfterLast(downloadPath, "/");
            response.setContentType(MediaType.APPLICATION_OCTET_STREAM_VALUE);
            FileUtils.setAttachmentResponseHeader(response, downloadName);
            FileUtils.writeBytes(downloadPath, response.getOutputStream());
        }
        catch (Exception e)
        {
            log.error("下载文件失败", e);
        }
    }


    @PostMapping("/collect/bkTop1")
    public String top(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.bkTop(tsCode);
        return "";
    }
    @PostMapping("/collect/bkBottom1")
    public String bottom(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.bkBottom(tsCode);
        return "";
    }

    @PostMapping("/collect/bkTopst")
    public String topst(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.bkTopst(tsCode);
        return "";
    }
    @PostMapping("/collect/bkBottomst")
    public String bottomst(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.bkBottomst(tsCode);
        return "";
    }

    @PostMapping("/collect/bkTop")
    public ResponseEntity<?> moveItemTop(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemTop(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkBottom")
    public ResponseEntity<?> moveItemBottom(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemBottom(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("stock/moveUp")
    public ResponseEntity<?> moveItemUp(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemUp(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkTopwaitback")
    public ResponseEntity<?> moveItemTopwaitback(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemTopwaitback(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkBottomwaitback")
    public ResponseEntity<?> moveItemBottomwaitback(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemBottomwaitback(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("stock/moveUpwaitback")
    public ResponseEntity<?> moveItemUpwaitback(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemUpwaitback(ts_code);
        return ResponseEntity.ok().build();
    }


    @PostMapping("/collect/bkTopym")
    public ResponseEntity<?> moveItemTopym(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemTopym(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkBottomym")
    public ResponseEntity<?> moveItemBottomym(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemBottomym(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("stock/moveUpym")
    public ResponseEntity<?> moveItemUpym(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemUpym(ts_code);
        return ResponseEntity.ok().build();
    }


    @PostMapping("/collect/bkTopzhuizong")
    public ResponseEntity<?> moveItemTopzhuizong(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemTopzhuizong(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkBottomzhuizong")
    public ResponseEntity<?> moveItemBottomzhuizong(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemBottomzhuizong(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("stock/moveUpzhuizong")
    public ResponseEntity<?> moveItemUpzhuizong(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemUpzhuizong(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectZhuizong")
    public String collectZhuizong(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectZhuizong(tsCode);
        return "";
    }
    @GetMapping("/stock/info/Zhuizong")
    public String[] getZhuizong() {
        return stockCollectService.getZhuizong();
    }

    @GetMapping("/stock/info/zanbuZhuizong")
    public String[] zanbuZhuizong() {
        return stockCollectService.zanbuZhuizong();
    }


    @PostMapping("/stock/delZhuizong")
    public ResponseEntity<?> delZhuizong(@RequestBody StockCollect stockCollect) {
        stockCollectService.delZhuizong(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/goonZhuizong")
    public ResponseEntity<?> goonZhuizong(@RequestBody StockCollect stockCollect) {
        stockCollectService.goonZhuizong(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }




    @PostMapping("/collect/bkToprengongzhineng")
    public ResponseEntity<?> moveItemToprengongzhineng(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemToprengongzhineng(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkBottomrengongzhineng")
    public ResponseEntity<?> moveItemBottomrengongzhineng(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemBottomrengongzhineng(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("stock/moveUprengongzhineng")
    public ResponseEntity<?> moveItemUprengongzhineng(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemUprengongzhineng(ts_code);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/stock/info/rengongzhineng")
    public String[] getrengongzhineng() {
        return stockCollectService.getrengongzhineng();
    }

    @PostMapping("/stock/collectrengongzhineng")
    public String collectrengongzhineng(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectrengongzhineng(tsCode);

        return "";
    }


    @PostMapping("/collect/bkTopwuyeguanli")
    public ResponseEntity<?> moveItemTopwuyeguanli(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemTopwuyeguanli(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkBottomwuyeguanli")
    public ResponseEntity<?> moveItemBottomwuyeguanli(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemBottomwuyeguanli(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("stock/moveUpwuyeguanli")
    public ResponseEntity<?> moveItemUpwuyeguanli(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemUpwuyeguanli(ts_code);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/stock/info/wuyeguanli")
    public String[] getwuyeguanli() {
        return stockCollectService.getwuyeguanli();
    }

    @PostMapping("/stock/collectwuyeguanli")
    public String collectwuyeguanli(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectwuyeguanli(tsCode);

        return "";
    }


    @PostMapping("/collect/bkTopxiangcunzhenxing")
    public ResponseEntity<?> moveItemTopxiangcunzhenxing(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemTopxiangcunzhenxing(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkBottomxiangcunzhenxing")
    public ResponseEntity<?> moveItemBottomxiangcunzhenxing(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemBottomxiangcunzhenxing(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("stock/moveUpxiangcunzhenxing")
    public ResponseEntity<?> moveItemUpxiangcunzhenxing(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemUpxiangcunzhenxing(ts_code);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/stock/info/xiangcunzhenxing")
    public String[] getxiangcunzhenxing() {
        return stockCollectService.getxiangcunzhenxing();
    }

    @PostMapping("/stock/collectxiangcunzhenxing")
    public String collectxiangcunzhenxing(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectxiangcunzhenxing(tsCode);

        return "";
    }


    @PostMapping("/collect/bkTopgnyiyaodianshanall")
    public ResponseEntity<?> moveItemTopgnyiyaodianshanall(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemTopgnyiyaodianshanall(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkBottomgnyiyaodianshanall")
    public ResponseEntity<?> moveItemBottomgnyiyaodianshanall(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemBottomgnyiyaodianshanall(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("stock/moveUpgnyiyaodianshanall")
    public ResponseEntity<?> moveItemUpgnyiyaodianshanall(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemUpgnyiyaodianshanall(ts_code);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/stock/info/gnyiyaodianshanall")
    public String[] getgnyiyaodianshanall() {
        return stockCollectService.getgnyiyaodianshanall();
    }

    @PostMapping("/stock/collectgnyiyaodianshanall")
    public String collectgnyiyaodianshanall(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectgnyiyaodianshanall(tsCode);

        return "";
    }


    @PostMapping("/collect/bkTopgnliuganall")
    public ResponseEntity<?> moveItemTopgnliuganall(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemTopgnliuganall(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkBottomgnliuganall")
    public ResponseEntity<?> moveItemBottomgnliuganall(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemBottomgnliuganall(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("stock/moveUpgnliuganall")
    public ResponseEntity<?> moveItemUpgnliuganall(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemUpgnliuganall(ts_code);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/stock/info/gnliuganall")
    public String[] getgnliuganall() {
        return stockCollectService.getgnliuganall();
    }

    @PostMapping("/stock/collectgnliuganall")
    public String collectgnliuganall(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectgnliuganall(tsCode);

        return "";
    }


    @PostMapping("/collect/bkTopgnchuantouall")
    public ResponseEntity<?> moveItemTopgnchuantouall(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemTopgnchuantouall(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkBottomgnchuantouall")
    public ResponseEntity<?> moveItemBottomgnchuantouall(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemBottomgnchuantouall(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("stock/moveUpgnchuantouall")
    public ResponseEntity<?> moveItemUpgnchuantouall(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemUpgnchuantouall(ts_code);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/stock/info/gnchuantouall")
    public String[] getgnchuantouall() {
        return stockCollectService.getgnchuantouall();
    }

    @PostMapping("/stock/collectgnchuantouall")
    public String collectgnchuantouall(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectgnchuantouall(tsCode);

        return "";
    }


    @PostMapping("/collect/bkTopgntudiliuzhuang")
    public ResponseEntity<?> moveItemTopgntudiliuzhuang(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemTopgntudiliuzhuang(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkBottomgntudiliuzhuang")
    public ResponseEntity<?> moveItemBottomgntudiliuzhuang(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemBottomgntudiliuzhuang(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("stock/moveUpgntudiliuzhuang")
    public ResponseEntity<?> moveItemUpgntudiliuzhuang(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemUpgntudiliuzhuang(ts_code);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/stock/info/gntudiliuzhuang")
    public String[] getgntudiliuzhuang() {
        return stockCollectService.getgntudiliuzhuang();
    }

    @PostMapping("/stock/collectgntudiliuzhuang")
    public String collectgntudiliuzhuang(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectgntudiliuzhuang(tsCode);

        return "";
    }



    @PostMapping("/collect/bkTopgnjiyincexuall")
    public ResponseEntity<?> moveItemTopgnjiyincexuall(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemTopgnjiyincexuall(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkBottomgnjiyincexuall")
    public ResponseEntity<?> moveItemBottomgnjiyincexuall(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemBottomgnjiyincexuall(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("stock/moveUpgnjiyincexuall")
    public ResponseEntity<?> moveItemUpgnjiyincexuall(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemUpgnjiyincexuall(ts_code);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/stock/info/gnjiyincexuall")
    public String[] getgnjiyincexuall() {
        return stockCollectService.getgnjiyincexuall();
    }

    @PostMapping("/stock/collectgnjiyincexuall")
    public String collectgnjiyincexuall(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectgnjiyincexuall(tsCode);

        return "";
    }


    @PostMapping("/collect/bkTopgnlenglianwuliuall")
    public ResponseEntity<?> moveItemTopgnlenglianwuliuall(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemTopgnlenglianwuliuall(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkBottomgnlenglianwuliuall")
    public ResponseEntity<?> moveItemBottomgnlenglianwuliuall(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemBottomgnlenglianwuliuall(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("stock/moveUpgnlenglianwuliuall")
    public ResponseEntity<?> moveItemUpgnlenglianwuliuall(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemUpgnlenglianwuliuall(ts_code);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/stock/info/gnlenglianwuliuall")
    public String[] getgnlenglianwuliuall() {
        return stockCollectService.getgnlenglianwuliuall();
    }

    @PostMapping("/stock/collectgnlenglianwuliuall")
    public String collectgnlenglianwuliuall(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectgnlenglianwuliuall(tsCode);

        return "";
    }

    @PostMapping("/collect/bkTopgnyanglaoall")
    public ResponseEntity<?> moveItemTopgnyanglaoall(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemTopgnyanglaoall(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkBottomgnyanglaoall")
    public ResponseEntity<?> moveItemBottomgnyanglaoall(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemBottomgnyanglaoall(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("stock/moveUpgnyanglaoall")
    public ResponseEntity<?> moveItemUpgnyanglaoall(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemUpgnyanglaoall(ts_code);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/stock/info/gnyanglaoall")
    public String[] getgnyanglaoall() {
        return stockCollectService.getgnyanglaoall();
    }

    @PostMapping("/stock/collectgnyanglaoall")
    public String collectgnyanglaoall(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectgnyanglaoall(tsCode);

        return "";
    }



    @PostMapping("/collect/bkTopgnyangjiall")
    public ResponseEntity<?> moveItemTopgnyangjiall(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemTopgnyangjiall(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkBottomgnyangjiall")
    public ResponseEntity<?> moveItemBottomgnyangjiall(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemBottomgnyangjiall(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("stock/moveUpgnyangjiall")
    public ResponseEntity<?> moveItemUpgnyangjiall(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemUpgnyangjiall(ts_code);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/stock/info/gnyangjiall")
    public String[] getgnyangjiall() {
        return stockCollectService.getgnyangjiall();
    }

    @PostMapping("/stock/collectgnyangjiall")
    public String collectgnyangjiall(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectgnyangjiall(tsCode);

        return "";
    }



    @PostMapping("/collect/bkTopgnyankeyiliao")
    public ResponseEntity<?> moveItemTopgnyankeyiliao(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemTopgnyankeyiliao(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkBottomgnyankeyiliao")
    public ResponseEntity<?> moveItemBottomgnyankeyiliao(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemBottomgnyankeyiliao(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("stock/moveUpgnyankeyiliao")
    public ResponseEntity<?> moveItemUpgnyankeyiliao(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemUpgnyankeyiliao(ts_code);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/stock/info/gnyankeyiliao")
    public String[] getgnyankeyiliao() {
        return stockCollectService.getgnyankeyiliao();
    }

    @PostMapping("/stock/collectgnyankeyiliao")
    public String collectgnyankeyiliao(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectgnyankeyiliao(tsCode);

        return "";
    }


    @PostMapping("/collect/bkTopgnyehulitiall")
    public ResponseEntity<?> moveItemTopgnyehulitiall(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemTopgnyehulitiall(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkBottomgnyehulitiall")
    public ResponseEntity<?> moveItemBottomgnyehulitiall(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemBottomgnyehulitiall(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("stock/moveUpgnyehulitiall")
    public ResponseEntity<?> moveItemUpgnyehulitiall(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemUpgnyehulitiall(ts_code);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/stock/info/gnyehulitiall")
    public String[] getgnyehulitiall() {
        return stockCollectService.getgnyehulitiall();
    }

    @PostMapping("/stock/collectgnyehulitiall")
    public String collectgnyehulitiall(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectgnyehulitiall(tsCode);

        return "";
    }


    @PostMapping("/collect/bkTopgnyancaoall")
    public ResponseEntity<?> moveItemTopgnyancaoall(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemTopgnyancaoall(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkBottomgnyancaoall")
    public ResponseEntity<?> moveItemBottomgnyancaoall(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemBottomgnyancaoall(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("stock/moveUpgnyancaoall")
    public ResponseEntity<?> moveItemUpgnyancaoall(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemUpgnyancaoall(ts_code);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/stock/info/gnyancaoall")
    public String[] getgnyancaoall() {
        return stockCollectService.getgnyancaoall();
    }

    @PostMapping("/stock/collectgnyancaoall")
    public String collectgnyancaoall(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectgnyancaoall(tsCode);

        return "";
    }


    @PostMapping("/collect/bkTopgnyakeyiliaoall")
    public ResponseEntity<?> moveItemTopgnyakeyiliaoall(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemTopgnyakeyiliaoall(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkBottomgnyakeyiliaoall")
    public ResponseEntity<?> moveItemBottomgnyakeyiliaoall(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemBottomgnyakeyiliaoall(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("stock/moveUpgnyakeyiliaoall")
    public ResponseEntity<?> moveItemUpgnyakeyiliaoall(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemUpgnyakeyiliaoall(ts_code);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/stock/info/gnyakeyiliaoall")
    public String[] getgnyakeyiliaoall() {
        return stockCollectService.getgnyakeyiliaoall();
    }

    @PostMapping("/stock/collectgnyakeyiliaoall")
    public String collectgnyakeyiliaoall(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectgnyakeyiliaoall(tsCode);

        return "";
    }


    @PostMapping("/collect/bkTopgnzhinengyiliaoall")
    public ResponseEntity<?> moveItemTopgnzhinengyiliaoall(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemTopgnzhinengyiliaoall(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkBottomgnzhinengyiliaoall")
    public ResponseEntity<?> moveItemBottomgnzhinengyiliaoall(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemBottomgnzhinengyiliaoall(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("stock/moveUpgnzhinengyiliaoall")
    public ResponseEntity<?> moveItemUpgnzhinengyiliaoall(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemUpgnzhinengyiliaoall(ts_code);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/stock/info/gnzhinengyiliaoall")
    public String[] getgnzhinengyiliaoall() {
        return stockCollectService.getgnzhinengyiliaoall();
    }

    @PostMapping("/stock/collectgnzhinengyiliaoall")
    public String collectgnzhinengyiliaoall(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectgnzhinengyiliaoall(tsCode);

        return "";
    }


    @PostMapping("/collect/bkTopgnchongzudanbaiall")
    public ResponseEntity<?> moveItemTopgnchongzudanbaiall(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemTopgnchongzudanbaiall(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkBottomgnchongzudanbaiall")
    public ResponseEntity<?> moveItemBottomgnchongzudanbaiall(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemBottomgnchongzudanbaiall(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("stock/moveUpgnchongzudanbaiall")
    public ResponseEntity<?> moveItemUpgnchongzudanbaiall(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemUpgnchongzudanbaiall(ts_code);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/stock/info/gnchongzudanbaiall")
    public String[] getgnchongzudanbaiall() {
        return stockCollectService.getgnchongzudanbaiall();
    }

    @PostMapping("/stock/collectgnchongzudanbaiall")
    public String collectgnchongzudanbaiall(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectgnchongzudanbaiall(tsCode);

        return "";
    }


    @PostMapping("/collect/bkTopgnzaixianjiaoyuall")
    public ResponseEntity<?> moveItemTopgnzaixianjiaoyuall(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemTopgnzaixianjiaoyuall(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkBottomgnzaixianjiaoyuall")
    public ResponseEntity<?> moveItemBottomgnzaixianjiaoyuall(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemBottomgnzaixianjiaoyuall(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("stock/moveUpgnzaixianjiaoyuall")
    public ResponseEntity<?> moveItemUpgnzaixianjiaoyuall(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemUpgnzaixianjiaoyuall(ts_code);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/stock/info/gnzaixianjiaoyuall")
    public String[] getgnzaixianjiaoyuall() {
        return stockCollectService.getgnzaixianjiaoyuall();
    }

    @PostMapping("/stock/collectgnzaixianjiaoyuall")
    public String collectgnzaixianjiaoyuall(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectgnzaixianjiaoyuall(tsCode);

        return "";
    }

    @PostMapping("/collect/bkTopgnzhiyejiaoyuall")
    public ResponseEntity<?> moveItemTopgnzhiyejiaoyuall(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemTopgnzhiyejiaoyuall(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkBottomgnzhiyejiaoyuall")
    public ResponseEntity<?> moveItemBottomgnzhiyejiaoyuall(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemBottomgnzhiyejiaoyuall(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("stock/moveUpgnzhiyejiaoyuall")
    public ResponseEntity<?> moveItemUpgnzhiyejiaoyuall(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemUpgnzhiyejiaoyuall(ts_code);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/stock/info/gnzhiyejiaoyuall")
    public String[] getgnzhiyejiaoyuall() {
        return stockCollectService.getgnzhiyejiaoyuall();
    }

    @PostMapping("/stock/collectgnzhiyejiaoyuall")
    public String collectgnzhiyejiaoyuall(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectgnzhiyejiaoyuall(tsCode);

        return "";
    }



    @PostMapping("/collect/bkTopgnxiaomigainianall")
    public ResponseEntity<?> moveItemTopgnxiaomigainianall(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemTopgnxiaomigainianall(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkBottomgnxiaomigainianall")
    public ResponseEntity<?> moveItemBottomgnxiaomigainianall(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemBottomgnxiaomigainianall(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("stock/moveUpgnxiaomigainianall")
    public ResponseEntity<?> moveItemUpgnxiaomigainianall(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemUpgnxiaomigainianall(ts_code);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/stock/info/gnxiaomigainianall")
    public String[] getgnxiaomigainianall() {
        return stockCollectService.getgnxiaomigainianall();
    }

    @PostMapping("/stock/collectgnxiaomigainianall")
    public String collectgnxiaomigainianall(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectgnxiaomigainianall(tsCode);

        return "";
    }



    @PostMapping("/collect/bkTopgnxiaodujiall")
    public ResponseEntity<?> moveItemTopgnxiaodujiall(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemTopgnxiaodujiall(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkBottomgnxiaodujiall")
    public ResponseEntity<?> moveItemBottomgnxiaodujiall(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemBottomgnxiaodujiall(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("stock/moveUpgnxiaodujiall")
    public ResponseEntity<?> moveItemUpgnxiaodujiall(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemUpgnxiaodujiall(ts_code);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/stock/info/gnxiaodujiall")
    public String[] getgnxiaodujiall() {
        return stockCollectService.getgnxiaodujiall();
    }

    @PostMapping("/stock/collectgnxiaodujiall")
    public String collectgnxiaodujiall(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectgnxiaodujiall(tsCode);

        return "";
    }


    @PostMapping("/collect/bkTopgnweishengsuall")
    public ResponseEntity<?> moveItemTopgnweishengsuall(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemTopgnweishengsuall(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkBottomgnweishengsuall")
    public ResponseEntity<?> moveItemBottomgnweishengsuall(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemBottomgnweishengsuall(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("stock/moveUpgnweishengsuall")
    public ResponseEntity<?> moveItemUpgnweishengsuall(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemUpgnweishengsuall(ts_code);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/stock/info/gnweishengsuall")
    public String[] getgnweishengsuall() {
        return stockCollectService.getgnweishengsuall();
    }

    @PostMapping("/stock/collectgnweishengsuall")
    public String collectgnweishengsuall(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectgnweishengsuall(tsCode);

        return "";
    }


    @PostMapping("/collect/bkTopZhuizongnlyx")
    public ResponseEntity<?> moveItemTopZhuizongnlyx(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemTopZhuizongnlyx(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkBottomZhuizongnlyx")
    public ResponseEntity<?> moveItemBottomZhuizongnlyx(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemBottomZhuizongnlyx(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("stock/moveUpZhuizongnlyx")
    public ResponseEntity<?> moveItemUpZhuizongnlyx(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemUpZhuizongnlyx(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectZhuizongnlyx")
    public String collectZhuizongnlyx(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectZhuizongnlyx(tsCode);
        return "";
    }
    @GetMapping("/stock/info/Zhuizongnlyx")
    public String[] getZhuizongnlyx() {
        return stockCollectService.getZhuizongnlyx();
    }

    @GetMapping("/stock/info/zanbuZhuizongnlyx")
    public String[] zanbuZhuizongnlyx() {
        return stockCollectService.zanbuZhuizongnlyx();
    }


    @PostMapping("/stock/delZhuizongnlyx")
    public ResponseEntity<?> delZhuizongnlyx(@RequestBody StockCollect stockCollect) {
        stockCollectService.delZhuizongnlyx(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/goonZhuizongnlyx")
    public ResponseEntity<?> goonZhuizongnlyx(@RequestBody StockCollect stockCollect) {
        stockCollectService.goonZhuizongnlyx(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }









    @PostMapping("/collect/bkTopZhuizongny")
    public ResponseEntity<?> moveItemTopZhuizongny(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemTopZhuizongny(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkBottomZhuizongny")
    public ResponseEntity<?> moveItemBottomZhuizongny(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemBottomZhuizongny(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("stock/moveUpZhuizongny")
    public ResponseEntity<?> moveItemUpZhuizongny(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemUpZhuizongny(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectZhuizongny")
    public String collectZhuizongny(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectZhuizongny(tsCode);
        return "";
    }
    @GetMapping("/stock/info/Zhuizongny")
    public String[] getZhuizongny() {
        return stockCollectService.getZhuizongny();
    }

    @GetMapping("/stock/info/zanbuZhuizongny")
    public String[] zanbuZhuizongny() {
        return stockCollectService.zanbuZhuizongny();
    }


    @PostMapping("/stock/delZhuizongny")
    public ResponseEntity<?> delZhuizongny(@RequestBody StockCollect stockCollect) {
        stockCollectService.delZhuizongny(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/goonZhuizongny")
    public ResponseEntity<?> goonZhuizongny(@RequestBody StockCollect stockCollect) {
        stockCollectService.goonZhuizongny(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }




    @PostMapping("/collect/bkTopZhuizongjtys")
    public ResponseEntity<?> moveItemTopZhuizongjtys(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemTopZhuizongjtys(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkBottomZhuizongjtys")
    public ResponseEntity<?> moveItemBottomZhuizongjtys(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemBottomZhuizongjtys(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("stock/moveUpZhuizongjtys")
    public ResponseEntity<?> moveItemUpZhuizongjtys(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemUpZhuizongjtys(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectZhuizongjtys")
    public String collectZhuizongjtys(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectZhuizongjtys(tsCode);
        return "";
    }
    @GetMapping("/stock/info/Zhuizongjtys")
    public String[] getZhuizongjtys() {
        return stockCollectService.getZhuizongjtys();
    }

    @GetMapping("/stock/info/zanbuZhuizongjtys")
    public String[] zanbuZhuizongjtys() {
        return stockCollectService.zanbuZhuizongjtys();
    }


    @PostMapping("/stock/delZhuizongjtys")
    public ResponseEntity<?> delZhuizongjtys(@RequestBody StockCollect stockCollect) {
        stockCollectService.delZhuizongjtys(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/goonZhuizongjtys")
    public ResponseEntity<?> goonZhuizongjtys(@RequestBody StockCollect stockCollect) {
        stockCollectService.goonZhuizongjtys(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }









    @PostMapping("/collect/bkTopZhuizongqiche")
    public ResponseEntity<?> moveItemTopZhuizongqiche(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemTopZhuizongqiche(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkBottomZhuizongqiche")
    public ResponseEntity<?> moveItemBottomZhuizongqiche(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemBottomZhuizongqiche(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("stock/moveUpZhuizongqiche")
    public ResponseEntity<?> moveItemUpZhuizongqiche(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemUpZhuizongqiche(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectZhuizongqiche")
    public String collectZhuizongqiche(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectZhuizongqiche(tsCode);
        return "";
    }
    @GetMapping("/stock/info/Zhuizongqiche")
    public String[] getZhuizongqiche() {
        return stockCollectService.getZhuizongqiche();
    }

    @GetMapping("/stock/info/zanbuZhuizongqiche")
    public String[] zanbuZhuizongqiche() {
        return stockCollectService.zanbuZhuizongqiche();
    }


    @PostMapping("/stock/delZhuizongqiche")
    public ResponseEntity<?> delZhuizongqiche(@RequestBody StockCollect stockCollect) {
        stockCollectService.delZhuizongqiche(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/goonZhuizongqiche")
    public ResponseEntity<?> goonZhuizongqiche(@RequestBody StockCollect stockCollect) {
        stockCollectService.goonZhuizongqiche(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }







    @PostMapping("/collect/bkTopZhuizonggt")
    public ResponseEntity<?> moveItemTopZhuizonggt(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemTopZhuizonggt(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkBottomZhuizonggt")
    public ResponseEntity<?> moveItemBottomZhuizonggt(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemBottomZhuizonggt(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("stock/moveUpZhuizonggt")
    public ResponseEntity<?> moveItemUpZhuizonggt(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemUpZhuizonggt(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectZhuizonggt")
    public String collectZhuizonggt(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectZhuizonggt(tsCode);
        return "";
    }
    @GetMapping("/stock/info/Zhuizonggt")
    public String[] getZhuizonggt() {
        return stockCollectService.getZhuizonggt();
    }

    @GetMapping("/stock/info/zanbuZhuizonggt")
    public String[] zanbuZhuizonggt() {
        return stockCollectService.zanbuZhuizonggt();
    }


    @PostMapping("/stock/delZhuizonggt")
    public ResponseEntity<?> delZhuizonggt(@RequestBody StockCollect stockCollect) {
        stockCollectService.delZhuizonggt(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/goonZhuizonggt")
    public ResponseEntity<?> goonZhuizonggt(@RequestBody StockCollect stockCollect) {
        stockCollectService.goonZhuizonggt(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }







    @PostMapping("/collect/bkTopZhuizongjinshu")
    public ResponseEntity<?> moveItemTopZhuizongjinshu(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemTopZhuizongjinshu(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkBottomZhuizongjinshu")
    public ResponseEntity<?> moveItemBottomZhuizongjinshu(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemBottomZhuizongjinshu(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("stock/moveUpZhuizongjinshu")
    public ResponseEntity<?> moveItemUpZhuizongjinshu(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemUpZhuizongjinshu(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectZhuizongjinshu")
    public String collectZhuizongjinshu(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectZhuizongjinshu(tsCode);
        return "";
    }
    @GetMapping("/stock/info/Zhuizongjinshu")
    public String[] getZhuizongjinshu() {
        return stockCollectService.getZhuizongjinshu();
    }

    @GetMapping("/stock/info/zanbuZhuizongjinshu")
    public String[] zanbuZhuizongjinshu() {
        return stockCollectService.zanbuZhuizongjinshu();
    }


    @PostMapping("/stock/delZhuizongjinshu")
    public ResponseEntity<?> delZhuizongjinshu(@RequestBody StockCollect stockCollect) {
        stockCollectService.delZhuizongjinshu(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/goonZhuizongjinshu")
    public ResponseEntity<?> goonZhuizongjinshu(@RequestBody StockCollect stockCollect) {
        stockCollectService.goonZhuizongjinshu(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }






    @PostMapping("/collect/bkTopZhuizonghuaxuezhiping")
    public ResponseEntity<?> moveItemTopZhuizonghuaxuezhiping(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemTopZhuizonghuaxuezhiping(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkBottomZhuizonghuaxuezhiping")
    public ResponseEntity<?> moveItemBottomZhuizonghuaxuezhiping(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemBottomZhuizonghuaxuezhiping(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("stock/moveUpZhuizonghuaxuezhiping")
    public ResponseEntity<?> moveItemUpZhuizonghuaxuezhiping(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemUpZhuizonghuaxuezhiping(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectZhuizonghuaxuezhiping")
    public String collectZhuizonghuaxuezhiping(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectZhuizonghuaxuezhiping(tsCode);
        return "";
    }
    @GetMapping("/stock/info/Zhuizonghuaxuezhiping")
    public String[] getZhuizonghuaxuezhiping() {
        return stockCollectService.getZhuizonghuaxuezhiping();
    }

    @GetMapping("/stock/info/zanbuZhuizonghuaxuezhiping")
    public String[] zanbuZhuizonghuaxuezhiping() {
        return stockCollectService.zanbuZhuizonghuaxuezhiping();
    }


    @PostMapping("/stock/delZhuizonghuaxuezhiping")
    public ResponseEntity<?> delZhuizonghuaxuezhiping(@RequestBody StockCollect stockCollect) {
        stockCollectService.delZhuizonghuaxuezhiping(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/goonZhuizonghuaxuezhiping")
    public ResponseEntity<?> goonZhuizonghuaxuezhiping(@RequestBody StockCollect stockCollect) {
        stockCollectService.goonZhuizonghuaxuezhiping(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }


    @PostMapping("/collect/bkTopZhuizongtongxing")
    public ResponseEntity<?> moveItemTopZhuizongtongxing(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemTopZhuizongtongxing(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkBottomZhuizongtongxing")
    public ResponseEntity<?> moveItemBottomZhuizongtongxing(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemBottomZhuizongtongxing(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("stock/moveUpZhuizongtongxing")
    public ResponseEntity<?> moveItemUpZhuizongtongxing(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemUpZhuizongtongxing(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectZhuizongtongxing")
    public String collectZhuizongtongxing(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectZhuizongtongxing(tsCode);
        return "";
    }
    @GetMapping("/stock/info/Zhuizongtongxing")
    public String[] getZhuizongtongxing() {
        return stockCollectService.getZhuizongtongxing();
    }

    @GetMapping("/stock/info/zanbuZhuizongtongxing")
    public String[] zanbuZhuizongtongxing() {
        return stockCollectService.zanbuZhuizongtongxing();
    }


    @PostMapping("/stock/delZhuizongtongxing")
    public ResponseEntity<?> delZhuizongtongxing(@RequestBody StockCollect stockCollect) {
        stockCollectService.delZhuizongtongxing(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/goonZhuizongtongxing")
    public ResponseEntity<?> goonZhuizongtongxing(@RequestBody StockCollect stockCollect) {
        stockCollectService.goonZhuizongtongxing(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }







    @PostMapping("/collect/bkTopZhuizongwenhua")
    public ResponseEntity<?> moveItemTopZhuizongwenhua(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemTopZhuizongwenhua(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkBottomZhuizongwenhua")
    public ResponseEntity<?> moveItemBottomZhuizongwenhua(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemBottomZhuizongwenhua(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("stock/moveUpZhuizongwenhua")
    public ResponseEntity<?> moveItemUpZhuizongwenhua(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemUpZhuizongwenhua(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectZhuizongwenhua")
    public String collectZhuizongwenhua(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectZhuizongwenhua(tsCode);
        return "";
    }
    @GetMapping("/stock/info/Zhuizongwenhua")
    public String[] getZhuizongwenhua() {
        return stockCollectService.getZhuizongwenhua();
    }

    @GetMapping("/stock/info/zanbuZhuizongwenhua")
    public String[] zanbuZhuizongwenhua() {
        return stockCollectService.zanbuZhuizongwenhua();
    }


    @PostMapping("/stock/delZhuizongwenhua")
    public ResponseEntity<?> delZhuizongwenhua(@RequestBody StockCollect stockCollect) {
        stockCollectService.delZhuizongwenhua(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/goonZhuizongwenhua")
    public ResponseEntity<?> goonZhuizongwenhua(@RequestBody StockCollect stockCollect) {
        stockCollectService.goonZhuizongwenhua(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }







    @PostMapping("/collect/bkTopZhuizongchuanmei")
    public ResponseEntity<?> moveItemTopZhuizongchuanmei(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemTopZhuizongchuanmei(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkBottomZhuizongchuanmei")
    public ResponseEntity<?> moveItemBottomZhuizongchuanmei(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemBottomZhuizongchuanmei(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("stock/moveUpZhuizongchuanmei")
    public ResponseEntity<?> moveItemUpZhuizongchuanmei(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemUpZhuizongchuanmei(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectZhuizongchuanmei")
    public String collectZhuizongchuanmei(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectZhuizongchuanmei(tsCode);
        return "";
    }
    @GetMapping("/stock/info/Zhuizongchuanmei")
    public String[] getZhuizongchuanmei() {
        return stockCollectService.getZhuizongchuanmei();
    }

    @GetMapping("/stock/info/zanbuZhuizongchuanmei")
    public String[] zanbuZhuizongchuanmei() {
        return stockCollectService.zanbuZhuizongchuanmei();
    }


    @PostMapping("/stock/delZhuizongchuanmei")
    public ResponseEntity<?> delZhuizongchuanmei(@RequestBody StockCollect stockCollect) {
        stockCollectService.delZhuizongchuanmei(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/goonZhuizongchuanmei")
    public ResponseEntity<?> goonZhuizongchuanmei(@RequestBody StockCollect stockCollect) {
        stockCollectService.goonZhuizongchuanmei(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }







    @PostMapping("/collect/bkTopZhuizongjinrong")
    public ResponseEntity<?> moveItemTopZhuizongjinrong(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemTopZhuizongjinrong(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkBottomZhuizongjinrong")
    public ResponseEntity<?> moveItemBottomZhuizongjinrong(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemBottomZhuizongjinrong(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("stock/moveUpZhuizongjinrong")
    public ResponseEntity<?> moveItemUpZhuizongjinrong(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemUpZhuizongjinrong(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectZhuizongjinrong")
    public String collectZhuizongjinrong(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectZhuizongjinrong(tsCode);
        return "";
    }
    @GetMapping("/stock/info/Zhuizongjinrong")
    public String[] getZhuizongjinrong() {
        return stockCollectService.getZhuizongjinrong();
    }

    @GetMapping("/stock/info/zanbuZhuizongjinrong")
    public String[] zanbuZhuizongjinrong() {
        return stockCollectService.zanbuZhuizongjinrong();
    }


    @PostMapping("/stock/delZhuizongjinrong")
    public ResponseEntity<?> delZhuizongjinrong(@RequestBody StockCollect stockCollect) {
        stockCollectService.delZhuizongjinrong(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/goonZhuizongjinrong")
    public ResponseEntity<?> goonZhuizongjinrong(@RequestBody StockCollect stockCollect) {
        stockCollectService.goonZhuizongjinrong(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkTopZhuizongzonghe")
    public ResponseEntity<?> moveItemTopZhuizongzonghe(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemTopZhuizongzonghe(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkBottomZhuizongzonghe")
    public ResponseEntity<?> moveItemBottomZhuizongzonghe(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemBottomZhuizongzonghe(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("stock/moveUpZhuizongzonghe")
    public ResponseEntity<?> moveItemUpZhuizongzonghe(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemUpZhuizongzonghe(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectZhuizongzonghe")
    public String collectZhuizongzonghe(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectZhuizongzonghe(tsCode);
        return "";
    }
    @GetMapping("/stock/info/Zhuizongzonghe")
    public String[] getZhuizongzonghe() {
        return stockCollectService.getZhuizongzonghe();
    }

    @GetMapping("/stock/info/zanbuZhuizongzonghe")
    public String[] zanbuZhuizongzonghe() {
        return stockCollectService.zanbuZhuizongzonghe();
    }


    @PostMapping("/stock/delZhuizongzonghe")
    public ResponseEntity<?> delZhuizongzonghe(@RequestBody StockCollect stockCollect) {
        stockCollectService.delZhuizongzonghe(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/goonZhuizongzonghe")
    public ResponseEntity<?> goonZhuizongzonghe(@RequestBody StockCollect stockCollect) {
        stockCollectService.goonZhuizongzonghe(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }







    @PostMapping("/collect/bkTopZhuizonghuanjin")
    public ResponseEntity<?> moveItemTopZhuizonghuanjin(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemTopZhuizonghuanjin(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkBottomZhuizonghuanjin")
    public ResponseEntity<?> moveItemBottomZhuizonghuanjin(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemBottomZhuizonghuanjin(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("stock/moveUpZhuizonghuanjin")
    public ResponseEntity<?> moveItemUpZhuizonghuanjin(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemUpZhuizonghuanjin(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectZhuizonghuanjin")
    public String collectZhuizonghuanjin(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectZhuizonghuanjin(tsCode);
        return "";
    }
    @GetMapping("/stock/info/Zhuizonghuanjin")
    public String[] getZhuizonghuanjin() {
        return stockCollectService.getZhuizonghuanjin();
    }

    @GetMapping("/stock/info/zanbuZhuizonghuanjin")
    public String[] zanbuZhuizonghuanjin() {
        return stockCollectService.zanbuZhuizonghuanjin();
    }


    @PostMapping("/stock/delZhuizonghuanjin")
    public ResponseEntity<?> delZhuizonghuanjin(@RequestBody StockCollect stockCollect) {
        stockCollectService.delZhuizonghuanjin(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/goonZhuizonghuanjin")
    public ResponseEntity<?> goonZhuizonghuanjin(@RequestBody StockCollect stockCollect) {
        stockCollectService.goonZhuizonghuanjin(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }








    @PostMapping("/collect/bkTopZhuizonggongye")
    public ResponseEntity<?> moveItemTopZhuizonggongye(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemTopZhuizonggongye(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkBottomZhuizonggongye")
    public ResponseEntity<?> moveItemBottomZhuizonggongye(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemBottomZhuizonggongye(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("stock/moveUpZhuizonggongye")
    public ResponseEntity<?> moveItemUpZhuizonggongye(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemUpZhuizonggongye(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectZhuizonggongye")
    public String collectZhuizonggongye(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectZhuizonggongye(tsCode);
        return "";
    }
    @GetMapping("/stock/info/Zhuizonggongye")
    public String[] getZhuizonggongye() {
        return stockCollectService.getZhuizonggongye();
    }

    @GetMapping("/stock/info/zanbuZhuizonggongye")
    public String[] zanbuZhuizonggongye() {
        return stockCollectService.zanbuZhuizonggongye();
    }


    @PostMapping("/stock/delZhuizonggongye")
    public ResponseEntity<?> delZhuizonggongye(@RequestBody StockCollect stockCollect) {
        stockCollectService.delZhuizonggongye(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/goonZhuizonggongye")
    public ResponseEntity<?> goonZhuizonggongye(@RequestBody StockCollect stockCollect) {
        stockCollectService.goonZhuizonggongye(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }






    @PostMapping("/collect/bkTopZhuizongyiyao")
    public ResponseEntity<?> moveItemTopZhuizongyiyao(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemTopZhuizongyiyao(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkBottomZhuizongyiyao")
    public ResponseEntity<?> moveItemBottomZhuizongyiyao(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemBottomZhuizongyiyao(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("stock/moveUpZhuizongyiyao")
    public ResponseEntity<?> moveItemUpZhuizongyiyao(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemUpZhuizongyiyao(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectZhuizongyiyao")
    public String collectZhuizongyiyao(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectZhuizongyiyao(tsCode);
        return "";
    }
    @GetMapping("/stock/info/Zhuizongyiyao")
    public String[] getZhuizongyiyao() {
        return stockCollectService.getZhuizongyiyao();
    }

    @GetMapping("/stock/info/zanbuZhuizongyiyao")
    public String[] zanbuZhuizongyiyao() {
        return stockCollectService.zanbuZhuizongyiyao();
    }


    @PostMapping("/stock/delZhuizongyiyao")
    public ResponseEntity<?> delZhuizongyiyao(@RequestBody StockCollect stockCollect) {
        stockCollectService.delZhuizongyiyao(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/goonZhuizongyiyao")
    public ResponseEntity<?> goonZhuizongyiyao(@RequestBody StockCollect stockCollect) {
        stockCollectService.goonZhuizongyiyao(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }






    @PostMapping("/collect/bkTopZhuizongjungong")
    public ResponseEntity<?> moveItemTopZhuizongjungong(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemTopZhuizongjungong(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkBottomZhuizongjungong")
    public ResponseEntity<?> moveItemBottomZhuizongjungong(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemBottomZhuizongjungong(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("stock/moveUpZhuizongjungong")
    public ResponseEntity<?> moveItemUpZhuizongjungong(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemUpZhuizongjungong(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectZhuizongjungong")
    public String collectZhuizongjungong(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectZhuizongjungong(tsCode);
        return "";
    }
    @GetMapping("/stock/info/Zhuizongjungong")
    public String[] getZhuizongjungong() {
        return stockCollectService.getZhuizongjungong();
    }

    @GetMapping("/stock/info/zanbuZhuizongjungong")
    public String[] zanbuZhuizongjungong() {
        return stockCollectService.zanbuZhuizongjungong();
    }


    @PostMapping("/stock/delZhuizongjungong")
    public ResponseEntity<?> delZhuizongjungong(@RequestBody StockCollect stockCollect) {
        stockCollectService.delZhuizongjungong(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/goonZhuizongjungong")
    public ResponseEntity<?> goonZhuizongjungong(@RequestBody StockCollect stockCollect) {
        stockCollectService.goonZhuizongjungong(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }








    @PostMapping("/collect/bkTopZhuizongdianziguangxue")
    public ResponseEntity<?> moveItemTopZhuizongdianziguangxue(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemTopZhuizongdianziguangxue(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkBottomZhuizongdianziguangxue")
    public ResponseEntity<?> moveItemBottomZhuizongdianziguangxue(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemBottomZhuizongdianziguangxue(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("stock/moveUpZhuizongdianziguangxue")
    public ResponseEntity<?> moveItemUpZhuizongdianziguangxue(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemUpZhuizongdianziguangxue(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectZhuizongdianziguangxue")
    public String collectZhuizongdianziguangxue(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectZhuizongdianziguangxue(tsCode);
        return "";
    }
    @GetMapping("/stock/info/Zhuizongdianziguangxue")
    public String[] getZhuizongdianziguangxue() {
        return stockCollectService.getZhuizongdianziguangxue();
    }

    @GetMapping("/stock/info/zanbuZhuizongdianziguangxue")
    public String[] zanbuZhuizongdianziguangxue() {
        return stockCollectService.zanbuZhuizongdianziguangxue();
    }


    @PostMapping("/stock/delZhuizongdianziguangxue")
    public ResponseEntity<?> delZhuizongdianziguangxue(@RequestBody StockCollect stockCollect) {
        stockCollectService.delZhuizongdianziguangxue(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/goonZhuizongdianziguangxue")
    public ResponseEntity<?> goonZhuizongdianziguangxue(@RequestBody StockCollect stockCollect) {
        stockCollectService.goonZhuizongdianziguangxue(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }







    @PostMapping("/collect/bkTopZhuizongshebei")
    public ResponseEntity<?> moveItemTopZhuizongshebei(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemTopZhuizongshebei(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkBottomZhuizongshebei")
    public ResponseEntity<?> moveItemBottomZhuizongshebei(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemBottomZhuizongshebei(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("stock/moveUpZhuizongshebei")
    public ResponseEntity<?> moveItemUpZhuizongshebei(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemUpZhuizongshebei(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectZhuizongshebei")
    public String collectZhuizongshebei(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectZhuizongshebei(tsCode);
        return "";
    }
    @GetMapping("/stock/info/Zhuizongshebei")
    public String[] getZhuizongshebei() {
        return stockCollectService.getZhuizongshebei();
    }

    @GetMapping("/stock/info/zanbuZhuizongshebei")
    public String[] zanbuZhuizongshebei() {
        return stockCollectService.zanbuZhuizongshebei();
    }


    @PostMapping("/stock/delZhuizongshebei")
    public ResponseEntity<?> delZhuizongshebei(@RequestBody StockCollect stockCollect) {
        stockCollectService.delZhuizongshebei(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/goonZhuizongshebei")
    public ResponseEntity<?> goonZhuizongshebei(@RequestBody StockCollect stockCollect) {
        stockCollectService.goonZhuizongshebei(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }







    @PostMapping("/collect/bkTopZhuizongfangdichang")
    public ResponseEntity<?> moveItemTopZhuizongfangdichang(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemTopZhuizongfangdichang(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkBottomZhuizongfangdichang")
    public ResponseEntity<?> moveItemBottomZhuizongfangdichang(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemBottomZhuizongfangdichang(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("stock/moveUpZhuizongfangdichang")
    public ResponseEntity<?> moveItemUpZhuizongfangdichang(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemUpZhuizongfangdichang(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectZhuizongfangdichang")
    public String collectZhuizongfangdichang(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectZhuizongfangdichang(tsCode);
        return "";
    }
    @GetMapping("/stock/info/Zhuizongfangdichang")
    public String[] getZhuizongfangdichang() {
        return stockCollectService.getZhuizongfangdichang();
    }

    @GetMapping("/stock/info/zanbuZhuizongfangdichang")
    public String[] zanbuZhuizongfangdichang() {
        return stockCollectService.zanbuZhuizongfangdichang();
    }


    @PostMapping("/stock/delZhuizongfangdichang")
    public ResponseEntity<?> delZhuizongfangdichang(@RequestBody StockCollect stockCollect) {
        stockCollectService.delZhuizongfangdichang(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/goonZhuizongfangdichang")
    public ResponseEntity<?> goonZhuizongfangdichang(@RequestBody StockCollect stockCollect) {
        stockCollectService.goonZhuizongfangdichang(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }







    @PostMapping("/collect/bkTopZhuizonghulianwang")
    public ResponseEntity<?> moveItemTopZhuizonghulianwang(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemTopZhuizonghulianwang(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkBottomZhuizonghulianwang")
    public ResponseEntity<?> moveItemBottomZhuizonghulianwang(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemBottomZhuizonghulianwang(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("stock/moveUpZhuizonghulianwang")
    public ResponseEntity<?> moveItemUpZhuizonghulianwang(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemUpZhuizonghulianwang(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectZhuizonghulianwang")
    public String collectZhuizonghulianwang(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectZhuizonghulianwang(tsCode);
        return "";
    }
    @GetMapping("/stock/info/Zhuizonghulianwang")
    public String[] getZhuizonghulianwang() {
        return stockCollectService.getZhuizonghulianwang();
    }

    @GetMapping("/stock/info/zanbuZhuizonghulianwang")
    public String[] zanbuZhuizonghulianwang() {
        return stockCollectService.zanbuZhuizonghulianwang();
    }


    @PostMapping("/stock/delZhuizonghulianwang")
    public ResponseEntity<?> delZhuizonghulianwang(@RequestBody StockCollect stockCollect) {
        stockCollectService.delZhuizonghulianwang(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/goonZhuizonghulianwang")
    public ResponseEntity<?> goonZhuizonghulianwang(@RequestBody StockCollect stockCollect) {
        stockCollectService.goonZhuizonghulianwang(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }







    @PostMapping("/collect/bkTopZhuizongmeironghuli")
    public ResponseEntity<?> moveItemTopZhuizongmeironghuli(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemTopZhuizongmeironghuli(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkBottomZhuizongmeironghuli")
    public ResponseEntity<?> moveItemBottomZhuizongmeironghuli(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemBottomZhuizongmeironghuli(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("stock/moveUpZhuizongmeironghuli")
    public ResponseEntity<?> moveItemUpZhuizongmeironghuli(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemUpZhuizongmeironghuli(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectZhuizongmeironghuli")
    public String collectZhuizongmeironghuli(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectZhuizongmeironghuli(tsCode);
        return "";
    }
    @GetMapping("/stock/info/Zhuizongmeironghuli")
    public String[] getZhuizongmeironghuli() {
        return stockCollectService.getZhuizongmeironghuli();
    }

    @GetMapping("/stock/info/zanbuZhuizongmeironghuli")
    public String[] zanbuZhuizongmeironghuli() {
        return stockCollectService.zanbuZhuizongmeironghuli();
    }


    @PostMapping("/stock/delZhuizongmeironghuli")
    public ResponseEntity<?> delZhuizongmeironghuli(@RequestBody StockCollect stockCollect) {
        stockCollectService.delZhuizongmeironghuli(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/goonZhuizongmeironghuli")
    public ResponseEntity<?> goonZhuizongmeironghuli(@RequestBody StockCollect stockCollect) {
        stockCollectService.goonZhuizongmeironghuli(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }











    @PostMapping("/collect/bkTopZhuizongcanyinyinshi")
    public ResponseEntity<?> moveItemTopZhuizongcanyinyinshi(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemTopZhuizongcanyinyinshi(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkBottomZhuizongcanyinyinshi")
    public ResponseEntity<?> moveItemBottomZhuizongcanyinyinshi(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemBottomZhuizongcanyinyinshi(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("stock/moveUpZhuizongcanyinyinshi")
    public ResponseEntity<?> moveItemUpZhuizongcanyinyinshi(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemUpZhuizongcanyinyinshi(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectZhuizongcanyinyinshi")
    public String collectZhuizongcanyinyinshi(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectZhuizongcanyinyinshi(tsCode);
        return "";
    }
    @GetMapping("/stock/info/Zhuizongcanyinyinshi")
    public String[] getZhuizongcanyinyinshi() {
        return stockCollectService.getZhuizongcanyinyinshi();
    }

    @GetMapping("/stock/info/zanbuZhuizongcanyinyinshi")
    public String[] zanbuZhuizongcanyinyinshi() {
        return stockCollectService.zanbuZhuizongcanyinyinshi();
    }


    @PostMapping("/stock/delZhuizongcanyinyinshi")
    public ResponseEntity<?> delZhuizongcanyinyinshi(@RequestBody StockCollect stockCollect) {
        stockCollectService.delZhuizongcanyinyinshi(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/goonZhuizongcanyinyinshi")
    public ResponseEntity<?> goonZhuizongcanyinyinshi(@RequestBody StockCollect stockCollect) {
        stockCollectService.goonZhuizongcanyinyinshi(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }







    @PostMapping("/collect/bkTopZhuizonglvyoujiudian")
    public ResponseEntity<?> moveItemTopZhuizonglvyoujiudian(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemTopZhuizonglvyoujiudian(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkBottomZhuizonglvyoujiudian")
    public ResponseEntity<?> moveItemBottomZhuizonglvyoujiudian(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemBottomZhuizonglvyoujiudian(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("stock/moveUpZhuizonglvyoujiudian")
    public ResponseEntity<?> moveItemUpZhuizonglvyoujiudian(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemUpZhuizonglvyoujiudian(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectZhuizonglvyoujiudian")
    public String collectZhuizonglvyoujiudian(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectZhuizonglvyoujiudian(tsCode);
        return "";
    }
    @GetMapping("/stock/info/Zhuizonglvyoujiudian")
    public String[] getZhuizonglvyoujiudian() {
        return stockCollectService.getZhuizonglvyoujiudian();
    }

    @GetMapping("/stock/info/zanbuZhuizonglvyoujiudian")
    public String[] zanbuZhuizonglvyoujiudian() {
        return stockCollectService.zanbuZhuizonglvyoujiudian();
    }


    @PostMapping("/stock/delZhuizonglvyoujiudian")
    public ResponseEntity<?> delZhuizonglvyoujiudian(@RequestBody StockCollect stockCollect) {
        stockCollectService.delZhuizonglvyoujiudian(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/goonZhuizonglvyoujiudian")
    public ResponseEntity<?> goonZhuizonglvyoujiudian(@RequestBody StockCollect stockCollect) {
        stockCollectService.goonZhuizonglvyoujiudian(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }








    @PostMapping("/collect/bkTopZhuizongfuzhuangjiafang")
    public ResponseEntity<?> moveItemTopZhuizongfuzhuangjiafang(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemTopZhuizongfuzhuangjiafang(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkBottomZhuizongfuzhuangjiafang")
    public ResponseEntity<?> moveItemBottomZhuizongfuzhuangjiafang(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemBottomZhuizongfuzhuangjiafang(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("stock/moveUpZhuizongfuzhuangjiafang")
    public ResponseEntity<?> moveItemUpZhuizongfuzhuangjiafang(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemUpZhuizongfuzhuangjiafang(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectZhuizongfuzhuangjiafang")
    public String collectZhuizongfuzhuangjiafang(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectZhuizongfuzhuangjiafang(tsCode);
        return "";
    }
    @GetMapping("/stock/info/Zhuizongfuzhuangjiafang")
    public String[] getZhuizongfuzhuangjiafang() {
        return stockCollectService.getZhuizongfuzhuangjiafang();
    }

    @GetMapping("/stock/info/zanbuZhuizongfuzhuangjiafang")
    public String[] zanbuZhuizongfuzhuangjiafang() {
        return stockCollectService.zanbuZhuizongfuzhuangjiafang();
    }


    @PostMapping("/stock/delZhuizongfuzhuangjiafang")
    public ResponseEntity<?> delZhuizongfuzhuangjiafang(@RequestBody StockCollect stockCollect) {
        stockCollectService.delZhuizongfuzhuangjiafang(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/goonZhuizongfuzhuangjiafang")
    public ResponseEntity<?> goonZhuizongfuzhuangjiafang(@RequestBody StockCollect stockCollect) {
        stockCollectService.goonZhuizongfuzhuangjiafang(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }








    @PostMapping("/collect/bkTopZhuizongjiajuyongpin")
    public ResponseEntity<?> moveItemTopZhuizongjiajuyongpin(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemTopZhuizongjiajuyongpin(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkBottomZhuizongjiajuyongpin")
    public ResponseEntity<?> moveItemBottomZhuizongjiajuyongpin(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemBottomZhuizongjiajuyongpin(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("stock/moveUpZhuizongjiajuyongpin")
    public ResponseEntity<?> moveItemUpZhuizongjiajuyongpin(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemUpZhuizongjiajuyongpin(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectZhuizongjiajuyongpin")
    public String collectZhuizongjiajuyongpin(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectZhuizongjiajuyongpin(tsCode);
        return "";
    }
    @GetMapping("/stock/info/Zhuizongjiajuyongpin")
    public String[] getZhuizongjiajuyongpin() {
        return stockCollectService.getZhuizongjiajuyongpin();
    }

    @GetMapping("/stock/info/zanbuZhuizongjiajuyongpin")
    public String[] zanbuZhuizongjiajuyongpin() {
        return stockCollectService.zanbuZhuizongjiajuyongpin();
    }


    @PostMapping("/stock/delZhuizongjiajuyongpin")
    public ResponseEntity<?> delZhuizongjiajuyongpin(@RequestBody StockCollect stockCollect) {
        stockCollectService.delZhuizongjiajuyongpin(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/goonZhuizongjiajuyongpin")
    public ResponseEntity<?> goonZhuizongjiajuyongpin(@RequestBody StockCollect stockCollect) {
        stockCollectService.goonZhuizongjiajuyongpin(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }







    @PostMapping("/collect/bkTopZhuizongjiadian")
    public ResponseEntity<?> moveItemTopZhuizongjiadian(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemTopZhuizongjiadian(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkBottomZhuizongjiadian")
    public ResponseEntity<?> moveItemBottomZhuizongjiadian(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemBottomZhuizongjiadian(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("stock/moveUpZhuizongjiadian")
    public ResponseEntity<?> moveItemUpZhuizongjiadian(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemUpZhuizongjiadian(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectZhuizongjiadian")
    public String collectZhuizongjiadian(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectZhuizongjiadian(tsCode);
        return "";
    }
    @GetMapping("/stock/info/Zhuizongjiadian")
    public String[] getZhuizongjiadian() {
        return stockCollectService.getZhuizongjiadian();
    }

    @GetMapping("/stock/info/zanbuZhuizongjiadian")
    public String[] zanbuZhuizongjiadian() {
        return stockCollectService.zanbuZhuizongjiadian();
    }


    @PostMapping("/stock/delZhuizongjiadian")
    public ResponseEntity<?> delZhuizongjiadian(@RequestBody StockCollect stockCollect) {
        stockCollectService.delZhuizongjiadian(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/goonZhuizongjiadian")
    public ResponseEntity<?> goonZhuizongjiadian(@RequestBody StockCollect stockCollect) {
        stockCollectService.goonZhuizongjiadian(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }








    @PostMapping("/collect/bkTopZhuizonglingshou")
    public ResponseEntity<?> moveItemTopZhuizonglingshou(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemTopZhuizonglingshou(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkBottomZhuizonglingshou")
    public ResponseEntity<?> moveItemBottomZhuizonglingshou(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemBottomZhuizonglingshou(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("stock/moveUpZhuizonglingshou")
    public ResponseEntity<?> moveItemUpZhuizonglingshou(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemUpZhuizonglingshou(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectZhuizonglingshou")
    public String collectZhuizonglingshou(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectZhuizonglingshou(tsCode);
        return "";
    }
    @GetMapping("/stock/info/Zhuizonglingshou")
    public String[] getZhuizonglingshou() {
        return stockCollectService.getZhuizonglingshou();
    }

    @GetMapping("/stock/info/zanbuZhuizonglingshou")
    public String[] zanbuZhuizonglingshou() {
        return stockCollectService.zanbuZhuizonglingshou();
    }


    @PostMapping("/stock/delZhuizonglingshou")
    public ResponseEntity<?> delZhuizonglingshou(@RequestBody StockCollect stockCollect) {
        stockCollectService.delZhuizonglingshou(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/goonZhuizonglingshou")
    public ResponseEntity<?> goonZhuizonglingshou(@RequestBody StockCollect stockCollect) {
        stockCollectService.goonZhuizonglingshou(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }







    @PostMapping("/collect/bkTopZhuizonghuaxueyuanliao")
    public ResponseEntity<?> moveItemTopZhuizonghuaxueyuanliao(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemTopZhuizonghuaxueyuanliao(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkBottomZhuizonghuaxueyuanliao")
    public ResponseEntity<?> moveItemBottomZhuizonghuaxueyuanliao(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemBottomZhuizonghuaxueyuanliao(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("stock/moveUpZhuizonghuaxueyuanliao")
    public ResponseEntity<?> moveItemUpZhuizonghuaxueyuanliao(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemUpZhuizonghuaxueyuanliao(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectZhuizonghuaxueyuanliao")
    public String collectZhuizonghuaxueyuanliao(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectZhuizonghuaxueyuanliao(tsCode);
        return "";
    }
    @GetMapping("/stock/info/Zhuizonghuaxueyuanliao")
    public String[] getZhuizonghuaxueyuanliao() {
        return stockCollectService.getZhuizonghuaxueyuanliao();
    }

    @GetMapping("/stock/info/zanbuZhuizonghuaxueyuanliao")
    public String[] zanbuZhuizonghuaxueyuanliao() {
        return stockCollectService.zanbuZhuizonghuaxueyuanliao();
    }


    @PostMapping("/stock/delZhuizonghuaxueyuanliao")
    public ResponseEntity<?> delZhuizonghuaxueyuanliao(@RequestBody StockCollect stockCollect) {
        stockCollectService.delZhuizonghuaxueyuanliao(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/goonZhuizonghuaxueyuanliao")
    public ResponseEntity<?> goonZhuizonghuaxueyuanliao(@RequestBody StockCollect stockCollect) {
        stockCollectService.goonZhuizonghuaxueyuanliao(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }




    @PostMapping("/collect/bkTopZhuizonghuaxuexianwei")
    public ResponseEntity<?> moveItemTopZhuizonghuaxuexianwei(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemTopZhuizonghuaxuexianwei(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkBottomZhuizonghuaxuexianwei")
    public ResponseEntity<?> moveItemBottomZhuizonghuaxuexianwei(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemBottomZhuizonghuaxuexianwei(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("stock/moveUpZhuizonghuaxuexianwei")
    public ResponseEntity<?> moveItemUpZhuizonghuaxuexianwei(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemUpZhuizonghuaxuexianwei(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectZhuizonghuaxuexianwei")
    public String collectZhuizonghuaxuexianwei(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectZhuizonghuaxuexianwei(tsCode);
        return "";
    }
    @GetMapping("/stock/info/Zhuizonghuaxuexianwei")
    public String[] getZhuizonghuaxuexianwei() {
        return stockCollectService.getZhuizonghuaxuexianwei();
    }

    @GetMapping("/stock/info/zanbuZhuizonghuaxuexianwei")
    public String[] zanbuZhuizonghuaxuexianwei() {
        return stockCollectService.zanbuZhuizonghuaxuexianwei();
    }


    @PostMapping("/stock/delZhuizonghuaxuexianwei")
    public ResponseEntity<?> delZhuizonghuaxuexianwei(@RequestBody StockCollect stockCollect) {
        stockCollectService.delZhuizonghuaxuexianwei(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/goonZhuizonghuaxuexianwei")
    public ResponseEntity<?> goonZhuizonghuaxuexianwei(@RequestBody StockCollect stockCollect) {
        stockCollectService.goonZhuizonghuaxuexianwei(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }







    @PostMapping("/collect/bkTopZhuizongbandaoti")
    public ResponseEntity<?> moveItemTopZhuizongbandaoti(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemTopZhuizongbandaoti(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkBottomZhuizongbandaoti")
    public ResponseEntity<?> moveItemBottomZhuizongbandaoti(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemBottomZhuizongbandaoti(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("stock/moveUpZhuizongbandaoti")
    public ResponseEntity<?> moveItemUpZhuizongbandaoti(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemUpZhuizongbandaoti(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectZhuizongbandaoti")
    public String collectZhuizongbandaoti(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectZhuizongbandaoti(tsCode);
        return "";
    }
    @GetMapping("/stock/info/Zhuizongbandaoti")
    public String[] getZhuizongbandaoti() {
        return stockCollectService.getZhuizongbandaoti();
    }

    @GetMapping("/stock/info/zanbuZhuizongbandaoti")
    public String[] zanbuZhuizongbandaoti() {
        return stockCollectService.zanbuZhuizongbandaoti();
    }


    @PostMapping("/stock/delZhuizongbandaoti")
    public ResponseEntity<?> delZhuizongbandaoti(@RequestBody StockCollect stockCollect) {
        stockCollectService.delZhuizongbandaoti(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/goonZhuizongbandaoti")
    public ResponseEntity<?> goonZhuizongbandaoti(@RequestBody StockCollect stockCollect) {
        stockCollectService.goonZhuizongbandaoti(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }








    @PostMapping("/collect/bkTopZhuizongbaozhuanyinshua")
    public ResponseEntity<?> moveItemTopZhuizongbaozhuanyinshua(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemTopZhuizongbaozhuanyinshua(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/collect/bkBottomZhuizongbaozhuanyinshua")
    public ResponseEntity<?> moveItemBottomZhuizongbaozhuanyinshua(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemBottomZhuizongbaozhuanyinshua(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("stock/moveUpZhuizongbaozhuanyinshua")
    public ResponseEntity<?> moveItemUpZhuizongbaozhuanyinshua(@RequestBody StockCollect stockCollect) {
        String ts_code = stockCollect.getTsCode();
        stockCollectService.moveItemUpZhuizongbaozhuanyinshua(ts_code);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/collectZhuizongbaozhuanyinshua")
    public String collectZhuizongbaozhuanyinshua(@RequestBody StockCollect stockCollect) {
        String tsCode = stockCollect.getTsCode();
        stockCollectService.collectZhuizongbaozhuanyinshua(tsCode);
        return "";
    }
    @GetMapping("/stock/info/Zhuizongbaozhuanyinshua")
    public String[] getZhuizongbaozhuanyinshua() {
        return stockCollectService.getZhuizongbaozhuanyinshua();
    }

    @GetMapping("/stock/info/zanbuZhuizongbaozhuanyinshua")
    public String[] zanbuZhuizongbaozhuanyinshua() {
        return stockCollectService.zanbuZhuizongbaozhuanyinshua();
    }


    @PostMapping("/stock/delZhuizongbaozhuanyinshua")
    public ResponseEntity<?> delZhuizongbaozhuanyinshua(@RequestBody StockCollect stockCollect) {
        stockCollectService.delZhuizongbaozhuanyinshua(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/stock/goonZhuizongbaozhuanyinshua")
    public ResponseEntity<?> goonZhuizongbaozhuanyinshua(@RequestBody StockCollect stockCollect) {
        stockCollectService.goonZhuizongbaozhuanyinshua(stockCollect.getTsCode());
        return ResponseEntity.ok().build();
    }









}
