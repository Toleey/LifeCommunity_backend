package com.toleey.lifecommunity.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
@RequestMapping("/back/user")
public class BackUserController {

    @RequestMapping("/login")
    public String toLogin(){
        return "login";
    }


}
