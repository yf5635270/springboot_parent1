package com.yf.controller;

import com.yf.entity.User;
import com.yf.entity.Usersba;
import com.yf.mapper.UserMapper;
import com.yf.service.UsersbaService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 杨非
 * @date 2026年03月13日 10:54
 */
@RestController
@RequestMapping("/usersba")
public class UsersbaController {

    @Autowired
    private UsersbaService usersbaService;



    @GetMapping("getOne")
    public Usersba getUsersba(@Param("id") Integer id){
        Usersba usersba = usersbaService.findById(id);

        return usersba;
    }

    @GetMapping("/queryList")
    public List<Usersba> queryUserList(){
        List<Usersba> list = usersbaService.findAll();

        for (Usersba usersba:list){
            System.out.println(usersba);
        }
        return list;
    }
}
