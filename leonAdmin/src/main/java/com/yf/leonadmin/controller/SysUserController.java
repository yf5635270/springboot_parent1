package com.yf.leonadmin.controller;

import com.yf.leonadmin.entity.SysUser;
import com.yf.leonadmin.service.SysUserService;
import jakarta.annotation.Resource;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 杨非
 * @date 2026年03月16日 21:36
 */
@RestController
@RequestMapping("/sysuser")
public class SysUserController {


    @Autowired
    private SysUserService sysUserService;


    // @RequestMapping(value = "",method = RequestMethod.POST)
    @PostMapping("/add")
    public String addUser(@RequestBody SysUser sysUser){
        int resultNo = sysUserService.insert(sysUser);
        return "操作成功记录数："+resultNo;
    }


    @GetMapping("/find")
    public SysUser findUser(@Param("id") Integer id){
        return sysUserService.getById(id);
    }

}
