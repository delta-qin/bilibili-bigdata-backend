package com.deltaqin.bilibili.redis.prefix;

/**
 * @author deltaqin
 * @date 2021/6/14 上午8:39
 */

// 视频 前缀
public class AllKeyPrefix extends BaseKeyPrefix {

    // 没有默认构造器要自己设置
    private AllKeyPrefix(int expire, String prefix) {
        super(prefix, expire);
    }

    public static final String GET_TOP5_THREE = "getTop5Three";

    public static AllKeyPrefix getBaidaUpInfo = new AllKeyPrefix(3600 * 36, "baida_up_info");
    public static AllKeyPrefix getBaidaVideoTopnInfo = new AllKeyPrefix(3600 * 36, "baida_video_topn_info");
    public static AllKeyPrefix getColumnTypeInfo = new AllKeyPrefix(3600 * 36, "column_type_info");
    public static AllKeyPrefix getColumnsInfo = new AllKeyPrefix(3600 * 36, "columns_info");
    public static AllKeyPrefix getColumnsTopnInfo = new AllKeyPrefix(3600 * 36, "columns_topn_info");
    public static AllKeyPrefix getUserInfo = new AllKeyPrefix(3600 * 36, "user_info");
    public static AllKeyPrefix getVideoTypeInfo = new AllKeyPrefix(3600 * 36, "video_type_info");
    public static AllKeyPrefix getVideosInfo = new AllKeyPrefix(3600 * 36, "videos_info");
    public static AllKeyPrefix getVideosTopnInfo = new AllKeyPrefix(3600 * 36, "videos_topn_info");

}
