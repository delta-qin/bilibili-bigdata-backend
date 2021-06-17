package com.deltaqin.bilibili.dataobject;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class BaidaUpInfo implements Serializable {
    private Integer id;

    private Date createTime;

    @ApiModelProperty(value = "百大UP的ID")
    private Long mid;

    @ApiModelProperty(value = "百大UP的昵称")
    private String name;

    @ApiModelProperty(value = "百大UP的性别")
    private String sex;

    @ApiModelProperty(value = "百大UP的头像")
    private String face;

    @ApiModelProperty(value = "百大UP的个人简述")
    private String sign;

    @ApiModelProperty(value = "百大UP的等级 0-6")
    private Integer level;

    @ApiModelProperty(value = "百大UP的生日 05-11")
    private String birthday;

    @ApiModelProperty(value = "播放数")
    private Long archiveView;

    @ApiModelProperty(value = "阅读数")
    private Long articleView;

    @ApiModelProperty(value = "获赞数")
    private Long likes;

    @ApiModelProperty(value = "关注数")
    private Long following;

    @ApiModelProperty(value = "粉丝数")
    private Long follower;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Long getArchiveView() {
        return archiveView;
    }

    public void setArchiveView(Long archiveView) {
        this.archiveView = archiveView;
    }

    public Long getArticleView() {
        return articleView;
    }

    public void setArticleView(Long articleView) {
        this.articleView = articleView;
    }

    public Long getLikes() {
        return likes;
    }

    public void setLikes(Long likes) {
        this.likes = likes;
    }

    public Long getFollowing() {
        return following;
    }

    public void setFollowing(Long following) {
        this.following = following;
    }

    public Long getFollower() {
        return follower;
    }

    public void setFollower(Long follower) {
        this.follower = follower;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", createTime=").append(createTime);
        sb.append(", mid=").append(mid);
        sb.append(", name=").append(name);
        sb.append(", sex=").append(sex);
        sb.append(", face=").append(face);
        sb.append(", sign=").append(sign);
        sb.append(", level=").append(level);
        sb.append(", birthday=").append(birthday);
        sb.append(", archiveView=").append(archiveView);
        sb.append(", articleView=").append(articleView);
        sb.append(", likes=").append(likes);
        sb.append(", following=").append(following);
        sb.append(", follower=").append(follower);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}