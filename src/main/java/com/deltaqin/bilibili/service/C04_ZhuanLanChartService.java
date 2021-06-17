package com.deltaqin.bilibili.service;

import java.util.HashMap;
import java.util.List;

/**
 * @author deltaqin
 * @date 2021/6/17 下午1:38
 */
public interface C04_ZhuanLanChartService {
    List<HashMap<String, Long>> getZhuanLanFenquTop50(Integer tid, Integer N);

    Long getZhuanLantotal(Integer tid);

    List<HashMap<String,Object>>  getZhuanLanNew7day(Integer tid);

    List<HashMap<String, Object>> getFenquAllNum();
}
