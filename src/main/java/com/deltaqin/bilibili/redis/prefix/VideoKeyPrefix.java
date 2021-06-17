package com.deltaqin.bilibili.redis.prefix;

/**
 * @author deltaqin
 * @date 2021/6/14 上午8:39
 */

// 视频 前缀
public class VideoKeyPrefix extends BaseKeyPrefix {

    // 没有默认构造器要自己设置
    private VideoKeyPrefix(int expire, String prefix) {
        super(prefix, expire);
    }

    public static final String GET_TOP5_THREE = "getTop5Three";

    public static VideoKeyPrefix getHome = new VideoKeyPrefix(3600 * 36, "home");

}
