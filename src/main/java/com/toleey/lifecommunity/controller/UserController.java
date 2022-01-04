package com.toleey.lifecommunity.controller;

import com.toleey.lifecommunity.dao.UserMapper;
import com.toleey.lifecommunity.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.net.http.HttpRequest;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@Controller
@ResponseBody
@SpringBootApplication
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired(required = false)
    private UserMapper userMapper;

    //生成随机用户名，数字和字母组成,
    public String getStringRandom(int length) {

        String val = "";
        Random random = new Random();

        //参数length，表示生成几位随机数
        for(int i = 0; i < length; i++) {

            String charOrNum = random.nextInt(2) % 2 == 0 ? "char" : "num";
            //输出字母还是数字
            if( "char".equalsIgnoreCase(charOrNum) ) {
                //输出是大写字母还是小写字母
                int temp = random.nextInt(2) % 2 == 0 ? 65 : 97;
                val += (char)(random.nextInt(26) + temp);
            } else if( "num".equalsIgnoreCase(charOrNum) ) {
                val += String.valueOf(random.nextInt(10));
            }
        }
        return val;
    }

    @ResponseBody
    @RequestMapping(value = "/doLogin",method = RequestMethod.POST)
    public Integer login(HttpServletRequest request){
        String phoneNumber  =  request.getParameter("phoneNumber").trim();
        String password  =  request.getParameter("password").trim();
        //System.out.println(Long.parseLong(phoneNumber));//int存不了手机号
        User findUser = userMapper.finaAUserByPhoneNumber(phoneNumber);//数据库就是用的varchar,根本不用转换。。。

        Integer result;

        if (findUser == null){//为空，查不到手机号，没注册过，新用户，注册

            User user = new User(); //默认头像
            user.setAvator("https://kjava.com/zs/image/OooOTm");
            String un = "LCUser-"+getStringRandom(4);
            user.setUserName(un);
            user.setPassword(password);
            user.setPhoneNumber(phoneNumber);
            user.setCreatedTime(new Timestamp((new Date()).getTime()));
            user.setEmail("");
            System.out.println(user);

             userMapper.insertAUser(user);
            System.out.println("注册成功");


            result = 1;


        }else {//不为空，查到了手机号，注册过，老用户，密码登录

            if (password.equals(findUser.getPassword())){ //输入密码正确 登录

                System.out.println("登录成功");

                result = 2;


            }else {//输入密码错误

                System.out.println("登录失败");

                result = 3;

            }

        }

        return  result;
    }

    //根据手机号返回用户信息
    @ResponseBody
    @RequestMapping(value = "/getAUserByPhoneNumber",method = RequestMethod.GET)
    public User findAUserByPhoneNumber( HttpServletRequest request ){
        String phoneNumber = request.getParameter("phoneNumber");
        return userMapper.finaAUserByPhoneNumber(phoneNumber);
    }

    //修改头像 根据手机号
    @ResponseBody
    @RequestMapping("/updateAvator")
    public Integer updateAvatorByPhoneNumber(HttpServletRequest request){
        String avator = request.getParameter("avator");
        String phoneNumber = request.getParameter("phoneNumber");
        return userMapper.updateAvatorByPhoneNumber(avator,phoneNumber);
    }

    //修改用户名 根据手机号
    @ResponseBody
    @RequestMapping("/updateUserName")
    public Integer updateUserNameByPhoneNumber(HttpServletRequest request){
        String userName = request.getParameter("userName");
        String phoneNumber = request.getParameter("phoneNumber");
        return userMapper.updateUserNameByPhoneNumber(userName,phoneNumber);
    }

    //修改密码 根据手机号
    @ResponseBody
    @RequestMapping("/updatePassword")
    public Integer updatePasswordByPhoneNumber(HttpServletRequest request){
        String password = request.getParameter("password");
        String phoneNumber = request.getParameter("phoneNumber");
        return userMapper.updatePasswordByPhoneNumber(password,phoneNumber);
    }

    //接受上传头像
    @ResponseBody
    @RequestMapping("/uploadAvator")
    public String uploadAvator(
            @RequestParam(value="file",required=false)MultipartFile multipartFile,
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


}
