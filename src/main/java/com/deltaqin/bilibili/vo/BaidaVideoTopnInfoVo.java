package com.deltaqin.bilibili.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author deltaqin
 * @date 2021/6/17 下午1:51
 */
@Data
public class BaidaVideoTopnInfoVo {
    private Integer id;

    @ApiModelProperty(value = "视频分区ID 即tid")
    private Integer typeid;

    private Date createTime;

    @ApiModelProperty(value = "视频aid")
    private Long aid;

    @ApiModelProperty(value = "视频长度  00:44")
    private String length;

    @ApiModelProperty(value = "作者ID")
    private Long mid;

    @ApiModelProperty(value = "作者名称")
    private String author;

    @ApiModelProperty(value = "播放量")
    private Long play;

    @ApiModelProperty(value = "评论数")
    private Long comment;

    @ApiModelProperty(value = "视频回复数")
    private Long videoReview;

    @ApiModelProperty(value = "视频bvid，是另外一种识别ID")
    private String bvid;

    @ApiModelProperty(value = "视频标题")
    private String title;

    @ApiModelProperty(value = "视频描述")
    private String desc;

    @ApiModelProperty(value = "视频发布时间")
    private Date created;
}
