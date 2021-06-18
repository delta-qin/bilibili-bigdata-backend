package com.deltaqin.bilibili.controller;

import com.deltaqin.bilibili.common.entities.ResultType;
import com.deltaqin.bilibili.redis.prefix.AllKeyPrefix;
import com.deltaqin.bilibili.service.C07_UpVideoChartService;
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
@RequestMapping("/chart/upvideo")
@CrossOrigin(allowCredentials = "true", allowedHeaders = "*")
@Api(tags = "07 百大up视频 ")
@Slf4j
public class C07_UpVideoChartController extends BaseController{

    @Autowired
    private C07_UpVideoChartService upVideoChartService;

    @ApiOperation(value = "（1）百大投稿总数     （数字）        ", notes = "")
    @RequestMapping(value = "/up/hundred/allviedo", method = RequestMethod.GET)
    public ResultType getHundredAllviedo() {
        //List<VideosTopnInfoVo> res = null;
        Long res = null;
        if (res == null){
            res = upVideoChartService.getHundredAllviedo();
        }
        return ResultType.create(res);
    }


    @ApiOperation(value = "（2）百大投稿占比      （饼图）  ", notes = "")
    @RequestMapping(value = "/up/hundred/percent", method = RequestMethod.GET)
    public ResultType getHundredPercent() {
        //List<VideosTopnInfoVo> res = null;
        List<HashMap<String, Object>> res = null;
        res = redisService.getListWithHashMap(AllKeyPrefix.getBaidaVideoTopnInfo,  "getHundredPercent", Object.class);
        if (res == null){
            res = upVideoChartService.getHundredPercent();
            redisService.setListWithHashMap(AllKeyPrefix.getBaidaVideoTopnInfo,  "getHundredPercent", res);
        }
        return ResultType.create(res);
    }

    @ApiOperation(value = "（3）百大中前topN播放量的视频      [baida_video_topN] (表单) ", notes = "")
    @RequestMapping(value = "/up/hundred/topN", method = RequestMethod.GET)
    public ResultType getHundredTopN(@RequestParam Integer N) {
        //List<VideosTopnInfoVo> res = null;
        List<HashMap<String, Object>> res = null;
        res = redisService.getListWithHashMap(AllKeyPrefix.getBaidaVideoTopnInfo,  "getHundredTopN"+N, Object.class);
        if (res == null){
            res = upVideoChartService.getHundredTopN(N);
            redisService.setListWithHashMap(AllKeyPrefix.getBaidaVideoTopnInfo,  "getHundredTopN"+N, res);
        }
        return ResultType.create(res);
    }
}
