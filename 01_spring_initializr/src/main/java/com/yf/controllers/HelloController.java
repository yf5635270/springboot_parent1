package com.yf.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {

    @RequestMapping("/world")
    public  String hello(){
        return "hello world";
    }


    public HelloController(){
        System.out.println("加载");
    }

}
