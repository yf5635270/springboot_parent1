package com.yf;

// import java.util.logging.Logger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author 杨非
 * @date 2026年03月07日 19:01
 * 开发组:Jul
 * 开发标准：记录日志不能直接使用日志实现，必须通过日志门面来实现
 * 同意
 */
public class JulMain {
    public static void main(String[] args) {

        // Logger logger = Logger.getLogger(JulMain.class.getName());
        // logger.info("开发组:Jul");

        Log log = LogFactory.getLog(JulMain.class);
        System.out.println(log.getClass());
        log.info("开发组:Jul");


    }
}
