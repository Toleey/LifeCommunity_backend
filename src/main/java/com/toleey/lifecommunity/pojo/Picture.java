package com.toleey.lifecommunity.pojo;

public class Picture {

    private long id;
    private long workId;
    private String pic;

    public Picture() {
    }

    public Picture(long id, long workId, String pic) {
        this.id = id;
        this.workId = workId;
        this.pic = pic;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getWorkId() {
        return workId;
    }

    public void setWorkId(long workId) {
        this.workId = workId;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    @Override
    public String toString() {
        return "Picture{" +
                "id=" + id +
                ", workId=" + workId +
                ", pic='" + pic + '\'' +
                '}';
    }
}
