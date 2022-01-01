package com.toleey.lifecommunity.controller;

import com.toleey.lifecommunity.dao.WorkMapper;
import com.toleey.lifecommunity.pojo.Opus;
import com.toleey.lifecommunity.pojo.Work;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Controller
@ResponseBody
@SpringBootApplication
@RequestMapping("/work")
@CrossOrigin
public class WorkController {

    @Autowired(required = false)
    private WorkMapper workMapper;

    @ResponseBody
    @RequestMapping(value = "/getOpusForIndex",method = RequestMethod.GET)
    public List<Opus> findAllOpus(){
        return workMapper.findAllOpus();
    }

    @ResponseBody
    @RequestMapping(value = "/getAllWorks",method = RequestMethod.GET)
    public List<Work> findAllWorks(){
        return workMapper.findAllWorks();
    }

    //查询单个作品
    @ResponseBody
    @RequestMapping(value = "/getAOpus")
    public Opus findAnOpus(HttpServletRequest request){
        String num = request.getParameter("id");
        Integer id = Integer.parseInt(num);
        return workMapper.findAnOpus(id);
    }

    //上传作品
    @ResponseBody
    @RequestMapping(value = "/shareWork",method = RequestMethod.POST)
    public Integer uploadWorks(HttpServletRequest request){
        String image = request.getParameter("image");
        String text = request.getParameter("text");
        String phoneNumber = request.getParameter("phoneNumber");

        Work work = new Work();
        work.setPic(image);
        work.setTitle(text);
        work.setCreatedTime(new Timestamp((new Date()).getTime()));
        work.setLike(0);
        work.setPhoneNumber(phoneNumber);

        System.out.println(work);
        return workMapper.insertAWork(work);
    }

    //作品点赞
    @ResponseBody
    @RequestMapping("/toLike")
    public Integer addALike(HttpServletRequest request){
        String wId = request.getParameter("workId");
        Integer workId = Integer.parseInt(wId);
        return workMapper.addALike(workId);
    }

    //查找所有作品根据phoneNumber
    @ResponseBody
    @RequestMapping("/getAllWorksByPhoneNumber")
    public List<Work> getAllWorksByPhoneNumber(HttpServletRequest request){
        String phoneNumber = request.getParameter("phoneNumber");
        return workMapper.getAllWorksByPhoneNumber(phoneNumber);
    }

    //查找作品数量根据phoneNumber
    @ResponseBody
    @RequestMapping("/getWorkCountByPhoneNumber")
    public Integer getWorkCountByPhoneNumber(HttpServletRequest request){
        String phoneNumber = request.getParameter("phoneNumber");
        return workMapper.getWorkCountByPhoneNumber(phoneNumber);
    }
}
