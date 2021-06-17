package com.deltaqin.bilibili.service;

import java.util.HashMap;
import java.util.List;

/**
 * @author deltaqin
 * @date 2021/6/17 下午1:39
 */
public interface C07_UpVideoChartService {
    Long getHundredAllviedo( );

    List<HashMap<String, Object>> getHundredPercent();

    List<HashMap<String, Object>> getHundredTopN(Integer n);

}
