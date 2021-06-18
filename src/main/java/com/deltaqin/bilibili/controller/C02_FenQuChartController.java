package com.deltaqin.bilibili.controller;

import com.deltaqin.bilibili.common.entities.ResultType;
import com.deltaqin.bilibili.redis.prefix.AllKeyPrefix;
import com.deltaqin.bilibili.service.C02_FenQuChartService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

/**
 * @author deltaqin
 * @date 2021/6/17 下午1:10
 */
@RestController
@RequestMapping("/chart/fenqu/video")
@CrossOrigin(allowCredentials = "true", allowedHeaders = "*")
@Api(tags = "02分区视频信息 ")
@Slf4j
public class C02_FenQuChartController extends BaseController{



    @Autowired
    private C02_FenQuChartService fenQuChartService;

    @ApiOperation(value = " 1) 指定分区的视频播放量排行榜，指定TopN（列表）\n", notes = "")
    @RequestMapping(value = "/video/topN", method = RequestMethod.GET)
    public ResultType getFenquTopN(@RequestParam Integer tid,@RequestParam int N) {
        //List<VideosTopnInfoVo> res = null;
        List<HashMap<String, Object>>  res = null;
        res = redisService.getListWithHashMap(AllKeyPrefix.getVideosTopnInfo, "getFenquTopN"+tid+"_"+N , Object.class);
        if (res == null){
            res = fenQuChartService.getFenquTopN(tid, N);
            redisService.setListWithHashMap(AllKeyPrefix.getVideosTopnInfo, "getFenquTopN"+tid+"_"+N, res);
        }
        return ResultType.create(res);
    }



    @ApiOperation(value = "指定分区视频的总数（数字卡片展示）", notes = "")
    @RequestMapping(value = "/video/fenqu/total", method = RequestMethod.GET)
    public ResultType getFenquTotal(@RequestParam Integer tid) {
        //List<VideosTopnInfoVo> res = null;
        Long  res = null;
        //res = redisService.getList(VideoKeyPrefix.getHome, VideoKeyPrefix.GET_TOP5_THREE, Top5ThreeModel.class);
        if (res == null){
            res = fenQuChartService.getFenquTotal(tid);
            //redisService.set(VideoTypeInfoKeyPrefix.getHome, VideoTypeInfoKeyPrefix.GET_TOP5_THREE, res);
        }
        return ResultType.create(res);
    }

    @ApiOperation(value = "指定分区的播放量、评论、转发、弹幕数等（雷达图）   [ video_info]\n", notes = "")
    @RequestMapping(value = "/video/fenqu/leida", method = RequestMethod.GET)
    public ResultType getFenquLeiDa(@RequestParam Integer tid) {
        //List<VideosTopnInfoVo> res = null;
        HashMap<String, Long>  res = null;
        //res = redisService.getList(VideoKeyPrefix.getHome, VideoKeyPrefix.GET_TOP5_THREE, Top5ThreeModel.class);
        if (res == null){
            res = fenQuChartService.getFenquLeiDa(tid);
            //redisService.set(VideoTypeInfoKeyPrefix.getHome, VideoTypeInfoKeyPrefix.GET_TOP5_THREE, res);
        }
        return ResultType.create(res);
    }



}
