package com.deltaqin.bilibili.dataobject;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class ColumnsInfo implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "专栏的分区ID")
    private Long cid;

    @ApiModelProperty(value = "该分区在某天的专栏发布总数，即cid和publish_time对应一个count")
    private Integer count;

    @ApiModelProperty(value = "发布时间")
    private Date publishTime;

    @ApiModelProperty(value = "阅读量")
    private Long view;

    @ApiModelProperty(value = "关注量（不需要）")
    private Long favorite;

    @ApiModelProperty(value = "点赞量")
    private Long like;

    @ApiModelProperty(value = "点踩量（不需要）")
    private Long dislike;

    @ApiModelProperty(value = "回复量")
    private Long reply;

    @ApiModelProperty(value = "分享数（不需要）")
    private Long share;

    @ApiModelProperty(value = "投币数（不需要）")
    private Long coin;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public Long getView() {
        return view;
    }

    public void setView(Long view) {
        this.view = view;
    }

    public Long getFavorite() {
        return favorite;
    }

    public void setFavorite(Long favorite) {
        this.favorite = favorite;
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

    public Long getReply() {
        return reply;
    }

    public void setReply(Long reply) {
        this.reply = reply;
    }

    public Long getShare() {
        return share;
    }

    public void setShare(Long share) {
        this.share = share;
    }

    public Long getCoin() {
        return coin;
    }

    public void setCoin(Long coin) {
        this.coin = coin;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", cid=").append(cid);
        sb.append(", count=").append(count);
        sb.append(", publishTime=").append(publishTime);
        sb.append(", view=").append(view);
        sb.append(", favorite=").append(favorite);
        sb.append(", like=").append(like);
        sb.append(", dislike=").append(dislike);
        sb.append(", reply=").append(reply);
        sb.append(", share=").append(share);
        sb.append(", coin=").append(coin);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}