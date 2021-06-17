package com.deltaqin.bilibili.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author deltaqin
 * @date 2021/6/17 下午1:48
 */
@Data
public class VideosInfoVo {
    private Integer id;

    @ApiModelProperty(value = "视频分区id")
    private Integer tid;

    @ApiModelProperty(value = "某个分区在某一天的视频总数，即某tid的分区视频在pubdate是某一天的视频发布总数")
    private Integer count;

    @ApiModelProperty(value = "观看量")
    private Long view;

    @ApiModelProperty(value = "弹幕数")
    private Long danmaku;

    @ApiModelProperty(value = "回复数")
    private Long reply;

    @ApiModelProperty(value = "点赞数")
    private Long like;

    @ApiModelProperty(value = "点踩数")
    private Long dislike;

    @ApiModelProperty(value = "投币数")
    private Long coin;

    @ApiModelProperty(value = "分享数")
    private Long share;

    @ApiModelProperty(value = "发布时间，关系着count属性")
    private Date pubdate;
}
