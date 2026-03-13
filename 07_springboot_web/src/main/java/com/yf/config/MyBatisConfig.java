package com.yf.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author 杨非
 * @date 2026年03月13日 11:22
 */
@Configuration
@MapperScan("com.yf.mapper")
public class MyBatisConfig {
}
