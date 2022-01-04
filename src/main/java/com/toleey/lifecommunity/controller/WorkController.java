package com.toleey.lifecommunity.controller;

import com.toleey.lifecommunity.dao.WorkMapper;
import com.toleey.lifecommunity.pojo.WorkLike;
import com.toleey.lifecommunity.pojo.Opus;
import com.toleey.lifecommunity.pojo.Picture;
import com.toleey.lifecommunity.pojo.Work;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

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

    //作品上传
    //接受上传头像
    @ResponseBody
    @RequestMapping("/uploadWork")
    public String uploadAvator(
            @RequestParam(value="file",required=false) MultipartFile multipartFile,
            HttpServletRequest request
    ) {

        SimpleDateFormat sd = new SimpleDateFormat("yyyy/MM/dd");

        //获取文件名
        String fileName = multipartFile.getOriginalFilename();
        //获取文件后缀名
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        //重新生成文件名
        fileName = UUID.randomUUID() + suffixName;
        //添加日期目录
        String format = sd.format(new Date());
        //指定本地文件夹存储图片
        String filePath = "/Users/toby/Java/Projects/lifecommunity/src/main/webapp/uploadFiles/" + format + "/";
        File file = new File(filePath, fileName);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        try {
            //将图片保存到static文件夹里
            file.createNewFile();
            multipartFile.transferTo(new File(filePath + fileName));
            return "http://" + request.getRemoteHost() + ":" + request.getServerPort() + "/" + format + "/" + fileName;
        } catch (Exception e) {
            e.printStackTrace();
            return "false";
        }

        //https://blog.csdn.net/yiyexy/article/details/105016786
    }

    //多图上传，获取多个图片
    @ResponseBody
    @RequestMapping("/getAllPictures")
    public List<Picture> getAllPicturesByWokrId (HttpServletRequest request){
        String wId = request.getParameter("workId");
        Integer workId = Integer.parseInt(wId);
        return workMapper.getAllPicturesByWorkId(workId);
    }

    //记录用户点赞的作品
    @ResponseBody
    @RequestMapping("/likeThisWork")
    public Integer addWorkToLike(HttpServletRequest request){
        String wId = request.getParameter("workId");
        Integer workId = Integer.parseInt(wId);
        String phoneNumber = request.getParameter("phoneNumber");
        WorkLike like = new WorkLike();
        like.setWorkId(workId);
        like.setPhoneNumber(phoneNumber);
        return workMapper.addWorkToLike(like);
    }

    //查询用户点赞的作品
    @ResponseBody
    @RequestMapping("/getAllLikeWork")
    public List<Work> getAllLikeWork(HttpServletRequest request){
        String phoneNumber = request.getParameter("phoneNumber");
        return workMapper.getAllLikeWork(phoneNumber);
    }

    //统计点赞数量
    @ResponseBody
    @RequestMapping("/getCountLike")
    public Integer getCountLike(HttpServletRequest request){
        String phoneNumber = request.getParameter("phoneNumber");
        return workMapper.getCountLike(phoneNumber);
    }

    //查看用户是否点赞了
    @ResponseBody
    @RequestMapping("/getIsLike")
    public Integer getIsLike(HttpServletRequest request){
        String wId = request.getParameter("workId");
        Integer workId = Integer.parseInt(wId);
        String phoneNumber = request.getParameter("phoneNumber");
        WorkLike like = new WorkLike();
        like.setWorkId(workId);
        like.setPhoneNumber(phoneNumber);
        return workMapper.getIsLike(like);
    }

}
