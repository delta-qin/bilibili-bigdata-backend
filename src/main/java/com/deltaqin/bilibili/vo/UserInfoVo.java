package com.deltaqin.bilibili.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author deltaqin
 * @date 2021/6/17 下午1:49
 */
@Data
public class UserInfoVo {
    private Integer id;

    @ApiModelProperty(value = "账号")
    private String name;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "注册时间")
    private Date registerTime;
}
