package com.deltaqin.bilibili.common.utils;

import java.math.BigDecimal;

/**
 * @author deltaqin
 * @date 2021/6/17 下午4:58
 */
public class DoubleUtil {
    public static double userBigDecimal(double n) {
        BigDecimal bigDecimal = new BigDecimal(n);
        return bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}
