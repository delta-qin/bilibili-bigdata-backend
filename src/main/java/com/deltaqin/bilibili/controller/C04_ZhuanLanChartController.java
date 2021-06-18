package com.deltaqin.bilibili.controller;

import com.deltaqin.bilibili.common.entities.ResultType;
import com.deltaqin.bilibili.redis.prefix.AllKeyPrefix;
import com.deltaqin.bilibili.service.C04_ZhuanLanChartService;
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
@RequestMapping("/chart/zhuanlan")
@CrossOrigin(allowCredentials = "true", allowedHeaders = "*")
@Api(tags = "04专栏接口")
@Slf4j
public class C04_ZhuanLanChartController extends BaseController{

    @Autowired
    private C04_ZhuanLanChartService zhuanLanChartService;

    @ApiOperation(value = "1）指定分区专栏浏览量排行Top50（列表）[ column_topn_info] ", notes = "")
    @RequestMapping(value = "/video/zhuanlan/fenqu/top50", method = RequestMethod.GET)
    public ResultType getZhuanLanFenquTop50(@RequestParam Integer tid, @RequestParam Integer N) {
        //List<VideosTopnInfoVo> res = null;
        List<HashMap<String, Long>> res = null;
        //res = redisService.getList(VideoKeyPrefix.getHome, VideoKeyPrefix.GET_TOP5_THREE, Top5ThreeModel.class);
        if (res == null){
            res = zhuanLanChartService.getZhuanLanFenquTop50(tid, N);
            //redisService.set(VideoTypeInfoKeyPrefix.getHome, VideoTypeInfoKeyPrefix.GET_TOP5_THREE, res);
        }
        return ResultType.create(res);
    }


    @ApiOperation(value = "（2）指定分区的专栏总数（数字卡片）   [column_info]", notes = "")
    @RequestMapping(value = "/video/zhuanlan/total", method = RequestMethod.GET)
    public ResultType getZhuanLantotal(@RequestParam Integer tid ) {
        //List<VideosTopnInfoVo> res = null;
        Long res = null;
        //res = redisService.getList(VideoKeyPrefix.getHome, VideoKeyPrefix.GET_TOP5_THREE, Top5ThreeModel.class);
        if (res == null){
            res = zhuanLanChartService.getZhuanLantotal(tid);
            //redisService.set(VideoTypeInfoKeyPrefix.getHome, VideoTypeInfoKeyPrefix.GET_TOP5_THREE, res);
        }
        return ResultType.create(res);
    }

    @ApiOperation(value = "  （3）近七日数据：指定分区近七日的每日投稿变化;  [column_info]\n", notes = "")
    @RequestMapping(value = "/video/zhuanlan/new7day", method = RequestMethod.GET)
    public ResultType getZhuanLanNew7day(@RequestParam Integer tid ) {
        //List<VideosTopnInfoVo> res = null;
        List<HashMap<String,Object>>  res = null;
        //res = redisService.getList(VideoKeyPrefix.getHome, VideoKeyPrefix.GET_TOP5_THREE, Top5ThreeModel.class);
        res = redisService.getListWithHashMap(AllKeyPrefix.getColumnsInfo, "getZhuanLanNew7day" , Object.class);
        if (res == null){
            res = zhuanLanChartService.getZhuanLanNew7day(tid);
            redisService.setListWithHashMap(AllKeyPrefix.getColumnsInfo, "getZhuanLanNew7day" , res);
        }
        return ResultType.create(res);
    }

    //（4）每一个分区的浏览量、点赞、评论数统计（条形图）
    @ApiOperation(value = " （4）每一个分区的浏览量、点赞、评论数统计（条形图）", notes = "")
    @RequestMapping(value = "/video/fenqu/allnum", method = RequestMethod.GET)
    public ResultType getFenquAllNum() {
        //List<VideosTopnInfoVo> res = null;
        List<HashMap<String,Object>>  res = null;
        res = redisService.getListWithHashMap(AllKeyPrefix.getColumnsInfo,  AllKeyPrefix.getColumnTypeInfo.getPrefix(), Object.class);
        if (res == null){
            res = zhuanLanChartService.getFenquAllNum();
            redisService.setListWithHashMap(AllKeyPrefix.getColumnsInfo,  AllKeyPrefix.getColumnTypeInfo.getPrefix(), res);
        }
        return ResultType.create(res);
    }


}
