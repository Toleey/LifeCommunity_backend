package com.toleey.lifecommunity.dao;

import com.toleey.lifecommunity.pojo.WorkLike;
import com.toleey.lifecommunity.pojo.Opus;
import com.toleey.lifecommunity.pojo.Picture;
import com.toleey.lifecommunity.pojo.Work;

import java.util.List;

public interface WorkMapper {

    //查找全部作品 新的
    public List<Opus> findAllOpus();

    //查找全部作品
    public List<Work> findAllWorks();

    //查询单个组品
    public Opus findAnOpus(Integer id);

    //上传作品
    public Integer insertAWork(Work work);

    //作品点赞
    public Integer addALike(Integer workId);

    //查找所有作品根据phoneNumber
    public List<Work> getAllWorksByPhoneNumber(String phoneNumber);

    //查找作品数量根据phoneNumber
    public Integer getWorkCountByPhoneNumber(String phoneNumber);

    //多图上传，获取多个图片
    public List<Picture> getAllPicturesByWorkId(Integer workId);

    //记录用户点赞作品
    public Integer addWorkToLike(WorkLike workLike);

    //查询用户点赞的作品
    public List<Work> getAllLikeWork(String phoneNumber);

    //统计点赞数量
    public Integer getCountLike(String phoneNumber);

    //查看用户是否点赞了
    public Integer getIsLike(WorkLike workLike);


}
