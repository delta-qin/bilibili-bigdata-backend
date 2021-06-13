package com.deltaqin.bilibili.dataobject;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class PartitionInfo implements Serializable {
    private Integer id;

    private String name;

    private Integer likeCount;

    private Integer coinsCount;

    private Integer collectionsCount;

    private Integer commentCount;

    private Integer shareCount;

    private Integer barrageCount;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public Integer getCoinsCount() {
        return coinsCount;
    }

    public void setCoinsCount(Integer coinsCount) {
        this.coinsCount = coinsCount;
    }

    public Integer getCollectionsCount() {
        return collectionsCount;
    }

    public void setCollectionsCount(Integer collectionsCount) {
        this.collectionsCount = collectionsCount;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Integer getShareCount() {
        return shareCount;
    }

    public void setShareCount(Integer shareCount) {
        this.shareCount = shareCount;
    }

    public Integer getBarrageCount() {
        return barrageCount;
    }

    public void setBarrageCount(Integer barrageCount) {
        this.barrageCount = barrageCount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", likeCount=").append(likeCount);
        sb.append(", coinsCount=").append(coinsCount);
        sb.append(", collectionsCount=").append(collectionsCount);
        sb.append(", commentCount=").append(commentCount);
        sb.append(", shareCount=").append(shareCount);
        sb.append(", barrageCount=").append(barrageCount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}