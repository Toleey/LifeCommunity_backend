package com.toleey.lifecommunity.dao;

import com.toleey.lifecommunity.pojo.Opus;
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


}
