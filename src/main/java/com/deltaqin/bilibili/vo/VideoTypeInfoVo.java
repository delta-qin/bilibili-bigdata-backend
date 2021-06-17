package com.deltaqin.bilibili.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author deltaqin
 * @date 2021/6/17 下午1:47
 */
@Data
public class VideoTypeInfoVo {

    @ApiModelProperty(value = "视频分区ID")
    private Integer id;

    @ApiModelProperty(value = "分区名字")
    private String name;

    @ApiModelProperty(value = "父分区ID")
    private Integer parentId;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

}
