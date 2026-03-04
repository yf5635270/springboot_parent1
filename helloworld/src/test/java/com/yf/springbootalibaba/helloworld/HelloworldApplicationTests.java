package com.yf.springbootalibaba.helloworld;

import com.yf.springbootalibaba.beans.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloworldApplicationTests {

    @Autowired
    private User user;


    @Test
    void contextLoads() {
        System.out.println(user);
    }

}
