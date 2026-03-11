package com.yf.controller;

import com.yf.entity.MyResult;
import com.yf.entity.User;
import com.yf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @author 杨非
 * @date 2026年03月11日 10:02
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/{id}")
    public MyResult getUser(@PathVariable Integer id){

        User user = userService.getUserByid(id);
        return new MyResult(200,"查询成功",user);
    }


    // 接受json 需要用@RequestBody
    @PostMapping("/addUser")
    public MyResult addUser(@RequestBody User user){
        userService.add(user);
        System.out.println(userService.getAllUser());
        return new MyResult(200,"添加成功",userService.getAllUser());
    }



    @PutMapping("/editUser")
    public MyResult editUser(@RequestBody User user){
        userService.update(user);
        return new MyResult(200,"修改成功",userService.getAllUser());
    }


    @DeleteMapping("/{id}")
    public MyResult delUser(@PathVariable Integer id){
        userService.delete(id);
        return new MyResult(200,"删除成功",userService.getAllUser());
    }
}
