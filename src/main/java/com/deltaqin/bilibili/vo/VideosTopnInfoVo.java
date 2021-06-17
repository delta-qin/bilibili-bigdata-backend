package com.deltaqin.bilibili.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author deltaqin
 * @date 2021/6/17 下午1:47
 */
@Data
public class VideosTopnInfoVo {
    @JsonInclude(value= JsonInclude.Include.NON_NULL)
    private Integer id;

    @ApiModelProperty(value = "视频分区id")
    private Integer tid;

    private Date createTime;

    @ApiModelProperty(value = "视频aid")
    private Long aid;

    @ApiModelProperty(value = "视频bvid，另一种id")
    private String bvid;

    @JsonInclude(value= JsonInclude.Include.NON_NULL)
    @ApiModelProperty(value = "标题")
    private String title;

    @JsonInclude(value= JsonInclude.Include.NON_NULL)
    @ApiModelProperty(value = "描述")
    private String desc;

    @ApiModelProperty(value = "视频总时长")
    private Integer duration;

    @ApiModelProperty(value = "作者id")
    private Long mid;

    @ApiModelProperty(value = "作者名称")
    private String name;

    @ApiModelProperty(value = "作者头像")
    private String face;

    @ApiModelProperty(value = "观看量")
    private Long view;

    @ApiModelProperty(value = "弹幕数")
    private Long danmaku;

    @ApiModelProperty(value = "回复数")
    private Long reply;

    @ApiModelProperty(value = "点赞量")
    private Long like;

    @ApiModelProperty(value = "点踩量")
    private Long dislike;

    @ApiModelProperty(value = "投币数")
    private Long coin;

    @ApiModelProperty(value = "收藏数")
    private Long favorite;

    private Double top5Three;
}
