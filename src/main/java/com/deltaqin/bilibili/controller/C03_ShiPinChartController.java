package com.deltaqin.bilibili.controller;

import com.deltaqin.bilibili.common.entities.ResultType;
import com.deltaqin.bilibili.redis.prefix.VideoKeyPrefix;
import com.deltaqin.bilibili.service.C03_ShiPinChartService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

/**
 * @author deltaqin
 * @date 2021/6/17 下午1:11
 */
@RestController
@RequestMapping("/chart/videotrend")
@CrossOrigin(allowCredentials = "true", allowedHeaders = "*")
@Api(tags = "03 视频投稿趋势 ")
@Slf4j
public class C03_ShiPinChartController extends BaseController{

    @Autowired
    private C03_ShiPinChartService shiPinChartService;

    //
    @ApiOperation(value = "指定分区的近七日的每日投稿变化", notes = "")
    @RequestMapping(value = "/video/fenqu/7day", method = RequestMethod.GET)
    public ResultType getFenqu7Day(@RequestParam Integer tid) {
        //List<VideosTopnInfoVo> res = null;
        List<HashMap<String, Long>> res = null;
        //res = redisService.getList(VideoKeyPrefix.getHome, VideoKeyPrefix.GET_TOP5_THREE, Top5ThreeModel.class);
        if (res == null){
            res = shiPinChartService.getFenqu7Day(tid);
            redisService.set(VideoKeyPrefix.getHome, VideoKeyPrefix.GET_TOP5_THREE, res);
        }
        return ResultType.create(res);
    }
}
