package com.deltaqin.bilibili.service;

import com.deltaqin.bilibili.dataobject.VideosTopnInfo;
import com.deltaqin.bilibili.model.Top5ThreeModel;
import com.deltaqin.bilibili.model.VideosTopnInfoModel;
import com.deltaqin.bilibili.redis.prefix.VideoKeyPrefix;
import com.deltaqin.bilibili.vo.VideosTopnInfoVo;

import java.util.HashMap;
import java.util.List;

/**
 * @author deltaqin
 * @date 2021/6/17 下午1:34
 */
public interface C01_ZhuYeService {
    List<Top5ThreeModel> getTop5Three();

    Long getVideoNewIn14Day();

    Long getVideoTotal();

    Long getZhuanLanTotal();

    Long getNewIn14Day();

    HashMap<String, Long> getAllsum();

    List<HashMap<String, Double>> getAllHot();

    List<HashMap<String, Object>> getVideoTop20();

    List<HashMap<String, Object>> getZhuanlanTop20();
}
