package com.yf.leonadmin.exception;

import com.yf.leonadmin.response.ResponseCode;
import lombok.Data;

/**
 * @ClassName BussinessException
 * @Description TODO
 * @Author 杨非
 * @Date 2026年03月18日 11:45
 */
@Data
public class BussinessException extends RuntimeException{

    /**
     * 错误码
     */
    private Integer code;
    /**
     * 异常信息
     */
    private String message;


    public BussinessException(ResponseCode responseCode ) {
        this.code = responseCode.getCode();
        this.message = responseCode.getMessage();
    }

    public BussinessException( Integer code, String message ) {
        this.code = code;
        this.message = message;
    }

    public BussinessException(String message ) {
        this.message = message;
    }
}
