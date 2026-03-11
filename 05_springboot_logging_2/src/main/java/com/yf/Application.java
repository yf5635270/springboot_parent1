package com.yf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 杨非
 * @date 2026年03月07日 20:16
 */
@SpringBootApplication
public class Application {

    //1.声明日志记录器
    static Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);

        System.out.println(logger.getClass());
        logger.trace("跟踪");
        logger.debug("调试");
        logger.info("信息");
        logger.warn("警告");
        logger.warn("警告2");
        logger.error("异常");
    }
}
