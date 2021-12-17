package com.toleey.lifecommunity.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.net.http.HttpRequest;

@Controller
@ResponseBody
@SpringBootApplication
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @ResponseBody
    @RequestMapping(value = "/doLogin",method = RequestMethod.POST)
    public String test(HttpServletRequest request){
        String phoneNumber  =  request.getParameter("phoneNumber");
        String password  =  request.getParameter("password");


        return "hi";
    }

}
