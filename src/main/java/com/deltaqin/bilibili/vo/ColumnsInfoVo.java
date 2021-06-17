package com.deltaqin.bilibili.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author deltaqin
 * @date 2021/6/17 下午1:50
 */
@Data
public class ColumnsInfoVo {
    private Integer id;

    @ApiModelProperty(value = "专栏的分区ID")
    private Long cid;

    @ApiModelProperty(value = "该分区在某天的专栏发布总数，即cid和publish_time对应一个count")
    private Integer count;

    @ApiModelProperty(value = "发布时间")
    private Date publishTime;

    @ApiModelProperty(value = "阅读量")
    private Long view;

    @ApiModelProperty(value = "关注量（不需要）")
    private Long favorite;

    @ApiModelProperty(value = "点赞量")
    private Long like;

    @ApiModelProperty(value = "点踩量（不需要）")
    private Long dislike;

    @ApiModelProperty(value = "回复量")
    private Long reply;

    @ApiModelProperty(value = "分享数（不需要）")
    private Long share;

    @ApiModelProperty(value = "投币数（不需要）")
    private Long coin;

    private Date createTime;
}
