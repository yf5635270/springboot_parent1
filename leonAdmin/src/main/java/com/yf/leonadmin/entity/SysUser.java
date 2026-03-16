package com.yf.leonadmin.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @author 杨非
 * @date 2026年03月16日 21:25
 */

@Data
@TableName("sys_user")
public class SysUser implements Serializable {

    // @TableId(type = IdType.AUTO)
    private Long id;

    // @TableField("username")
    private String username;

    private String userpwd;

    private String name;

    private String sex;

    private String tel;

    private String headurl;
}
