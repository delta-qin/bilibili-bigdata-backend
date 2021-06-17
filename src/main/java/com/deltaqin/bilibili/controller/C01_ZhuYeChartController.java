package com.deltaqin.bilibili.controller;

import com.deltaqin.bilibili.common.entities.ResultType;
import com.deltaqin.bilibili.dataobject.VideosTopnInfo;
import com.deltaqin.bilibili.model.Top5ThreeModel;
import com.deltaqin.bilibili.model.VideosTopnInfoModel;
import com.deltaqin.bilibili.redis.prefix.BaseKeyPrefix;
import com.deltaqin.bilibili.redis.prefix.KeyPrefix;
import com.deltaqin.bilibili.redis.prefix.VideoKeyPrefix;
import com.deltaqin.bilibili.service.C01_ZhuYeService;
import com.deltaqin.bilibili.vo.VideosTopnInfoVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author deltaqin
 * @date 2021/6/17 下午12:22
 */
@RestController
@RequestMapping("/chart/home")
@CrossOrigin(allowCredentials = "true", allowedHeaders = "*")
@Api(tags = "01主页图标数据接口")
@Slf4j
public class C01_ZhuYeChartController extends BaseController {


    @Autowired
    private C01_ZhuYeService zhuYeService;

    @ApiOperation(value = "视频总数", notes = "")
    @RequestMapping(value = "/video/total", method = RequestMethod.GET)
    public ResultType getVideoTotal() {
        Long count = zhuYeService.getVideoTotal();
        return  ResultType.create(count);
    }

    @ApiOperation(value = "14日内新增数据", notes = "")
    @RequestMapping(value = "/video/new/14day", method = RequestMethod.GET)
    public ResultType getVideoNewIn14Day() {
        Long videoNewIn14Day = zhuYeService.getVideoNewIn14Day();
        return ResultType.create(videoNewIn14Day);
    }

    @ApiOperation(value = "（3） 爬取专栏总数（数字卡片）", notes = "")
    @RequestMapping(value = "/video/zhuanlan/total", method = RequestMethod.GET)
    public ResultType getZhuanLanTotal() {
        Long videoNewIn14Day = zhuYeService.getZhuanLanTotal();
        return ResultType.create(videoNewIn14Day);
    }

    @ApiOperation(value = "（4） 全站专栏日新增（数字卡片）", notes = "")
    @RequestMapping(value = "/video/zhuanlan/newIn14Day", method = RequestMethod.GET)
    public ResultType getNewIn14Day() {
        Long zhuanLanTotal = zhuYeService.getNewIn14Day();
        return ResultType.create(zhuanLanTotal);
    }

    @ApiOperation(value = "（5） 全站视频多连转发评论弹幕数分析（雷达）   [video_info]", notes = "")
    @RequestMapping(value = "/video/video/allsum", method = RequestMethod.GET)
    public ResultType getAllsum() {
        HashMap<String, Long> zhuanLanTotal = zhuYeService.getAllsum();
        return ResultType.create(zhuanLanTotal);
    }


    @ApiOperation(value = "（6） Top5视频的分区三连数据（条形）  [video_info]", notes = "")
    @RequestMapping(value = "/video/top5data", method = RequestMethod.GET)
    public ResultType getTop5ThreeLian() {
        //List<VideosTopnInfoVo> res = null;
        List<Top5ThreeModel> res = null;
        //res = redisService.getList(VideoKeyPrefix.getHome, VideoKeyPrefix.GET_TOP5_THREE, Top5ThreeModel.class);
        if (res == null){
            res = zhuYeService.getTop5Three();
            redisService.set(VideoKeyPrefix.getHome, VideoKeyPrefix.GET_TOP5_THREE, res);
        }
        return ResultType.create(res);
    }

    @ApiOperation(value = "（7） 全站分区热度占比（饼状图） ", notes = "")
    @RequestMapping(value = "/video/allhot", method = RequestMethod.GET)
    public ResultType getAllHot() {
        //List<VideosTopnInfoVo> res = null;
        List<HashMap<String, Double>>  res = null;
        //res = redisService.getList(VideoKeyPrefix.getHome, VideoKeyPrefix.GET_TOP5_THREE, Top5ThreeModel.class);
        if (res == null){
            res = zhuYeService.getAllHot();
            redisService.set(VideoKeyPrefix.getHome, VideoKeyPrefix.GET_TOP5_THREE, res);
        }
        return ResultType.create(res);
    }


    @ApiOperation(value = "（8） 全站Top20视频排行（列表）\n", notes = "")
    @RequestMapping(value = "/video/VideoTop20", method = RequestMethod.GET)
    public ResultType getVideoTop20() {
        //List<VideosTopnInfoVo> res = null;
        List<HashMap<String, Object>>  res = null;
        //res = redisService.getList(VideoKeyPrefix.getHome, VideoKeyPrefix.GET_TOP5_THREE, Top5ThreeModel.class);
        if (res == null){
            res = zhuYeService.getVideoTop20();
            redisService.set(VideoKeyPrefix.getHome, VideoKeyPrefix.GET_TOP5_THREE, res);
        }
        return ResultType.create(res);
    }


    @ApiOperation(value = "（9） 全站Top20专栏排行（列表） ", notes = "")
    @RequestMapping(value = "/video/zhaunlantop20", method = RequestMethod.GET)
    public ResultType getZhuanlanTop20() {
        //List<VideosTopnInfoVo> res = null;
        List<HashMap<String, Object>>  res = null;
        //res = redisService.getList(VideoKeyPrefix.getHome, VideoKeyPrefix.GET_TOP5_THREE, Top5ThreeModel.class);
        if (res == null){
            res = zhuYeService.getZhuanlanTop20();
            redisService.set(VideoKeyPrefix.getHome, VideoKeyPrefix.GET_TOP5_THREE, res);
        }
        return ResultType.create(res);
    }



    private VideosTopnInfoVo convertVoFromModel(VideosTopnInfoModel tmp) {
        if (tmp == null) return null;

        VideosTopnInfoVo videosTopnInfoVo = new VideosTopnInfoVo();
        BeanUtils.copyProperties(tmp, videosTopnInfoVo);
        return videosTopnInfoVo;
    }


}
