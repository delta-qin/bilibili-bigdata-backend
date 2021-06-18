package com.deltaqin.bilibili.controller;

import com.deltaqin.bilibili.common.entities.ResultType;
import com.deltaqin.bilibili.redis.prefix.VideoKeyPrefix;
import com.deltaqin.bilibili.service.C05_ShiPinChartService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

/**
 * @author deltaqin
 * @date 2021/6/17 下午1:11
 */
@RestController
@RequestMapping("/chart/newvideo")
@CrossOrigin(allowCredentials = "true", allowedHeaders = "*")
@Api(tags = "05视频新增")
@Slf4j
public class C05_ShiPinChartController extends BaseController {

    @Autowired
    private C05_ShiPinChartService shiPinChartService;

    //    （1）分区视频新增：所有分区视频当日新增数统计（条形） [video_info]
    @ApiOperation(value = " （1）分区视频新增：所有分区视频当日新增数统计（条形） [video_info]", notes = "")
    @RequestMapping(value = "/video/fenqu/allnum", method = RequestMethod.GET)
    public ResultType getFenquAllToday() {
        //List<VideosTopnInfoVo> res = null;
        List<HashMap<String, Object>> res = null;
        //res = redisService.getList(VideoKeyPrefix.getHome, VideoKeyPrefix.GET_TOP5_THREE, Top5ThreeModel.class);
        if (res == null) {
            res = shiPinChartService.getFenquAllToday();
            redisService.set(VideoKeyPrefix.getHome, VideoKeyPrefix.GET_TOP5_THREE, res);
        }
        return ResultType.create(res);
    }
}
