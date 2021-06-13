package com.deltaqin.bilibili.model;

import lombok.Builder;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import org.joda.time.DateTime;

/**
 * @author deltaqin
 * @date 2021/6/13 上午11:18
 */
@Data
@Builder
public class UserModel {

    private Integer id;

    @NotBlank(message = "用户名字不能为空")
    private String name;

    @NotBlank(message = "密码不能为空")
    private String password;

    private DateTime registerTime;
}
