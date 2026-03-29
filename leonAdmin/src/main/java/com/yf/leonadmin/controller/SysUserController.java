package com.yf.leonadmin.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yf.leonadmin.entity.SysUser;
import com.yf.leonadmin.exception.BussinessException;
import com.yf.leonadmin.rabbitmq.MQSender;
import com.yf.leonadmin.response.Resct;
import com.yf.leonadmin.response.ResponseCode;
import com.yf.leonadmin.service.SysUserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 杨非
 * @date 2026年03月16日 21:36
 */
@Tag(name="系统用户管理")
@RestController
@RequestMapping("/sysuser")
public class SysUserController {


    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private MQSender mqSender;



    @RequestMapping("/mq")
    @ResponseBody
    public void mq(){
        mqSender.send("葱仔NO1");
    }


    // @RequestMapping(value = "",method = RequestMethod.POST)
    @Operation(summary = "添加用户")
    @PostMapping("/add")
    @CrossOrigin
    public Resct addUser(@RequestBody SysUser sysUser){


        Integer count = sysUserService.getCount(sysUser.getUsername());

        if(count>0){
            // throw new BussinessException(ResponseCode.USERNAME_EXIST);
            return Resct.fail(ResponseCode.USERNAME_EXIST.getCode(),ResponseCode.USERNAME_EXIST.getMessage());
        }

        int resultNo = sysUserService.insert(sysUser);

        if(resultNo>0) {
            return Resct.success();
        }else {
            return Resct.fail(ResponseCode.USERNAME_EXIST.getCode(),ResponseCode.USERNAME_EXIST.getMessage());
        }
    }


    /**
     * @Author  杨非
     * @Description TODO
     * @Date 2026/3/18 12:19
     *
     * @Param id
     *
     * @Return com.yf.leonadmin.entity.SysUser
     */
    @Operation(summary = "通过ID查询用户")
    @GetMapping("/finduser")
    @CrossOrigin
    public SysUser findUser(@Param("id") Integer id){
        return sysUserService.getById(id);
    }




    /**
     * @Author  杨非
     * @Description TODO
     * @Date 2026/3/18 12:15
     *
     * @Param sysUser
     * @Param pagenum
     * @Param pageSize
     *
     * @Return com.yf.leonadmin.response.Resct<com.github.pagehelper.PageInfo<com.yf.leonadmin.entity.SysUser>>
     */
    @Operation(summary = "查找所有用户")
    @GetMapping("/findlist")
    @CrossOrigin
    public Resct<PageInfo<SysUser>> findlist(
            // @RequestBody SysUser sysUser,
                                             @RequestParam Integer pageNum,
                                         @RequestParam Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<SysUser> list = sysUserService.getList();
        PageInfo<SysUser> pageInfo = new PageInfo(list);
        return Resct.data(pageInfo);
    }


    @Operation(summary = "更新编辑用户信息")
    @PostMapping("/edituser")
    @CrossOrigin
    public Resct editUser(@RequestBody SysUser sysUser){
        return Resct.success();
    }

    @Operation(summary = "删除用户")
    @PostMapping("deluser")
    @CrossOrigin
    public Resct delUser(@Param("id") Integer id){
        return Resct.success();
    }
}
