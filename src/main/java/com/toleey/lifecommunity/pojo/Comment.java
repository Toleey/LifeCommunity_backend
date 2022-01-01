package com.toleey.lifecommunity.pojo;

import java.sql.Timestamp;

public class Comment {
    private long id;
    private String content;
    private long like;
    private String phoneNumber;
    private long workId;
    private long replyId;
    private java.sql.Timestamp createdTime;

    public Comment() {
    }

    public Comment(long id, String content, long like, String phoneNumber, long workId, long replyId, Timestamp createdTime) {
        this.id = id;
        this.content = content;
        this.like = like;
        this.phoneNumber = phoneNumber;
        this.workId = workId;
        this.replyId = replyId;
        this.createdTime = createdTime;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getLike() {
        return like;
    }

    public void setLike(long like) {
        this.like = like;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getWorkId() {
        return workId;
    }

    public void setWorkId(long workId) {
        this.workId = workId;
    }

    public long getReplyId() {
        return replyId;
    }

    public void setReplyId(long replyId) {
        this.replyId = replyId;
    }

    public Timestamp getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Timestamp createdTime) {
        this.createdTime = createdTime;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", like=" + like +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", workId=" + workId +
                ", replyId=" + replyId +
                ", createdTime=" + createdTime +
                '}';
    }
}
