package com.deltaqin.bilibili.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author deltaqin
 * @date 2021/6/17 下午1:50
 */
@Data
public class ColumnsTopnInfoVo {
    private Integer id;

    @ApiModelProperty(value = "专栏分区ID")
    private Integer cid;

    private Date createTime;

    @ApiModelProperty(value = "文章ID")
    private Integer columnId;

    @ApiModelProperty(value = "详细分类，如'手机游戏'")
    private Integer categoryId;

    @ApiModelProperty(value = "父分类，如'游戏'-'手机游戏'，这里就是'游戏'")
    private Integer categoryParentId;

    @ApiModelProperty(value = "专栏题目")
    private String title;

    @ApiModelProperty(value = "描述")
    private String summary;

    @ApiModelProperty(value = "作者ID")
    private Long mid;

    @ApiModelProperty(value = "作者昵称")
    private String name;

    @ApiModelProperty(value = "作者头像")
    private String face;

    @ApiModelProperty(value = "阅读量")
    private Long view;

    @ApiModelProperty(value = "分享量")
    private Long share;

    @ApiModelProperty(value = "回复量")
    private Long reply;

    @ApiModelProperty(value = "获赞量")
    private Long like;

    @ApiModelProperty(value = "点踩量")
    private Long dislike;

    @ApiModelProperty(value = "投币量")
    private Long coin;

    @ApiModelProperty(value = "关注数")
    private Long favorite;

    @ApiModelProperty(value = "文字长度")
    private Integer words;
}
