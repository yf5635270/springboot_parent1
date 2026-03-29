package com.yf.leonadmin.exception;

import com.yf.leonadmin.response.Resct;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author 杨非
 * @date 2026年03月18日 11:29
 */
@RestControllerAdvice
public class ControllerExceptionHandler {



    @ExceptionHandler(Exception.class)
    public Resct handleBussinessException(BussinessException e){

        return Resct.fail(e.getCode(),e.getMessage());
    }
}
