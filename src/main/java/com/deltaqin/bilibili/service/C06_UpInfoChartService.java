package com.deltaqin.bilibili.service;

import java.util.HashMap;
import java.util.List;

/**
 * @author deltaqin
 * @date 2021/6/17 下午1:39
 */
public interface C06_UpInfoChartService {
    List<HashMap<String, Object>> getUpSexNum();

    List<HashMap<String, Object>> getUpVideoTopN(int n);

    List<HashMap<String, Object>> getAllVideoTopN(int n);
}
