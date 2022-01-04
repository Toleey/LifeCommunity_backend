package com.toleey.lifecommunity.pojo;


public class WorkLike {

  private long id;
  private String phoneNumber;
  private long workId;

  public WorkLike() {
  }

  public WorkLike(long id, String phoneNumber, long workId) {
    this.id = id;
    this.phoneNumber = phoneNumber;
    this.workId = workId;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
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

  @Override
  public String toString() {
    return "Like{" +
            "id=" + id +
            ", phoneNumber='" + phoneNumber + '\'' +
            ", workId=" + workId +
            '}';
  }
}
