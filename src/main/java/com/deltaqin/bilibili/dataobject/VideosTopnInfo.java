package com.deltaqin.bilibili.dataobject;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class VideosTopnInfo implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "视频分区id")
    private Integer tid;

    private Date createTime;

    @ApiModelProperty(value = "视频aid")
    private Long aid;

    @ApiModelProperty(value = "视频bvid，另一种id")
    private String bvid;

    @ApiModelProperty(value = "标题")
    private String title;

    @ApiModelProperty(value = "描述")
    private String desc;

    @ApiModelProperty(value = "视频总时长")
    private Integer duration;

    @ApiModelProperty(value = "作者id")
    private Long mid;

    @ApiModelProperty(value = "作者名称")
    private String name;

    @ApiModelProperty(value = "作者头像")
    private String face;

    @ApiModelProperty(value = "观看量")
    private Long view;

    @ApiModelProperty(value = "弹幕数")
    private Long danmaku;

    @ApiModelProperty(value = "回复数")
    private Long reply;

    @ApiModelProperty(value = "点赞量")
    private Long like;

    @ApiModelProperty(value = "点踩量")
    private Long dislike;

    @ApiModelProperty(value = "投币数")
    private Long coin;

    @ApiModelProperty(value = "收藏数")
    private Long favorite;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getAid() {
        return aid;
    }

    public void setAid(Long aid) {
        this.aid = aid;
    }

    public String getBvid() {
        return bvid;
    }

    public void setBvid(String bvid) {
        this.bvid = bvid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Long getMid() {
        return mid;
    }

    public void setMid(Long mid) {
        this.mid = mid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public Long getView() {
        return view;
    }

    public void setView(Long view) {
        this.view = view;
    }

    public Long getDanmaku() {
        return danmaku;
    }

    public void setDanmaku(Long danmaku) {
        this.danmaku = danmaku;
    }

    public Long getReply() {
        return reply;
    }

    public void setReply(Long reply) {
        this.reply = reply;
    }

    public Long getLike() {
        return like;
    }

    public void setLike(Long like) {
        this.like = like;
    }

    public Long getDislike() {
        return dislike;
    }

    public void setDislike(Long dislike) {
        this.dislike = dislike;
    }

    public Long getCoin() {
        return coin;
    }

    public void setCoin(Long coin) {
        this.coin = coin;
    }

    public Long getFavorite() {
        return favorite;
    }

    public void setFavorite(Long favorite) {
        this.favorite = favorite;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", tid=").append(tid);
        sb.append(", createTime=").append(createTime);
        sb.append(", aid=").append(aid);
        sb.append(", bvid=").append(bvid);
        sb.append(", title=").append(title);
        sb.append(", desc=").append(desc);
        sb.append(", duration=").append(duration);
        sb.append(", mid=").append(mid);
        sb.append(", name=").append(name);
        sb.append(", face=").append(face);
        sb.append(", view=").append(view);
        sb.append(", danmaku=").append(danmaku);
        sb.append(", reply=").append(reply);
        sb.append(", like=").append(like);
        sb.append(", dislike=").append(dislike);
        sb.append(", coin=").append(coin);
        sb.append(", favorite=").append(favorite);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}