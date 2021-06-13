package com.deltaqin.bilibili.vo;

import lombok.Builder;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import org.joda.time.DateTime;

/**
 * @author deltaqin
 * @date 2021/6/13 上午11:18
 */
@Data
public class UserVo {

    private Integer id;

    private String name;

    //private String password;

    private String registerTime;
}
