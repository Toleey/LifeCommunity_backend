package com.toleey.lifecommunity.pojo;


public class CommentLike {

  private long id;
  private long commentId;
  private String phoneNumber;

  public CommentLike() {
  }

  public CommentLike(long id, long commentId, String phoneNumber) {
    this.id = id;
    this.commentId = commentId;
    this.phoneNumber = phoneNumber;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getCommentId() {
    return commentId;
  }

  public void setCommentId(long commentId) {
    this.commentId = commentId;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  @Override
  public String toString() {
    return "CommentLike{" +
            "id=" + id +
            ", commentId=" + commentId +
            ", phoneNumber='" + phoneNumber + '\'' +
            '}';
  }
}

