package com.toleey.lifecommunity;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.toleey.lifecommunity.dao")
public class LifecommunityApplication {

    public static void main(String[] args) {
        SpringApplication.run(LifecommunityApplication.class, args);
    }

}
