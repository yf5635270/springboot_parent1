package com.yf.leonadmin.response;

import lombok.Getter;

/**
 * @author 杨非
 * @date 2026年03月17日 14:55
 */
@Getter
public class Resct<T> {

    // 状态码
    private Integer code;

    // 提示信息
    private String message;

    // 自定义返回类型
    private T data;

    private Resct(Integer code){
        this.code = code;
    }

    private Resct(Integer code,String message ) {
        this.message = message;
        this.code = code;
    }

    private Resct(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> Resct<T> success(){
        return new Resct<>(ResponseCode.SUCCESS.getCode());
    }

    public static <T> Resct<T> success(String message){
        return new Resct<>(ResponseCode.SUCCESS.getCode(),message);
    }

    public static <T> Resct<T> data(T data){
        return new Resct<>(ResponseCode.SUCCESS.getCode(),ResponseCode.SUCCESS.getMessage(), data);
    }

    public static <T> Resct<T> fail(){
        return new Resct<>(ResponseCode.ERROR.getCode(),ResponseCode.ERROR.getMessage());
    }

    public static <T> Resct<T> fail(String message){
        return new Resct<>(ResponseCode.ERROR.getCode(),message);
    }

    public static <T> Resct<T> fail(Integer code ,String message){
        return new Resct<>(code,message);
    }


}
