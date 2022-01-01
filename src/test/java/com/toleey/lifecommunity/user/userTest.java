package com.toleey.lifecommunity.user;


import com.toleey.lifecommunity.dao.UserMapper;
import com.toleey.lifecommunity.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Timestamp;
import java.util.Date;

public class userTest {

//    @Autowired(required = false)
//    private UserMapper userMapper;

    @Test
    public void testInsertAUser(){
        User user = new User(); //默认头像
        user.setAvator("https://gravatar.zeruns.tech/avatar/2aeb599ab872efb092bce259f75d6154?s=256&d=wavatar");
        String un = "LCUser-";
        user.setUserName(un);
        user.setPassword("123456");
        user.setPhoneNumber("123456");
        user.setCreatedTime(new Timestamp((new Date()).getTime()));
        user.setEmail("");
        System.out.println(user);

       //userMapper.insertAUser(user);
    }


}
