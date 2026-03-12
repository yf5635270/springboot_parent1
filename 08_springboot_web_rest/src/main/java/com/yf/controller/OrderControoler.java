package com.yf.controller;

import com.yf.entity.MyResult;
import com.yf.entity.User;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

/**
 * @author 杨非
 * @date 2026年03月11日 11:11
 */
@RestController
public class OrderControoler {

    // private final RestTemplate restTemplate;
    //
    // // 当BEAN没有无参构造函数时候，Spring将自动拿到有参数的构造函数，参数进行自动注入
    // public OrderControoler(RestTemplateBuilder restTemplateBulder){
    //     this.restTemplate = restTemplateBulder.build();
    // }

    RestClient defaultClient = RestClient.create();


    @RequestMapping("orderGet")
    public String orderGet(){
        //远程访问
        //输出字符串
        String outStr =
                defaultClient.get().uri("http://localhost:8080/yangfei/user/{id}",1).retrieve().body(String.class);

        // //获取json转实体
        // MyResult myResult =
        //         defaultClient.get().uri("http://localhost:8080/yangfei/user/1").accept(MediaType.APPLICATION_JSON).retrieve().body(MyResult.class);
        //获取返回转换实体
        MyResult myResult =
                defaultClient.get().uri("http://localhost:8080/yangfei/user/2").retrieve().body(MyResult.class);

        // System.out.println(myResult.toString());
        return myResult.toString();
    }

    @RequestMapping("orderAdd")
    public String orderAdd(){
        User user = new User("大白","月球");
        MyResult response =
                defaultClient.post().uri("http://localhost:8080/yangfei/user/addUser",user).contentType(MediaType.APPLICATION_JSON).body(user).retrieve().body(MyResult.class);
        // MyResult myResult =
        //         defaultClient.post().uri("http://localhost:8080/yangfei/add").contentType(MediaType.APPLICATION_JSON).body(user).retrieve().body(new ParameterizedTypeReference<MyResult>(){});

        return response.toString();
    }


    @RequestMapping("edit")
    public String edit(){
        User user = new User(2,"大白","月球");
        MyResult response =
            defaultClient.put().uri("http://localhost:8080/yangfei/user/editUser",user).contentType(MediaType.APPLICATION_JSON).body(user).retrieve().body(MyResult.class);
        return response.toString();
    }


    @RequestMapping("del")
    public String del(){
        Integer id = 3;
        MyResult response =
                defaultClient.delete().uri("http://localhost:8080/yangfei/user/{id}",id).retrieve().body(MyResult.class);

        return response.toString();
    }
}
