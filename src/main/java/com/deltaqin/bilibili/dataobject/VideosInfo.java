package com.deltaqin.bilibili.dataobject;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class VideosInfo implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "视频分区id")
    private Integer tid;

    @ApiModelProperty(value = "某个分区在某一天的视频总数，即某tid的分区视频在pubdate是某一天的视频发布总数")
    private Integer count;

    @ApiModelProperty(value = "观看量")
    private Long view;

    @ApiModelProperty(value = "弹幕数")
    private Long danmaku;

    @ApiModelProperty(value = "回复数")
    private Long reply;

    @ApiModelProperty(value = "点赞数")
    private Long like;

    @ApiModelProperty(value = "点踩数")
    private Long dislike;

    @ApiModelProperty(value = "投币数")
    private Long coin;

    @ApiModelProperty(value = "分享数")
    private Long share;

    @ApiModelProperty(value = "发布时间，关系着count属性")
    private Date pubdate;

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

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
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

    public Long getShare() {
        return share;
    }

    public void setShare(Long share) {
        this.share = share;
    }

    public Date getPubdate() {
        return pubdate;
    }

    public void setPubdate(Date pubdate) {
        this.pubdate = pubdate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", tid=").append(tid);
        sb.append(", count=").append(count);
        sb.append(", view=").append(view);
        sb.append(", danmaku=").append(danmaku);
        sb.append(", reply=").append(reply);
        sb.append(", like=").append(like);
        sb.append(", dislike=").append(dislike);
        sb.append(", coin=").append(coin);
        sb.append(", share=").append(share);
        sb.append(", pubdate=").append(pubdate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}