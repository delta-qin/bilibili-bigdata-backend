package com.deltaqin.bilibili.dataobject;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class ColumnsTopnInfo implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "专栏分区ID")
    private Integer cid;

    private Date createTime;

    @ApiModelProperty(value = "文章ID")
    private Integer columnId;

    @ApiModelProperty(value = "详细分类，如'手机游戏'")
    private Integer categoryId;

    @ApiModelProperty(value = "父分类，如'游戏'-'手机游戏'，这里就是'游戏'")
    private Integer categoryParentId;

    @ApiModelProperty(value = "专栏题目")
    private String title;

    @ApiModelProperty(value = "描述")
    private String summary;

    @ApiModelProperty(value = "作者ID")
    private Long mid;

    @ApiModelProperty(value = "作者昵称")
    private String name;

    @ApiModelProperty(value = "作者头像")
    private String face;

    @ApiModelProperty(value = "阅读量")
    private Long view;

    @ApiModelProperty(value = "分享量")
    private Long share;

    @ApiModelProperty(value = "回复量")
    private Long reply;

    @ApiModelProperty(value = "获赞量")
    private Long like;

    @ApiModelProperty(value = "点踩量")
    private Long dislike;

    @ApiModelProperty(value = "投币量")
    private Long coin;

    @ApiModelProperty(value = "关注数")
    private Long favorite;

    @ApiModelProperty(value = "文字长度")
    private Integer words;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getColumnId() {
        return columnId;
    }

    public void setColumnId(Integer columnId) {
        this.columnId = columnId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getCategoryParentId() {
        return categoryParentId;
    }

    public void setCategoryParentId(Integer categoryParentId) {
        this.categoryParentId = categoryParentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
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

    public Long getShare() {
        return share;
    }

    public void setShare(Long share) {
        this.share = share;
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

    public Integer getWords() {
        return words;
    }

    public void setWords(Integer words) {
        this.words = words;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", cid=").append(cid);
        sb.append(", createTime=").append(createTime);
        sb.append(", columnId=").append(columnId);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", categoryParentId=").append(categoryParentId);
        sb.append(", title=").append(title);
        sb.append(", summary=").append(summary);
        sb.append(", mid=").append(mid);
        sb.append(", name=").append(name);
        sb.append(", face=").append(face);
        sb.append(", view=").append(view);
        sb.append(", share=").append(share);
        sb.append(", reply=").append(reply);
        sb.append(", like=").append(like);
        sb.append(", dislike=").append(dislike);
        sb.append(", coin=").append(coin);
        sb.append(", favorite=").append(favorite);
        sb.append(", words=").append(words);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}