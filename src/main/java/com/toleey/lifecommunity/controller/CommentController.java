package com.toleey.lifecommunity.controller;

import com.toleey.lifecommunity.dao.CommentMapper;
import com.toleey.lifecommunity.pojo.Comment;
import com.toleey.lifecommunity.pojo.CommentLike;
import com.toleey.lifecommunity.pojo.Discuss;
import com.toleey.lifecommunity.pojo.WorkLike;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Controller
@ResponseBody
@SpringBootApplication
@RequestMapping("/comment")
@CrossOrigin
public class CommentController {

    @Autowired(required = false)
    private CommentMapper commentMapper;

    //根据作品id查找评论
    @ResponseBody
    @RequestMapping("/getAWorkComment")
    public List<Discuss> findAWorkComment(HttpServletRequest request){
        String wId = request.getParameter("workId");
        Integer workId = Integer.parseInt(wId);
        return commentMapper.findAWorkComment(workId);
    }

    //根据作品id以及用户phoneNumber发表评论
    @ResponseBody
    @RequestMapping("/addAComment")
    public Integer insertAComment(HttpServletRequest request){
        String content = request.getParameter("content");
        String phoneNumber = request.getParameter("phoneNumber");
        String wId = request.getParameter("workId");
        Integer workId = Integer.parseInt(wId);

        System.out.println("hi");
        System.out.println(content);
        System.out.println(phoneNumber);
        System.out.println(workId);

//        String rId = request.getParameter("replyId");
//        Integer replyId = Integer.parseInt(rId);

        Comment comment = new Comment();
        comment.setContent(content);
        comment.setLike(0);
        comment.setPhoneNumber(phoneNumber);
        comment.setWorkId(workId);
        //comment.setReplyId(replyId);
        comment.setCreatedTime(new Timestamp((new Date()).getTime()));

        return commentMapper.insertAComment(comment);
    }

    //评论点赞
    @ResponseBody
    @RequestMapping("/toLike")
    public Integer addALike(HttpServletRequest request){
        String cId = request.getParameter("commentId");
        Integer commentId = Integer.parseInt(cId);
        return commentMapper.addALike(commentId);
    }

    //记录用户评论点赞
    @ResponseBody
    @RequestMapping("/likeThisComment")
    public Integer addCommentToLike(HttpServletRequest request){
        String cId = request.getParameter("commentId");
        Integer commentId = Integer.parseInt(cId);
        String phoneNumber = request.getParameter("phoneNumber");

        CommentLike commentLike = new CommentLike();
        commentLike.setCommentId(commentId);
        commentLike.setPhoneNumber(phoneNumber);

        return commentMapper.addCommentToLike(commentLike);
    }
    //查看用户评论是否点赞
    @ResponseBody
    @RequestMapping("/getCommentIsLike")
    public Integer getCommentIsLike(HttpServletRequest request){
        String cId = request.getParameter("commentId");
        Integer commentId = Integer.parseInt(cId);
        String phoneNumber = request.getParameter("phoneNumber");

        CommentLike commentLike = new CommentLike();
        commentLike.setCommentId(commentId);
        commentLike.setPhoneNumber(phoneNumber);

        System.out.println(commentLike);
        return commentMapper.getCommentIsLike(commentLike);
    }

}
