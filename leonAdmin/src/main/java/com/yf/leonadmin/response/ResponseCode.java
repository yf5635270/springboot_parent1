package com.yf.leonadmin.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ResponseCode {


    SUCCESS(200,"SUCCESS"),
    ERROR(500,"FAIL"),

    USERNAME_EXIST(1001,"用户名已存在");

    // 响应状态编码
    private Integer code;
    // 返回信息
    private String message;
}
