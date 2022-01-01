package com.toleey.lifecommunity.pojo;

import java.sql.Timestamp;

public class Opus {

    private long id;
    public String avatorImg;
    public String userName;
    private String pic;
    private String title;
    private java.sql.Timestamp createdTime;
    private long like;

    public Opus() {
    }

    public Opus(long id, String avatorImg, String userName, String pic, String title, Timestamp createdTime, long like) {
        this.id = id;
        this.avatorImg = avatorImg;
        this.userName = userName;
        this.pic = pic;
        this.title = title;
        this.createdTime = createdTime;
        this.like = like;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAvatorImg() {
        return avatorImg;
    }

    public void setAvatorImg(String avatorImg) {
        this.avatorImg = avatorImg;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Timestamp getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Timestamp createdTime) {
        this.createdTime = createdTime;
    }

    public long getLike() {
        return like;
    }

    public void setLike(long like) {
        this.like = like;
    }

    @Override
    public String toString() {
        return "Opus{" +
                "id=" + id +
                ", avatorImg='" + avatorImg + '\'' +
                ", userName='" + userName + '\'' +
                ", pic='" + pic + '\'' +
                ", title='" + title + '\'' +
                ", createdTime=" + createdTime +
                ", like=" + like +
                '}';
    }
}
