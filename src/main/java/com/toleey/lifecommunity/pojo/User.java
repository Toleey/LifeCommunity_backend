package com.toleey.lifecommunity.pojo;


import java.sql.Timestamp;

public class User {

  private long id;
  private String avator;
  private String userName;
  private String password;
  private String phoneNumber;
  private java.sql.Timestamp createdTime;
  private String email;
  private long message;
  private long like;
  private long post;

  public User() {
  }

  public User(long id, String avator, String userName, String password, String phoneNumber, Timestamp createdTime, String email, long message, long like, long post) {
    this.id = id;
    this.avator = avator;
    this.userName = userName;
    this.password = password;
    this.phoneNumber = phoneNumber;
    this.createdTime = createdTime;
    this.email = email;
    this.message = message;
    this.like = like;
    this.post = post;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getAvator() {
    return avator;
  }

  public void setAvator(String avator) {
    this.avator = avator;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public Timestamp getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Timestamp createdTime) {
    this.createdTime = createdTime;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public long getMessage() {
    return message;
  }

  public void setMessage(long message) {
    this.message = message;
  }

  public long getLike() {
    return like;
  }

  public void setLike(long like) {
    this.like = like;
  }

  public long getPost() {
    return post;
  }

  public void setPost(long post) {
    this.post = post;
  }

  @Override
  public String toString() {
    return "User{" +
            "id=" + id +
            ", avator='" + avator + '\'' +
            ", userName='" + userName + '\'' +
            ", password='" + password + '\'' +
            ", phoneNumber='" + phoneNumber + '\'' +
            ", createdTime=" + createdTime +
            ", email='" + email + '\'' +
            ", message=" + message +
            ", like=" + like +
            ", post=" + post +
            '}';
  }
}
