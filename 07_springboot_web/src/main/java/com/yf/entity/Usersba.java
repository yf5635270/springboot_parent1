package com.yf.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 杨非
 * @date 2026年03月13日 11:35
 */

@Data
@TableName("sys_user")
public class Usersba implements Serializable {

    private Integer id;
    private String username;
    private String address;

}
