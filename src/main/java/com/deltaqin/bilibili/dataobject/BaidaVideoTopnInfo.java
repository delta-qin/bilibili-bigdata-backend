package com.deltaqin.bilibili.dataobject;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class BaidaVideoTopnInfo implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "视频分区ID 即tid")
    private Integer typeid;

    private Date createTime;

    @ApiModelProperty(value = "视频aid")
    private Long aid;

    @ApiModelProperty(value = "视频长度  00:44")
    private String length;

    @ApiModelProperty(value = "作者ID")
    private Long mid;

    @ApiModelProperty(value = "作者名称")
    private String author;

    @ApiModelProperty(value = "播放量")
    private Long play;

    @ApiModelProperty(value = "评论数")
    private Long comment;

    @ApiModelProperty(value = "视频回复数")
    private Long videoReview;

    @ApiModelProperty(value = "视频bvid，是另外一种识别ID")
    private String bvid;

    @ApiModelProperty(value = "视频标题")
    private String title;

    @ApiModelProperty(value = "视频描述")
    private String desc;

    @ApiModelProperty(value = "视频发布时间")
    private Date created;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
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

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public Long getMid() {
        return mid;
    }

    public void setMid(Long mid) {
        this.mid = mid;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Long getPlay() {
        return play;
    }

    public void setPlay(Long play) {
        this.play = play;
    }

    public Long getComment() {
        return comment;
    }

    public void setComment(Long comment) {
        this.comment = comment;
    }

    public Long getVideoReview() {
        return videoReview;
    }

    public void setVideoReview(Long videoReview) {
        this.videoReview = videoReview;
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

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", typeid=").append(typeid);
        sb.append(", createTime=").append(createTime);
        sb.append(", aid=").append(aid);
        sb.append(", length=").append(length);
        sb.append(", mid=").append(mid);
        sb.append(", author=").append(author);
        sb.append(", play=").append(play);
        sb.append(", comment=").append(comment);
        sb.append(", videoReview=").append(videoReview);
        sb.append(", bvid=").append(bvid);
        sb.append(", title=").append(title);
        sb.append(", desc=").append(desc);
        sb.append(", created=").append(created);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}