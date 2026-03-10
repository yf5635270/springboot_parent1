package com.yf;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 杨非
 * @date 2026年03月07日 19:01
 * 开发组:Log4j
 */
public class Log4jMain {


    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Log4jMain.class);
        System.out.println(logger.getClass());
        logger.info("开发组:Log4j");
    }
}
