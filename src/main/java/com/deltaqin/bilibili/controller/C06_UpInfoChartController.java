package com.deltaqin.bilibili.controller;

import com.deltaqin.bilibili.common.entities.ResultType;
import com.deltaqin.bilibili.redis.prefix.VideoKeyPrefix;
import com.deltaqin.bilibili.service.C05_ShiPinChartService;
import com.deltaqin.bilibili.service.C06_UpInfoChartService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

/**
 * @author deltaqin
 * @date 2021/6/17 下午1:12
 */
@RestController
@RequestMapping("/chart/upinfo")
@CrossOrigin(allowCredentials = "true", allowedHeaders = "*")
@Api(tags = "06 百大up信息 ")
@Slf4j
public class C06_UpInfoChartController extends BaseController {

    @Autowired
    private C06_UpInfoChartService upInfoChartService;

    @ApiOperation(value = " （1）100位百大up性别组成比例（饼状）            [ baida_up ]", notes = "")
    @RequestMapping(value = "/up/sexNum", method = RequestMethod.GET)
    public ResultType getUpSexNum() {
        //List<VideosTopnInfoVo> res = null;
        List<HashMap<String,Object>> res = null;
        //res = redisService.getList(VideoKeyPrefix.getHome, VideoKeyPrefix.GET_TOP5_THREE, Top5ThreeModel.class);
        if (res == null){
            res = upInfoChartService.getUpSexNum();
            redisService.set(VideoKeyPrefix.getHome, VideoKeyPrefix.GET_TOP5_THREE, res);
        }
        return ResultType.create(res);
    }

    @ApiOperation(value = "（2）TOP10的播放量排行榜单（条形）         [ baida_up ]", notes = "")
    @RequestMapping(value = "/up/videoTopN", method = RequestMethod.GET)
    public ResultType getUpVideoTopN(@RequestParam int N) {
        //List<VideosTopnInfoVo> res = null;
        List<HashMap<String,Object>> res = null;
        //res = redisService.getList(VideoKeyPrefix.getHome, VideoKeyPrefix.GET_TOP5_THREE, Top5ThreeModel.class);
        if (res == null){
            res = upInfoChartService.getUpVideoTopN(N);
            redisService.set(VideoKeyPrefix.getHome, VideoKeyPrefix.GET_TOP5_THREE, res);
        }
        return ResultType.create(res);
    }


    @ApiOperation(value = "（3）TOP10的播放量排行榜单（条形）         [ baida_up ]", notes = "")
    @RequestMapping(value = "/up/allVideoTopN", method = RequestMethod.GET)
    public ResultType getAllVideoTopN(@RequestParam int N) {
        //List<VideosTopnInfoVo> res = null;
        List<HashMap<String,Object>> res = null;
        //res = redisService.getList(VideoKeyPrefix.getHome, VideoKeyPrefix.GET_TOP5_THREE, Top5ThreeModel.class);
        if (res == null){
            res = upInfoChartService.getAllVideoTopN(N);
            redisService.set(VideoKeyPrefix.getHome, VideoKeyPrefix.GET_TOP5_THREE, res);
        }
        return ResultType.create(res);
    }
}
