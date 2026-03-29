package com.yf.leonadmin.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

/**
 * @author 杨非
 * @date 2026年03月16日 21:25
 */

@Data
@TableName("sys_user")
@Schema(description = "系统用户信息实体")
public class SysUser implements Serializable {

    // @TableId(type = IdType.AUTO)
    @Schema(description = "ID自增")
    private Long id;

    // @TableField("username")      //表明不一致时需要设置
    @Schema(description = "登录用户名")
    private String username;

    @Schema(description = "登录用户密码")
    private String userpwd;

    @Schema(description = "用户姓名")
    private String name;

    @Schema(description = "性别")
    private String sex;

    @Schema(description = "电话")
    private String tel;

    @Schema(description = "头像地址")
    private String headurl;
}
