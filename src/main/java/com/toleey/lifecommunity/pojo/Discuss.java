package com.toleey.lifecommunity.pojo;

import java.sql.Timestamp;

public class Discuss {

    private long id;
    private String avatorImg;
    private String userName;
    private String content;
    private java.sql.Timestamp createdTime;
    private long like;

    public Discuss() {
    }

    public Discuss(long id, String avatorImg, String userName, String content, Timestamp createdTime, long like) {
        this.id = id;
        this.avatorImg = avatorImg;
        this.userName = userName;
        this.content = content;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
        return "Discuss{" +
                "id=" + id +
                ", avatorImg='" + avatorImg + '\'' +
                ", userName='" + userName + '\'' +
                ", content='" + content + '\'' +
                ", createdTime=" + createdTime +
                ", like=" + like +
                '}';
    }
}
