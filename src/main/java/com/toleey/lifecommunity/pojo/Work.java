package com.toleey.lifecommunity.pojo;


import java.sql.Timestamp;

public class Work {

  private long id;
  private String pic;
  private String title;
  private java.sql.Timestamp createdTime;
  private long like;
  private String phoneNumber;

  public Work(long id, String pic, String title, Timestamp createdTime, long like, String phoneNumber) {
    this.id = id;
    this.pic = pic;
    this.title = title;
    this.createdTime = createdTime;
    this.like = like;
    this.phoneNumber = phoneNumber;
  }

  public Work() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
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

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
}
