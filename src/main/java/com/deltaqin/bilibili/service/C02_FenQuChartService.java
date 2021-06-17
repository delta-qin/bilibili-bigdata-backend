package com.deltaqin.bilibili.service;

import java.util.HashMap;
import java.util.List;

/**
 * @author deltaqin
 * @date 2021/6/17 下午1:37
 */
public interface C02_FenQuChartService {
    List<HashMap<String, Object>> getFenquTopN(Integer tid, int n);

    Long getFenquTotal(Integer tid);

    HashMap<String, Long> getFenquLeiDa(Integer tid);
}
