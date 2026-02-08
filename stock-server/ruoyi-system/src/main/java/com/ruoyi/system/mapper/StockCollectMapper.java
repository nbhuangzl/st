package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.StockCollect;
import org.apache.ibatis.annotations.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Mapper
public interface StockCollectMapper {

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'284')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKgaixingsuliao(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '284' order by sort_order")
    String[] selectBKgaixingsuliao();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKgaixingsuliao(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='284'     WHERE ts_code = #{tsCode}")
    void updateBKgaixingsuliao(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKgaixingsuliao(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'283')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKhechenshuzhi(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '283' order by sort_order")
    String[] selectBKhechenshuzhi();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKhechenshuzhi(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='283'     WHERE ts_code = #{tsCode}")
    void updateBKhechenshuzhi(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKhechenshuzhi(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'282')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKmucailiao(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '282' order by sort_order")
    String[] selectBKmucailiao();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKmucailiao(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='282'     WHERE ts_code = #{tsCode}")
    void updateBKmucailiao(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKmucailiao(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'281')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKmojumoliao(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '281' order by sort_order")
    String[] selectBKmojumoliao();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKmojumoliao(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='281'     WHERE ts_code = #{tsCode}")
    void updateBKmojumoliao(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKmojumoliao(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'280')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKfuliao(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '280' order by sort_order")
    String[] selectBKfuliao();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKfuliao(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='280'     WHERE ts_code = #{tsCode}")
    void updateBKfuliao(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKfuliao(@Param("tsCode") String tsCode);



    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'279')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKyinran(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '279' order by sort_order")
    String[] selectBKyinran();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKyinran(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='279'     WHERE ts_code = #{tsCode}")
    void updateBKyinran(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKyinran(@Param("tsCode") String tsCode);



    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'278')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKcuizhiyingyongsoftware(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '278' order by sort_order")
    String[] selectBKcuizhiyingyongsoftware();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKcuizhiyingyongsoftware(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='278'     WHERE ts_code = #{tsCode}")
    void updateBKcuizhiyingyongsoftware(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKcuizhiyingyongsoftware(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'277')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKtiyu(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '277' order by sort_order")
    String[] selectBKtiyu();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKtiyu(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='277'     WHERE ts_code = #{tsCode}")
    void updateBKtiyu(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKtiyu(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'276')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKdipanyufadongjikui(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '276' order by sort_order")
    String[] selectBKdipanyufadongjikui();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKdipanyufadongjikui(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='276'     WHERE ts_code = #{tsCode}")
    void updateBKdipanyufadongjikui(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKdipanyufadongjikui(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'275')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKshanyongzhaikeche(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '275' order by sort_order")
    String[] selectBKshanyongzhaikeche();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKshanyongzhaikeche(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='275'     WHERE ts_code = #{tsCode}")
    void updateBKshanyongzhaikeche(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKshanyongzhaikeche(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'274')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKshanyongzhaihuoche(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '274' order by sort_order")
    String[] selectBKshanyongzhaihuoche();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKshanyongzhaihuoche(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='274'     WHERE ts_code = #{tsCode}")
    void updateBKshanyongzhaihuoche(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKshanyongzhaihuoche(@Param("tsCode") String tsCode);



    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'273')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKcizhuandiban(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '273' order by sort_order")
    String[] selectBKcizhuandiban();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKcizhuandiban(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='273'     WHERE ts_code = #{tsCode}")
    void updateBKcizhuandiban(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKcizhuandiban(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'272')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKtongxingwangluoshebei(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '272' order by sort_order")
    String[] selectBKtongxingwangluoshebei();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKtongxingwangluoshebei(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='272'     WHERE ts_code = #{tsCode}")
    void updateBKtongxingwangluoshebei(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKtongxingwangluoshebei(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'271')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKtongxingzhongduanjipeijian(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '271' order by sort_order")
    String[] selectBKtongxingzhongduanjipeijian();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKtongxingzhongduanjipeijian(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='271'     WHERE ts_code = #{tsCode}")
    void updateBKtongxingzhongduanjipeijian(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKtongxingzhongduanjipeijian(@Param("tsCode") String tsCode);



    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'270')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKtongxingxianlanpeitao(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '270' order by sort_order")
    String[] selectBKtongxingxianlanpeitao();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKtongxingxianlanpeitao(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='270'     WHERE ts_code = #{tsCode}")
    void updateBKtongxingxianlanpeitao(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKtongxingxianlanpeitao(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'269')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKtongxinggongchengjifuwu(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '269' order by sort_order")
    String[] selectBKtongxinggongchengjifuwu();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKtongxinggongchengjifuwu(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='269'     WHERE ts_code = #{tsCode}")
    void updateBKtongxinggongchengjifuwu(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKtongxinggongchengjifuwu(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'268')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKtongxingyingyongzengzhi(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '268' order by sort_order")
    String[] selectBKtongxingyingyongzengzhi();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKtongxingyingyongzengzhi(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='268'     WHERE ts_code = #{tsCode}")
    void updateBKtongxingyingyongzengzhi(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKtongxingyingyongzengzhi(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'267')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKhanghaizhuangbei(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '267' order by sort_order")
    String[] selectBKhanghaizhuangbei();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKhanghaizhuangbei(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='267'     WHERE ts_code = #{tsCode}")
    void updateBKhanghaizhuangbei(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKhanghaizhuangbei(@Param("tsCode") String tsCode);



    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'266')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKdimianbingzhuang(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '266' order by sort_order")
    String[] selectBKdimianbingzhuang();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKdimianbingzhuang(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='266'     WHERE ts_code = #{tsCode}")
    void updateBKdimianbingzhuang(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKdimianbingzhuang(@Param("tsCode") String tsCode);



    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'265')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKbkhangkongzhuangbei(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '265' order by sort_order")
    String[] selectBKbkhangkongzhuangbei();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKbkhangkongzhuangbei(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='265'     WHERE ts_code = #{tsCode}")
    void updateBKbkhangkongzhuangbei(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKbkhangkongzhuangbei(@Param("tsCode") String tsCode);



    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'264')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKmianfang(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '264' order by sort_order")
    String[] selectBKmianfang();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKmianfang(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='264'     WHERE ts_code = #{tsCode}")
    void updateBKmianfang(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKmianfang(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'263')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKdingzhijiaju(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '263' order by sort_order")
    String[] selectBKdingzhijiaju();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKdingzhijiaju(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='263'     WHERE ts_code = #{tsCode}")
    void updateBKdingzhijiaju(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKdingzhijiaju(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_ym (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'262')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKym(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_ym  where is_deleted = '0' and flag = '262' order by sort_order")
    String[] selectBKym();
    @Update("UPDATE stock_collect_ym SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKym(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_ym SET is_deleted = '0', flag='262'     WHERE ts_code = #{tsCode}")
    void updateBKym(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_ym WHERE ts_code = #{tsCode}")
    int checkIfExistsBKym(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'261')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKguiliaoguipian(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '261' order by sort_order")
    String[] selectBKguiliaoguipian();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKguiliaoguipian(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='261'     WHERE ts_code = #{tsCode}")
    void updateBKguiliaoguipian(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKguiliaoguipian(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'260')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKguangfufucai(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '260' order by sort_order")
    String[] selectBKguangfufucai();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKguangfufucai(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='260'     WHERE ts_code = #{tsCode}")
    void updateBKguangfufucai(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKguangfufucai(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'259')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKguangfujiagongshebei(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '259' order by sort_order")
    String[] selectBKguangfujiagongshebei();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKguangfujiagongshebei(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='259'     WHERE ts_code = #{tsCode}")
    void updateBKguangfujiagongshebei(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKguangfujiagongshebei(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'258')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKnengyuanjingshugu(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '258' order by sort_order")
    String[] selectBKnengyuanjingshugu();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKnengyuanjingshugu(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='258'     WHERE ts_code = #{tsCode}")
    void updateBKnengyuanjingshugu(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKnengyuanjingshugu(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'257')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKgongjiao(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '257' order by sort_order")
    String[] selectBKgongjiao();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKgongjiao(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='257'     WHERE ts_code = #{tsCode}")
    void updateBKgongjiao(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKgongjiao(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'256')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKgaosugonglu(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '256' order by sort_order")
    String[] selectBKgaosugonglu();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKgaosugonglu(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='256'     WHERE ts_code = #{tsCode}")
    void updateBKgaosugonglu(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKgaosugonglu(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'255')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKhangkongyunshu(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '255' order by sort_order")
    String[] selectBKhangkongyunshu();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKhangkongyunshu(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='255'     WHERE ts_code = #{tsCode}")
    void updateBKhangkongyunshu(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKhangkongyunshu(@Param("tsCode") String tsCode);



    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'254')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKhangyun(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '254' order by sort_order")
    String[] selectBKhangyun();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKhangyun(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='254'     WHERE ts_code = #{tsCode}")
    void updateBKhangyun(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKhangyun(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'253')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKshipin(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '253' order by sort_order")
    String[] selectBKshipin();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKshipin(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='253'     WHERE ts_code = #{tsCode}")
    void updateBKshipin(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKshipin(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'252')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKfuzhuang(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '252' order by sort_order")
    String[] selectBKfuzhuang();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKfuzhuang(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='252'     WHERE ts_code = #{tsCode}")
    void updateBKfuzhuang(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKfuzhuang(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'251')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKjiafang(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '251' order by sort_order")
    String[] selectBKjiafang();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKjiafang(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='251'     WHERE ts_code = #{tsCode}")
    void updateBKjiafang(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKjiafang(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'250')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKhuazp(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '250' order by sort_order")
    String[] selectBKhuazp();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKhuazp(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='250'     WHERE ts_code = #{tsCode}")
    void updateBKhuazp(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKhuazp(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'249')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKbingxi(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '249' order by sort_order")
    String[] selectBKbingxi();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKbingxi(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='249'     WHERE ts_code = #{tsCode}")
    void updateBKbingxi(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKbingxi(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'248')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKjiadianparts(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '248' order by sort_order")
    String[] selectBKjiadianparts();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKjiadianparts(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='248'     WHERE ts_code = #{tsCode}")
    void updateBKjiadianparts(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKjiadianparts(@Param("tsCode") String tsCode);



    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'247')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKmeatzhiping(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '247' order by sort_order")
    String[] selectBKmeatzhiping();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKmeatzhiping(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='247'     WHERE ts_code = #{tsCode}")
    void updateBKmeatzhiping(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKmeatzhiping(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'246')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKxiuxianshiping(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '246' order by sort_order")
    String[] selectBKxiuxianshiping();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKxiuxianshiping(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='246'     WHERE ts_code = #{tsCode}")
    void updateBKxiuxianshiping(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKxiuxianshiping(@Param("tsCode") String tsCode);



    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'245')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKyujiagongfood(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '245' order by sort_order")
    String[] selectBKyujiagongfood();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKyujiagongfood(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='245'     WHERE ts_code = #{tsCode}")
    void updateBKyujiagongfood(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKyujiagongfood(@Param("tsCode") String tsCode);



    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'244')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKtiaoweiping(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '244' order by sort_order")
    String[] selectBKtiaoweiping();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKtiaoweiping(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='244'     WHERE ts_code = #{tsCode}")
    void updateBKtiaoweiping(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKtiaoweiping(@Param("tsCode") String tsCode);



    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'243')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKbeer(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '243' order by sort_order")
    String[] selectBKbeer();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKbeer(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='243'     WHERE ts_code = #{tsCode}")
    void updateBKbeer(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKbeer(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'242')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKluming(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '242' order by sort_order")
    String[] selectBKluming();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKluming(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='242'     WHERE ts_code = #{tsCode}")
    void updateBKluming(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKluming(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'241')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKqitawine(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '241' order by sort_order")
    String[] selectBKqitawine();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKqitawine(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='241'     WHERE ts_code = #{tsCode}")
    void updateBKqitawine(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKqitawine(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'240')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKruanyinliao(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '240' order by sort_order")
    String[] selectBKruanyinliao();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKruanyinliao(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='240'     WHERE ts_code = #{tsCode}")
    void updateBKruanyinliao(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKruanyinliao(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'239')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKziranjingdian(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '239' order by sort_order")
    String[] selectBKziranjingdian();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKziranjingdian(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='239'     WHERE ts_code = #{tsCode}")
    void updateBKziranjingdian(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKziranjingdian(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'238')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKlvyouzonghe(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '238' order by sort_order")
    String[] selectBKlvyouzonghe();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKlvyouzonghe(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='238'     WHERE ts_code = #{tsCode}")
    void updateBKlvyouzonghe(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKlvyouzonghe(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'237')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKcanying(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '237' order by sort_order")
    String[] selectBKcanying();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKcanying(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='237'     WHERE ts_code = #{tsCode}")
    void updateBKcanying(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKcanying(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'236')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKjiudian(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '236' order by sort_order")
    String[] selectBKjiudian();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKjiudian(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='236'     WHERE ts_code = #{tsCode}")
    void updateBKjiudian(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKjiudian(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'235')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKrengongjingdian(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '235' order by sort_order")
    String[] selectBKrengongjingdian();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKrengongjingdian(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='235'     WHERE ts_code = #{tsCode}")
    void updateBKrengongjingdian(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKrengongjingdian(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'234')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKzhuanyeliansuo(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '234' order by sort_order")
    String[] selectBKzhuanyeliansuo();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKzhuanyeliansuo(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='234'     WHERE ts_code = #{tsCode}")
    void updateBKzhuanyeliansuo(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKzhuanyeliansuo(@Param("tsCode") String tsCode);



    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'233')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKbaihuolingshou(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '233' order by sort_order")
    String[] selectBKbaihuolingshou();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKbaihuolingshou(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='233'     WHERE ts_code = #{tsCode}")
    void updateBKbaihuolingshou(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKbaihuolingshou(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'232')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKshangyewuyejinying(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '232' order by sort_order")
    String[] selectBKshangyewuyejinying();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKshangyewuyejinying(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='232'     WHERE ts_code = #{tsCode}")
    void updateBKshangyewuyejinying(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKshangyewuyejinying(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'231')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKshubiandianshebei(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '231' order by sort_order")
    String[] selectBKshubiandianshebei();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKshubiandianshebei(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='231'     WHERE ts_code = #{tsCode}")
    void updateBKshubiandianshebei(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKshubiandianshebei(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'230')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKxianlangpartsjiqita(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '230' order by sort_order")
    String[] selectBKxianlangpartsjiqita();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKxianlangpartsjiqita(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='230'     WHERE ts_code = #{tsCode}")
    void updateBKxianlangpartsjiqita(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKxianlangpartsjiqita(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'229')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKtiwaizhenduang(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '229' order by sort_order")
    String[] selectBKtiwaizhenduang();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKtiwaizhenduang(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='229'     WHERE ts_code = #{tsCode}")
    void updateBKtiwaizhenduang(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKtiwaizhenduang(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'228')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKyiliaohaocai(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '228' order by sort_order")
    String[] selectBKyiliaohaocai();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKyiliaohaocai(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='228'     WHERE ts_code = #{tsCode}")
    void updateBKyiliaohaocai(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKyiliaohaocai(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'227')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKgongkongshebei(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '227' order by sort_order")
    String[] selectBKgongkongshebei();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKgongkongshebei(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='227'     WHERE ts_code = #{tsCode}")
    void updateBKgongkongshebei(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKgongkongshebei(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'226')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKjiguangshebei(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '226' order by sort_order")
    String[] selectBKjiguangshebei();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKjiguangshebei(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='226'     WHERE ts_code = #{tsCode}")
    void updateBKjiguangshebei(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKjiguangshebei(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'225')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKbkrobot(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '225' order by sort_order")
    String[] selectBKbkrobot();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKbkrobot(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='225'     WHERE ts_code = #{tsCode}")
    void updateBKbkrobot(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKbkrobot(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'224')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKbkqitacpushebei(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '224' order by sort_order")
    String[] selectBKbkqitacpushebei();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKbkqitacpushebei(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='224'     WHERE ts_code = #{tsCode}")
    void updateBKbkqitacpushebei(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKbkqitacpushebei(@Param("tsCode") String tsCode);



    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'223')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKbknongyongjixie(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '223' order by sort_order")
    String[] selectBKbknongyongjixie();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKbknongyongjixie(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='223'     WHERE ts_code = #{tsCode}")
    void updateBKbknongyongjixie(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKbknongyongjixie(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'222')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKfangzhifuzhuangshebei(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '222' order by sort_order")
    String[] selectBKfangzhifuzhuangshebei();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKfangzhifuzhuangshebei(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='222'     WHERE ts_code = #{tsCode}")
    void updateBKfangzhifuzhuangshebei(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKfangzhifuzhuangshebei(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'221')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKqitazhuanyongshebei(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '221' order by sort_order")
    String[] selectBKqitazhuanyongshebei();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKqitazhuanyongshebei(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='221'     WHERE ts_code = #{tsCode}")
    void updateBKqitazhuanyongshebei(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKqitazhuanyongshebei(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'220')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKlouyushebei(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '220' order by sort_order")
    String[] selectBKlouyushebei();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKlouyushebei(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='220'     WHERE ts_code = #{tsCode}")
    void updateBKlouyushebei(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKlouyushebei(@Param("tsCode") String tsCode);




    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'219')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKenergyjiheavyshebei(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '219' order by sort_order")
    String[] selectBKenergyjiheavyshebei();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKenergyjiheavyshebei(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='219'     WHERE ts_code = #{tsCode}")
    void updateBKenergyjiheavyshebei(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKenergyjiheavyshebei(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'218')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKmeitangkaicai(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '218' order by sort_order")
    String[] selectBKmeitangkaicai();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKmeitangkaicai(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='218'     WHERE ts_code = #{tsCode}")
    void updateBKmeitangkaicai(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKmeitangkaicai(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'217')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKshiyoujiagong(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '217' order by sort_order")
    String[] selectBKshiyoujiagong();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKshiyoujiagong(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='217'     WHERE ts_code = #{tsCode}")
    void updateBKshiyoujiagong(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKshiyoujiagong(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'216')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKyoufugongcheng(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '216' order by sort_order")
    String[] selectBKyoufugongcheng();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKyoufugongcheng(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='216'     WHERE ts_code = #{tsCode}")
    void updateBKyoufugongcheng(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKyoufugongcheng(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'215')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKyouqikaicai(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '215' order by sort_order")
    String[] selectBKyouqikaicai();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKyouqikaicai(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='215'     WHERE ts_code = #{tsCode}")
    void updateBKyouqikaicai(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKyouqikaicai(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'214')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKxinnengyuanfadian(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '214' order by sort_order")
    String[] selectBKxinnengyuanfadian();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKxinnengyuanfadian(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='214'     WHERE ts_code = #{tsCode}")
    void updateBKxinnengyuanfadian(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKxinnengyuanfadian(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'213')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKdiannengzonghefuwu(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '213' order by sort_order")
    String[] selectBKdiannengzonghefuwu();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKdiannengzonghefuwu(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='213'     WHERE ts_code = #{tsCode}")
    void updateBKdiannengzonghefuwu(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKdiannengzonghefuwu(@Param("tsCode") String tsCode);



    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'212')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKhuodian(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '212' order by sort_order")
    String[] selectBKhuodian();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKhuodian(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='212'     WHERE ts_code = #{tsCode}")
    void updateBKhuodian(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKhuodian(@Param("tsCode") String tsCode);



    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'211')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKreli(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '211' order by sort_order")
    String[] selectBKreli();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKreli(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='211'     WHERE ts_code = #{tsCode}")
    void updateBKreli(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKreli(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'210')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKshuidian(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '210' order by sort_order")
    String[] selectBKshuidian();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKshuidian(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='210'     WHERE ts_code = #{tsCode}")
    void updateBKshuidian(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKshuidian(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'209')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKhuaxuezhijiyinli(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '209' order by sort_order")
    String[] selectBKhuaxuezhijiyinli();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKhuaxuezhijiyinli(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='209'     WHERE ts_code = #{tsCode}")
    void updateBKhuaxuezhijiyinli(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKhuaxuezhijiyinli(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'208')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKhuaxuezhiji(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '208' order by sort_order")
    String[] selectBKhuaxuezhiji();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKhuaxuezhiji(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='208'     WHERE ts_code = #{tsCode}")
    void updateBKhuaxuezhiji(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKhuaxuezhiji(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'207')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKyuanliaoyao(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '207' order by sort_order")
    String[] selectBKyuanliaoyao();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKyuanliaoyao(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='207'     WHERE ts_code = #{tsCode}")
    void updateBKyuanliaoyao(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKyuanliaoyao(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'206')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKqitashengwuzhip(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '206' order by sort_order")
    String[] selectBKqitashengwuzhip();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKqitashengwuzhip(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='206'     WHERE ts_code = #{tsCode}")
    void updateBKqitashengwuzhip(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKqitashengwuzhip(@Param("tsCode") String tsCode);




    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'205')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKxueyezhip(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '205' order by sort_order")
    String[] selectBKxueyezhip();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKxueyezhip(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='205'     WHERE ts_code = #{tsCode}")
    void updateBKxueyezhip(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKxueyezhip(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'204')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKyiyuan(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '204' order by sort_order")
    String[] selectBKyiyuan();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKyiyuan(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='204'     WHERE ts_code = #{tsCode}")
    void updateBKyiyuan(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKyiyuan(@Param("tsCode") String tsCode);



    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'203')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKyiliaoyanfawaibao(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '203' order by sort_order")
    String[] selectBKyiliaoyanfawaibao();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKyiliaoyanfawaibao(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='203'     WHERE ts_code = #{tsCode}")
    void updateBKyiliaoyanfawaibao(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKyiliaoyanfawaibao(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'202')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKwujiyan(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '202' order by sort_order")
    String[] selectBKwujiyan();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKwujiyan(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='202'     WHERE ts_code = #{tsCode}")
    void updateBKwujiyan(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKwujiyan(@Param("tsCode") String tsCode);




    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'201')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKqitahuaxueraw(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '201' order by sort_order")
    String[] selectBKqitahuaxueraw();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKqitahuaxueraw(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='201'     WHERE ts_code = #{tsCode}")
    void updateBKqitahuaxueraw(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKqitahuaxueraw(@Param("tsCode") String tsCode);



    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'200')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKtaibaifen(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '200' order by sort_order")
    String[] selectBKtaibaifen();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKtaibaifen(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='200'     WHERE ts_code = #{tsCode}")
    void updateBKtaibaifen(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKtaibaifen(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'199')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKmeihuagong(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '199' order by sort_order")
    String[] selectBKmeihuagong();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKmeihuagong(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='199'     WHERE ts_code = #{tsCode}")
    void updateBKmeihuagong(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKmeihuagong(@Param("tsCode") String tsCode);





    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'198')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKlvjian(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '198' order by sort_order")
    String[] selectBKlvjian();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKlvjian(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='198'     WHERE ts_code = #{tsCode}")
    void updateBKlvjian(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKlvjian(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'197')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKxiaofeidianziparts(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '197' order by sort_order")
    String[] selectBKxiaofeidianziparts();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKxiaofeidianziparts(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='197'     WHERE ts_code = #{tsCode}")
    void updateBKxiaofeidianziparts(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKxiaofeidianziparts(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'196')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKbidongyuanjian(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '196' order by sort_order")
    String[] selectBKbidongyuanjian();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKbidongyuanjian(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='196'     WHERE ts_code = #{tsCode}")
    void updateBKbidongyuanjian(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKbidongyuanjian(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},195')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKyinzhidianluban(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '195' order by sort_order")
    String[] selectBKyinzhidianluban();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKyinzhidianluban(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='195'     WHERE ts_code = #{tsCode}")
    void updateBKyinzhidianluban(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKyinzhidianluban(@Param("tsCode") String tsCode);
    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'194')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKlidianchi(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '194' order by sort_order")
    String[] selectBKlidianchi();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKlidianchi(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='194'     WHERE ts_code = #{tsCode}")
    void updateBKlidianchi(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKlidianchi(@Param("tsCode") String tsCode);



    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'193')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKqitadianchi(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '193' order by sort_order")
    String[] selectBKqitadianchi();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKqitadianchi(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='193'     WHERE ts_code = #{tsCode}")
    void updateBKqitadianchi(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKqitadianchi(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'192')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKdianchihuaxue(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '192' order by sort_order")
    String[] selectBKdianchihuaxue();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKdianchihuaxue(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='192'     WHERE ts_code = #{tsCode}")
    void updateBKdianchihuaxue(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKdianchihuaxue(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'191')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKmianban(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '191' order by sort_order")
    String[] selectBKmianban();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKmianban(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='191'     WHERE ts_code = #{tsCode}")
    void updateBKmianban(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKmianban(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'190')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKled(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '190' order by sort_order")
    String[] selectBKled();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKled(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='190'     WHERE ts_code = #{tsCode}")
    void updateBKled(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKled(@Param("tsCode") String tsCode);



    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'189')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKguanxueyuanjian(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '189' order by sort_order")
    String[] selectBKguanxueyuanjian();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKguanxueyuanjian(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='189'     WHERE ts_code = #{tsCode}")
    void updateBKguanxueyuanjian(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKguanxueyuanjian(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'188')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKyiyaoliutong(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '188' order by sort_order")
    String[] selectBKyiyaoliutong();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKyiyaoliutong(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='188'     WHERE ts_code = #{tsCode}")
    void updateBKyiyaoliutong(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKyiyaoliutong(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'187')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKdanfei(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '187' order by sort_order")
    String[] selectBKdanfei();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKdanfei(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='187'     WHERE ts_code = #{tsCode}")
    void updateBKdanfei(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKdanfei(@Param("tsCode") String tsCode);



    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'186')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKnongyao(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '186' order by sort_order")
    String[] selectBKnongyao();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKnongyao(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='186'     WHERE ts_code = #{tsCode}")
    void updateBKnongyao(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKnongyao(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'185')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKfuhefei(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '185' order by sort_order")
    String[] selectBKfuhefei();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKfuhefei(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='185'     WHERE ts_code = #{tsCode}")
    void updateBKfuhefei(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKfuhefei(@Param("tsCode") String tsCode);



    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'184')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKlinhui(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '184' order by sort_order")
    String[] selectBKlinhui();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKlinhui(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='184'     WHERE ts_code = #{tsCode}")
    void updateBKlinhui(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKlinhui(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'183')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKroujiyangzhi(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '183' order by sort_order")
    String[] selectBKroujiyangzhi();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKroujiyangzhi(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='183'     WHERE ts_code = #{tsCode}")
    void updateBKroujiyangzhi(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKroujiyangzhi(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'182')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKshengzhuyangzhi(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '182' order by sort_order")
    String[] selectBKshengzhuyangzhi();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKshengzhuyangzhi(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='182'     WHERE ts_code = #{tsCode}")
    void updateBKshengzhuyangzhi(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKshengzhuyangzhi(@Param("tsCode") String tsCode);




    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'181')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKqitayangzhi(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '181' order by sort_order")
    String[] selectBKqitayangzhi();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKqitayangzhi(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='181'     WHERE ts_code = #{tsCode}")
    void updateBKqitayangzhi(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKqitayangzhi(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'180')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKshuichanyangzhi(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '180' order by sort_order")
    String[] selectBKshuichanyangzhi();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKshuichanyangzhi(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='180'     WHERE ts_code = #{tsCode}")
    void updateBKshuichanyangzhi(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKshuichanyangzhi(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'179')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKdongwubaojian(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '179' order by sort_order")
    String[] selectBKdongwubaojian();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKdongwubaojian(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='179'     WHERE ts_code = #{tsCode}")
    void updateBKdongwubaojian(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKdongwubaojian(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'178')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKlinye(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '178' order by sort_order")
    String[] selectBKlinye();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKlinye(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='178'     WHERE ts_code = #{tsCode}")
    void updateBKlinye(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKlinye(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'177')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKzhongzhishengchan(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '177' order by sort_order")
    String[] selectBKzhongzhishengchan();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKzhongzhishengchan(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='177'     WHERE ts_code = #{tsCode}")
    void updateBKzhongzhishengchan(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKzhongzhishengchan(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'176')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKqitazhongzhiye(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '176' order by sort_order")
    String[] selectBKqitazhongzhiye();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKqitazhongzhiye(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='176'     WHERE ts_code = #{tsCode}")
    void updateBKqitazhongzhiye(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKqitazhongzhiye(@Param("tsCode") String tsCode);



    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'175')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKguoshujiagong(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '175' order by sort_order")
    String[] selectBKguoshujiagong();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKguoshujiagong(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='175'     WHERE ts_code = #{tsCode}")
    void updateBKguoshujiagong(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKguoshujiagong(@Param("tsCode") String tsCode);



    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'174')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKshuichansiliao(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '174' order by sort_order")
    String[] selectBKshuichansiliao();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKshuichansiliao(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='174'     WHERE ts_code = #{tsCode}")
    void updateBKshuichansiliao(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKshuichansiliao(@Param("tsCode") String tsCode);



    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'173')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKliangyoujiagong(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '173' order by sort_order")
    String[] selectBKliangyoujiagong();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKliangyoujiagong(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='173'     WHERE ts_code = #{tsCode}")
    void updateBKliangyoujiagong(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKliangyoujiagong(@Param("tsCode") String tsCode);





    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'172')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKqitanongchanpinjiagong(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '172' order by sort_order")
    String[] selectBKqitanongchanpinjiagong();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKqitanongchanpinjiagong(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='172'     WHERE ts_code = #{tsCode}")
    void updateBKqitanongchanpinjiagong(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKqitanongchanpinjiagong(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'171')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKxuchusiliao(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '171' order by sort_order")
    String[] selectBKxuchusiliao();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKxuchusiliao(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='171'     WHERE ts_code = #{tsCode}")
    void updateBKxuchusiliao(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKxuchusiliao(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'170')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKanlun(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '170' order by sort_order")
    String[] selectBKanlun();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKanlun(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='170'     WHERE ts_code = #{tsCode}")
    void updateBKanlun(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKanlun(@Param("tsCode") String tsCode);



    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'169')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKnianjiao(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '169' order by sort_order")
    String[] selectBKnianjiao();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKnianjiao(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='169'     WHERE ts_code = #{tsCode}")
    void updateBKnianjiao(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKnianjiao(@Param("tsCode") String tsCode);
    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'168')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKdilun(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '168' order by sort_order")
    String[] selectBKdilun();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKdilun(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='168'     WHERE ts_code = #{tsCode}")
    void updateBKdilun(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKdilun(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'167')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKyoujigui(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '167' order by sort_order")
    String[] selectBKyoujigui();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKyoujigui(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='167'     WHERE ts_code = #{tsCode}")
    void updateBKyoujigui(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKyoujigui(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'166')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKfuhuagong(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '166' order by sort_order")
    String[] selectBKfuhuagong();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKfuhuagong(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='166'     WHERE ts_code = #{tsCode}")
    void updateBKfuhuagong(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKfuhuagong(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'165')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKjuanzhi(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '165' order by sort_order")
    String[] selectBKjuanzhi();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKjuanzhi(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='165'     WHERE ts_code = #{tsCode}")
    void updateBKjuanzhi(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKjuanzhi(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'164')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKminbaoyongpin(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '164' order by sort_order")
    String[] selectBKminbaoyongpin();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKminbaoyongpin(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='164'     WHERE ts_code = #{tsCode}")
    void updateBKminbaoyongpin(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKminbaoyongpin(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'163')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKfanzhihuaxuepin(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '163' order by sort_order")
    String[] selectBKfanzhihuaxuepin();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKfanzhihuaxuepin(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='163'     WHERE ts_code = #{tsCode}")
    void updateBKfanzhihuaxuepin(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKfanzhihuaxuepin(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'162')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKfoodsiliaotianjiaji(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '162' order by sort_order")
    String[] selectBKfoodsiliaotianjiaji();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKfoodsiliaotianjiaji(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='162'     WHERE ts_code = #{tsCode}")
    void updateBKfoodsiliaotianjiaji(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKfoodsiliaotianjiaji(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'161')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKqitahuaxue(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '161' order by sort_order")
    String[] selectBKqitahuaxue();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKqitahuaxue(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='161'     WHERE ts_code = #{tsCode}")
    void updateBKqitahuaxue(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKqitahuaxue(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'160')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKotherjiaju(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '160' order by sort_order")
    String[] selectBKotherjiaju();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKotherjiaju(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='160'     WHERE ts_code = #{tsCode}")
    void updateBKotherjiaju(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKotherjiaju(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'159')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKwenyuyongping(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '159' order by sort_order")
    String[] selectBKwenyuyongping();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKwenyuyongping(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='159'     WHERE ts_code = #{tsCode}")
    void updateBKwenyuyongping(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKwenyuyongping(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'158')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKbaozhuang(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '158' order by sort_order")
    String[] selectBKbaozhuang();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKbaozhuang(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='158'     WHERE ts_code = #{tsCode}")
    void updateBKbaozhuang(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKbaozhuang(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'157')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKchuban(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '157' order by sort_order")
    String[] selectBKchuban();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKchuban(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='157'     WHERE ts_code = #{tsCode}")
    void updateBKchuban(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKchuban(@Param("tsCode") String tsCode);



    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'156')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKguangaoyinxiao(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '156' order by sort_order")
    String[] selectBKguangaoyinxiao();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKguangaoyinxiao(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='156'     WHERE ts_code = #{tsCode}")
    void updateBKguangaoyinxiao(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKguangaoyinxiao(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'155')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKmonixinpiansheji(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '155' order by sort_order")
    String[] selectBKmonixinpiansheji();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKmonixinpiansheji(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='155'     WHERE ts_code = #{tsCode}")
    void updateBKmonixinpiansheji(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKmonixinpiansheji(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'154')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKbaodaotishebei(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '154' order by sort_order")
    String[] selectBKbaodaotishebei();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKbaodaotishebei(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='154'     WHERE ts_code = #{tsCode}")
    void updateBKbaodaotishebei(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKbaodaotishebei(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'153')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKfenliqijian(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '153' order by sort_order")
    String[] selectBKfenliqijian();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKfenliqijian(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='153'     WHERE ts_code = #{tsCode}")
    void updateBKfenliqijian(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKfenliqijian(@Param("tsCode") String tsCode);
    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'152')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKjichengdianlutest(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '152' order by sort_order")
    String[] selectBKjichengdianlutest();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKjichengdianlutest(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='152'     WHERE ts_code = #{tsCode}")
    void updateBKjichengdianlutest(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKjichengdianlutest(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'151')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKbandaoticailiao(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '151' order by sort_order")
    String[] selectBKbandaoticailiao();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKbandaoticailiao(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='151'     WHERE ts_code = #{tsCode}")
    void updateBKbandaoticailiao(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKbandaoticailiao(@Param("tsCode") String tsCode);
    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'150')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKshuzixinpian(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '150' order by sort_order")
    String[] selectBKshuzixinpian();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKshuzixinpian(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='150'     WHERE ts_code = #{tsCode}")
    void updateBKshuzixinpian(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKshuzixinpian(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'149')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKdaqizhili(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '149' order by sort_order")
    String[] selectBKdaqizhili();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKdaqizhili(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='149'     WHERE ts_code = #{tsCode}")
    void updateBKdaqizhili(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKdaqizhili(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'148')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKgufei(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '148' order by sort_order")
    String[] selectBKgufei();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKgufei(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='148'     WHERE ts_code = #{tsCode}")
    void updateBKgufei(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKgufei(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'147')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKshuiwu(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '147' order by sort_order")
    String[] selectBKshuiwu();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKshuiwu(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='147'     WHERE ts_code = #{tsCode}")
    void updateBKshuiwu(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKshuiwu(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'146')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKzonghehuanjin(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '146' order by sort_order")
    String[] selectBKzonghehuanjin();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKzonghehuanjin(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='146'     WHERE ts_code = #{tsCode}")
    void updateBKzonghehuanjin(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKzonghehuanjin(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'145')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKbkwu(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '145' order by sort_order")
    String[] selectBKbkwu();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKbkwu(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='145'     WHERE ts_code = #{tsCode}")
    void updateBKbkwu(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKbkwu(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'144')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKbkqitaxiaojinshu(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '144' order by sort_order")
    String[] selectBKbkqitaxiaojinshu();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKbkqitaxiaojinshu(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='144'     WHERE ts_code = #{tsCode}")
    void updateBKbkqitaxiaojinshu(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKbkqitaxiaojinshu(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'143')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKbkxitu(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '143' order by sort_order")
    String[] selectBKbkxitu();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKbkxitu(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='143'     WHERE ts_code = #{tsCode}")
    void updateBKbkxitu(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKbkxitu(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'142')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKbklv(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '142' order by sort_order")
    String[] selectBKbklv();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKbklv(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='142'     WHERE ts_code = #{tsCode}")
    void updateBKbklv(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKbklv(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'141')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKbktong(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '141' order by sort_order")
    String[] selectBKbktong();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKbktong(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='141'     WHERE ts_code = #{tsCode}")
    void updateBKbktong(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKbktong(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'140')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKbkjinshuzhipin(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '140' order by sort_order")
    String[] selectBKbkjinshuzhipin();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKbkjinshuzhipin(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='140'     WHERE ts_code = #{tsCode}")
    void updateBKbkjinshuzhipin(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKbkjinshuzhipin(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'139')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKbkaircondition(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '139' order by sort_order")
    String[] selectBKbkaircondition();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKbkaircondition(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='139'     WHERE ts_code = #{tsCode}")
    void updateBKbkaircondition(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKbkaircondition(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'138)")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKbkcardianzidianqi(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '138' order by sort_order")
    String[] selectBKbkcardianzidianqi();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKbkcardianzidianqi(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='138'     WHERE ts_code = #{tsCode}")
    void updateBKbkcardianzidianqi(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKbkcardianzidianqi(@Param("tsCode") String tsCode);



    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'137')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKbkdipan(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '137' order by sort_order")
    String[] selectBKbkdipan();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKbkdipan(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='137'     WHERE ts_code = #{tsCode}")
    void updateBKbkdipan(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKbkdipan(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'136')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKbkluntai(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '136' order by sort_order")
    String[] selectBKbkluntai();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKbkluntai(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='136'     WHERE ts_code = #{tsCode}")
    void updateBKbkluntai(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKbkluntai(@Param("tsCode") String tsCode);



    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'135')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKbkcheshen(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '135' order by sort_order")
    String[] selectBKbkcheshen();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKbkcheshen(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='135'     WHERE ts_code = #{tsCode}")
    void updateBKbkcheshen(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKbkcheshen(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'134')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKbkcarservice02(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '134' order by sort_order")
    String[] selectBKbkcarservice02();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKbkcarservice02(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='134'     WHERE ts_code = #{tsCode}")
    void updateBKbkcarservice02(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKbkcarservice02(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'133')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKothercarparts(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '133' order by sort_order")
    String[] selectBKothercarparts();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKothercarparts(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='133'     WHERE ts_code = #{tsCode}")
    void updateBKothercarparts(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKothercarparts(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'132')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKtegang(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '132' order by sort_order")
    String[] selectBKtegang();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKtegang(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='132'     WHERE ts_code = #{tsCode}")
    void updateBKtegang(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKtegang(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'131')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKpugang(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '131' order by sort_order")
    String[] selectBKpugang();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKpugang(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='131'     WHERE ts_code = #{tsCode}")
    void updateBKpugang(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKpugang(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'130')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKpipe(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '130' order by sort_order")
    String[] selectBKpipe();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKpipe(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='130'     WHERE ts_code = #{tsCode}")
    void updateBKpipe(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKpipe(@Param("tsCode") String tsCode);
    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'129')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKnaihuocailiao(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '129' order by sort_order")
    String[] selectBKnaihuocailiao();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKnaihuocailiao(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='129'     WHERE ts_code = #{tsCode}")
    void updateBKnaihuocailiao(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKnaihuocailiao(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'128')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKzhuangshiyuanlin(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '128' order by sort_order")
    String[] selectBKzhuangshiyuanlin();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKzhuangshiyuanlin(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='128'     WHERE ts_code = #{tsCode}")
    void updateBKzhuangshiyuanlin(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKzhuangshiyuanlin(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'127')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKgongchengzixun(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '127' order by sort_order")
    String[] selectBKgongchengzixun();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKgongchengzixun(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='127'     WHERE ts_code = #{tsCode}")
    void updateBKgongchengzixun(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKgongchengzixun(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'126')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKjichujianshe(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '126' order by sort_order")
    String[] selectBKjichujianshe();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKjichujianshe(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='126'     WHERE ts_code = #{tsCode}")
    void updateBKjichujianshe(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKjichujianshe(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'125')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKgangjiegou(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '125' order by sort_order")
    String[] selectBKgangjiegou();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKgangjiegou(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='125'     WHERE ts_code = #{tsCode}")
    void updateBKgangjiegou(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKgangjiegou(@Param("tsCode") String tsCode);



    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'124')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKShangyewuyeguanli(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '124' order by sort_order")
    String[] selectBKShangyewuyeguanli();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKShangyewuyeguanli(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='124'     WHERE ts_code = #{tsCode}")
    void updateBKShangyewuyeguanli(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKShangyewuyeguanli(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'123')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKZhuzhaikaifa(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '123' order by sort_order")
    String[] selectBKZhuzhaikaifa();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKZhuzhaikaifa(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='123'     WHERE ts_code = #{tsCode}")
    void updateBKZhuzhaikaifa(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKZhuzhaikaifa(@Param("tsCode") String tsCode);



    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'122')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKShangyedichang(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '122' order by sort_order")
    String[] selectBKShangyedichang();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKShangyedichang(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='122'     WHERE ts_code = #{tsCode}")
    void updateBKShangyedichang(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKShangyedichang(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'121')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKCement(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '121' order by sort_order")
    String[] selectBKCement();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKCement(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='121'     WHERE ts_code = #{tsCode}")
    void updateBKCement(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKCement(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'120')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKPackageprint(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '120' order by sort_order")
    String[] selectBKPackageprint();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKPackageprint(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='120'     WHERE ts_code = #{tsCode}")
    void updateBKPackageprint(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKPackageprint(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'119')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKKitchenappliances(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '119' order by sort_order")
    String[] selectBKKitchenappliances();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKKitchenappliances(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='119'     WHERE ts_code = #{tsCode}")
    void updateBKKitchenappliances(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKKitchenappliances(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'118')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKCommunicationservices(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '118' order by sort_order")
    String[] selectBKCommunicationservices();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKCommunicationservices(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='118'     WHERE ts_code = #{tsCode}")
    void updateBKCommunicationservices(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKCommunicationservices(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'117')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKPowergridequipment(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '117' order by sort_order")
    String[] selectBKPowergridequipment();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKPowergridequipment(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='117'     WHERE ts_code = #{tsCode}")
    void updateBKPowergridequipment(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKPowergridequipment(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'116')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKPetroleumprocessingtrade(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '116' order by sort_order")
    String[] selectBKPetroleumprocessingtrade();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKPetroleumprocessingtrade(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='116'     WHERE ts_code = #{tsCode}")
    void updateBKPetroleumprocessingtrade(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKPetroleumprocessingtrade(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'115')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKOthersocialservices(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '115' order by sort_order")
    String[] selectBKOthersocialservices();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKOthersocialservices(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='115'     WHERE ts_code = #{tsCode}")
    void updateBKOthersocialservices(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKOthersocialservices(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'114')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKCulturalmedia(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '114' order by sort_order")
    String[] selectBKCulturalmedia();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKCulturalmedia(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='114'     WHERE ts_code = #{tsCode}")
    void updateBKCulturalmedia(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKCulturalmedia(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'113')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKOpticaloptoelectronics(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '113' order by sort_order")
    String[] selectBKOpticaloptoelectronics();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKOpticaloptoelectronics(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='113'     WHERE ts_code = #{tsCode}")
    void updateBKOpticaloptoelectronics(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKOpticaloptoelectronics(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'112')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKElectronicchemicals(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '112' order by sort_order")
    String[] selectBKElectronicchemicals();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKElectronicchemicals(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='112'     WHERE ts_code = #{tsCode}")
    void updateBKElectronicchemicals(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKElectronicchemicals(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'111')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKCinema(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '111' order by sort_order")
    String[] selectBKCinema();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKCinema(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='111'     WHERE ts_code = #{tsCode}")
    void updateBKCinema(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKCinema(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'110')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKAgriculturalchemicalproducts(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '110' order by sort_order")
    String[] selectBKAgriculturalchemicalproducts();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKAgriculturalchemicalproducts(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='110'     WHERE ts_code = #{tsCode}")
    void updateBKAgriculturalchemicalproducts(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKAgriculturalchemicalproducts(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'109')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKBreedingindustry(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '109' order by sort_order")
    String[] selectBKBreedingindustry();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKBreedingindustry(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='109'     WHERE ts_code = #{tsCode}")
    void updateBKBreedingindustry(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKBreedingindustry(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'108')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKConstructionmachinery(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '108' order by sort_order")
    String[] selectBKConstructionmachinery();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKConstructionmachinery(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='108'     WHERE ts_code = #{tsCode}")
    void updateBKConstructionmachinery(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKConstructionmachinery(@Param("tsCode") String tsCode);
    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'107')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKOilgasextractionservices(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '107' order by sort_order")
    String[] selectBKOilgasextractionservices();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKOilgasextractionservices(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '107', flag='107'     WHERE ts_code = #{tsCode}")
    void updateBKOilgasextractionservices(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKOilgasextractionservices(@Param("tsCode") String tsCode);
    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'106')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKWindequipment(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '106' order by sort_order")
    String[] selectBKWindequipment();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKWindequipment(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='106'     WHERE ts_code = #{tsCode}")
    void updateBKWindequipment(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKWindequipment(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'105')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKInternetecommerce(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '105' order by sort_order")
    String[] selectBKInternetecommerce();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKInternetecommerce(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='105'     WHERE ts_code = #{tsCode}")
    void updateBKInternetecommerce(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKInternetecommerce(@Param("tsCode") String tsCode);
    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'104')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKProcessingagriculturalproducts(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '104' order by sort_order")
    String[] selectBKProcessingagriculturalproducts();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKProcessingagriculturalproducts(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='104'     WHERE ts_code = #{tsCode}")
    void updateBKProcessingagriculturalproducts(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKProcessingagriculturalproducts(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'103')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKPhotovoltaicequipment(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '103' order by sort_order")
    String[] selectBKPhotovoltaicequipment();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKPhotovoltaicequipment(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='103'     WHERE ts_code = #{tsCode}")
    void updateBKPhotovoltaicequipment(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKPhotovoltaicequipment(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'102')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKTextilemanufacturing(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '102' order by sort_order")
    String[] selectBKTextilemanufacturing();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKTextilemanufacturing(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='102'     WHERE ts_code = #{tsCode}")
    void updateBKTextilemanufacturing(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKTextilemanufacturing(@Param("tsCode") String tsCode);
    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'101')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKRailwayequipment(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '101' order by sort_order")
    String[] selectBKRailwayequipment();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKRailwayequipment(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='101'     WHERE ts_code = #{tsCode}")
    void updateBKRailwayequipment(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKRailwayequipment(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'100')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKCarservice(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '100' order by sort_order")
    String[] selectBKCarservice();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKCarservice(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='100'     WHERE ts_code = #{tsCode}")
    void updateBKCarservice(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKCarservice(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'99')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKWhitesmallhold(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '99' order by sort_order")
    String[] selectBKWhitesmallhold();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKWhitesmallhold(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='99'     WHERE ts_code = #{tsCode}")
    void updateBKWhitesmallhold(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKWhitesmallhold(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'98')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKPlasticprd(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '98' order by sort_order")
    String[] selectBKPlasticprd();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKPlasticprd(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='98'     WHERE ts_code = #{tsCode}")
    void updateBKPlasticprd(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKPlasticprd(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'97')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKOtherelectronic(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '97' order by sort_order")
    String[] selectBKOtherelectronic();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKOtherelectronic(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='97'     WHERE ts_code = #{tsCode}")
    void updateBKOtherelectronic(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKOtherelectronic(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'96')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKEnvironmentequipment(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '96' order by sort_order")
    String[] selectBKEnvironmentequipment();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKEnvironmentequipment(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='96'     WHERE ts_code = #{tsCode}")
    void updateBKEnvironmentequipment(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKEnvironmentequipment(@Param("tsCode") String tsCode);
    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'95')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKBrowngoods(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '95' order by sort_order")
    String[] selectBKBrowngoods();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKBrowngoods(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='95'     WHERE ts_code = #{tsCode}")
    void updateBKBrowngoods(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKBrowngoods(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'94')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKCarparts(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '94' order by sort_order")
    String[] selectBKCarparts();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKCarparts(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='94'     WHERE ts_code = #{tsCode}")
    void updateBKCarparts(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKCarparts(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'93')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKEnergymetal(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '93' order by sort_order")
    String[] selectBKEnergymetal();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKEnergymetal(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='93'     WHERE ts_code = #{tsCode}")
    void updateBKEnergymetal(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKEnergymetal(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'92')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKAutoequipment(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '92' order by sort_order")
    String[] selectBKAutoequipment();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKAutoequipment(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='92'     WHERE ts_code = #{tsCode}")
    void updateBKAutoequipment(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKAutoequipment(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'91')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKInsurance(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '91' order by sort_order")
    String[] selectBKInsurance();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKInsurance(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='91'     WHERE ts_code = #{tsCode}")
    void updateBKInsurance(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKInsurance(@Param("tsCode") String tsCode);
    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'90')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKItservice(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '90' order by sort_order")
    String[] selectBKItservice();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKItservice(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='90'     WHERE ts_code = #{tsCode}")
    void updateBKItservice(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKItservice(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'89')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKMilitaryelectronic(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '89' order by sort_order")
    String[] selectBKMilitaryelectronic();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKMilitaryelectronic(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='89'     WHERE ts_code = #{tsCode}")
    void updateBKMilitaryelectronic(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKMilitaryelectronic(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'88')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKAviationequipment(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '88' order by create_date desc")
    String[] selectBKAviationequipment();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKAviationequipment(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='88'     WHERE ts_code = #{tsCode}")
    void updateBKAviationequipment(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKAviationequipment(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'87')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKPhotovoltaicpowergeneration(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '87' order by sort_order")
    String[] selectBKPhotovoltaicpowergeneration();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKPhotovoltaicpowergeneration(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='87'     WHERE ts_code = #{tsCode}")
    void updateBKPhotovoltaicpowergeneration(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKPhotovoltaicpowergeneration(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'86')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKSatellite(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '86' order by sort_order")
    String[] selectBKSatellite();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKSatellite(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='86'     WHERE ts_code = #{tsCode}")
    void updateBKSatellite(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKSatellite(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'85')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKEntertainment(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '85' order by sort_order")
    String[] selectBKEntertainment();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKEntertainment(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='85'     WHERE ts_code = #{tsCode}")
    void updateBKEntertainment(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKEntertainment(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'84')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKDatacenter(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '84' order by sort_order")
    String[] selectBKDatacenter();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKDatacenter(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='84'     WHERE ts_code = #{tsCode}")
    void updateBKDatacenter(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKDatacenter(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'83')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKPort(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '83' order by sort_order")
    String[] selectBKPort();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKPort(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='83'     WHERE ts_code = #{tsCode}")
    void updateBKPort(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKPort(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'82')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKBearing(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '82' order by sort_order")
    String[] selectBKBearing();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKBearing(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='82'     WHERE ts_code = #{tsCode}")
    void updateBKBearing(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKBearing(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'81')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKCNC(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '81' order by sort_order")
    String[] selectBKCNC();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKCNC(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='81'     WHERE ts_code = #{tsCode}")
    void updateBKCNC(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKCNC(@Param("tsCode") String tsCode);
    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'80')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKElectronicequipment(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '80' order by sort_order")
    String[] selectBKElectronicequipment();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKElectronicequipment(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='80'     WHERE ts_code = #{tsCode}")
    void updateBKElectronicequipment(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKElectronicequipment(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'79')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKPowerequipment(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '79' order by sort_order")
    String[] selectBKPowerequipment();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKPowerequipment(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='79'     WHERE ts_code = #{tsCode}")
    void updateBKPowerequipment(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKPowerequipment(@Param("tsCode") String tsCode);
    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'78')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKMilitaryindustry(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '78' order by sort_order")
    String[] selectBKMilitaryindustry();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKMilitaryindustry(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='78'     WHERE ts_code = #{tsCode}")
    void updateBKMilitaryindustry(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKMilitaryindustry(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'77')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKBasicMetalxi(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '77' order by sort_order")
    String[] selectBKBasicMetalxi();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKBasicMetalxi(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='77'     WHERE ts_code = #{tsCode}")
    void updateBKBasicMetalxi(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKBasicMetalxi(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'76')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKCell(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '76' order by sort_order")
    String[] selectBKCell();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKCell(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='76'     WHERE ts_code = #{tsCode}")
    void updateBKCell(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKCell(@Param("tsCode") String tsCode);



    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'75')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKJewelry(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '75' order by sort_order")
    String[] selectBKJewelry();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKJewelry(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='75'     WHERE ts_code = #{tsCode}")
    void updateBKJewelry(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKJewelry(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'74')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKGlass(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '74' order by sort_order")
    String[] selectBKGlass();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKGlass(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='74'     WHERE ts_code = #{tsCode}")
    void updateBKGlass(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKGlass(@Param("tsCode") String tsCode);



    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'73')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKRealestateservices(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '73'  order by sort_order")
    String[] selectBKRealestateservices();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKRealestateservices(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='73'     WHERE ts_code = #{tsCode}")
    void updateBKRealestateservices(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKRealestateservices(@Param("tsCode") String tsCode);

//    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'72')")
//    @Options(useGeneratedKeys = true, keyProperty = "id")
//    int insertBKRobot(StockCollect stockCollect);
//    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '72'  order by sort_order")
//    String[] selectBKRobot();
//    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
//    void delBKRobot(@Param("tsCode") String tsCode);
//    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='72'     WHERE ts_code = #{tsCode}")
//    void updateBKRobot(@Param("tsCode") String tsCode);
//    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
//    int checkIfExistsBKRobot(@Param("tsCode") String tsCode);



    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'71')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKBasicmetaltong(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '71'  order by sort_order")
    String[] selectBKBasicmetaltong();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKBasicmetaltong(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='71'     WHERE ts_code = #{tsCode}")
    void updateBKBasicmetaltong(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKBasicmetaltong(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'70')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKPreciousli(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '70'  order by sort_order")
    String[] selectBKPreciousli();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKPreciousli(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='70'     WHERE ts_code = #{tsCode}")
    void updateBKPreciousli(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKPreciousli(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'69')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKMedicalservice(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '69'  order by sort_order")
    String[] selectBKMedicalservice();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKMedicalservice(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='69'     WHERE ts_code = #{tsCode}")
    void updateBKMedicalservice(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKMedicalservice(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'68')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKSyntheticfibersresins(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '68'  order by sort_order")
    String[] selectBKSyntheticfibersresins();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKSyntheticfibersresins(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='68'     WHERE ts_code = #{tsCode}")
    void updateBKSyntheticfibersresins(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKSyntheticfibersresins(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'67')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKHomefurnishing(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '67'  order by sort_order")
    String[] selectBKHomefurnishing();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKHomefurnishing(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='67'     WHERE ts_code = #{tsCode}")
    void updateBKHomefurnishing(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKHomefurnishing(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'66')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKBeverage(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '66'  order by sort_order")
    String[] selectBKBeverage();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKBeverage(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='66'     WHERE ts_code = #{tsCode}")
    void updateBKBeverage(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKBeverage(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'65')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKMetalprd(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '65'  order by sort_order")
    String[] selectBKMetalprd();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKMetalprd(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='65'     WHERE ts_code = #{tsCode}")
    void updateBKMetalprd(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKMetalprd(@Param("tsCode") String tsCode);



    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'64')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKBasicmetal(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '64'  order by sort_order")
    String[] selectBKBasicmetal();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKBasicmetal(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='64'     WHERE ts_code = #{tsCode}")
    void updateBKBasicmetal(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKBasicmetal(@Param("tsCode") String tsCode);
    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'63')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKMarketingservices(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '63'  order by sort_order")
    String[] selectBKMarketingservices();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKMarketingservices(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='63'     WHERE ts_code = #{tsCode}")
    void updateBKMarketingservices(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKMarketingservices(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'62')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKEducation(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '62'  order by sort_order")
    String[] selectBKEducation();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKEducation(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='62'     WHERE ts_code = #{tsCode}")
    void updateBKEducation(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKEducation(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'61')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKChinesemedicine(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '61'  order by sort_order")
    String[] selectBKChinesemedicine();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKChinesemedicine(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='61'     WHERE ts_code = #{tsCode}")
    void updateBKChinesemedicine(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKChinesemedicine(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'60')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKBiopharmaceuticals(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '60'  order by sort_order")
    String[] selectBKBiopharmaceuticals();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKBiopharmaceuticals(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='60'     WHERE ts_code = #{tsCode}")
    void updateBKBiopharmaceuticals(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKBiopharmaceuticals(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'59')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKChemicalpharmaceuticals(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '59'  order by sort_order")
    String[] selectBKChemicalpharmaceuticals();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKChemicalpharmaceuticals(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='59'     WHERE ts_code = #{tsCode}")
    void updateBKChemicalpharmaceuticals(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKChemicalpharmaceuticals(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'58')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKRoad(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '58'  order by sort_order")
    String[] selectBKRoad();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKRoad(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='58'     WHERE ts_code = #{tsCode}")
    void updateBKRoad(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKRoad(@Param("tsCode") String tsCode);
    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'57')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKBank(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '57'  order by sort_order")
    String[] selectBKBank();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKBank(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='57'     WHERE ts_code = #{tsCode}")
    void updateBKBank(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKBank(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'56')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKWine(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '56'  order by sort_order")
    String[] selectBKWine();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKWine(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='56'     WHERE ts_code = #{tsCode}")
    void updateBKWine(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKWine(@Param("tsCode") String tsCode);
    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'55')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKElectricalmachinery(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '55'  order by sort_order")
    String[] selectBKElectricalmachinery();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKElectricalmachinery(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='55'     WHERE ts_code = #{tsCode}")
    void updateBKElectricalmachinery(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKElectricalmachinery(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'54')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKFishing(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '54'  order by sort_order")
    String[] selectBKFishing();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKFishing(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='54'     WHERE ts_code = #{tsCode}")
    void updateBKFishing(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKFishing(@Param("tsCode") String tsCode);
    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'53')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKPhotovoltaic(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '53'  order by sort_order")
    String[] selectBKPhotovoltaic();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKPhotovoltaic(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='53'     WHERE ts_code = #{tsCode}")
    void updateBKPhotovoltaic(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKPhotovoltaic(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'52')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKCoal(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '52'  order by sort_order")
    String[] selectBKCoal();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKCoal(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='52'     WHERE ts_code = #{tsCode}")
    void updateBKCoal(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKCoal(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'51')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKAnimalhusbandry(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '51'  order by sort_order")
    String[] selectBKAnimalhusbandry();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKAnimalhusbandry(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='51'     WHERE ts_code = #{tsCode}")
    void updateBKAnimalhusbandry(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKAnimalhusbandry(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'50')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKDecoration(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '50'  order by sort_order")
    String[] selectBKDecoration();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKDecoration(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='50'     WHERE ts_code = #{tsCode}")
    void updateBKDecoration(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKDecoration(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'49')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKPreciousmetal(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '49'  order by sort_order")
    String[] selectBKPreciousmetal();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKPreciousmetal(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='49'     WHERE ts_code = #{tsCode}")
    void updateBKPreciousmetal(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKPreciousmetal(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'48')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKChemicalraw(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '48'  order by sort_order")
    String[] selectBKChemicalraw();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKChemicalraw(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='48'     WHERE ts_code = #{tsCode}")
    void updateBKChemicalraw(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKChemicalraw(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'47')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKLightindustry(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '47'  order by sort_order")
    String[] selectBKLightindustry();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKLightindustry(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='47'     WHERE ts_code = #{tsCode}")
    void updateBKLightindustry(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKLightindustry(@Param("tsCode") String tsCode);



    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'46')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKLeisureservices(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '46'  order by sort_order")
    String[] selectBKLeisureservices();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKLeisureservices(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='46'     WHERE ts_code = #{tsCode}")
    void updateBKLeisureservices(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKLeisureservices(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'45')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKBond(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '45'  order by sort_order")
    String[] selectBKBond();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKBond(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='45'     WHERE ts_code = #{tsCode}")
    void updateBKBond(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKBond(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'44')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKMedium(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '44'  order by sort_order")
    String[] selectBKMedium();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKMedium(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='44'     WHERE ts_code = #{tsCode}")
    void updateBKMedium(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKMedium(@Param("tsCode") String tsCode);
    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'43')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKConsumerelectronics(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '43'  order by sort_order")
    String[] selectBKConsumerelectronics();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKConsumerelectronics(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='43'     WHERE ts_code = #{tsCode}")
    void updateBKConsumerelectronics(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKConsumerelectronics(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'42')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKSmallhome(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '42'  order by sort_order")
    String[] selectBKSmallhome();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKSmallhome(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='42'     WHERE ts_code = #{tsCode}")
    void updateBKSmallhome(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKSmallhome(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'41')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKWeave(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '41'  order by sort_order")
    String[] selectBKWeave();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKWeave(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='41'     WHERE ts_code = #{tsCode}")
    void updateBKWeave(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKWeave(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'40')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKMetal(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '40'  order by sort_order")
    String[] selectBKMetal();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKMetal(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='40'     WHERE ts_code = #{tsCode}")
    void updateBKMetal(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKMetal(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'39')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKBuildingconstruction(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '39'  order by sort_order")
    String[] selectBKBuildingconstruction();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKBuildingconstruction(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='39'     WHERE ts_code = #{tsCode}")
    void updateBKBuildingconstruction(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKBuildingconstruction(@Param("tsCode") String tsCode);




    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'38')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKRubber(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '38'  order by sort_order")
    String[] selectBKRubber();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKRubber(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='38'     WHERE ts_code = #{tsCode}")
    void updateBKRubber(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKRubber(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'37')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKCommercialproperties(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '37'  order by sort_order")
    String[] selectBKCommercialproperties();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKCommercialproperties(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='37'     WHERE ts_code = #{tsCode}")
    void updateBKCommercialproperties(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKCommercialproperties(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'36')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKOtherbuildingmaterials(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '36'  order by sort_order")
    String[] selectBKOtherbuildingmaterials();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKOtherbuildingmaterials(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='36'     WHERE ts_code = #{tsCode}")
    void updateBKOtherbuildingmaterials(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKOtherbuildingmaterials(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'35')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKInfrastructure(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '35'  order by sort_order")
    String[] selectBKInfrastructure();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKInfrastructure(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='35'     WHERE ts_code = #{tsCode}")
    void updateBKInfrastructure(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKInfrastructure(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'34')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKSoftware(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '34'  order by sort_order")
    String[] selectBKSoftware();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKSoftware(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='34'     WHERE ts_code = #{tsCode}")
    void updateBKSoftware(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKSoftware(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'33')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKGas(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '33' order by sort_order")
    String[] selectBKGas();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKGas(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='33'     WHERE ts_code = #{tsCode}")
    void updateBKGas(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKGas(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'32')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKMedicalequipment(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '32'  order by sort_order")
    String[] selectBKMedicalequipment();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKMedicalequipment(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='32'     WHERE ts_code = #{tsCode}")
    void updateBKMedicalequipment(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKMedicalequipment(@Param("tsCode") String tsCode);



    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'31')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKAgriculture(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '31' order by sort_order")
    String[] selectBKAgriculture();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKAgriculture(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='31'     WHERE ts_code = #{tsCode}")
    void updateBKAgriculture(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKAgriculture(@Param("tsCode") String tsCode);



    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'30')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKComputerhardware(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '30' order by sort_order")
    String[] selectBKComputerhardware();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKComputerhardware(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='30'     WHERE ts_code = #{tsCode}")
    void updateBKComputerhardware(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKComputerhardware(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'29')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKLogistics(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '29'  order by sort_order")
    String[] selectBKLogistics();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKLogistics(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='29'     WHERE ts_code = #{tsCode}")
    void updateBKLogistics(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKLogistics(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'28')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKCommonequipment(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '28'  order by sort_order")
    String[] selectBKCommonequipment();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKCommonequipment(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='28'     WHERE ts_code = #{tsCode}")
    void updateBKCommonequipment(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKCommonequipment(@Param("tsCode") String tsCode);





    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'27')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKCeramics(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '27'  order by sort_order")
    String[] selectBKCeramics();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKCeramics(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='27'     WHERE ts_code = #{tsCode}")
    void updateBKCeramics(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKCeramics(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'26')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKSpecialequipment(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '26'  order by sort_order")
    String[] selectBKSpecialequipment();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKSpecialequipment(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='26'     WHERE ts_code = #{tsCode}")
    void updateBKSpecialequipment(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKSpecialequipment(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'25')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKElequpiment(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '25'  order by sort_order")
    String[] selectBKElequpiment();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKElequpiment(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='25'     WHERE ts_code = #{tsCode}")
    void updateBKElequpiment(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKElequpiment(@Param("tsCode") String tsCode);



    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'24')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKTour(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '24'  order by sort_order")
    String[] selectBKTour();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKTour(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='24'     WHERE ts_code = #{tsCode}")
    void updateBKTour(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKTour(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'23')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKBroadcast(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '23'  order by sort_order")
    String[] selectBKBroadcast();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKBroadcast(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='23'     WHERE ts_code = #{tsCode}")
    void updateBKBroadcast(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKBroadcast(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'22')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKTree(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '22'  order by sort_order")
    String[] selectBKTree();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKTree(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='22'     WHERE ts_code = #{tsCode}")
    void updateBKTree(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKTree(@Param("tsCode") String tsCode);



    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'21')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKPesticide(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '21'  order by sort_order")
    String[] selectBKPesticide();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKPesticide(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='21'     WHERE ts_code = #{tsCode}")
    void updateBKPesticide(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKPesticide(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'20')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKClothes(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '20'  order by sort_order")
    String[] selectBKClothes();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKClothes(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='20'     WHERE ts_code = #{tsCode}")
    void updateBKClothes(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKClothes(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'19')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKSale(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '19'  order by sort_order")
    String[] selectBKSale();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKSale(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='19'     WHERE ts_code = #{tsCode}")
    void updateBKSale(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKSale(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'18')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKNonBank(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '18'  order by sort_order")
    String[] selectBKNonBank();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKNonBank(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='18'     WHERE ts_code = #{tsCode}")
    void updateBKNonBank(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKNonBank(@Param("tsCode") String tsCode);



    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'17')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKSteel(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '17'  order by sort_order")
    String[] selectBKSteel();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKSteel(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='17'     WHERE ts_code = #{tsCode}")
    void updateBKSteel(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKSteel(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'16')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKChemical(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '16'  order by sort_order")
    String[] selectBKChemical();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKChemical(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='16'     WHERE ts_code = #{tsCode}")
    void updateBKChemical(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKChemical(@Param("tsCode") String tsCode);



    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'15')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKOther(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '15'  order by sort_order")
    String[] selectBKOther();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKOther(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='15'     WHERE ts_code = #{tsCode}")
    void updateBKOther(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKOther(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'14')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKPaper(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '14'  order by sort_order")
    String[] selectBKPaper();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKPaper(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='14'   WHERE ts_code = #{tsCode}")
    void updateBKPaper(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKPaper(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'13')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKEnvironment(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '13'  order by sort_order")
    String[] selectBKEnvironment();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKEnvironment(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='13'  WHERE ts_code = #{tsCode}")
    void updateBKEnvironment(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode} ")
    int checkIfExistsBKEnvironment(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'12')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKEquipment(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '12'  order by sort_order")
    String[] selectBKEquipment();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKEquipment(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='12'   WHERE ts_code = #{tsCode}")
    void updateBKEquipment(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKEquipment(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'11')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKMaterial(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '11'  order by sort_order")
    String[] selectBKMaterial();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKMaterial(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0', flag='11'   WHERE ts_code = #{tsCode}")
    void updateBKMaterial(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKMaterial(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'10')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKCommunication(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '10'  order by sort_order")
    String[] selectBKCommunication();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKCommunication(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0' , flag='10'  WHERE ts_code = #{tsCode}")
    void updateBKCommunication(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKCommunication(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'9')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKElectric(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '9'  order by sort_order")
    String[] selectBKElectric();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKElectric(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0'  , flag='9'  WHERE ts_code = #{tsCode}")
    void updateBKElectric(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKElectric(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'8')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKTransport(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '8'  order by sort_order")
    String[] selectBKTransport();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKTransport(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0' , flag='8'  WHERE ts_code = #{tsCode}")
    void updateBKTransport(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKTransport(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'7')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKTrade(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '7'  order by sort_order")
    String[] selectBKTrade();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKTrade(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0' , flag='7'  WHERE ts_code = #{tsCode}")
    void updateBKTrade(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKTrade(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'6')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKCar(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '6'  order by sort_order")
    String[] selectBKCar();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKCar(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0' , flag='6'   WHERE ts_code = #{tsCode}")
    void updateBKCar(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKCar(@Param("tsCode") String tsCode);






    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'5')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKComputer(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk  where is_deleted = '0' and flag = '5'  order by sort_order")
    String[] selectBKComputer();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKComputer(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0' , flag='5'  WHERE ts_code = #{tsCode}")
    void updateBKComputer(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKComputer(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'4')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKSemiconductor(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk where is_deleted = '0' and flag = '4'  order by sort_order")
    String[] selectBKSemiconductor();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKSemiconductor(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0' , flag='4'    WHERE ts_code = #{tsCode}")
    void updateBKSemiconductor(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKSemiconductor(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'3')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKBuild(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk where is_deleted = '0' and flag = '3'  order by sort_order")
    String[] selectBKBuild();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKBuild(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0'  , flag='3'   WHERE ts_code = #{tsCode}")
    void updateBKBuild(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKBuild(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'2')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKFood(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk where is_deleted = '0' and flag = '2'  order by sort_order")
    String[] selectBKFood();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKFood(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0' , flag='2'   WHERE ts_code = #{tsCode}")
    void updateBKFood(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKFood(@Param("tsCode") String tsCode);




    @Insert("INSERT INTO stock_collect_bk (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'1')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBKMedicine(StockCollect stockCollect);
    @Select("SELECT ts_code FROM stock_collect_bk where is_deleted = '0' and flag = '1'  order by sort_order")
    String[] selectBKMedicine();
    @Update("UPDATE stock_collect_bk SET is_deleted = '1'  WHERE ts_code = #{tsCode}")
    void delBKMedicine(@Param("tsCode") String tsCode);
    @Update("UPDATE stock_collect_bk SET is_deleted = '0'  , flag='1'  WHERE ts_code = #{tsCode}")
    void updateBKMedicine(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    int checkIfExistsBKMedicine(@Param("tsCode") String tsCode);



    @Select("SELECT is_deleted FROM stock_collect WHERE ts_code = #{tsCode} and is_pct10_one = '2'")
    String selectIsFavoriteByTsCode(@Param("tsCode") String tsCode);
    @Select("SELECT is_deleted FROM stock_collect WHERE ts_code = #{tsCode} and is_pct10_one = '1'")
    String selectIsFavoriteByTsCode1(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect (ts_code,create_date) VALUES (#{tsCode}, #{createDate})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insert(StockCollect stockCollect);

    @Insert("INSERT INTO stock_collect_daliang (ts_code,create_date) VALUES (#{tsCode}, #{createDate})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertDaliang(StockCollect stockCollect);

    @Insert("INSERT INTO stock_collect_st (ts_code,create_date) VALUES (#{tsCode}, #{createDate})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertST(StockCollect stockCollect);

    @Insert("INSERT INTO stock_collect_qiaoqiao (ts_code,create_date) VALUES (#{tsCode}, #{createDate})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertQiaoqiao(StockCollect stockCollect);

    @Insert("INSERT INTO stock_collect_waitback (ts_code,create_date) VALUES (#{tsCode}, #{createDate})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertWaitback(StockCollect stockCollect);


    @Insert("INSERT INTO stock_collect_shape (ts_code,create_date) VALUES (#{tsCode}, #{createDate})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertShape(StockCollect stockCollect);




    @Update("UPDATE stock_collect_pctmore SET is_deleted = '1' WHERE ts_code = #{tsCode}")
    void delPctMore(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_pctone SET is_deleted = '1' WHERE ts_code = #{tsCode}")
    void delPctOne(@Param("tsCode") String tsCode);


    @Update("UPDATE stock_collect_daliang SET is_deleted = '1' WHERE ts_code = #{tsCode}")
    void cancelCollectDaliang(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_st SET is_deleted = '1' WHERE ts_code = #{tsCode}")
    void cancelCollectST(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_qiaoqiao SET is_deleted = '1' WHERE ts_code = #{tsCode}")
    void cancelCollectQiaoqiao(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_waitback SET is_deleted = '1' WHERE ts_code = #{tsCode}")
    void delWaitback(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_shape SET is_deleted = '1' WHERE ts_code = #{tsCode}")
    void delShape(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect SET is_deleted = '0'  , is_pct10_one = '2' WHERE ts_code = #{tsCode}")
    void collectPctMore(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_daliang SET is_deleted = '0' WHERE ts_code = #{tsCode}")
    void collectDaliang(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect SET is_deleted = '0' , is_pct10_one = '1' WHERE ts_code = #{tsCode}")
    void collectPctOne(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_st SET is_deleted = '0' WHERE ts_code = #{tsCode}")
    void collectUpdateST(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_qiaoqiao SET is_deleted = '0' WHERE ts_code = #{tsCode}")
    void collectUpdateQiaoqiao(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_waitback SET is_deleted = '0' WHERE ts_code = #{tsCode}")
    void collectUpdateWaitback(@Param("tsCode") String tsCode);




    @Update("UPDATE stock_collect_shape SET is_deleted = '0' WHERE ts_code = #{tsCode}")
    void collectUpdateShape(@Param("tsCode") String tsCode);


    @Select("SELECT COUNT(*) FROM stock_collect WHERE ts_code = #{tsCode}")
    int checkIfExists(@Param("tsCode") String tsCode);
    @Select("SELECT COUNT(*) FROM stock_collect_daliang WHERE ts_code = #{tsCode}")
    int checkIfExistsDaliang(@Param("tsCode") String tsCode);

    @Select("SELECT COUNT(*) FROM stock_collect_st WHERE ts_code = #{tsCode}")
    int checkIfExistsST(@Param("tsCode") String tsCode);

    @Select("SELECT COUNT(*) FROM stock_collect_qiaoqiao WHERE ts_code = #{tsCode}")
    int checkIfExistsQiaoqiao(@Param("tsCode") String tsCode);

    @Select("SELECT COUNT(*) FROM stock_collect_waitback WHERE ts_code = #{tsCode}")
    int checkIfExistsWaitback(@Param("tsCode") String tsCode);




    @Select("SELECT COUNT(*) FROM stock_collect_shape WHERE ts_code = #{tsCode}")
    int checkIfExistsShape(@Param("tsCode") String tsCode);




    @Select("SELECT ts_code FROM stock_collect_pctmore where is_deleted = '0'  order by create_date desc")
    String[] selectPctMore();

    @Select("SELECT ts_code FROM stock_collect_pctone where is_deleted = '0'  order by create_date desc ")
    String[] selectPctOne();



    @Select("SELECT ts_code FROM stock_collect_daliang where is_deleted = '0'  order by create_date desc")
    String[] selectDaliang();

    @Select("SELECT ts_code FROM stock_collect_st where is_deleted = '0'  order by create_date desc")
    String[] selectST();

    @Select("SELECT ts_code FROM stock_collect_qiaoqiao where is_deleted = '0'  order by create_date desc")
    String[] selectQiaoqiao();

    @Select("SELECT ts_code FROM stock_collect_waitback where is_deleted = '0'  order by sort_order ")
    String[] selectWaitback();



    @Select("SELECT ts_code FROM stock_collect_shape where is_deleted = '0' order by create_date desc")
    String[] selectShape();



    @Update("UPDATE stock_collect_bk SET  create_date=#{currentDate}   WHERE ts_code = #{tsCode}")
    void bkTop(@Param("tsCode") String tsCode, @Param("currentDate") Date currentDate);
    @Update("UPDATE stock_collect_bk SET  create_date=#{currentDate}   WHERE ts_code = #{tsCode}")
    void bkBottom(@Param("tsCode") String tsCode, @Param("currentDate") Date currentDate);


    @Update("UPDATE stock_collect_st SET  create_date=#{currentDate}   WHERE ts_code = #{tsCode}")
    void bkTopst(@Param("tsCode") String tsCode, @Param("currentDate") Date currentDate);
    @Update("UPDATE stock_collect_st SET  create_date=#{currentDate}   WHERE ts_code = #{tsCode}")
    void bkBottomst(@Param("tsCode") String tsCode, @Param("currentDate") Date currentDate);

    @Update("UPDATE stock_collect_st  SET sort = (SELECT MAX(sort_order) FROM stock_collect_st) + 1  WHERE ts_code = #{tsCode}")
    void bkTopsort(@Param("tsCode") String tsCode, @Param("currentDate") Date currentDate);
    @Update("UPDATE stock_collect_st SET  create_date=#{currentDate}   WHERE ts_code = #{tsCode}")
    void bkBottomsort(@Param("tsCode") String tsCode, @Param("currentDate") Date currentDate);


    @Select("SELECT ts_code as tsCode,sort_order as sortOrder FROM stock_collect_bk where flag = #{flag} ORDER BY sort_order")
    List<StockCollect> selectAllWithSortOrder(@Param("flag") String flag);

    @Select("SELECT min(sort_order) as sortOrder FROM stock_collect_bk where flag = #{flag} ")
    StockCollect selectMinOrder(@Param("flag") String flag);

    @Select("SELECT max(sort_order) as sortOrder FROM stock_collect_bk where flag = #{flag} ")
    StockCollect selectMaxOrder(@Param("flag") String flag);

    // 更新记录的排序值
    @Update("UPDATE stock_collect_bk SET sort_order = #{newSortOrder} WHERE ts_code = #{tsCode}")
    void updateSortOrder(@Param("tsCode") String tsCode, @Param("newSortOrder") Integer newSortOrder);

    // 根据ID获取记录的排序值
    @Select("SELECT sort_order FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    Integer selectSortOrderById(@Param("tsCode") String tsCode);

    @Select("SELECT flag FROM stock_collect_bk WHERE ts_code = #{tsCode}")
    String selectFlagById(@Param("tsCode") String tsCode);




    @Select("SELECT ts_code as tsCode,sort_order as sortOrder FROM stock_collect_ym where flag = #{flag} ORDER BY sort_order")
    List<StockCollect> selectAllWithSortOrderym(@Param("flag") String flag);

    @Select("SELECT min(sort_order) as sortOrder FROM stock_collect_ym where flag = #{flag} ")
    StockCollect selectMinOrderym(@Param("flag") String flag);

    // 更新记录的排序值
    @Update("UPDATE stock_collect_ym SET sort_order = #{newSortOrder} WHERE ts_code = #{tsCode}")
    void updateSortOrderym(@Param("tsCode") String tsCode, @Param("newSortOrder") Integer newSortOrder);

    // 根据ID获取记录的排序值
    @Select("SELECT sort_order FROM stock_collect_ym WHERE ts_code = #{tsCode}")
    Integer selectSortOrderByIdym(@Param("tsCode") String tsCode);

    @Select("SELECT flag FROM stock_collect_ym WHERE ts_code = #{tsCode}")
    String selectFlagByIdym(@Param("tsCode") String tsCode);






    @Select("SELECT ts_code as tsCode,sort_order as sortOrder FROM stock_collect_waitback where flag = #{flag} ORDER BY sort_order")
    List<StockCollect> selectAllWithSortOrderwaitback(@Param("flag") String flag);

    @Select("SELECT min(sort_order) as sortOrder FROM stock_collect_waitback where flag = #{flag} ")
    StockCollect selectMinOrderwaitback(@Param("flag") String flag);

    // 更新记录的排序值
    @Update("UPDATE stock_collect_waitback SET sort_order = #{newSortOrder} WHERE ts_code = #{tsCode}")
    void updateSortOrderwaitback(@Param("tsCode") String tsCode, @Param("newSortOrder") Integer newSortOrder);

    // 根据ID获取记录的排序值
    @Select("SELECT sort_order FROM stock_collect_waitback WHERE ts_code = #{tsCode}")
    Integer selectSortOrderByIdwaitback(@Param("tsCode") String tsCode);

    @Select("SELECT flag FROM stock_collect_waitback WHERE ts_code = #{tsCode}")
    String selectFlagByIdwaitback(@Param("tsCode") String tsCode);



    @Insert("INSERT INTO stock_collect_zhuizong (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'6')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertzhuizong(StockCollect stockCollect);

    @Select("SELECT ts_code FROM stock_collect_zhuizong  where is_deleted = '0'     order by create_date desc")
    String[] selectzhuizong();

    @Select("SELECT ts_code FROM stock_collect_zhuizong  where is_deleted = '1'   order by sort_order asc")
    String[] selectzanbuZhuizong();


    @Update("UPDATE stock_collect_zhuizong SET is_deleted = '1' ,create_date = now()   WHERE ts_code = #{tsCode}")
    void delzhuizong(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_zhuizong SET is_deleted = '0',create_date = now()     WHERE ts_code = #{tsCode}")
    void updatezhuizong(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_zhuizong SET is_deleted = '0' ,create_date = now()    WHERE ts_code = #{tsCode}")
    void goonzhuizong(@Param("tsCode") String tsCode);

    @Select("SELECT COUNT(*) FROM stock_collect_zhuizong WHERE ts_code = #{tsCode}")
    int checkIfExistszhuizong(@Param("tsCode") String tsCode);


    @Select("SELECT ts_code as tsCode,sort_order as sortOrder FROM stock_collect_zhuizong where flag = #{flag} ORDER BY sort_order")
    List<StockCollect> selectAllWithSortOrderzhuizong(@Param("flag") String flag);

    @Select("SELECT min(sort_order) as sortOrder FROM stock_collect_zhuizong where flag = #{flag} ")
    StockCollect selectMinOrderzhuizong(@Param("flag") String flag);

    @Select("SELECT max(sort_order) as sortOrder FROM stock_collect_zhuizong where flag = #{flag} ")
    StockCollect selectMaxOrderzhuizong(@Param("flag") String flag);

    // 更新记录的排序值
    @Update("UPDATE stock_collect_zhuizong SET sort_order = #{newSortOrder} WHERE ts_code = #{tsCode}")
    void updateSortOrderzhuizong(@Param("tsCode") String tsCode, @Param("newSortOrder") Integer newSortOrder);

    // 根据ID获取记录的排序值
    @Select("SELECT sort_order FROM stock_collect_zhuizong WHERE ts_code = #{tsCode}")
    Integer selectSortOrderByIdzhuizong(@Param("tsCode") String tsCode);

    @Select("SELECT flag FROM stock_collect_zhuizong WHERE ts_code = #{tsCode}")
    String selectFlagByIdzhuizong(@Param("tsCode") String tsCode);






    @Select("SELECT ts_code as tsCode,sort_order as sortOrder FROM stock_collect_rengongzhineng where flag = #{flag} ORDER BY sort_order")
    List<StockCollect> selectAllWithSortOrderrengongzhineng(@Param("flag") String flag);

    @Select("SELECT min(sort_order) as sortOrder FROM stock_collect_rengongzhineng where flag = #{flag} ")
    StockCollect selectMinOrderrengongzhineng(@Param("flag") String flag);

    @Select("SELECT max(sort_order) as sortOrder FROM stock_collect_rengongzhineng where flag = #{flag} ")
    StockCollect selectMaxOrderrengongzhineng(@Param("flag") String flag);

    // 更新记录的排序值
    @Update("UPDATE stock_collect_rengongzhineng SET sort_order = #{newSortOrder} WHERE ts_code = #{tsCode}")
    void updateSortOrderrengongzhineng(@Param("tsCode") String tsCode, @Param("newSortOrder") Integer newSortOrder);

    // 根据ID获取记录的排序值
    @Select("SELECT sort_order FROM stock_collect_rengongzhineng WHERE ts_code = #{tsCode}")
    Integer selectSortOrderByIdrengongzhineng(@Param("tsCode") String tsCode);

    @Select("SELECT flag FROM stock_collect_rengongzhineng WHERE ts_code = #{tsCode}")
    String selectFlagByIdrengongzhineng(@Param("tsCode") String tsCode);

    @Select("SELECT ts_code FROM stock_collect_rengongzhineng where is_deleted = '0'  order by sort_order ")
    String[] selectrengongzhineng();

    @Select("SELECT COUNT(*) FROM stock_collect_rengongzhineng WHERE ts_code = #{tsCode}")
    int checkIfExistsrengongzhineng(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_rengongzhineng SET is_deleted = '0' WHERE ts_code = #{tsCode}")
    void collectUpdaterengongzhineng(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_rengongzhineng (ts_code,create_date) VALUES (#{tsCode}, #{createDate})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertrengongzhineng(StockCollect stockCollect);



    @Select("SELECT ts_code as tsCode,sort_order as sortOrder FROM stock_collect_wuyeguanli where flag = #{flag} ORDER BY sort_order")
    List<StockCollect> selectAllWithSortOrderwuyeguanli(@Param("flag") String flag);

    @Select("SELECT min(sort_order) as sortOrder FROM stock_collect_wuyeguanli where flag = #{flag} ")
    StockCollect selectMinOrderwuyeguanli(@Param("flag") String flag);

    @Select("SELECT max(sort_order) as sortOrder FROM stock_collect_wuyeguanli where flag = #{flag} ")
    StockCollect selectMaxOrderwuyeguanli(@Param("flag") String flag);

    // 更新记录的排序值
    @Update("UPDATE stock_collect_wuyeguanli SET sort_order = #{newSortOrder} WHERE ts_code = #{tsCode}")
    void updateSortOrderwuyeguanli(@Param("tsCode") String tsCode, @Param("newSortOrder") Integer newSortOrder);

    // 根据ID获取记录的排序值
    @Select("SELECT sort_order FROM stock_collect_wuyeguanli WHERE ts_code = #{tsCode}")
    Integer selectSortOrderByIdwuyeguanli(@Param("tsCode") String tsCode);

    @Select("SELECT flag FROM stock_collect_wuyeguanli WHERE ts_code = #{tsCode}")
    String selectFlagByIdwuyeguanli(@Param("tsCode") String tsCode);

    @Select("SELECT ts_code FROM stock_collect_wuyeguanli where is_deleted = '0'  order by sort_order ")
    String[] selectwuyeguanli();

    @Select("SELECT COUNT(*) FROM stock_collect_wuyeguanli WHERE ts_code = #{tsCode}")
    int checkIfExistswuyeguanli(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_wuyeguanli SET is_deleted = '0' WHERE ts_code = #{tsCode}")
    void collectUpdatewuyeguanli(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_wuyeguanli (ts_code,create_date) VALUES (#{tsCode}, #{createDate})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertwuyeguanli(StockCollect stockCollect);




    @Select("SELECT ts_code as tsCode,sort_order as sortOrder FROM stock_collect_xiangcunzhenxing where flag = #{flag} ORDER BY sort_order")
    List<StockCollect> selectAllWithSortOrderxiangcunzhenxing(@Param("flag") String flag);

    @Select("SELECT min(sort_order) as sortOrder FROM stock_collect_xiangcunzhenxing where flag = #{flag} ")
    StockCollect selectMinOrderxiangcunzhenxing(@Param("flag") String flag);

    @Select("SELECT max(sort_order) as sortOrder FROM stock_collect_xiangcunzhenxing where flag = #{flag} ")
    StockCollect selectMaxOrderxiangcunzhenxing(@Param("flag") String flag);

    // 更新记录的排序值
    @Update("UPDATE stock_collect_xiangcunzhenxing SET sort_order = #{newSortOrder} WHERE ts_code = #{tsCode}")
    void updateSortOrderxiangcunzhenxing(@Param("tsCode") String tsCode, @Param("newSortOrder") Integer newSortOrder);

    // 根据ID获取记录的排序值
    @Select("SELECT sort_order FROM stock_collect_xiangcunzhenxing WHERE ts_code = #{tsCode}")
    Integer selectSortOrderByIdxiangcunzhenxing(@Param("tsCode") String tsCode);

    @Select("SELECT flag FROM stock_collect_xiangcunzhenxing WHERE ts_code = #{tsCode}")
    String selectFlagByIdxiangcunzhenxing(@Param("tsCode") String tsCode);

    @Select("SELECT ts_code FROM stock_collect_xiangcunzhenxing where is_deleted = '0'  order by sort_order ")
    String[] selectxiangcunzhenxing();

    @Select("SELECT COUNT(*) FROM stock_collect_xiangcunzhenxing WHERE ts_code = #{tsCode}")
    int checkIfExistsxiangcunzhenxing(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_xiangcunzhenxing SET is_deleted = '0' WHERE ts_code = #{tsCode}")
    void collectUpdatexiangcunzhenxing(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_xiangcunzhenxing (ts_code,create_date) VALUES (#{tsCode}, #{createDate})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertxiangcunzhenxing(StockCollect stockCollect);



    @Select("SELECT ts_code as tsCode,sort_order as sortOrder FROM stock_collect_gnyiyuanall where flag = #{flag} ORDER BY sort_order")
    List<StockCollect> selectAllWithSortOrdergnyiyuanall(@Param("flag") String flag);

    @Select("SELECT min(sort_order) as sortOrder FROM stock_collect_gnyiyuanall where flag = #{flag} ")
    StockCollect selectMinOrdergnyiyuanall(@Param("flag") String flag);

    @Select("SELECT max(sort_order) as sortOrder FROM stock_collect_gnyiyuanall where flag = #{flag} ")
    StockCollect selectMaxOrdergnyiyuanall(@Param("flag") String flag);

    // 更新记录的排序值
    @Update("UPDATE stock_collect_gnyiyuanall SET sort_order = #{newSortOrder} WHERE ts_code = #{tsCode}")
    void updateSortOrdergnyiyuanall(@Param("tsCode") String tsCode, @Param("newSortOrder") Integer newSortOrder);

    // 根据ID获取记录的排序值
    @Select("SELECT sort_order FROM stock_collect_gnyiyuanall WHERE ts_code = #{tsCode}")
    Integer selectSortOrderByIdgnyiyuanall(@Param("tsCode") String tsCode);

    @Select("SELECT flag FROM stock_collect_gnyiyuanall WHERE ts_code = #{tsCode}")
    String selectFlagByIdgnyiyuanall(@Param("tsCode") String tsCode);

    @Select("SELECT ts_code FROM stock_collect_gnyiyuanall where is_deleted = '0'  order by sort_order ")
    String[] selectgnyiyuanall();

    @Select("SELECT COUNT(*) FROM stock_collect_gnyiyuanall WHERE ts_code = #{tsCode}")
    int checkIfExistsgnyiyuanall(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_gnyiyuanall SET is_deleted = '0' WHERE ts_code = #{tsCode}")
    void collectUpdategnyiyuanall(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_gnyiyuanall (ts_code,create_date) VALUES (#{tsCode}, #{createDate})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertgnyiyuanall(StockCollect stockCollect);



    @Select("SELECT ts_code as tsCode,sort_order as sortOrder FROM stock_collect_gnyiyaodianshanall where flag = #{flag} ORDER BY sort_order")
    List<StockCollect> selectAllWithSortOrdergnyiyaodianshanall(@Param("flag") String flag);

    @Select("SELECT min(sort_order) as sortOrder FROM stock_collect_gnyiyaodianshanall where flag = #{flag} ")
    StockCollect selectMinOrdergnyiyaodianshanall(@Param("flag") String flag);

    @Select("SELECT max(sort_order) as sortOrder FROM stock_collect_gnyiyaodianshanall where flag = #{flag} ")
    StockCollect selectMaxOrdergnyiyaodianshanall(@Param("flag") String flag);


    // 更新记录的排序值
    @Update("UPDATE stock_collect_gnyiyaodianshanall SET sort_order = #{newSortOrder} WHERE ts_code = #{tsCode}")
    void updateSortOrdergnyiyaodianshanall(@Param("tsCode") String tsCode, @Param("newSortOrder") Integer newSortOrder);

    // 根据ID获取记录的排序值
    @Select("SELECT sort_order FROM stock_collect_gnyiyaodianshanall WHERE ts_code = #{tsCode}")
    Integer selectSortOrderByIdgnyiyaodianshanall(@Param("tsCode") String tsCode);

    @Select("SELECT flag FROM stock_collect_gnyiyaodianshanall WHERE ts_code = #{tsCode}")
    String selectFlagByIdgnyiyaodianshanall(@Param("tsCode") String tsCode);

    @Select("SELECT ts_code FROM stock_collect_gnyiyaodianshanall where is_deleted = '0'  order by sort_order ")
    String[] selectgnyiyaodianshanall();

    @Select("SELECT COUNT(*) FROM stock_collect_gnyiyaodianshanall WHERE ts_code = #{tsCode}")
    int checkIfExistsgnyiyaodianshanall(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_gnyiyaodianshanall SET is_deleted = '0' WHERE ts_code = #{tsCode}")
    void collectUpdategnyiyaodianshanall(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_gnyiyaodianshanall (ts_code,create_date) VALUES (#{tsCode}, #{createDate})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertgnyiyaodianshanall(StockCollect stockCollect);




    @Select("SELECT ts_code as tsCode,sort_order as sortOrder FROM stock_collect_gnliuganall where flag = #{flag} ORDER BY sort_order")
    List<StockCollect> selectAllWithSortOrdergnliuganall(@Param("flag") String flag);

    @Select("SELECT min(sort_order) as sortOrder FROM stock_collect_gnliuganall where flag = #{flag} ")
    StockCollect selectMinOrdergnliuganall(@Param("flag") String flag);

    @Select("SELECT max(sort_order) as sortOrder FROM stock_collect_gnliuganall where flag = #{flag} ")
    StockCollect selectMaxOrdergnliuganall(@Param("flag") String flag);


    // 更新记录的排序值
    @Update("UPDATE stock_collect_gnliuganall SET sort_order = #{newSortOrder} WHERE ts_code = #{tsCode}")
    void updateSortOrdergnliuganall(@Param("tsCode") String tsCode, @Param("newSortOrder") Integer newSortOrder);

    // 根据ID获取记录的排序值
    @Select("SELECT sort_order FROM stock_collect_gnliuganall WHERE ts_code = #{tsCode}")
    Integer selectSortOrderByIdgnliuganall(@Param("tsCode") String tsCode);

    @Select("SELECT flag FROM stock_collect_gnliuganall WHERE ts_code = #{tsCode}")
    String selectFlagByIdgnliuganall(@Param("tsCode") String tsCode);

    @Select("SELECT ts_code FROM stock_collect_gnliuganall where is_deleted = '0'  order by sort_order ASC ")
    String[] selectgnliuganall();

    @Select("SELECT COUNT(*) FROM stock_collect_gnliuganall WHERE ts_code = #{tsCode}")
    int checkIfExistsgnliuganall(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_gnliuganall SET is_deleted = '0' WHERE ts_code = #{tsCode}")
    void collectUpdategnliuganall(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_gnliuganall (ts_code,create_date) VALUES (#{tsCode}, #{createDate})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertgnliuganall(StockCollect stockCollect);

    @Select("SELECT ts_code as tsCode,sort_order as sortOrder FROM stock_collect_gnchuantouall where flag = #{flag} ORDER BY sort_order")
    List<StockCollect> selectAllWithSortOrdergnchuantouall(@Param("flag") String flag);

    @Select("SELECT min(sort_order) as sortOrder FROM stock_collect_gnchuantouall where flag = #{flag} ")
    StockCollect selectMinOrdergnchuantouall(@Param("flag") String flag);


    @Select("SELECT max(sort_order) as sortOrder FROM stock_collect_gnchuantouall where flag = #{flag} ")
    StockCollect selectMaxOrdergnchuantouall(@Param("flag") String flag);

    // 更新记录的排序值
    @Update("UPDATE stock_collect_gnchuantouall SET sort_order = #{newSortOrder} WHERE ts_code = #{tsCode}")
    void updateSortOrdergnchuantouall(@Param("tsCode") String tsCode, @Param("newSortOrder") Integer newSortOrder);

    // 根据ID获取记录的排序值
    @Select("SELECT sort_order FROM stock_collect_gnchuantouall WHERE ts_code = #{tsCode}")
    Integer selectSortOrderByIdgnchuantouall(@Param("tsCode") String tsCode);

    @Select("SELECT flag FROM stock_collect_gnchuantouall WHERE ts_code = #{tsCode}")
    String selectFlagByIdgnchuantouall(@Param("tsCode") String tsCode);

    @Select("SELECT ts_code FROM stock_collect_gnchuantouall where is_deleted = '0'  order by   sort_order ASC ")
    String[] selectgnchuantouall();

    @Select("SELECT COUNT(*) FROM stock_collect_gnchuantouall WHERE ts_code = #{tsCode}")
    int checkIfExistsgnchuantouall(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_gnchuantouall SET is_deleted = '0' WHERE ts_code = #{tsCode}")
    void collectUpdategnchuantouall(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_gnchuantouall (ts_code,create_date) VALUES (#{tsCode}, #{createDate})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertgnchuantouall(StockCollect stockCollect);



    @Select("SELECT ts_code as tsCode,sort_order as sortOrder FROM stock_collect_gntudiliuzhuang where flag = #{flag} ORDER BY sort_order")
    List<StockCollect> selectAllWithSortOrdergntudiliuzhuang(@Param("flag") String flag);

    @Select("SELECT min(sort_order) as sortOrder FROM stock_collect_gntudiliuzhuang where flag = #{flag} ")
    StockCollect selectMinOrdergntudiliuzhuang(@Param("flag") String flag);

    @Select("SELECT max(sort_order) as sortOrder FROM stock_collect_gntudiliuzhuang where flag = #{flag} ")
    StockCollect selectMaxOrdergntudiliuzhuang(@Param("flag") String flag);

    // 更新记录的排序值
    @Update("UPDATE stock_collect_gntudiliuzhuang SET sort_order = #{newSortOrder} WHERE ts_code = #{tsCode}")
    void updateSortOrdergntudiliuzhuang(@Param("tsCode") String tsCode, @Param("newSortOrder") Integer newSortOrder);

    // 根据ID获取记录的排序值
    @Select("SELECT sort_order FROM stock_collect_gntudiliuzhuang WHERE ts_code = #{tsCode}")
    Integer selectSortOrderByIdgntudiliuzhuang(@Param("tsCode") String tsCode);

    @Select("SELECT flag FROM stock_collect_gntudiliuzhuang WHERE ts_code = #{tsCode}")
    String selectFlagByIdgntudiliuzhuang(@Param("tsCode") String tsCode);

    @Select("SELECT ts_code FROM stock_collect_gntudiliuzhuang where is_deleted = '0'  order by   sort_order ASC ")
    String[] selectgntudiliuzhuang();

    @Select("SELECT COUNT(*) FROM stock_collect_gntudiliuzhuang WHERE ts_code = #{tsCode}")
    int checkIfExistsgntudiliuzhuang(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_gntudiliuzhuang SET is_deleted = '0' WHERE ts_code = #{tsCode}")
    void collectUpdategntudiliuzhuang(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_gntudiliuzhuang (ts_code,create_date) VALUES (#{tsCode}, #{createDate})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertgntudiliuzhuang(StockCollect stockCollect);

    @Select("SELECT ts_code as tsCode,sort_order as sortOrder FROM stock_collect_gnjiyincexuall where flag = #{flag} ORDER BY sort_order")
    List<StockCollect> selectAllWithSortOrdergnjiyincexuall(@Param("flag") String flag);

    @Select("SELECT min(sort_order) as sortOrder FROM stock_collect_gnjiyincexuall where flag = #{flag} ")
    StockCollect selectMinOrdergnjiyincexuall(@Param("flag") String flag);

    @Select("SELECT max(sort_order) as sortOrder FROM stock_collect_gnjiyincexuall where flag = #{flag} ")
    StockCollect selectMaxOrdergnjiyincexuall(@Param("flag") String flag);

    // 更新记录的排序值
    @Update("UPDATE stock_collect_gnjiyincexuall SET sort_order = #{newSortOrder} WHERE ts_code = #{tsCode}")
    void updateSortOrdergnjiyincexuall(@Param("tsCode") String tsCode, @Param("newSortOrder") Integer newSortOrder);

    // 根据ID获取记录的排序值
    @Select("SELECT sort_order FROM stock_collect_gnjiyincexuall WHERE ts_code = #{tsCode}")
    Integer selectSortOrderByIdgnjiyincexuall(@Param("tsCode") String tsCode);

    @Select("SELECT flag FROM stock_collect_gnjiyincexuall WHERE ts_code = #{tsCode}")
    String selectFlagByIdgnjiyincexuall(@Param("tsCode") String tsCode);

    @Select("SELECT ts_code FROM stock_collect_gnjiyincexuall where is_deleted = '0'  order by   sort_order ASC ")
    String[] selectgnjiyincexuall();

    @Select("SELECT COUNT(*) FROM stock_collect_gnjiyincexuall WHERE ts_code = #{tsCode}")
    int checkIfExistsgnjiyincexuall(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_gnjiyincexuall SET is_deleted = '0' WHERE ts_code = #{tsCode}")
    void collectUpdategnjiyincexuall(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_gnjiyincexuall (ts_code,create_date) VALUES (#{tsCode}, #{createDate})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertgnjiyincexuall(StockCollect stockCollect);


    @Select("SELECT ts_code as tsCode,sort_order as sortOrder FROM stock_collect_gnlenglianwuliuall where flag = #{flag} ORDER BY sort_order")
    List<StockCollect> selectAllWithSortOrdergnlenglianwuliuall(@Param("flag") String flag);

    @Select("SELECT min(sort_order) as sortOrder FROM stock_collect_gnlenglianwuliuall where flag = #{flag} ")
    StockCollect selectMinOrdergnlenglianwuliuall(@Param("flag") String flag);

    @Select("SELECT max(sort_order) as sortOrder FROM stock_collect_gnlenglianwuliuall where flag = #{flag} ")
    StockCollect selectMaxOrdergnlenglianwuliuall(@Param("flag") String flag);

    // 更新记录的排序值
    @Update("UPDATE stock_collect_gnlenglianwuliuall SET sort_order = #{newSortOrder} WHERE ts_code = #{tsCode}")
    void updateSortOrdergnlenglianwuliuall(@Param("tsCode") String tsCode, @Param("newSortOrder") Integer newSortOrder);

    // 根据ID获取记录的排序值
    @Select("SELECT sort_order FROM stock_collect_gnlenglianwuliuall WHERE ts_code = #{tsCode}")
    Integer selectSortOrderByIdgnlenglianwuliuall(@Param("tsCode") String tsCode);

    @Select("SELECT flag FROM stock_collect_gnlenglianwuliuall WHERE ts_code = #{tsCode}")
    String selectFlagByIdgnlenglianwuliuall(@Param("tsCode") String tsCode);

    @Select("SELECT ts_code FROM stock_collect_gnlenglianwuliuall where is_deleted = '0'  order by   sort_order ASC ")
    String[] selectgnlenglianwuliuall();

    @Select("SELECT COUNT(*) FROM stock_collect_gnlenglianwuliuall WHERE ts_code = #{tsCode}")
    int checkIfExistsgnlenglianwuliuall(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_gnlenglianwuliuall SET is_deleted = '0' WHERE ts_code = #{tsCode}")
    void collectUpdategnlenglianwuliuall(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_gnlenglianwuliuall (ts_code,create_date) VALUES (#{tsCode}, #{createDate})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertgnlenglianwuliuall(StockCollect stockCollect);





    @Select("SELECT ts_code as tsCode,sort_order as sortOrder FROM stock_collect_gnyanglaoall where flag = #{flag} ORDER BY sort_order")
    List<StockCollect> selectAllWithSortOrdergnyanglaoall(@Param("flag") String flag);

    @Select("SELECT min(sort_order) as sortOrder FROM stock_collect_gnyanglaoall where flag = #{flag} ")
    StockCollect selectMinOrdergnyanglaoall(@Param("flag") String flag);

    @Select("SELECT max(sort_order) as sortOrder FROM stock_collect_gnyanglaoall where flag = #{flag} ")
    StockCollect selectMaxOrdergnyanglaoall(@Param("flag") String flag);

    // 更新记录的排序值
    @Update("UPDATE stock_collect_gnyanglaoall SET sort_order = #{newSortOrder} WHERE ts_code = #{tsCode}")
    void updateSortOrdergnyanglaoall(@Param("tsCode") String tsCode, @Param("newSortOrder") Integer newSortOrder);

    // 根据ID获取记录的排序值
    @Select("SELECT sort_order FROM stock_collect_gnyanglaoall WHERE ts_code = #{tsCode}")
    Integer selectSortOrderByIdgnyanglaoall(@Param("tsCode") String tsCode);

    @Select("SELECT flag FROM stock_collect_gnyanglaoall WHERE ts_code = #{tsCode}")
    String selectFlagByIdgnyanglaoall(@Param("tsCode") String tsCode);

    @Select("SELECT ts_code FROM stock_collect_gnyanglaoall where is_deleted = '0'  order by   sort_order ASC ")
    String[] selectgnyanglaoall();

    @Select("SELECT COUNT(*) FROM stock_collect_gnyanglaoall WHERE ts_code = #{tsCode}")
    int checkIfExistsgnyanglaoall(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_gnyanglaoall SET is_deleted = '0' WHERE ts_code = #{tsCode}")
    void collectUpdategnyanglaoall(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_gnyanglaoall (ts_code,create_date) VALUES (#{tsCode}, #{createDate})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertgnyanglaoall(StockCollect stockCollect);





    @Select("SELECT ts_code as tsCode,sort_order as sortOrder FROM stock_collect_gnyangjiall where flag = #{flag} ORDER BY sort_order")
    List<StockCollect> selectAllWithSortOrdergnyangjiall(@Param("flag") String flag);

    @Select("SELECT min(sort_order) as sortOrder FROM stock_collect_gnyangjiall where flag = #{flag} ")
    StockCollect selectMinOrdergnyangjiall(@Param("flag") String flag);

    @Select("SELECT max(sort_order) as sortOrder FROM stock_collect_gnyangjiall where flag = #{flag} ")
    StockCollect selectMaxOrdergnyangjiall(@Param("flag") String flag);

    // 更新记录的排序值
    @Update("UPDATE stock_collect_gnyangjiall SET sort_order = #{newSortOrder} WHERE ts_code = #{tsCode}")
    void updateSortOrdergnyangjiall(@Param("tsCode") String tsCode, @Param("newSortOrder") Integer newSortOrder);

    // 根据ID获取记录的排序值
    @Select("SELECT sort_order FROM stock_collect_gnyangjiall WHERE ts_code = #{tsCode}")
    Integer selectSortOrderByIdgnyangjiall(@Param("tsCode") String tsCode);

    @Select("SELECT flag FROM stock_collect_gnyangjiall WHERE ts_code = #{tsCode}")
    String selectFlagByIdgnyangjiall(@Param("tsCode") String tsCode);

    @Select("SELECT ts_code FROM stock_collect_gnyangjiall where is_deleted = '0'  order by   sort_order ASC ")
    String[] selectgnyangjiall();

    @Select("SELECT COUNT(*) FROM stock_collect_gnyangjiall WHERE ts_code = #{tsCode}")
    int checkIfExistsgnyangjiall(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_gnyangjiall SET is_deleted = '0' WHERE ts_code = #{tsCode}")
    void collectUpdategnyangjiall(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_gnyangjiall (ts_code,create_date) VALUES (#{tsCode}, #{createDate})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertgnyangjiall(StockCollect stockCollect);




    @Select("SELECT ts_code as tsCode,sort_order as sortOrder FROM stock_collect_gnyankeyiliao where flag = #{flag} ORDER BY sort_order")
    List<StockCollect> selectAllWithSortOrdergnyankeyiliao(@Param("flag") String flag);

    @Select("SELECT min(sort_order) as sortOrder FROM stock_collect_gnyankeyiliao where flag = #{flag} ")
    StockCollect selectMinOrdergnyankeyiliao(@Param("flag") String flag);

    @Select("SELECT max(sort_order) as sortOrder FROM stock_collect_gnyankeyiliao where flag = #{flag} ")
    StockCollect selectMaxOrdergnyankeyiliao(@Param("flag") String flag);

    // 更新记录的排序值
    @Update("UPDATE stock_collect_gnyankeyiliao SET sort_order = #{newSortOrder} WHERE ts_code = #{tsCode}")
    void updateSortOrdergnyankeyiliao(@Param("tsCode") String tsCode, @Param("newSortOrder") Integer newSortOrder);

    // 根据ID获取记录的排序值
    @Select("SELECT sort_order FROM stock_collect_gnyankeyiliao WHERE ts_code = #{tsCode}")
    Integer selectSortOrderByIdgnyankeyiliao(@Param("tsCode") String tsCode);

    @Select("SELECT flag FROM stock_collect_gnyankeyiliao WHERE ts_code = #{tsCode}")
    String selectFlagByIdgnyankeyiliao(@Param("tsCode") String tsCode);

    @Select("SELECT ts_code FROM stock_collect_gnyankeyiliao where is_deleted = '0'  order by   sort_order ASC ")
    String[] selectgnyankeyiliao();

    @Select("SELECT COUNT(*) FROM stock_collect_gnyankeyiliao WHERE ts_code = #{tsCode}")
    int checkIfExistsgnyankeyiliao(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_gnyankeyiliao SET is_deleted = '0' WHERE ts_code = #{tsCode}")
    void collectUpdategnyankeyiliao(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_gnyankeyiliao (ts_code,create_date) VALUES (#{tsCode}, #{createDate})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertgnyankeyiliao(StockCollect stockCollect);





    @Select("SELECT ts_code as tsCode,sort_order as sortOrder FROM stock_collect_gnyehulitiall where flag = #{flag} ORDER BY sort_order")
    List<StockCollect> selectAllWithSortOrdergnyehulitiall(@Param("flag") String flag);

    @Select("SELECT min(sort_order) as sortOrder FROM stock_collect_gnyehulitiall where flag = #{flag} ")
    StockCollect selectMinOrdergnyehulitiall(@Param("flag") String flag);

    @Select("SELECT max(sort_order) as sortOrder FROM stock_collect_gnyehulitiall where flag = #{flag} ")
    StockCollect selectMaxOrdergnyehulitiall(@Param("flag") String flag);

    // 更新记录的排序值
    @Update("UPDATE stock_collect_gnyehulitiall SET sort_order = #{newSortOrder} WHERE ts_code = #{tsCode}")
    void updateSortOrdergnyehulitiall(@Param("tsCode") String tsCode, @Param("newSortOrder") Integer newSortOrder);

    // 根据ID获取记录的排序值
    @Select("SELECT sort_order FROM stock_collect_gnyehulitiall WHERE ts_code = #{tsCode}")
    Integer selectSortOrderByIdgnyehulitiall(@Param("tsCode") String tsCode);

    @Select("SELECT flag FROM stock_collect_gnyehulitiall WHERE ts_code = #{tsCode}")
    String selectFlagByIdgnyehulitiall(@Param("tsCode") String tsCode);

    @Select("SELECT ts_code FROM stock_collect_gnyehulitiall where is_deleted = '0'  order by   sort_order ASC ")
    String[] selectgnyehulitiall();

    @Select("SELECT COUNT(*) FROM stock_collect_gnyehulitiall WHERE ts_code = #{tsCode}")
    int checkIfExistsgnyehulitiall(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_gnyehulitiall SET is_deleted = '0' WHERE ts_code = #{tsCode}")
    void collectUpdategnyehulitiall(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_gnyehulitiall (ts_code,create_date) VALUES (#{tsCode}, #{createDate})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertgnyehulitiall(StockCollect stockCollect);



    @Select("SELECT ts_code as tsCode,sort_order as sortOrder FROM stock_collect_gnyancaoall where flag = #{flag} ORDER BY sort_order")
    List<StockCollect> selectAllWithSortOrdergnyancaoall(@Param("flag") String flag);

    @Select("SELECT min(sort_order) as sortOrder FROM stock_collect_gnyancaoall where flag = #{flag} ")
    StockCollect selectMinOrdergnyancaoall(@Param("flag") String flag);

    @Select("SELECT max(sort_order) as sortOrder FROM stock_collect_gnyancaoall where flag = #{flag} ")
    StockCollect selectMaxOrdergnyancaoall(@Param("flag") String flag);

    // 更新记录的排序值
    @Update("UPDATE stock_collect_gnyancaoall SET sort_order = #{newSortOrder} WHERE ts_code = #{tsCode}")
    void updateSortOrdergnyancaoall(@Param("tsCode") String tsCode, @Param("newSortOrder") Integer newSortOrder);

    // 根据ID获取记录的排序值
    @Select("SELECT sort_order FROM stock_collect_gnyancaoall WHERE ts_code = #{tsCode}")
    Integer selectSortOrderByIdgnyancaoall(@Param("tsCode") String tsCode);

    @Select("SELECT flag FROM stock_collect_gnyancaoall WHERE ts_code = #{tsCode}")
    String selectFlagByIdgnyancaoall(@Param("tsCode") String tsCode);

    @Select("SELECT ts_code FROM stock_collect_gnyancaoall where is_deleted = '0'  order by   sort_order ASC ")
    String[] selectgnyancaoall();

    @Select("SELECT COUNT(*) FROM stock_collect_gnyancaoall WHERE ts_code = #{tsCode}")
    int checkIfExistsgnyancaoall(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_gnyancaoall SET is_deleted = '0' WHERE ts_code = #{tsCode}")
    void collectUpdategnyancaoall(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_gnyancaoall (ts_code,create_date) VALUES (#{tsCode}, #{createDate})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertgnyancaoall(StockCollect stockCollect);





    @Select("SELECT ts_code as tsCode,sort_order as sortOrder FROM stock_collect_gnyakeyiliaoall where flag = #{flag} ORDER BY sort_order")
    List<StockCollect> selectAllWithSortOrdergnyakeyiliaoall(@Param("flag") String flag);

    @Select("SELECT min(sort_order) as sortOrder FROM stock_collect_gnyakeyiliaoall where flag = #{flag} ")
    StockCollect selectMinOrdergnyakeyiliaoall(@Param("flag") String flag);

    @Select("SELECT max(sort_order) as sortOrder FROM stock_collect_gnyakeyiliaoall where flag = #{flag} ")
    StockCollect selectMaxOrdergnyakeyiliaoall(@Param("flag") String flag);

    // 更新记录的排序值
    @Update("UPDATE stock_collect_gnyakeyiliaoall SET sort_order = #{newSortOrder} WHERE ts_code = #{tsCode}")
    void updateSortOrdergnyakeyiliaoall(@Param("tsCode") String tsCode, @Param("newSortOrder") Integer newSortOrder);

    // 根据ID获取记录的排序值
    @Select("SELECT sort_order FROM stock_collect_gnyakeyiliaoall WHERE ts_code = #{tsCode}")
    Integer selectSortOrderByIdgnyakeyiliaoall(@Param("tsCode") String tsCode);

    @Select("SELECT flag FROM stock_collect_gnyakeyiliaoall WHERE ts_code = #{tsCode}")
    String selectFlagByIdgnyakeyiliaoall(@Param("tsCode") String tsCode);

    @Select("SELECT ts_code FROM stock_collect_gnyakeyiliaoall where is_deleted = '0'  order by   sort_order ASC ")
    String[] selectgnyakeyiliaoall();

    @Select("SELECT COUNT(*) FROM stock_collect_gnyakeyiliaoall WHERE ts_code = #{tsCode}")
    int checkIfExistsgnyakeyiliaoall(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_gnyakeyiliaoall SET is_deleted = '0' WHERE ts_code = #{tsCode}")
    void collectUpdategnyakeyiliaoall(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_gnyakeyiliaoall (ts_code,create_date) VALUES (#{tsCode}, #{createDate})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertgnyakeyiliaoall(StockCollect stockCollect);



    @Select("SELECT ts_code as tsCode,sort_order as sortOrder FROM stock_collect_gnzhinengyiliaoall where flag = #{flag} ORDER BY sort_order")
    List<StockCollect> selectAllWithSortOrdergnzhinengyiliaoall(@Param("flag") String flag);

    @Select("SELECT min(sort_order) as sortOrder FROM stock_collect_gnzhinengyiliaoall where flag = #{flag} ")
    StockCollect selectMinOrdergnzhinengyiliaoall(@Param("flag") String flag);

    @Select("SELECT max(sort_order) as sortOrder FROM stock_collect_gnzhinengyiliaoall where flag = #{flag} ")
    StockCollect selectMaxOrdergnzhinengyiliaoall(@Param("flag") String flag);

    // 更新记录的排序值
    @Update("UPDATE stock_collect_gnzhinengyiliaoall SET sort_order = #{newSortOrder} WHERE ts_code = #{tsCode}")
    void updateSortOrdergnzhinengyiliaoall(@Param("tsCode") String tsCode, @Param("newSortOrder") Integer newSortOrder);

    // 根据ID获取记录的排序值
    @Select("SELECT sort_order FROM stock_collect_gnzhinengyiliaoall WHERE ts_code = #{tsCode}")
    Integer selectSortOrderByIdgnzhinengyiliaoall(@Param("tsCode") String tsCode);

    @Select("SELECT flag FROM stock_collect_gnzhinengyiliaoall WHERE ts_code = #{tsCode}")
    String selectFlagByIdgnzhinengyiliaoall(@Param("tsCode") String tsCode);

    @Select("SELECT ts_code FROM stock_collect_gnzhinengyiliaoall where is_deleted = '0'  order by   sort_order ASC ")
    String[] selectgnzhinengyiliaoall();

    @Select("SELECT COUNT(*) FROM stock_collect_gnzhinengyiliaoall WHERE ts_code = #{tsCode}")
    int checkIfExistsgnzhinengyiliaoall(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_gnzhinengyiliaoall SET is_deleted = '0' WHERE ts_code = #{tsCode}")
    void collectUpdategnzhinengyiliaoall(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_gnzhinengyiliaoall (ts_code,create_date) VALUES (#{tsCode}, #{createDate})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertgnzhinengyiliaoall(StockCollect stockCollect);





    @Select("SELECT ts_code as tsCode,sort_order as sortOrder FROM stock_collect_gnchongzudanbaiall where flag = #{flag} ORDER BY sort_order")
    List<StockCollect> selectAllWithSortOrdergnchongzudanbaiall(@Param("flag") String flag);

    @Select("SELECT min(sort_order) as sortOrder FROM stock_collect_gnchongzudanbaiall where flag = #{flag} ")
    StockCollect selectMinOrdergnchongzudanbaiall(@Param("flag") String flag);

    @Select("SELECT max(sort_order) as sortOrder FROM stock_collect_gnchongzudanbaiall where flag = #{flag} ")
    StockCollect selectMaxOrdergnchongzudanbaiall(@Param("flag") String flag);

    // 更新记录的排序值
    @Update("UPDATE stock_collect_gnchongzudanbaiall SET sort_order = #{newSortOrder} WHERE ts_code = #{tsCode}")
    void updateSortOrdergnchongzudanbaiall(@Param("tsCode") String tsCode, @Param("newSortOrder") Integer newSortOrder);

    // 根据ID获取记录的排序值
    @Select("SELECT sort_order FROM stock_collect_gnchongzudanbaiall WHERE ts_code = #{tsCode}")
    Integer selectSortOrderByIdgnchongzudanbaiall(@Param("tsCode") String tsCode);

    @Select("SELECT flag FROM stock_collect_gnchongzudanbaiall WHERE ts_code = #{tsCode}")
    String selectFlagByIdgnchongzudanbaiall(@Param("tsCode") String tsCode);

    @Select("SELECT ts_code FROM stock_collect_gnchongzudanbaiall where is_deleted = '0'  order by   sort_order ASC ")
    String[] selectgnchongzudanbaiall();

    @Select("SELECT COUNT(*) FROM stock_collect_gnchongzudanbaiall WHERE ts_code = #{tsCode}")
    int checkIfExistsgnchongzudanbaiall(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_gnchongzudanbaiall SET is_deleted = '0' WHERE ts_code = #{tsCode}")
    void collectUpdategnchongzudanbaiall(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_gnchongzudanbaiall (ts_code,create_date) VALUES (#{tsCode}, #{createDate})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertgnchongzudanbaiall(StockCollect stockCollect);



    @Select("SELECT ts_code as tsCode,sort_order as sortOrder FROM stock_collect_gnzaixianjiaoyuall where flag = #{flag} ORDER BY sort_order")
    List<StockCollect> selectAllWithSortOrdergnzaixianjiaoyuall(@Param("flag") String flag);

    @Select("SELECT min(sort_order) as sortOrder FROM stock_collect_gnzaixianjiaoyuall where flag = #{flag} ")
    StockCollect selectMinOrdergnzaixianjiaoyuall(@Param("flag") String flag);

    @Select("SELECT max(sort_order) as sortOrder FROM stock_collect_gnzaixianjiaoyuall where flag = #{flag} ")
    StockCollect selectMaxOrdergnzaixianjiaoyuall(@Param("flag") String flag);

    // 更新记录的排序值
    @Update("UPDATE stock_collect_gnzaixianjiaoyuall SET sort_order = #{newSortOrder} WHERE ts_code = #{tsCode}")
    void updateSortOrdergnzaixianjiaoyuall(@Param("tsCode") String tsCode, @Param("newSortOrder") Integer newSortOrder);

    // 根据ID获取记录的排序值
    @Select("SELECT sort_order FROM stock_collect_gnzaixianjiaoyuall WHERE ts_code = #{tsCode}")
    Integer selectSortOrderByIdgnzaixianjiaoyuall(@Param("tsCode") String tsCode);

    @Select("SELECT flag FROM stock_collect_gnzaixianjiaoyuall WHERE ts_code = #{tsCode}")
    String selectFlagByIdgnzaixianjiaoyuall(@Param("tsCode") String tsCode);

    @Select("SELECT ts_code FROM stock_collect_gnzaixianjiaoyuall where is_deleted = '0'  order by   sort_order ASC ")
    String[] selectgnzaixianjiaoyuall();

    @Select("SELECT COUNT(*) FROM stock_collect_gnzaixianjiaoyuall WHERE ts_code = #{tsCode}")
    int checkIfExistsgnzaixianjiaoyuall(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_gnzaixianjiaoyuall SET is_deleted = '0' WHERE ts_code = #{tsCode}")
    void collectUpdategnzaixianjiaoyuall(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_gnzaixianjiaoyuall (ts_code,create_date) VALUES (#{tsCode}, #{createDate})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertgnzaixianjiaoyuall(StockCollect stockCollect);




    @Select("SELECT ts_code as tsCode,sort_order as sortOrder FROM stock_collect_gnzhiyejiaoyuall where flag = #{flag} ORDER BY sort_order")
    List<StockCollect> selectAllWithSortOrdergnzhiyejiaoyuall(@Param("flag") String flag);

    @Select("SELECT min(sort_order) as sortOrder FROM stock_collect_gnzhiyejiaoyuall where flag = #{flag} ")
    StockCollect selectMinOrdergnzhiyejiaoyuall(@Param("flag") String flag);

    @Select("SELECT max(sort_order) as sortOrder FROM stock_collect_gnzhiyejiaoyuall where flag = #{flag} ")
    StockCollect selectMaxOrdergnzhiyejiaoyuall(@Param("flag") String flag);

    // 更新记录的排序值
    @Update("UPDATE stock_collect_gnzhiyejiaoyuall SET sort_order = #{newSortOrder} WHERE ts_code = #{tsCode}")
    void updateSortOrdergnzhiyejiaoyuall(@Param("tsCode") String tsCode, @Param("newSortOrder") Integer newSortOrder);

    // 根据ID获取记录的排序值
    @Select("SELECT sort_order FROM stock_collect_gnzhiyejiaoyuall WHERE ts_code = #{tsCode}")
    Integer selectSortOrderByIdgnzhiyejiaoyuall(@Param("tsCode") String tsCode);

    @Select("SELECT flag FROM stock_collect_gnzhiyejiaoyuall WHERE ts_code = #{tsCode}")
    String selectFlagByIdgnzhiyejiaoyuall(@Param("tsCode") String tsCode);

    @Select("SELECT ts_code FROM stock_collect_gnzhiyejiaoyuall where is_deleted = '0'  order by   sort_order ASC ")
    String[] selectgnzhiyejiaoyuall();

    @Select("SELECT COUNT(*) FROM stock_collect_gnzhiyejiaoyuall WHERE ts_code = #{tsCode}")
    int checkIfExistsgnzhiyejiaoyuall(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_gnzhiyejiaoyuall SET is_deleted = '0' WHERE ts_code = #{tsCode}")
    void collectUpdategnzhiyejiaoyuall(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_gnzhiyejiaoyuall (ts_code,create_date) VALUES (#{tsCode}, #{createDate})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertgnzhiyejiaoyuall(StockCollect stockCollect);





    @Select("SELECT ts_code as tsCode,sort_order as sortOrder FROM stock_collect_gnxiaomigainianall where flag = #{flag} ORDER BY sort_order")
    List<StockCollect> selectAllWithSortOrdergnxiaomigainianall(@Param("flag") String flag);

    @Select("SELECT min(sort_order) as sortOrder FROM stock_collect_gnxiaomigainianall where flag = #{flag} ")
    StockCollect selectMinOrdergnxiaomigainianall(@Param("flag") String flag);

    @Select("SELECT max(sort_order) as sortOrder FROM stock_collect_gnxiaomigainianall where flag = #{flag} ")
    StockCollect selectMaxOrdergnxiaomigainianall(@Param("flag") String flag);

    // 更新记录的排序值
    @Update("UPDATE stock_collect_gnxiaomigainianall SET sort_order = #{newSortOrder} WHERE ts_code = #{tsCode}")
    void updateSortOrdergnxiaomigainianall(@Param("tsCode") String tsCode, @Param("newSortOrder") Integer newSortOrder);

    // 根据ID获取记录的排序值
    @Select("SELECT sort_order FROM stock_collect_gnxiaomigainianall WHERE ts_code = #{tsCode}")
    Integer selectSortOrderByIdgnxiaomigainianall(@Param("tsCode") String tsCode);

    @Select("SELECT flag FROM stock_collect_gnxiaomigainianall WHERE ts_code = #{tsCode}")
    String selectFlagByIdgnxiaomigainianall(@Param("tsCode") String tsCode);

    @Select("SELECT ts_code FROM stock_collect_gnxiaomigainianall where is_deleted = '0'  order by   sort_order ASC ")
    String[] selectgnxiaomigainianall();

    @Select("SELECT COUNT(*) FROM stock_collect_gnxiaomigainianall WHERE ts_code = #{tsCode}")
    int checkIfExistsgnxiaomigainianall(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_gnxiaomigainianall SET is_deleted = '0' WHERE ts_code = #{tsCode}")
    void collectUpdategnxiaomigainianall(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_gnxiaomigainianall (ts_code,create_date) VALUES (#{tsCode}, #{createDate})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertgnxiaomigainianall(StockCollect stockCollect);





    @Select("SELECT ts_code as tsCode,sort_order as sortOrder FROM stock_collect_gnxiaodujiall where flag = #{flag} ORDER BY sort_order")
    List<StockCollect> selectAllWithSortOrdergnxiaodujiall(@Param("flag") String flag);

    @Select("SELECT min(sort_order) as sortOrder FROM stock_collect_gnxiaodujiall where flag = #{flag} ")
    StockCollect selectMinOrdergnxiaodujiall(@Param("flag") String flag);

    @Select("SELECT max(sort_order) as sortOrder FROM stock_collect_gnxiaodujiall where flag = #{flag} ")
    StockCollect selectMaxOrdergnxiaodujiall(@Param("flag") String flag);

    // 更新记录的排序值
    @Update("UPDATE stock_collect_gnxiaodujiall SET sort_order = #{newSortOrder} WHERE ts_code = #{tsCode}")
    void updateSortOrdergnxiaodujiall(@Param("tsCode") String tsCode, @Param("newSortOrder") Integer newSortOrder);

    // 根据ID获取记录的排序值
    @Select("SELECT sort_order FROM stock_collect_gnxiaodujiall WHERE ts_code = #{tsCode}")
    Integer selectSortOrderByIdgnxiaodujiall(@Param("tsCode") String tsCode);

    @Select("SELECT flag FROM stock_collect_gnxiaodujiall WHERE ts_code = #{tsCode}")
    String selectFlagByIdgnxiaodujiall(@Param("tsCode") String tsCode);

    @Select("SELECT ts_code FROM stock_collect_gnxiaodujiall where is_deleted = '0'  order by   sort_order ASC ")
    String[] selectgnxiaodujiall();

    @Select("SELECT COUNT(*) FROM stock_collect_gnxiaodujiall WHERE ts_code = #{tsCode}")
    int checkIfExistsgnxiaodujiall(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_gnxiaodujiall SET is_deleted = '0' WHERE ts_code = #{tsCode}")
    void collectUpdategnxiaodujiall(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_gnxiaodujiall (ts_code,create_date) VALUES (#{tsCode}, #{createDate})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertgnxiaodujiall(StockCollect stockCollect);




    @Select("SELECT ts_code as tsCode,sort_order as sortOrder FROM stock_collect_gnweishengsuall where flag = #{flag} ORDER BY sort_order")
    List<StockCollect> selectAllWithSortOrdergnweishengsuall(@Param("flag") String flag);

    @Select("SELECT min(sort_order) as sortOrder FROM stock_collect_gnweishengsuall where flag = #{flag} ")
    StockCollect selectMinOrdergnweishengsuall(@Param("flag") String flag);

    @Select("SELECT max(sort_order) as sortOrder FROM stock_collect_gnweishengsuall where flag = #{flag} ")
    StockCollect selectMaxOrdergnweishengsuall(@Param("flag") String flag);

    // 更新记录的排序值
    @Update("UPDATE stock_collect_gnweishengsuall SET sort_order = #{newSortOrder} WHERE ts_code = #{tsCode}")
    void updateSortOrdergnweishengsuall(@Param("tsCode") String tsCode, @Param("newSortOrder") Integer newSortOrder);

    // 根据ID获取记录的排序值
    @Select("SELECT sort_order FROM stock_collect_gnweishengsuall WHERE ts_code = #{tsCode}")
    Integer selectSortOrderByIdgnweishengsuall(@Param("tsCode") String tsCode);

    @Select("SELECT flag FROM stock_collect_gnweishengsuall WHERE ts_code = #{tsCode}")
    String selectFlagByIdgnweishengsuall(@Param("tsCode") String tsCode);

    @Select("SELECT ts_code FROM stock_collect_gnweishengsuall where is_deleted = '0'  order by   sort_order ASC ")
    String[] selectgnweishengsuall();

    @Select("SELECT COUNT(*) FROM stock_collect_gnweishengsuall WHERE ts_code = #{tsCode}")
    int checkIfExistsgnweishengsuall(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_gnweishengsuall SET is_deleted = '0' WHERE ts_code = #{tsCode}")
    void collectUpdategnweishengsuall(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_gnweishengsuall (ts_code,create_date) VALUES (#{tsCode}, #{createDate})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertgnweishengsuall(StockCollect stockCollect);





    @Insert("INSERT INTO stock_collect_Zhuizongnlyx (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'6')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertZhuizongnlyx(StockCollect stockCollect);

    @Select("SELECT ts_code FROM stock_collect_Zhuizongnlyx  where is_deleted = '0'     order by create_date desc")
    String[] selectZhuizongnlyx();

    @Select("SELECT ts_code FROM stock_collect_Zhuizongnlyx  where is_deleted = '1'   order by sort_order asc")
    String[] selectzanbuZhuizongnlyx();


    @Update("UPDATE stock_collect_Zhuizongnlyx SET is_deleted = '1' ,create_date = now()   WHERE ts_code = #{tsCode}")
    void delZhuizongnlyx(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizongnlyx SET is_deleted = '0',create_date = now()     WHERE ts_code = #{tsCode}")
    void updateZhuizongnlyx(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizongnlyx SET is_deleted = '0' ,create_date = now()    WHERE ts_code = #{tsCode}")
    void goonZhuizongnlyx(@Param("tsCode") String tsCode);

    @Select("SELECT COUNT(*) FROM stock_collect_Zhuizongnlyx WHERE ts_code = #{tsCode}")
    int checkIfExistsZhuizongnlyx(@Param("tsCode") String tsCode);


    @Select("SELECT ts_code as tsCode,sort_order as sortOrder FROM stock_collect_Zhuizongnlyx where flag = #{flag} ORDER BY sort_order")
    List<StockCollect> selectAllWithSortOrderZhuizongnlyx(@Param("flag") String flag);

    @Select("SELECT min(sort_order) as sortOrder FROM stock_collect_Zhuizongnlyx where flag = #{flag} ")
    StockCollect selectMinOrderZhuizongnlyx(@Param("flag") String flag);

    @Select("SELECT max(sort_order) as sortOrder FROM stock_collect_Zhuizongnlyx where flag = #{flag} ")
    StockCollect selectMaxOrderZhuizongnlyx(@Param("flag") String flag);

    // 更新记录的排序值
    @Update("UPDATE stock_collect_Zhuizongnlyx SET sort_order = #{newSortOrder} WHERE ts_code = #{tsCode}")
    void updateSortOrderZhuizongnlyx(@Param("tsCode") String tsCode, @Param("newSortOrder") Integer newSortOrder);

    // 根据ID获取记录的排序值
    @Select("SELECT sort_order FROM stock_collect_zhuizongnlyx WHERE ts_code = #{tsCode}")
    Integer selectSortOrderByIdZhuizongnlyx(@Param("tsCode") String tsCode);

    @Select("SELECT flag FROM stock_collect_zhuizongnlyx WHERE ts_code = #{tsCode}")
    String selectFlagByIdZhuizongnlyx(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_Zhuizongny (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'6')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertZhuizongny(StockCollect stockCollect);

    @Select("SELECT ts_code FROM stock_collect_Zhuizongny  where is_deleted = '0'     order by create_date desc")
    String[] selectZhuizongny();

    @Select("SELECT ts_code FROM stock_collect_Zhuizongny  where is_deleted = '1'   order by sort_order asc")
    String[] selectzanbuZhuizongny();


    @Update("UPDATE stock_collect_Zhuizongny SET is_deleted = '1' ,create_date = now()   WHERE ts_code = #{tsCode}")
    void delZhuizongny(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizongny SET is_deleted = '0',create_date = now()     WHERE ts_code = #{tsCode}")
    void updateZhuizongny(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizongny SET is_deleted = '0' ,create_date = now()    WHERE ts_code = #{tsCode}")
    void goonZhuizongny(@Param("tsCode") String tsCode);

    @Select("SELECT COUNT(*) FROM stock_collect_Zhuizongny WHERE ts_code = #{tsCode}")
    int checkIfExistsZhuizongny(@Param("tsCode") String tsCode);


    @Select("SELECT ts_code as tsCode,sort_order as sortOrder FROM stock_collect_Zhuizongny where flag = #{flag} ORDER BY sort_order")
    List<StockCollect> selectAllWithSortOrderZhuizongny(@Param("flag") String flag);

    @Select("SELECT min(sort_order) as sortOrder FROM stock_collect_Zhuizongny where flag = #{flag} ")
    StockCollect selectMinOrderZhuizongny(@Param("flag") String flag);

    @Select("SELECT max(sort_order) as sortOrder FROM stock_collect_Zhuizongny where flag = #{flag} ")
    StockCollect selectMaxOrderZhuizongny(@Param("flag") String flag);

    // 更新记录的排序值
    @Update("UPDATE stock_collect_Zhuizongny SET sort_order = #{newSortOrder} WHERE ts_code = #{tsCode}")
    void updateSortOrderZhuizongny(@Param("tsCode") String tsCode, @Param("newSortOrder") Integer newSortOrder);

    // 根据ID获取记录的排序值
    @Select("SELECT sort_order FROM stock_collect_zhuizongny WHERE ts_code = #{tsCode}")
    Integer selectSortOrderByIdZhuizongny(@Param("tsCode") String tsCode);

    @Select("SELECT flag FROM stock_collect_zhuizongny WHERE ts_code = #{tsCode}")
    String selectFlagByIdZhuizongny(@Param("tsCode") String tsCode);




    @Insert("INSERT INTO stock_collect_Zhuizongjtys (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'6')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertZhuizongjtys(StockCollect stockCollect);

    @Select("SELECT ts_code FROM stock_collect_Zhuizongjtys  where is_deleted = '0'     order by create_date desc")
    String[] selectZhuizongjtys();

    @Select("SELECT ts_code FROM stock_collect_Zhuizongjtys  where is_deleted = '1'   order by sort_order asc")
    String[] selectzanbuZhuizongjtys();


    @Update("UPDATE stock_collect_Zhuizongjtys SET is_deleted = '1' ,create_date = now()   WHERE ts_code = #{tsCode}")
    void delZhuizongjtys(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizongjtys SET is_deleted = '0',create_date = now()     WHERE ts_code = #{tsCode}")
    void updateZhuizongjtys(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizongjtys SET is_deleted = '0' ,create_date = now()    WHERE ts_code = #{tsCode}")
    void goonZhuizongjtys(@Param("tsCode") String tsCode);

    @Select("SELECT COUNT(*) FROM stock_collect_Zhuizongjtys WHERE ts_code = #{tsCode}")
    int checkIfExistsZhuizongjtys(@Param("tsCode") String tsCode);


    @Select("SELECT ts_code as tsCode,sort_order as sortOrder FROM stock_collect_Zhuizongjtys where flag = #{flag} ORDER BY sort_order")
    List<StockCollect> selectAllWithSortOrderZhuizongjtys(@Param("flag") String flag);

    @Select("SELECT min(sort_order) as sortOrder FROM stock_collect_Zhuizongjtys where flag = #{flag} ")
    StockCollect selectMinOrderZhuizongjtys(@Param("flag") String flag);

    @Select("SELECT max(sort_order) as sortOrder FROM stock_collect_Zhuizongjtys where flag = #{flag} ")
    StockCollect selectMaxOrderZhuizongjtys(@Param("flag") String flag);

    // 更新记录的排序值
    @Update("UPDATE stock_collect_Zhuizongjtys SET sort_order = #{newSortOrder} WHERE ts_code = #{tsCode}")
    void updateSortOrderZhuizongjtys(@Param("tsCode") String tsCode, @Param("newSortOrder") Integer newSortOrder);

    // 根据ID获取记录的排序值
    @Select("SELECT sort_order FROM stock_collect_zhuizongjtys WHERE ts_code = #{tsCode}")
    Integer selectSortOrderByIdZhuizongjtys(@Param("tsCode") String tsCode);

    @Select("SELECT flag FROM stock_collect_zhuizongjtys WHERE ts_code = #{tsCode}")
    String selectFlagByIdZhuizongjtys(@Param("tsCode") String tsCode);



    @Insert("INSERT INTO stock_collect_Zhuizongqiche (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'6')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertZhuizongqiche(StockCollect stockCollect);

    @Select("SELECT ts_code FROM stock_collect_Zhuizongqiche  where is_deleted = '0'     order by create_date desc")
    String[] selectZhuizongqiche();

    @Select("SELECT ts_code FROM stock_collect_Zhuizongqiche  where is_deleted = '1'   order by sort_order asc")
    String[] selectzanbuZhuizongqiche();


    @Update("UPDATE stock_collect_Zhuizongqiche SET is_deleted = '1' ,create_date = now()   WHERE ts_code = #{tsCode}")
    void delZhuizongqiche(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizongqiche SET is_deleted = '0',create_date = now()     WHERE ts_code = #{tsCode}")
    void updateZhuizongqiche(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizongqiche SET is_deleted = '0' ,create_date = now()    WHERE ts_code = #{tsCode}")
    void goonZhuizongqiche(@Param("tsCode") String tsCode);

    @Select("SELECT COUNT(*) FROM stock_collect_Zhuizongqiche WHERE ts_code = #{tsCode}")
    int checkIfExistsZhuizongqiche(@Param("tsCode") String tsCode);


    @Select("SELECT ts_code as tsCode,sort_order as sortOrder FROM stock_collect_Zhuizongqiche where flag = #{flag} ORDER BY sort_order")
    List<StockCollect> selectAllWithSortOrderZhuizongqiche(@Param("flag") String flag);

    @Select("SELECT min(sort_order) as sortOrder FROM stock_collect_Zhuizongqiche where flag = #{flag} ")
    StockCollect selectMinOrderZhuizongqiche(@Param("flag") String flag);

    @Select("SELECT max(sort_order) as sortOrder FROM stock_collect_Zhuizongqiche where flag = #{flag} ")
    StockCollect selectMaxOrderZhuizongqiche(@Param("flag") String flag);

    // 更新记录的排序值
    @Update("UPDATE stock_collect_Zhuizongqiche SET sort_order = #{newSortOrder} WHERE ts_code = #{tsCode}")
    void updateSortOrderZhuizongqiche(@Param("tsCode") String tsCode, @Param("newSortOrder") Integer newSortOrder);

    // 根据ID获取记录的排序值
    @Select("SELECT sort_order FROM stock_collect_Zhuizongqiche WHERE ts_code = #{tsCode}")
    Integer selectSortOrderByIdZhuizongqiche(@Param("tsCode") String tsCode);

    @Select("SELECT flag FROM stock_collect_Zhuizongqiche WHERE ts_code = #{tsCode}")
    String selectFlagByIdZhuizongqiche(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_Zhuizonggt (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'6')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertZhuizonggt(StockCollect stockCollect);

    @Select("SELECT ts_code FROM stock_collect_Zhuizonggt  where is_deleted = '0'     order by create_date desc")
    String[] selectZhuizonggt();

    @Select("SELECT ts_code FROM stock_collect_Zhuizonggt  where is_deleted = '1'   order by sort_order asc")
    String[] selectzanbuZhuizonggt();


    @Update("UPDATE stock_collect_Zhuizonggt SET is_deleted = '1' ,create_date = now()   WHERE ts_code = #{tsCode}")
    void delZhuizonggt(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizonggt SET is_deleted = '0',create_date = now()     WHERE ts_code = #{tsCode}")
    void updateZhuizonggt(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizonggt SET is_deleted = '0' ,create_date = now()    WHERE ts_code = #{tsCode}")
    void goonZhuizonggt(@Param("tsCode") String tsCode);

    @Select("SELECT COUNT(*) FROM stock_collect_Zhuizonggt WHERE ts_code = #{tsCode}")
    int checkIfExistsZhuizonggt(@Param("tsCode") String tsCode);


    @Select("SELECT ts_code as tsCode,sort_order as sortOrder FROM stock_collect_Zhuizonggt where flag = #{flag} ORDER BY sort_order")
    List<StockCollect> selectAllWithSortOrderZhuizonggt(@Param("flag") String flag);

    @Select("SELECT min(sort_order) as sortOrder FROM stock_collect_Zhuizonggt where flag = #{flag} ")
    StockCollect selectMinOrderZhuizonggt(@Param("flag") String flag);

    @Select("SELECT max(sort_order) as sortOrder FROM stock_collect_Zhuizonggt where flag = #{flag} ")
    StockCollect selectMaxOrderZhuizonggt(@Param("flag") String flag);

    // 更新记录的排序值
    @Update("UPDATE stock_collect_Zhuizonggt SET sort_order = #{newSortOrder} WHERE ts_code = #{tsCode}")
    void updateSortOrderZhuizonggt(@Param("tsCode") String tsCode, @Param("newSortOrder") Integer newSortOrder);

    // 根据ID获取记录的排序值
    @Select("SELECT sort_order FROM stock_collect_Zhuizonggt WHERE ts_code = #{tsCode}")
    Integer selectSortOrderByIdZhuizonggt(@Param("tsCode") String tsCode);

    @Select("SELECT flag FROM stock_collect_Zhuizonggt WHERE ts_code = #{tsCode}")
    String selectFlagByIdZhuizonggt(@Param("tsCode") String tsCode);



    @Insert("INSERT INTO stock_collect_Zhuizongjinshu (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'6')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertZhuizongjinshu(StockCollect stockCollect);

    @Select("SELECT ts_code FROM stock_collect_Zhuizongjinshu  where is_deleted = '0'     order by create_date desc")
    String[] selectZhuizongjinshu();

    @Select("SELECT ts_code FROM stock_collect_Zhuizongjinshu  where is_deleted = '1'   order by sort_order asc")
    String[] selectzanbuZhuizongjinshu();


    @Update("UPDATE stock_collect_Zhuizongjinshu SET is_deleted = '1' ,create_date = now()   WHERE ts_code = #{tsCode}")
    void delZhuizongjinshu(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizongjinshu SET is_deleted = '0',create_date = now()     WHERE ts_code = #{tsCode}")
    void updateZhuizongjinshu(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizongjinshu SET is_deleted = '0' ,create_date = now()    WHERE ts_code = #{tsCode}")
    void goonZhuizongjinshu(@Param("tsCode") String tsCode);

    @Select("SELECT COUNT(*) FROM stock_collect_Zhuizongjinshu WHERE ts_code = #{tsCode}")
    int checkIfExistsZhuizongjinshu(@Param("tsCode") String tsCode);


    @Select("SELECT ts_code as tsCode,sort_order as sortOrder FROM stock_collect_Zhuizongjinshu where flag = #{flag} ORDER BY sort_order")
    List<StockCollect> selectAllWithSortOrderZhuizongjinshu(@Param("flag") String flag);

    @Select("SELECT min(sort_order) as sortOrder FROM stock_collect_Zhuizongjinshu where flag = #{flag} ")
    StockCollect selectMinOrderZhuizongjinshu(@Param("flag") String flag);

    @Select("SELECT max(sort_order) as sortOrder FROM stock_collect_Zhuizongjinshu where flag = #{flag} ")
    StockCollect selectMaxOrderZhuizongjinshu(@Param("flag") String flag);

    // 更新记录的排序值
    @Update("UPDATE stock_collect_Zhuizongjinshu SET sort_order = #{newSortOrder} WHERE ts_code = #{tsCode}")
    void updateSortOrderZhuizongjinshu(@Param("tsCode") String tsCode, @Param("newSortOrder") Integer newSortOrder);

    // 根据ID获取记录的排序值
    @Select("SELECT sort_order FROM stock_collect_Zhuizongjinshu WHERE ts_code = #{tsCode}")
    Integer selectSortOrderByIdZhuizongjinshu(@Param("tsCode") String tsCode);

    @Select("SELECT flag FROM stock_collect_Zhuizongjinshu WHERE ts_code = #{tsCode}")
    String selectFlagByIdZhuizongjinshu(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_Zhuizonghuaxuezhiping (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'6')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertZhuizonghuaxuezhiping(StockCollect stockCollect);

    @Select("SELECT ts_code FROM stock_collect_Zhuizonghuaxuezhiping  where is_deleted = '0'     order by create_date desc")
    String[] selectZhuizonghuaxuezhiping();

    @Select("SELECT ts_code FROM stock_collect_Zhuizonghuaxuezhiping  where is_deleted = '1'   order by sort_order asc")
    String[] selectzanbuZhuizonghuaxuezhiping();


    @Update("UPDATE stock_collect_Zhuizonghuaxuezhiping SET is_deleted = '1' ,create_date = now()   WHERE ts_code = #{tsCode}")
    void delZhuizonghuaxuezhiping(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizonghuaxuezhiping SET is_deleted = '0',create_date = now()     WHERE ts_code = #{tsCode}")
    void updateZhuizonghuaxuezhiping(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizonghuaxuezhiping SET is_deleted = '0' ,create_date = now()    WHERE ts_code = #{tsCode}")
    void goonZhuizonghuaxuezhiping(@Param("tsCode") String tsCode);

    @Select("SELECT COUNT(*) FROM stock_collect_Zhuizonghuaxuezhiping WHERE ts_code = #{tsCode}")
    int checkIfExistsZhuizonghuaxuezhiping(@Param("tsCode") String tsCode);


    @Select("SELECT ts_code as tsCode,sort_order as sortOrder FROM stock_collect_Zhuizonghuaxuezhiping where flag = #{flag} ORDER BY sort_order")
    List<StockCollect> selectAllWithSortOrderZhuizonghuaxuezhiping(@Param("flag") String flag);

    @Select("SELECT min(sort_order) as sortOrder FROM stock_collect_Zhuizonghuaxuezhiping where flag = #{flag} ")
    StockCollect selectMinOrderZhuizonghuaxuezhiping(@Param("flag") String flag);

    @Select("SELECT max(sort_order) as sortOrder FROM stock_collect_Zhuizonghuaxuezhiping where flag = #{flag} ")
    StockCollect selectMaxOrderZhuizonghuaxuezhiping(@Param("flag") String flag);

    // 更新记录的排序值
    @Update("UPDATE stock_collect_Zhuizonghuaxuezhiping SET sort_order = #{newSortOrder} WHERE ts_code = #{tsCode}")
    void updateSortOrderZhuizonghuaxuezhiping(@Param("tsCode") String tsCode, @Param("newSortOrder") Integer newSortOrder);

    // 根据ID获取记录的排序值
    @Select("SELECT sort_order FROM stock_collect_Zhuizonghuaxuezhiping WHERE ts_code = #{tsCode}")
    Integer selectSortOrderByIdZhuizonghuaxuezhiping(@Param("tsCode") String tsCode);

    @Select("SELECT flag FROM stock_collect_Zhuizonghuaxuezhiping WHERE ts_code = #{tsCode}")
    String selectFlagByIdZhuizonghuaxuezhiping(@Param("tsCode") String tsCode);



    @Insert("INSERT INTO stock_collect_Zhuizongtongxing (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'6')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertZhuizongtongxing(StockCollect stockCollect);

    @Select("SELECT ts_code FROM stock_collect_Zhuizongtongxing  where is_deleted = '0'     order by create_date desc")
    String[] selectZhuizongtongxing();

    @Select("SELECT ts_code FROM stock_collect_Zhuizongtongxing  where is_deleted = '1'   order by sort_order asc")
    String[] selectzanbuZhuizongtongxing();


    @Update("UPDATE stock_collect_Zhuizongtongxing SET is_deleted = '1' ,create_date = now()   WHERE ts_code = #{tsCode}")
    void delZhuizongtongxing(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizongtongxing SET is_deleted = '0',create_date = now()     WHERE ts_code = #{tsCode}")
    void updateZhuizongtongxing(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizongtongxing SET is_deleted = '0' ,create_date = now()    WHERE ts_code = #{tsCode}")
    void goonZhuizongtongxing(@Param("tsCode") String tsCode);

    @Select("SELECT COUNT(*) FROM stock_collect_Zhuizongtongxing WHERE ts_code = #{tsCode}")
    int checkIfExistsZhuizongtongxing(@Param("tsCode") String tsCode);


    @Select("SELECT ts_code as tsCode,sort_order as sortOrder FROM stock_collect_Zhuizongtongxing where flag = #{flag} ORDER BY sort_order")
    List<StockCollect> selectAllWithSortOrderZhuizongtongxing(@Param("flag") String flag);

    @Select("SELECT min(sort_order) as sortOrder FROM stock_collect_Zhuizongtongxing where flag = #{flag} ")
    StockCollect selectMinOrderZhuizongtongxing(@Param("flag") String flag);

    @Select("SELECT max(sort_order) as sortOrder FROM stock_collect_Zhuizongtongxing where flag = #{flag} ")
    StockCollect selectMaxOrderZhuizongtongxing(@Param("flag") String flag);

    // 更新记录的排序值
    @Update("UPDATE stock_collect_Zhuizongtongxing SET sort_order = #{newSortOrder} WHERE ts_code = #{tsCode}")
    void updateSortOrderZhuizongtongxing(@Param("tsCode") String tsCode, @Param("newSortOrder") Integer newSortOrder);

    // 根据ID获取记录的排序值
    @Select("SELECT sort_order FROM stock_collect_Zhuizongtongxing WHERE ts_code = #{tsCode}")
    Integer selectSortOrderByIdZhuizongtongxing(@Param("tsCode") String tsCode);

    @Select("SELECT flag FROM stock_collect_Zhuizongtongxing WHERE ts_code = #{tsCode}")
    String selectFlagByIdZhuizongtongxing(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_Zhuizongwenhua (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'6')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertZhuizongwenhua(StockCollect stockCollect);

    @Select("SELECT ts_code FROM stock_collect_Zhuizongwenhua  where is_deleted = '0'     order by create_date desc")
    String[] selectZhuizongwenhua();

    @Select("SELECT ts_code FROM stock_collect_Zhuizongwenhua  where is_deleted = '1'   order by sort_order asc")
    String[] selectzanbuZhuizongwenhua();


    @Update("UPDATE stock_collect_Zhuizongwenhua SET is_deleted = '1' ,create_date = now()   WHERE ts_code = #{tsCode}")
    void delZhuizongwenhua(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizongwenhua SET is_deleted = '0',create_date = now()     WHERE ts_code = #{tsCode}")
    void updateZhuizongwenhua(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizongwenhua SET is_deleted = '0' ,create_date = now()    WHERE ts_code = #{tsCode}")
    void goonZhuizongwenhua(@Param("tsCode") String tsCode);

    @Select("SELECT COUNT(*) FROM stock_collect_Zhuizongwenhua WHERE ts_code = #{tsCode}")
    int checkIfExistsZhuizongwenhua(@Param("tsCode") String tsCode);


    @Select("SELECT ts_code as tsCode,sort_order as sortOrder FROM stock_collect_Zhuizongwenhua where flag = #{flag} ORDER BY sort_order")
    List<StockCollect> selectAllWithSortOrderZhuizongwenhua(@Param("flag") String flag);

    @Select("SELECT min(sort_order) as sortOrder FROM stock_collect_Zhuizongwenhua where flag = #{flag} ")
    StockCollect selectMinOrderZhuizongwenhua(@Param("flag") String flag);

    @Select("SELECT max(sort_order) as sortOrder FROM stock_collect_Zhuizongwenhua where flag = #{flag} ")
    StockCollect selectMaxOrderZhuizongwenhua(@Param("flag") String flag);

    // 更新记录的排序值
    @Update("UPDATE stock_collect_Zhuizongwenhua SET sort_order = #{newSortOrder} WHERE ts_code = #{tsCode}")
    void updateSortOrderZhuizongwenhua(@Param("tsCode") String tsCode, @Param("newSortOrder") Integer newSortOrder);

    // 根据ID获取记录的排序值
    @Select("SELECT sort_order FROM stock_collect_Zhuizongwenhua WHERE ts_code = #{tsCode}")
    Integer selectSortOrderByIdZhuizongwenhua(@Param("tsCode") String tsCode);

    @Select("SELECT flag FROM stock_collect_Zhuizongwenhua WHERE ts_code = #{tsCode}")
    String selectFlagByIdZhuizongwenhua(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_Zhuizongchuanmei (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'6')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertZhuizongchuanmei(StockCollect stockCollect);

    @Select("SELECT ts_code FROM stock_collect_Zhuizongchuanmei  where is_deleted = '0'     order by create_date desc")
    String[] selectZhuizongchuanmei();

    @Select("SELECT ts_code FROM stock_collect_Zhuizongchuanmei  where is_deleted = '1'   order by sort_order asc")
    String[] selectzanbuZhuizongchuanmei();


    @Update("UPDATE stock_collect_Zhuizongchuanmei SET is_deleted = '1' ,create_date = now()   WHERE ts_code = #{tsCode}")
    void delZhuizongchuanmei(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizongchuanmei SET is_deleted = '0',create_date = now()     WHERE ts_code = #{tsCode}")
    void updateZhuizongchuanmei(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizongchuanmei SET is_deleted = '0' ,create_date = now()    WHERE ts_code = #{tsCode}")
    void goonZhuizongchuanmei(@Param("tsCode") String tsCode);

    @Select("SELECT COUNT(*) FROM stock_collect_Zhuizongchuanmei WHERE ts_code = #{tsCode}")
    int checkIfExistsZhuizongchuanmei(@Param("tsCode") String tsCode);


    @Select("SELECT ts_code as tsCode,sort_order as sortOrder FROM stock_collect_Zhuizongchuanmei where flag = #{flag} ORDER BY sort_order")
    List<StockCollect> selectAllWithSortOrderZhuizongchuanmei(@Param("flag") String flag);

    @Select("SELECT min(sort_order) as sortOrder FROM stock_collect_Zhuizongchuanmei where flag = #{flag} ")
    StockCollect selectMinOrderZhuizongchuanmei(@Param("flag") String flag);

    @Select("SELECT max(sort_order) as sortOrder FROM stock_collect_Zhuizongchuanmei where flag = #{flag} ")
    StockCollect selectMaxOrderZhuizongchuanmei(@Param("flag") String flag);

    // 更新记录的排序值
    @Update("UPDATE stock_collect_Zhuizongchuanmei SET sort_order = #{newSortOrder} WHERE ts_code = #{tsCode}")
    void updateSortOrderZhuizongchuanmei(@Param("tsCode") String tsCode, @Param("newSortOrder") Integer newSortOrder);

    // 根据ID获取记录的排序值
    @Select("SELECT sort_order FROM stock_collect_Zhuizongchuanmei WHERE ts_code = #{tsCode}")
    Integer selectSortOrderByIdZhuizongchuanmei(@Param("tsCode") String tsCode);

    @Select("SELECT flag FROM stock_collect_Zhuizongchuanmei WHERE ts_code = #{tsCode}")
    String selectFlagByIdZhuizongchuanmei(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_Zhuizongjinrong (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'6')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertZhuizongjinrong(StockCollect stockCollect);

    @Select("SELECT ts_code FROM stock_collect_Zhuizongjinrong  where is_deleted = '0'     order by create_date desc")
    String[] selectZhuizongjinrong();

    @Select("SELECT ts_code FROM stock_collect_Zhuizongjinrong  where is_deleted = '1'   order by sort_order asc")
    String[] selectzanbuZhuizongjinrong();


    @Update("UPDATE stock_collect_Zhuizongjinrong SET is_deleted = '1' ,create_date = now()   WHERE ts_code = #{tsCode}")
    void delZhuizongjinrong(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizongjinrong SET is_deleted = '0',create_date = now()     WHERE ts_code = #{tsCode}")
    void updateZhuizongjinrong(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizongjinrong SET is_deleted = '0' ,create_date = now()    WHERE ts_code = #{tsCode}")
    void goonZhuizongjinrong(@Param("tsCode") String tsCode);

    @Select("SELECT COUNT(*) FROM stock_collect_Zhuizongjinrong WHERE ts_code = #{tsCode}")
    int checkIfExistsZhuizongjinrong(@Param("tsCode") String tsCode);


    @Select("SELECT ts_code as tsCode,sort_order as sortOrder FROM stock_collect_Zhuizongjinrong where flag = #{flag} ORDER BY sort_order")
    List<StockCollect> selectAllWithSortOrderZhuizongjinrong(@Param("flag") String flag);

    @Select("SELECT min(sort_order) as sortOrder FROM stock_collect_Zhuizongjinrong where flag = #{flag} ")
    StockCollect selectMinOrderZhuizongjinrong(@Param("flag") String flag);

    @Select("SELECT max(sort_order) as sortOrder FROM stock_collect_Zhuizongjinrong where flag = #{flag} ")
    StockCollect selectMaxOrderZhuizongjinrong(@Param("flag") String flag);

    // 更新记录的排序值
    @Update("UPDATE stock_collect_Zhuizongjinrong SET sort_order = #{newSortOrder} WHERE ts_code = #{tsCode}")
    void updateSortOrderZhuizongjinrong(@Param("tsCode") String tsCode, @Param("newSortOrder") Integer newSortOrder);

    // 根据ID获取记录的排序值
    @Select("SELECT sort_order FROM stock_collect_Zhuizongjinrong WHERE ts_code = #{tsCode}")
    Integer selectSortOrderByIdZhuizongjinrong(@Param("tsCode") String tsCode);

    @Select("SELECT flag FROM stock_collect_Zhuizongjinrong WHERE ts_code = #{tsCode}")
    String selectFlagByIdZhuizongjinrong(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_Zhuizongzonghe (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'6')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertZhuizongzonghe(StockCollect stockCollect);

    @Select("SELECT ts_code FROM stock_collect_Zhuizongzonghe  where is_deleted = '0'     order by create_date desc")
    String[] selectZhuizongzonghe();

    @Select("SELECT ts_code FROM stock_collect_Zhuizongzonghe  where is_deleted = '1'   order by sort_order asc")
    String[] selectzanbuZhuizongzonghe();


    @Update("UPDATE stock_collect_Zhuizongzonghe SET is_deleted = '1' ,create_date = now()   WHERE ts_code = #{tsCode}")
    void delZhuizongzonghe(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizongzonghe SET is_deleted = '0',create_date = now()     WHERE ts_code = #{tsCode}")
    void updateZhuizongzonghe(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizongzonghe SET is_deleted = '0' ,create_date = now()    WHERE ts_code = #{tsCode}")
    void goonZhuizongzonghe(@Param("tsCode") String tsCode);

    @Select("SELECT COUNT(*) FROM stock_collect_Zhuizongzonghe WHERE ts_code = #{tsCode}")
    int checkIfExistsZhuizongzonghe(@Param("tsCode") String tsCode);


    @Select("SELECT ts_code as tsCode,sort_order as sortOrder FROM stock_collect_Zhuizongzonghe where flag = #{flag} ORDER BY sort_order")
    List<StockCollect> selectAllWithSortOrderZhuizongzonghe(@Param("flag") String flag);

    @Select("SELECT min(sort_order) as sortOrder FROM stock_collect_Zhuizongzonghe where flag = #{flag} ")
    StockCollect selectMinOrderZhuizongzonghe(@Param("flag") String flag);

    @Select("SELECT max(sort_order) as sortOrder FROM stock_collect_Zhuizongzonghe where flag = #{flag} ")
    StockCollect selectMaxOrderZhuizongzonghe(@Param("flag") String flag);

    // 更新记录的排序值
    @Update("UPDATE stock_collect_Zhuizongzonghe SET sort_order = #{newSortOrder} WHERE ts_code = #{tsCode}")
    void updateSortOrderZhuizongzonghe(@Param("tsCode") String tsCode, @Param("newSortOrder") Integer newSortOrder);

    // 根据ID获取记录的排序值
    @Select("SELECT sort_order FROM stock_collect_Zhuizongzonghe WHERE ts_code = #{tsCode}")
    Integer selectSortOrderByIdZhuizongzonghe(@Param("tsCode") String tsCode);

    @Select("SELECT flag FROM stock_collect_Zhuizongzonghe WHERE ts_code = #{tsCode}")
    String selectFlagByIdZhuizongzonghe(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_Zhuizonghuanjin (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'6')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertZhuizonghuanjin(StockCollect stockCollect);

    @Select("SELECT ts_code FROM stock_collect_Zhuizonghuanjin  where is_deleted = '0'     order by create_date desc")
    String[] selectZhuizonghuanjin();

    @Select("SELECT ts_code FROM stock_collect_Zhuizonghuanjin  where is_deleted = '1'   order by sort_order asc")
    String[] selectzanbuZhuizonghuanjin();


    @Update("UPDATE stock_collect_Zhuizonghuanjin SET is_deleted = '1' ,create_date = now()   WHERE ts_code = #{tsCode}")
    void delZhuizonghuanjin(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizonghuanjin SET is_deleted = '0',create_date = now()     WHERE ts_code = #{tsCode}")
    void updateZhuizonghuanjin(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizonghuanjin SET is_deleted = '0' ,create_date = now()    WHERE ts_code = #{tsCode}")
    void goonZhuizonghuanjin(@Param("tsCode") String tsCode);

    @Select("SELECT COUNT(*) FROM stock_collect_Zhuizonghuanjin WHERE ts_code = #{tsCode}")
    int checkIfExistsZhuizonghuanjin(@Param("tsCode") String tsCode);


    @Select("SELECT ts_code as tsCode,sort_order as sortOrder FROM stock_collect_Zhuizonghuanjin where flag = #{flag} ORDER BY sort_order")
    List<StockCollect> selectAllWithSortOrderZhuizonghuanjin(@Param("flag") String flag);

    @Select("SELECT min(sort_order) as sortOrder FROM stock_collect_Zhuizonghuanjin where flag = #{flag} ")
    StockCollect selectMinOrderZhuizonghuanjin(@Param("flag") String flag);

    @Select("SELECT max(sort_order) as sortOrder FROM stock_collect_Zhuizonghuanjin where flag = #{flag} ")
    StockCollect selectMaxOrderZhuizonghuanjin(@Param("flag") String flag);

    // 更新记录的排序值
    @Update("UPDATE stock_collect_Zhuizonghuanjin SET sort_order = #{newSortOrder} WHERE ts_code = #{tsCode}")
    void updateSortOrderZhuizonghuanjin(@Param("tsCode") String tsCode, @Param("newSortOrder") Integer newSortOrder);

    // 根据ID获取记录的排序值
    @Select("SELECT sort_order FROM stock_collect_Zhuizonghuanjin WHERE ts_code = #{tsCode}")
    Integer selectSortOrderByIdZhuizonghuanjin(@Param("tsCode") String tsCode);

    @Select("SELECT flag FROM stock_collect_Zhuizonghuanjin WHERE ts_code = #{tsCode}")
    String selectFlagByIdZhuizonghuanjin(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_Zhuizonggongye (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'6')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertZhuizonggongye(StockCollect stockCollect);

    @Select("SELECT ts_code FROM stock_collect_Zhuizonggongye  where is_deleted = '0'     order by create_date desc")
    String[] selectZhuizonggongye();

    @Select("SELECT ts_code FROM stock_collect_Zhuizonggongye  where is_deleted = '1'   order by sort_order asc")
    String[] selectzanbuZhuizonggongye();


    @Update("UPDATE stock_collect_Zhuizonggongye SET is_deleted = '1' ,create_date = now()   WHERE ts_code = #{tsCode}")
    void delZhuizonggongye(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizonggongye SET is_deleted = '0',create_date = now()     WHERE ts_code = #{tsCode}")
    void updateZhuizonggongye(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizonggongye SET is_deleted = '0' ,create_date = now()    WHERE ts_code = #{tsCode}")
    void goonZhuizonggongye(@Param("tsCode") String tsCode);

    @Select("SELECT COUNT(*) FROM stock_collect_Zhuizonggongye WHERE ts_code = #{tsCode}")
    int checkIfExistsZhuizonggongye(@Param("tsCode") String tsCode);


    @Select("SELECT ts_code as tsCode,sort_order as sortOrder FROM stock_collect_Zhuizonggongye where flag = #{flag} ORDER BY sort_order")
    List<StockCollect> selectAllWithSortOrderZhuizonggongye(@Param("flag") String flag);

    @Select("SELECT min(sort_order) as sortOrder FROM stock_collect_Zhuizonggongye where flag = #{flag} ")
    StockCollect selectMinOrderZhuizonggongye(@Param("flag") String flag);

    @Select("SELECT max(sort_order) as sortOrder FROM stock_collect_Zhuizonggongye where flag = #{flag} ")
    StockCollect selectMaxOrderZhuizonggongye(@Param("flag") String flag);

    // 更新记录的排序值
    @Update("UPDATE stock_collect_Zhuizonggongye SET sort_order = #{newSortOrder} WHERE ts_code = #{tsCode}")
    void updateSortOrderZhuizonggongye(@Param("tsCode") String tsCode, @Param("newSortOrder") Integer newSortOrder);

    // 根据ID获取记录的排序值
    @Select("SELECT sort_order FROM stock_collect_Zhuizonggongye WHERE ts_code = #{tsCode}")
    Integer selectSortOrderByIdZhuizonggongye(@Param("tsCode") String tsCode);

    @Select("SELECT flag FROM stock_collect_Zhuizonggongye WHERE ts_code = #{tsCode}")
    String selectFlagByIdZhuizonggongye(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_Zhuizongyiyao (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'6')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertZhuizongyiyao(StockCollect stockCollect);

    @Select("SELECT ts_code FROM stock_collect_Zhuizongyiyao  where is_deleted = '0'     order by create_date desc")
    String[] selectZhuizongyiyao();

    @Select("SELECT ts_code FROM stock_collect_Zhuizongyiyao  where is_deleted = '1'   order by sort_order asc")
    String[] selectzanbuZhuizongyiyao();


    @Update("UPDATE stock_collect_Zhuizongyiyao SET is_deleted = '1' ,create_date = now()   WHERE ts_code = #{tsCode}")
    void delZhuizongyiyao(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizongyiyao SET is_deleted = '0',create_date = now()     WHERE ts_code = #{tsCode}")
    void updateZhuizongyiyao(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizongyiyao SET is_deleted = '0' ,create_date = now()    WHERE ts_code = #{tsCode}")
    void goonZhuizongyiyao(@Param("tsCode") String tsCode);

    @Select("SELECT COUNT(*) FROM stock_collect_Zhuizongyiyao WHERE ts_code = #{tsCode}")
    int checkIfExistsZhuizongyiyao(@Param("tsCode") String tsCode);


    @Select("SELECT ts_code as tsCode,sort_order as sortOrder FROM stock_collect_Zhuizongyiyao where flag = #{flag} ORDER BY sort_order")
    List<StockCollect> selectAllWithSortOrderZhuizongyiyao(@Param("flag") String flag);

    @Select("SELECT min(sort_order) as sortOrder FROM stock_collect_Zhuizongyiyao where flag = #{flag} ")
    StockCollect selectMinOrderZhuizongyiyao(@Param("flag") String flag);

    @Select("SELECT max(sort_order) as sortOrder FROM stock_collect_Zhuizongyiyao where flag = #{flag} ")
    StockCollect selectMaxOrderZhuizongyiyao(@Param("flag") String flag);

    // 更新记录的排序值
    @Update("UPDATE stock_collect_Zhuizongyiyao SET sort_order = #{newSortOrder} WHERE ts_code = #{tsCode}")
    void updateSortOrderZhuizongyiyao(@Param("tsCode") String tsCode, @Param("newSortOrder") Integer newSortOrder);

    // 根据ID获取记录的排序值
    @Select("SELECT sort_order FROM stock_collect_Zhuizongyiyao WHERE ts_code = #{tsCode}")
    Integer selectSortOrderByIdZhuizongyiyao(@Param("tsCode") String tsCode);

    @Select("SELECT flag FROM stock_collect_Zhuizongyiyao WHERE ts_code = #{tsCode}")
    String selectFlagByIdZhuizongyiyao(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_Zhuizongjungong (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'6')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertZhuizongjungong(StockCollect stockCollect);

    @Select("SELECT ts_code FROM stock_collect_Zhuizongjungong  where is_deleted = '0'     order by create_date desc")
    String[] selectZhuizongjungong();

    @Select("SELECT ts_code FROM stock_collect_Zhuizongjungong  where is_deleted = '1'   order by sort_order asc")
    String[] selectzanbuZhuizongjungong();


    @Update("UPDATE stock_collect_Zhuizongjungong SET is_deleted = '1' ,create_date = now()   WHERE ts_code = #{tsCode}")
    void delZhuizongjungong(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizongjungong SET is_deleted = '0',create_date = now()     WHERE ts_code = #{tsCode}")
    void updateZhuizongjungong(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizongjungong SET is_deleted = '0' ,create_date = now()    WHERE ts_code = #{tsCode}")
    void goonZhuizongjungong(@Param("tsCode") String tsCode);

    @Select("SELECT COUNT(*) FROM stock_collect_Zhuizongjungong WHERE ts_code = #{tsCode}")
    int checkIfExistsZhuizongjungong(@Param("tsCode") String tsCode);


    @Select("SELECT ts_code as tsCode,sort_order as sortOrder FROM stock_collect_Zhuizongjungong where flag = #{flag} ORDER BY sort_order")
    List<StockCollect> selectAllWithSortOrderZhuizongjungong(@Param("flag") String flag);

    @Select("SELECT min(sort_order) as sortOrder FROM stock_collect_Zhuizongjungong where flag = #{flag} ")
    StockCollect selectMinOrderZhuizongjungong(@Param("flag") String flag);

    @Select("SELECT max(sort_order) as sortOrder FROM stock_collect_Zhuizongjungong where flag = #{flag} ")
    StockCollect selectMaxOrderZhuizongjungong(@Param("flag") String flag);

    // 更新记录的排序值
    @Update("UPDATE stock_collect_Zhuizongjungong SET sort_order = #{newSortOrder} WHERE ts_code = #{tsCode}")
    void updateSortOrderZhuizongjungong(@Param("tsCode") String tsCode, @Param("newSortOrder") Integer newSortOrder);

    // 根据ID获取记录的排序值
    @Select("SELECT sort_order FROM stock_collect_Zhuizongjungong WHERE ts_code = #{tsCode}")
    Integer selectSortOrderByIdZhuizongjungong(@Param("tsCode") String tsCode);

    @Select("SELECT flag FROM stock_collect_Zhuizongjungong WHERE ts_code = #{tsCode}")
    String selectFlagByIdZhuizongjungong(@Param("tsCode") String tsCode);



    @Insert("INSERT INTO stock_collect_Zhuizongdianziguangxue (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'6')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertZhuizongdianziguangxue(StockCollect stockCollect);

    @Select("SELECT ts_code FROM stock_collect_Zhuizongdianziguangxue  where is_deleted = '0'     order by create_date desc")
    String[] selectZhuizongdianziguangxue();

    @Select("SELECT ts_code FROM stock_collect_Zhuizongdianziguangxue  where is_deleted = '1'   order by sort_order asc")
    String[] selectzanbuZhuizongdianziguangxue();


    @Update("UPDATE stock_collect_Zhuizongdianziguangxue SET is_deleted = '1' ,create_date = now()   WHERE ts_code = #{tsCode}")
    void delZhuizongdianziguangxue(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizongdianziguangxue SET is_deleted = '0',create_date = now()     WHERE ts_code = #{tsCode}")
    void updateZhuizongdianziguangxue(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizongdianziguangxue SET is_deleted = '0' ,create_date = now()    WHERE ts_code = #{tsCode}")
    void goonZhuizongdianziguangxue(@Param("tsCode") String tsCode);

    @Select("SELECT COUNT(*) FROM stock_collect_Zhuizongdianziguangxue WHERE ts_code = #{tsCode}")
    int checkIfExistsZhuizongdianziguangxue(@Param("tsCode") String tsCode);


    @Select("SELECT ts_code as tsCode,sort_order as sortOrder FROM stock_collect_Zhuizongdianziguangxue where flag = #{flag} ORDER BY sort_order")
    List<StockCollect> selectAllWithSortOrderZhuizongdianziguangxue(@Param("flag") String flag);

    @Select("SELECT min(sort_order) as sortOrder FROM stock_collect_Zhuizongdianziguangxue where flag = #{flag} ")
    StockCollect selectMinOrderZhuizongdianziguangxue(@Param("flag") String flag);

    @Select("SELECT max(sort_order) as sortOrder FROM stock_collect_Zhuizongdianziguangxue where flag = #{flag} ")
    StockCollect selectMaxOrderZhuizongdianziguangxue(@Param("flag") String flag);

    // 更新记录的排序值
    @Update("UPDATE stock_collect_Zhuizongdianziguangxue SET sort_order = #{newSortOrder} WHERE ts_code = #{tsCode}")
    void updateSortOrderZhuizongdianziguangxue(@Param("tsCode") String tsCode, @Param("newSortOrder") Integer newSortOrder);

    // 根据ID获取记录的排序值
    @Select("SELECT sort_order FROM stock_collect_Zhuizongdianziguangxue WHERE ts_code = #{tsCode}")
    Integer selectSortOrderByIdZhuizongdianziguangxue(@Param("tsCode") String tsCode);

    @Select("SELECT flag FROM stock_collect_Zhuizongdianziguangxue WHERE ts_code = #{tsCode}")
    String selectFlagByIdZhuizongdianziguangxue(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_Zhuizongshebei (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'6')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertZhuizongshebei(StockCollect stockCollect);

    @Select("SELECT ts_code FROM stock_collect_Zhuizongshebei  where is_deleted = '0'     order by create_date desc")
    String[] selectZhuizongshebei();

    @Select("SELECT ts_code FROM stock_collect_Zhuizongshebei  where is_deleted = '1'   order by sort_order asc")
    String[] selectzanbuZhuizongshebei();


    @Update("UPDATE stock_collect_Zhuizongshebei SET is_deleted = '1' ,create_date = now()   WHERE ts_code = #{tsCode}")
    void delZhuizongshebei(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizongshebei SET is_deleted = '0',create_date = now()     WHERE ts_code = #{tsCode}")
    void updateZhuizongshebei(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizongshebei SET is_deleted = '0' ,create_date = now()    WHERE ts_code = #{tsCode}")
    void goonZhuizongshebei(@Param("tsCode") String tsCode);

    @Select("SELECT COUNT(*) FROM stock_collect_Zhuizongshebei WHERE ts_code = #{tsCode}")
    int checkIfExistsZhuizongshebei(@Param("tsCode") String tsCode);


    @Select("SELECT ts_code as tsCode,sort_order as sortOrder FROM stock_collect_Zhuizongshebei where flag = #{flag} ORDER BY sort_order")
    List<StockCollect> selectAllWithSortOrderZhuizongshebei(@Param("flag") String flag);

    @Select("SELECT min(sort_order) as sortOrder FROM stock_collect_Zhuizongshebei where flag = #{flag} ")
    StockCollect selectMinOrderZhuizongshebei(@Param("flag") String flag);

    @Select("SELECT max(sort_order) as sortOrder FROM stock_collect_Zhuizongshebei where flag = #{flag} ")
    StockCollect selectMaxOrderZhuizongshebei(@Param("flag") String flag);

    // 更新记录的排序值
    @Update("UPDATE stock_collect_Zhuizongshebei SET sort_order = #{newSortOrder} WHERE ts_code = #{tsCode}")
    void updateSortOrderZhuizongshebei(@Param("tsCode") String tsCode, @Param("newSortOrder") Integer newSortOrder);

    // 根据ID获取记录的排序值
    @Select("SELECT sort_order FROM stock_collect_Zhuizongshebei WHERE ts_code = #{tsCode}")
    Integer selectSortOrderByIdZhuizongshebei(@Param("tsCode") String tsCode);

    @Select("SELECT flag FROM stock_collect_Zhuizongshebei WHERE ts_code = #{tsCode}")
    String selectFlagByIdZhuizongshebei(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_Zhuizongfangdichang (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'6')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertZhuizongfangdichang(StockCollect stockCollect);

    @Select("SELECT ts_code FROM stock_collect_Zhuizongfangdichang  where is_deleted = '0'     order by create_date desc")
    String[] selectZhuizongfangdichang();

    @Select("SELECT ts_code FROM stock_collect_Zhuizongfangdichang  where is_deleted = '1'   order by sort_order asc")
    String[] selectzanbuZhuizongfangdichang();


    @Update("UPDATE stock_collect_Zhuizongfangdichang SET is_deleted = '1' ,create_date = now()   WHERE ts_code = #{tsCode}")
    void delZhuizongfangdichang(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizongfangdichang SET is_deleted = '0',create_date = now()     WHERE ts_code = #{tsCode}")
    void updateZhuizongfangdichang(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizongfangdichang SET is_deleted = '0' ,create_date = now()    WHERE ts_code = #{tsCode}")
    void goonZhuizongfangdichang(@Param("tsCode") String tsCode);

    @Select("SELECT COUNT(*) FROM stock_collect_Zhuizongfangdichang WHERE ts_code = #{tsCode}")
    int checkIfExistsZhuizongfangdichang(@Param("tsCode") String tsCode);


    @Select("SELECT ts_code as tsCode,sort_order as sortOrder FROM stock_collect_Zhuizongfangdichang where flag = #{flag} ORDER BY sort_order")
    List<StockCollect> selectAllWithSortOrderZhuizongfangdichang(@Param("flag") String flag);

    @Select("SELECT min(sort_order) as sortOrder FROM stock_collect_Zhuizongfangdichang where flag = #{flag} ")
    StockCollect selectMinOrderZhuizongfangdichang(@Param("flag") String flag);

    @Select("SELECT max(sort_order) as sortOrder FROM stock_collect_Zhuizongfangdichang where flag = #{flag} ")
    StockCollect selectMaxOrderZhuizongfangdichang(@Param("flag") String flag);

    // 更新记录的排序值
    @Update("UPDATE stock_collect_Zhuizongfangdichang SET sort_order = #{newSortOrder} WHERE ts_code = #{tsCode}")
    void updateSortOrderZhuizongfangdichang(@Param("tsCode") String tsCode, @Param("newSortOrder") Integer newSortOrder);

    // 根据ID获取记录的排序值
    @Select("SELECT sort_order FROM stock_collect_Zhuizongfangdichang WHERE ts_code = #{tsCode}")
    Integer selectSortOrderByIdZhuizongfangdichang(@Param("tsCode") String tsCode);

    @Select("SELECT flag FROM stock_collect_Zhuizongfangdichang WHERE ts_code = #{tsCode}")
    String selectFlagByIdZhuizongfangdichang(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_Zhuizonghulianwang (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'6')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertZhuizonghulianwang(StockCollect stockCollect);

    @Select("SELECT ts_code FROM stock_collect_Zhuizonghulianwang  where is_deleted = '0'     order by create_date desc")
    String[] selectZhuizonghulianwang();

    @Select("SELECT ts_code FROM stock_collect_Zhuizonghulianwang  where is_deleted = '1'   order by sort_order asc")
    String[] selectzanbuZhuizonghulianwang();


    @Update("UPDATE stock_collect_Zhuizonghulianwang SET is_deleted = '1' ,create_date = now()   WHERE ts_code = #{tsCode}")
    void delZhuizonghulianwang(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizonghulianwang SET is_deleted = '0',create_date = now()     WHERE ts_code = #{tsCode}")
    void updateZhuizonghulianwang(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizonghulianwang SET is_deleted = '0' ,create_date = now()    WHERE ts_code = #{tsCode}")
    void goonZhuizonghulianwang(@Param("tsCode") String tsCode);

    @Select("SELECT COUNT(*) FROM stock_collect_Zhuizonghulianwang WHERE ts_code = #{tsCode}")
    int checkIfExistsZhuizonghulianwang(@Param("tsCode") String tsCode);


    @Select("SELECT ts_code as tsCode,sort_order as sortOrder FROM stock_collect_Zhuizonghulianwang where flag = #{flag} ORDER BY sort_order")
    List<StockCollect> selectAllWithSortOrderZhuizonghulianwang(@Param("flag") String flag);

    @Select("SELECT min(sort_order) as sortOrder FROM stock_collect_Zhuizonghulianwang where flag = #{flag} ")
    StockCollect selectMinOrderZhuizonghulianwang(@Param("flag") String flag);

    @Select("SELECT max(sort_order) as sortOrder FROM stock_collect_Zhuizonghulianwang where flag = #{flag} ")
    StockCollect selectMaxOrderZhuizonghulianwang(@Param("flag") String flag);

    // 更新记录的排序值
    @Update("UPDATE stock_collect_Zhuizonghulianwang SET sort_order = #{newSortOrder} WHERE ts_code = #{tsCode}")
    void updateSortOrderZhuizonghulianwang(@Param("tsCode") String tsCode, @Param("newSortOrder") Integer newSortOrder);

    // 根据ID获取记录的排序值
    @Select("SELECT sort_order FROM stock_collect_Zhuizonghulianwang WHERE ts_code = #{tsCode}")
    Integer selectSortOrderByIdZhuizonghulianwang(@Param("tsCode") String tsCode);

    @Select("SELECT flag FROM stock_collect_Zhuizonghulianwang WHERE ts_code = #{tsCode}")
    String selectFlagByIdZhuizonghulianwang(@Param("tsCode") String tsCode);




    @Insert("INSERT INTO stock_collect_Zhuizongmeironghuli (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'6')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertZhuizongmeironghuli(StockCollect stockCollect);

    @Select("SELECT ts_code FROM stock_collect_Zhuizongmeironghuli  where is_deleted = '0'     order by create_date desc")
    String[] selectZhuizongmeironghuli();

    @Select("SELECT ts_code FROM stock_collect_Zhuizongmeironghuli  where is_deleted = '1'   order by sort_order asc")
    String[] selectzanbuZhuizongmeironghuli();


    @Update("UPDATE stock_collect_Zhuizongmeironghuli SET is_deleted = '1' ,create_date = now()   WHERE ts_code = #{tsCode}")
    void delZhuizongmeironghuli(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizongmeironghuli SET is_deleted = '0',create_date = now()     WHERE ts_code = #{tsCode}")
    void updateZhuizongmeironghuli(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizongmeironghuli SET is_deleted = '0' ,create_date = now()    WHERE ts_code = #{tsCode}")
    void goonZhuizongmeironghuli(@Param("tsCode") String tsCode);

    @Select("SELECT COUNT(*) FROM stock_collect_Zhuizongmeironghuli WHERE ts_code = #{tsCode}")
    int checkIfExistsZhuizongmeironghuli(@Param("tsCode") String tsCode);


    @Select("SELECT ts_code as tsCode,sort_order as sortOrder FROM stock_collect_Zhuizongmeironghuli where flag = #{flag} ORDER BY sort_order")
    List<StockCollect> selectAllWithSortOrderZhuizongmeironghuli(@Param("flag") String flag);

    @Select("SELECT min(sort_order) as sortOrder FROM stock_collect_Zhuizongmeironghuli where flag = #{flag} ")
    StockCollect selectMinOrderZhuizongmeironghuli(@Param("flag") String flag);

    @Select("SELECT max(sort_order) as sortOrder FROM stock_collect_Zhuizongmeironghuli where flag = #{flag} ")
    StockCollect selectMaxOrderZhuizongmeironghuli(@Param("flag") String flag);

    // 更新记录的排序值
    @Update("UPDATE stock_collect_Zhuizongmeironghuli SET sort_order = #{newSortOrder} WHERE ts_code = #{tsCode}")
    void updateSortOrderZhuizongmeironghuli(@Param("tsCode") String tsCode, @Param("newSortOrder") Integer newSortOrder);

    // 根据ID获取记录的排序值
    @Select("SELECT sort_order FROM stock_collect_Zhuizongmeironghuli WHERE ts_code = #{tsCode}")
    Integer selectSortOrderByIdZhuizongmeironghuli(@Param("tsCode") String tsCode);

    @Select("SELECT flag FROM stock_collect_Zhuizongmeironghuli WHERE ts_code = #{tsCode}")
    String selectFlagByIdZhuizongmeironghuli(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_Zhuizongcanyinyinshi (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'6')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertZhuizongcanyinyinshi(StockCollect stockCollect);

    @Select("SELECT ts_code FROM stock_collect_Zhuizongcanyinyinshi  where is_deleted = '0'     order by create_date desc")
    String[] selectZhuizongcanyinyinshi();

    @Select("SELECT ts_code FROM stock_collect_Zhuizongcanyinyinshi  where is_deleted = '1'   order by sort_order asc")
    String[] selectzanbuZhuizongcanyinyinshi();


    @Update("UPDATE stock_collect_Zhuizongcanyinyinshi SET is_deleted = '1' ,create_date = now()   WHERE ts_code = #{tsCode}")
    void delZhuizongcanyinyinshi(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizongcanyinyinshi SET is_deleted = '0',create_date = now()     WHERE ts_code = #{tsCode}")
    void updateZhuizongcanyinyinshi(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizongcanyinyinshi SET is_deleted = '0' ,create_date = now()    WHERE ts_code = #{tsCode}")
    void goonZhuizongcanyinyinshi(@Param("tsCode") String tsCode);

    @Select("SELECT COUNT(*) FROM stock_collect_Zhuizongcanyinyinshi WHERE ts_code = #{tsCode}")
    int checkIfExistsZhuizongcanyinyinshi(@Param("tsCode") String tsCode);


    @Select("SELECT ts_code as tsCode,sort_order as sortOrder FROM stock_collect_Zhuizongcanyinyinshi where flag = #{flag} ORDER BY sort_order")
    List<StockCollect> selectAllWithSortOrderZhuizongcanyinyinshi(@Param("flag") String flag);

    @Select("SELECT min(sort_order) as sortOrder FROM stock_collect_Zhuizongcanyinyinshi where flag = #{flag} ")
    StockCollect selectMinOrderZhuizongcanyinyinshi(@Param("flag") String flag);

    @Select("SELECT max(sort_order) as sortOrder FROM stock_collect_Zhuizongcanyinyinshi where flag = #{flag} ")
    StockCollect selectMaxOrderZhuizongcanyinyinshi(@Param("flag") String flag);

    // 更新记录的排序值
    @Update("UPDATE stock_collect_Zhuizongcanyinyinshi SET sort_order = #{newSortOrder} WHERE ts_code = #{tsCode}")
    void updateSortOrderZhuizongcanyinyinshi(@Param("tsCode") String tsCode, @Param("newSortOrder") Integer newSortOrder);

    // 根据ID获取记录的排序值
    @Select("SELECT sort_order FROM stock_collect_Zhuizongcanyinyinshi WHERE ts_code = #{tsCode}")
    Integer selectSortOrderByIdZhuizongcanyinyinshi(@Param("tsCode") String tsCode);

    @Select("SELECT flag FROM stock_collect_Zhuizongcanyinyinshi WHERE ts_code = #{tsCode}")
    String selectFlagByIdZhuizongcanyinyinshi(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_Zhuizonglvyoujiudian (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'6')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertZhuizonglvyoujiudian(StockCollect stockCollect);

    @Select("SELECT ts_code FROM stock_collect_Zhuizonglvyoujiudian  where is_deleted = '0'     order by create_date desc")
    String[] selectZhuizonglvyoujiudian();

    @Select("SELECT ts_code FROM stock_collect_Zhuizonglvyoujiudian  where is_deleted = '1'   order by sort_order asc")
    String[] selectzanbuZhuizonglvyoujiudian();


    @Update("UPDATE stock_collect_Zhuizonglvyoujiudian SET is_deleted = '1' ,create_date = now()   WHERE ts_code = #{tsCode}")
    void delZhuizonglvyoujiudian(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizonglvyoujiudian SET is_deleted = '0',create_date = now()     WHERE ts_code = #{tsCode}")
    void updateZhuizonglvyoujiudian(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizonglvyoujiudian SET is_deleted = '0' ,create_date = now()    WHERE ts_code = #{tsCode}")
    void goonZhuizonglvyoujiudian(@Param("tsCode") String tsCode);

    @Select("SELECT COUNT(*) FROM stock_collect_Zhuizonglvyoujiudian WHERE ts_code = #{tsCode}")
    int checkIfExistsZhuizonglvyoujiudian(@Param("tsCode") String tsCode);


    @Select("SELECT ts_code as tsCode,sort_order as sortOrder FROM stock_collect_Zhuizonglvyoujiudian where flag = #{flag} ORDER BY sort_order")
    List<StockCollect> selectAllWithSortOrderZhuizonglvyoujiudian(@Param("flag") String flag);

    @Select("SELECT min(sort_order) as sortOrder FROM stock_collect_Zhuizonglvyoujiudian where flag = #{flag} ")
    StockCollect selectMinOrderZhuizonglvyoujiudian(@Param("flag") String flag);

    @Select("SELECT max(sort_order) as sortOrder FROM stock_collect_Zhuizonglvyoujiudian where flag = #{flag} ")
    StockCollect selectMaxOrderZhuizonglvyoujiudian(@Param("flag") String flag);

    // 更新记录的排序值
    @Update("UPDATE stock_collect_Zhuizonglvyoujiudian SET sort_order = #{newSortOrder} WHERE ts_code = #{tsCode}")
    void updateSortOrderZhuizonglvyoujiudian(@Param("tsCode") String tsCode, @Param("newSortOrder") Integer newSortOrder);

    // 根据ID获取记录的排序值
    @Select("SELECT sort_order FROM stock_collect_Zhuizonglvyoujiudian WHERE ts_code = #{tsCode}")
    Integer selectSortOrderByIdZhuizonglvyoujiudian(@Param("tsCode") String tsCode);

    @Select("SELECT flag FROM stock_collect_Zhuizonglvyoujiudian WHERE ts_code = #{tsCode}")
    String selectFlagByIdZhuizonglvyoujiudian(@Param("tsCode") String tsCode);






    @Insert("INSERT INTO stock_collect_Zhuizongfuzhuangjiafang (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'6')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertZhuizongfuzhuangjiafang(StockCollect stockCollect);

    @Select("SELECT ts_code FROM stock_collect_Zhuizongfuzhuangjiafang  where is_deleted = '0'     order by create_date desc")
    String[] selectZhuizongfuzhuangjiafang();

    @Select("SELECT ts_code FROM stock_collect_Zhuizongfuzhuangjiafang  where is_deleted = '1'   order by sort_order asc")
    String[] selectzanbuZhuizongfuzhuangjiafang();


    @Update("UPDATE stock_collect_Zhuizongfuzhuangjiafang SET is_deleted = '1' ,create_date = now()   WHERE ts_code = #{tsCode}")
    void delZhuizongfuzhuangjiafang(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizongfuzhuangjiafang SET is_deleted = '0',create_date = now()     WHERE ts_code = #{tsCode}")
    void updateZhuizongfuzhuangjiafang(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizongfuzhuangjiafang SET is_deleted = '0' ,create_date = now()    WHERE ts_code = #{tsCode}")
    void goonZhuizongfuzhuangjiafang(@Param("tsCode") String tsCode);

    @Select("SELECT COUNT(*) FROM stock_collect_Zhuizongfuzhuangjiafang WHERE ts_code = #{tsCode}")
    int checkIfExistsZhuizongfuzhuangjiafang(@Param("tsCode") String tsCode);


    @Select("SELECT ts_code as tsCode,sort_order as sortOrder FROM stock_collect_Zhuizongfuzhuangjiafang where flag = #{flag} ORDER BY sort_order")
    List<StockCollect> selectAllWithSortOrderZhuizongfuzhuangjiafang(@Param("flag") String flag);

    @Select("SELECT min(sort_order) as sortOrder FROM stock_collect_Zhuizongfuzhuangjiafang where flag = #{flag} ")
    StockCollect selectMinOrderZhuizongfuzhuangjiafang(@Param("flag") String flag);

    @Select("SELECT max(sort_order) as sortOrder FROM stock_collect_Zhuizongfuzhuangjiafang where flag = #{flag} ")
    StockCollect selectMaxOrderZhuizongfuzhuangjiafang(@Param("flag") String flag);

    // 更新记录的排序值
    @Update("UPDATE stock_collect_Zhuizongfuzhuangjiafang SET sort_order = #{newSortOrder} WHERE ts_code = #{tsCode}")
    void updateSortOrderZhuizongfuzhuangjiafang(@Param("tsCode") String tsCode, @Param("newSortOrder") Integer newSortOrder);

    // 根据ID获取记录的排序值
    @Select("SELECT sort_order FROM stock_collect_Zhuizongfuzhuangjiafang WHERE ts_code = #{tsCode}")
    Integer selectSortOrderByIdZhuizongfuzhuangjiafang(@Param("tsCode") String tsCode);

    @Select("SELECT flag FROM stock_collect_Zhuizongfuzhuangjiafang WHERE ts_code = #{tsCode}")
    String selectFlagByIdZhuizongfuzhuangjiafang(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_Zhuizongjiajuyongpin (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'6')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertZhuizongjiajuyongpin(StockCollect stockCollect);

    @Select("SELECT ts_code FROM stock_collect_Zhuizongjiajuyongpin  where is_deleted = '0'     order by create_date desc")
    String[] selectZhuizongjiajuyongpin();

    @Select("SELECT ts_code FROM stock_collect_Zhuizongjiajuyongpin  where is_deleted = '1'   order by sort_order asc")
    String[] selectzanbuZhuizongjiajuyongpin();


    @Update("UPDATE stock_collect_Zhuizongjiajuyongpin SET is_deleted = '1' ,create_date = now()   WHERE ts_code = #{tsCode}")
    void delZhuizongjiajuyongpin(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizongjiajuyongpin SET is_deleted = '0',create_date = now()     WHERE ts_code = #{tsCode}")
    void updateZhuizongjiajuyongpin(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizongjiajuyongpin SET is_deleted = '0' ,create_date = now()    WHERE ts_code = #{tsCode}")
    void goonZhuizongjiajuyongpin(@Param("tsCode") String tsCode);

    @Select("SELECT COUNT(*) FROM stock_collect_Zhuizongjiajuyongpin WHERE ts_code = #{tsCode}")
    int checkIfExistsZhuizongjiajuyongpin(@Param("tsCode") String tsCode);


    @Select("SELECT ts_code as tsCode,sort_order as sortOrder FROM stock_collect_Zhuizongjiajuyongpin where flag = #{flag} ORDER BY sort_order")
    List<StockCollect> selectAllWithSortOrderZhuizongjiajuyongpin(@Param("flag") String flag);

    @Select("SELECT min(sort_order) as sortOrder FROM stock_collect_Zhuizongjiajuyongpin where flag = #{flag} ")
    StockCollect selectMinOrderZhuizongjiajuyongpin(@Param("flag") String flag);

    @Select("SELECT max(sort_order) as sortOrder FROM stock_collect_Zhuizongjiajuyongpin where flag = #{flag} ")
    StockCollect selectMaxOrderZhuizongjiajuyongpin(@Param("flag") String flag);

    // 更新记录的排序值
    @Update("UPDATE stock_collect_Zhuizongjiajuyongpin SET sort_order = #{newSortOrder} WHERE ts_code = #{tsCode}")
    void updateSortOrderZhuizongjiajuyongpin(@Param("tsCode") String tsCode, @Param("newSortOrder") Integer newSortOrder);

    // 根据ID获取记录的排序值
    @Select("SELECT sort_order FROM stock_collect_Zhuizongjiajuyongpin WHERE ts_code = #{tsCode}")
    Integer selectSortOrderByIdZhuizongjiajuyongpin(@Param("tsCode") String tsCode);

    @Select("SELECT flag FROM stock_collect_Zhuizongjiajuyongpin WHERE ts_code = #{tsCode}")
    String selectFlagByIdZhuizongjiajuyongpin(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_Zhuizongjiadian (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'6')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertZhuizongjiadian(StockCollect stockCollect);

    @Select("SELECT ts_code FROM stock_collect_Zhuizongjiadian  where is_deleted = '0'     order by create_date desc")
    String[] selectZhuizongjiadian();

    @Select("SELECT ts_code FROM stock_collect_Zhuizongjiadian  where is_deleted = '1'   order by sort_order asc")
    String[] selectzanbuZhuizongjiadian();


    @Update("UPDATE stock_collect_Zhuizongjiadian SET is_deleted = '1' ,create_date = now()   WHERE ts_code = #{tsCode}")
    void delZhuizongjiadian(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizongjiadian SET is_deleted = '0',create_date = now()     WHERE ts_code = #{tsCode}")
    void updateZhuizongjiadian(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizongjiadian SET is_deleted = '0' ,create_date = now()    WHERE ts_code = #{tsCode}")
    void goonZhuizongjiadian(@Param("tsCode") String tsCode);

    @Select("SELECT COUNT(*) FROM stock_collect_Zhuizongjiadian WHERE ts_code = #{tsCode}")
    int checkIfExistsZhuizongjiadian(@Param("tsCode") String tsCode);


    @Select("SELECT ts_code as tsCode,sort_order as sortOrder FROM stock_collect_Zhuizongjiadian where flag = #{flag} ORDER BY sort_order")
    List<StockCollect> selectAllWithSortOrderZhuizongjiadian(@Param("flag") String flag);

    @Select("SELECT min(sort_order) as sortOrder FROM stock_collect_Zhuizongjiadian where flag = #{flag} ")
    StockCollect selectMinOrderZhuizongjiadian(@Param("flag") String flag);

    @Select("SELECT max(sort_order) as sortOrder FROM stock_collect_Zhuizongjiadian where flag = #{flag} ")
    StockCollect selectMaxOrderZhuizongjiadian(@Param("flag") String flag);

    // 更新记录的排序值
    @Update("UPDATE stock_collect_Zhuizongjiadian SET sort_order = #{newSortOrder} WHERE ts_code = #{tsCode}")
    void updateSortOrderZhuizongjiadian(@Param("tsCode") String tsCode, @Param("newSortOrder") Integer newSortOrder);

    // 根据ID获取记录的排序值
    @Select("SELECT sort_order FROM stock_collect_Zhuizongjiadian WHERE ts_code = #{tsCode}")
    Integer selectSortOrderByIdZhuizongjiadian(@Param("tsCode") String tsCode);

    @Select("SELECT flag FROM stock_collect_Zhuizongjiadian WHERE ts_code = #{tsCode}")
    String selectFlagByIdZhuizongjiadian(@Param("tsCode") String tsCode);


    @Insert("INSERT INTO stock_collect_Zhuizonglingshou (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'6')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertZhuizonglingshou(StockCollect stockCollect);

    @Select("SELECT ts_code FROM stock_collect_Zhuizonglingshou  where is_deleted = '0'     order by create_date desc")
    String[] selectZhuizonglingshou();

    @Select("SELECT ts_code FROM stock_collect_Zhuizonglingshou  where is_deleted = '1'   order by sort_order asc")
    String[] selectzanbuZhuizonglingshou();


    @Update("UPDATE stock_collect_Zhuizonglingshou SET is_deleted = '1' ,create_date = now()   WHERE ts_code = #{tsCode}")
    void delZhuizonglingshou(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizonglingshou SET is_deleted = '0',create_date = now()     WHERE ts_code = #{tsCode}")
    void updateZhuizonglingshou(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizonglingshou SET is_deleted = '0' ,create_date = now()    WHERE ts_code = #{tsCode}")
    void goonZhuizonglingshou(@Param("tsCode") String tsCode);

    @Select("SELECT COUNT(*) FROM stock_collect_Zhuizonglingshou WHERE ts_code = #{tsCode}")
    int checkIfExistsZhuizonglingshou(@Param("tsCode") String tsCode);


    @Select("SELECT ts_code as tsCode,sort_order as sortOrder FROM stock_collect_Zhuizonglingshou where flag = #{flag} ORDER BY sort_order")
    List<StockCollect> selectAllWithSortOrderZhuizonglingshou(@Param("flag") String flag);

    @Select("SELECT min(sort_order) as sortOrder FROM stock_collect_Zhuizonglingshou where flag = #{flag} ")
    StockCollect selectMinOrderZhuizonglingshou(@Param("flag") String flag);

    @Select("SELECT max(sort_order) as sortOrder FROM stock_collect_Zhuizonglingshou where flag = #{flag} ")
    StockCollect selectMaxOrderZhuizonglingshou(@Param("flag") String flag);

    // 更新记录的排序值
    @Update("UPDATE stock_collect_Zhuizonglingshou SET sort_order = #{newSortOrder} WHERE ts_code = #{tsCode}")
    void updateSortOrderZhuizonglingshou(@Param("tsCode") String tsCode, @Param("newSortOrder") Integer newSortOrder);

    // 根据ID获取记录的排序值
    @Select("SELECT sort_order FROM stock_collect_Zhuizonglingshou WHERE ts_code = #{tsCode}")
    Integer selectSortOrderByIdZhuizonglingshou(@Param("tsCode") String tsCode);

    @Select("SELECT flag FROM stock_collect_Zhuizonglingshou WHERE ts_code = #{tsCode}")
    String selectFlagByIdZhuizonglingshou(@Param("tsCode") String tsCode);

    @Insert("INSERT INTO stock_collect_Zhuizonghuaxueyuanliao (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'6')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertZhuizonghuaxueyuanliao(StockCollect stockCollect);

    @Select("SELECT ts_code FROM stock_collect_Zhuizonghuaxueyuanliao  where is_deleted = '0'     order by create_date desc")
    String[] selectZhuizonghuaxueyuanliao();

    @Select("SELECT ts_code FROM stock_collect_Zhuizonghuaxueyuanliao  where is_deleted = '1'   order by sort_order asc")
    String[] selectzanbuZhuizonghuaxueyuanliao();


    @Update("UPDATE stock_collect_Zhuizonghuaxueyuanliao SET is_deleted = '1' ,create_date = now()   WHERE ts_code = #{tsCode}")
    void delZhuizonghuaxueyuanliao(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizonghuaxueyuanliao SET is_deleted = '0',create_date = now()     WHERE ts_code = #{tsCode}")
    void updateZhuizonghuaxueyuanliao(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizonghuaxueyuanliao SET is_deleted = '0' ,create_date = now()    WHERE ts_code = #{tsCode}")
    void goonZhuizonghuaxueyuanliao(@Param("tsCode") String tsCode);

    @Select("SELECT COUNT(*) FROM stock_collect_Zhuizonghuaxueyuanliao WHERE ts_code = #{tsCode}")
    int checkIfExistsZhuizonghuaxueyuanliao(@Param("tsCode") String tsCode);


    @Select("SELECT ts_code as tsCode,sort_order as sortOrder FROM stock_collect_Zhuizonghuaxueyuanliao where flag = #{flag} ORDER BY sort_order")
    List<StockCollect> selectAllWithSortOrderZhuizonghuaxueyuanliao(@Param("flag") String flag);

    @Select("SELECT min(sort_order) as sortOrder FROM stock_collect_Zhuizonghuaxueyuanliao where flag = #{flag} ")
    StockCollect selectMinOrderZhuizonghuaxueyuanliao(@Param("flag") String flag);

    @Select("SELECT max(sort_order) as sortOrder FROM stock_collect_Zhuizonghuaxueyuanliao where flag = #{flag} ")
    StockCollect selectMaxOrderZhuizonghuaxueyuanliao(@Param("flag") String flag);

    // 更新记录的排序值
    @Update("UPDATE stock_collect_Zhuizonghuaxueyuanliao SET sort_order = #{newSortOrder} WHERE ts_code = #{tsCode}")
    void updateSortOrderZhuizonghuaxueyuanliao(@Param("tsCode") String tsCode, @Param("newSortOrder") Integer newSortOrder);

    // 根据ID获取记录的排序值
    @Select("SELECT sort_order FROM stock_collect_Zhuizonghuaxueyuanliao WHERE ts_code = #{tsCode}")
    Integer selectSortOrderByIdZhuizonghuaxueyuanliao(@Param("tsCode") String tsCode);

    @Select("SELECT flag FROM stock_collect_Zhuizonghuaxueyuanliao WHERE ts_code = #{tsCode}")
    String selectFlagByIdZhuizonghuaxueyuanliao(@Param("tsCode") String tsCode);



    @Insert("INSERT INTO stock_collect_Zhuizonghuaxuexianwei (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'6')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertZhuizonghuaxuexianwei(StockCollect stockCollect);

    @Select("SELECT ts_code FROM stock_collect_Zhuizonghuaxuexianwei  where is_deleted = '0'     order by create_date desc")
    String[] selectZhuizonghuaxuexianwei();

    @Select("SELECT ts_code FROM stock_collect_Zhuizonghuaxuexianwei  where is_deleted = '1'   order by sort_order asc")
    String[] selectzanbuZhuizonghuaxuexianwei();


    @Update("UPDATE stock_collect_Zhuizonghuaxuexianwei SET is_deleted = '1' ,create_date = now()   WHERE ts_code = #{tsCode}")
    void delZhuizonghuaxuexianwei(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizonghuaxuexianwei SET is_deleted = '0',create_date = now()     WHERE ts_code = #{tsCode}")
    void updateZhuizonghuaxuexianwei(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizonghuaxuexianwei SET is_deleted = '0' ,create_date = now()    WHERE ts_code = #{tsCode}")
    void goonZhuizonghuaxuexianwei(@Param("tsCode") String tsCode);

    @Select("SELECT COUNT(*) FROM stock_collect_Zhuizonghuaxuexianwei WHERE ts_code = #{tsCode}")
    int checkIfExistsZhuizonghuaxuexianwei(@Param("tsCode") String tsCode);


    @Select("SELECT ts_code as tsCode,sort_order as sortOrder FROM stock_collect_Zhuizonghuaxuexianwei where flag = #{flag} ORDER BY sort_order")
    List<StockCollect> selectAllWithSortOrderZhuizonghuaxuexianwei(@Param("flag") String flag);

    @Select("SELECT min(sort_order) as sortOrder FROM stock_collect_Zhuizonghuaxuexianwei where flag = #{flag} ")
    StockCollect selectMinOrderZhuizonghuaxuexianwei(@Param("flag") String flag);

    @Select("SELECT max(sort_order) as sortOrder FROM stock_collect_Zhuizonghuaxuexianwei where flag = #{flag} ")
    StockCollect selectMaxOrderZhuizonghuaxuexianwei(@Param("flag") String flag);

    // 更新记录的排序值
    @Update("UPDATE stock_collect_Zhuizonghuaxuexianwei SET sort_order = #{newSortOrder} WHERE ts_code = #{tsCode}")
    void updateSortOrderZhuizonghuaxuexianwei(@Param("tsCode") String tsCode, @Param("newSortOrder") Integer newSortOrder);

    // 根据ID获取记录的排序值
    @Select("SELECT sort_order FROM stock_collect_Zhuizonghuaxuexianwei WHERE ts_code = #{tsCode}")
    Integer selectSortOrderByIdZhuizonghuaxuexianwei(@Param("tsCode") String tsCode);

    @Select("SELECT flag FROM stock_collect_Zhuizonghuaxuexianwei WHERE ts_code = #{tsCode}")
    String selectFlagByIdZhuizonghuaxuexianwei(@Param("tsCode") String tsCode);




    @Insert("INSERT INTO stock_collect_Zhuizongbandaoti (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'6')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertZhuizongbandaoti(StockCollect stockCollect);

    @Select("SELECT ts_code FROM stock_collect_Zhuizongbandaoti  where is_deleted = '0'     order by create_date desc")
    String[] selectZhuizongbandaoti();

    @Select("SELECT ts_code FROM stock_collect_Zhuizongbandaoti  where is_deleted = '1'   order by sort_order asc")
    String[] selectzanbuZhuizongbandaoti();


    @Update("UPDATE stock_collect_Zhuizongbandaoti SET is_deleted = '1' ,create_date = now()   WHERE ts_code = #{tsCode}")
    void delZhuizongbandaoti(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizongbandaoti SET is_deleted = '0',create_date = now()     WHERE ts_code = #{tsCode}")
    void updateZhuizongbandaoti(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizongbandaoti SET is_deleted = '0' ,create_date = now()    WHERE ts_code = #{tsCode}")
    void goonZhuizongbandaoti(@Param("tsCode") String tsCode);

    @Select("SELECT COUNT(*) FROM stock_collect_Zhuizongbandaoti WHERE ts_code = #{tsCode}")
    int checkIfExistsZhuizongbandaoti(@Param("tsCode") String tsCode);


    @Select("SELECT ts_code as tsCode,sort_order as sortOrder FROM stock_collect_Zhuizongbandaoti where flag = #{flag} ORDER BY sort_order")
    List<StockCollect> selectAllWithSortOrderZhuizongbandaoti(@Param("flag") String flag);

    @Select("SELECT min(sort_order) as sortOrder FROM stock_collect_Zhuizongbandaoti where flag = #{flag} ")
    StockCollect selectMinOrderZhuizongbandaoti(@Param("flag") String flag);

    @Select("SELECT max(sort_order) as sortOrder FROM stock_collect_Zhuizongbandaoti where flag = #{flag} ")
    StockCollect selectMaxOrderZhuizongbandaoti(@Param("flag") String flag);

    // 更新记录的排序值
    @Update("UPDATE stock_collect_Zhuizongbandaoti SET sort_order = #{newSortOrder} WHERE ts_code = #{tsCode}")
    void updateSortOrderZhuizongbandaoti(@Param("tsCode") String tsCode, @Param("newSortOrder") Integer newSortOrder);

    // 根据ID获取记录的排序值
    @Select("SELECT sort_order FROM stock_collect_Zhuizongbandaoti WHERE ts_code = #{tsCode}")
    Integer selectSortOrderByIdZhuizongbandaoti(@Param("tsCode") String tsCode);

    @Select("SELECT flag FROM stock_collect_Zhuizongbandaoti WHERE ts_code = #{tsCode}")
    String selectFlagByIdZhuizongbandaoti(@Param("tsCode") String tsCode);




    @Insert("INSERT INTO stock_collect_Zhuizongbaozhuanyinshua (ts_code,create_date,flag) VALUES (#{tsCode}, #{createDate},'6')")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertZhuizongbaozhuanyinshua(StockCollect stockCollect);

    @Select("SELECT ts_code FROM stock_collect_Zhuizongbaozhuanyinshua  where is_deleted = '0'     order by create_date desc")
    String[] selectZhuizongbaozhuanyinshua();

    @Select("SELECT ts_code FROM stock_collect_Zhuizongbaozhuanyinshua  where is_deleted = '1'   order by sort_order asc")
    String[] selectzanbuZhuizongbaozhuanyinshua();


    @Update("UPDATE stock_collect_Zhuizongbaozhuanyinshua SET is_deleted = '1' ,create_date = now()   WHERE ts_code = #{tsCode}")
    void delZhuizongbaozhuanyinshua(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizongbaozhuanyinshua SET is_deleted = '0',create_date = now()     WHERE ts_code = #{tsCode}")
    void updateZhuizongbaozhuanyinshua(@Param("tsCode") String tsCode);

    @Update("UPDATE stock_collect_Zhuizongbaozhuanyinshua SET is_deleted = '0' ,create_date = now()    WHERE ts_code = #{tsCode}")
    void goonZhuizongbaozhuanyinshua(@Param("tsCode") String tsCode);

    @Select("SELECT COUNT(*) FROM stock_collect_Zhuizongbaozhuanyinshua WHERE ts_code = #{tsCode}")
    int checkIfExistsZhuizongbaozhuanyinshua(@Param("tsCode") String tsCode);


    @Select("SELECT ts_code as tsCode,sort_order as sortOrder FROM stock_collect_Zhuizongbaozhuanyinshua where flag = #{flag} ORDER BY sort_order")
    List<StockCollect> selectAllWithSortOrderZhuizongbaozhuanyinshua(@Param("flag") String flag);

    @Select("SELECT min(sort_order) as sortOrder FROM stock_collect_Zhuizongbaozhuanyinshua where flag = #{flag} ")
    StockCollect selectMinOrderZhuizongbaozhuanyinshua(@Param("flag") String flag);

    @Select("SELECT max(sort_order) as sortOrder FROM stock_collect_Zhuizongbaozhuanyinshua where flag = #{flag} ")
    StockCollect selectMaxOrderZhuizongbaozhuanyinshua(@Param("flag") String flag);

    // 更新记录的排序值
    @Update("UPDATE stock_collect_Zhuizongbaozhuanyinshua SET sort_order = #{newSortOrder} WHERE ts_code = #{tsCode}")
    void updateSortOrderZhuizongbaozhuanyinshua(@Param("tsCode") String tsCode, @Param("newSortOrder") Integer newSortOrder);

    // 根据ID获取记录的排序值
    @Select("SELECT sort_order FROM stock_collect_Zhuizongbaozhuanyinshua WHERE ts_code = #{tsCode}")
    Integer selectSortOrderByIdZhuizongbaozhuanyinshua(@Param("tsCode") String tsCode);

    @Select("SELECT flag FROM stock_collect_Zhuizongbaozhuanyinshua WHERE ts_code = #{tsCode}")
    String selectFlagByIdZhuizongbaozhuanyinshua(@Param("tsCode") String tsCode);

}
