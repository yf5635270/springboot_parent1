package com.yf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 杨非
 * @date 2026年03月12日 15:27
 */
// 如果还是使用RestController，则只会显示return的字符串，而不显示其他内容
@Controller
@RequestMapping("hello")
public class HelloController {

    @RequestMapping("hi")
    public String getHelloHtml(){
        return "hello";
    }

    @RequestMapping("index")
    public String getIndex(){
        return "index2";
    }
}
