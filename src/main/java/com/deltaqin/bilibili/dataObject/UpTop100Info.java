package com.deltaqin.bilibili.dataobject;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class UpTop100Info implements Serializable {
    private Integer id;

    private String upName;

    private Integer upFocusCount;

    private Integer upPlayCount;

    private byte[] upSex;

    private Integer upPartitionId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUpName() {
        return upName;
    }

    public void setUpName(String upName) {
        this.upName = upName;
    }

    public Integer getUpFocusCount() {
        return upFocusCount;
    }

    public void setUpFocusCount(Integer upFocusCount) {
        this.upFocusCount = upFocusCount;
    }

    public Integer getUpPlayCount() {
        return upPlayCount;
    }

    public void setUpPlayCount(Integer upPlayCount) {
        this.upPlayCount = upPlayCount;
    }

    public byte[] getUpSex() {
        return upSex;
    }

    public void setUpSex(byte[] upSex) {
        this.upSex = upSex;
    }

    public Integer getUpPartitionId() {
        return upPartitionId;
    }

    public void setUpPartitionId(Integer upPartitionId) {
        this.upPartitionId = upPartitionId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", upName=").append(upName);
        sb.append(", upFocusCount=").append(upFocusCount);
        sb.append(", upPlayCount=").append(upPlayCount);
        sb.append(", upSex=").append(upSex);
        sb.append(", upPartitionId=").append(upPartitionId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}