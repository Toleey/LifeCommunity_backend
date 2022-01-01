package com.toleey.lifecommunity;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@MapperScan("com.toleey.lifecommunity.dao")
class LifecommunityApplicationTests {

    @Test
    void contextLoads() {
    }

}
