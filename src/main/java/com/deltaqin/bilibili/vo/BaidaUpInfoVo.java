package com.deltaqin.bilibili.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author deltaqin
 * @date 2021/6/17 下午1:51
 */
@Data
public class BaidaUpInfoVo {
    private Integer id;

    private Date createTime;

    @ApiModelProperty(value = "百大UP的ID")
    private Long mid;

    @ApiModelProperty(value = "百大UP的昵称")
    private String name;

    @ApiModelProperty(value = "百大UP的性别")
    private String sex;

    @ApiModelProperty(value = "百大UP的头像")
    private String face;

    @ApiModelProperty(value = "百大UP的个人简述")
    private String sign;

    @ApiModelProperty(value = "百大UP的等级 0-6")
    private Integer level;

    @ApiModelProperty(value = "百大UP的生日 05-11")
    private String birthday;

    @ApiModelProperty(value = "播放数")
    private Long archiveView;

    @ApiModelProperty(value = "阅读数")
    private Long articleView;

    @ApiModelProperty(value = "获赞数")
    private Long likes;

    @ApiModelProperty(value = "关注数")
    private Long following;

    @ApiModelProperty(value = "粉丝数")
    private Long follower;
}
