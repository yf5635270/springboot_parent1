package com.yf.springbootalibaba.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * springboot启动类 入口
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.yf.springbootalibaba")
public class HelloworldApplication {


    public static void main(String[] args) {
        SpringApplication.run(HelloworldApplication.class, args);
    }


}
