package com.yf.leonadmin.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 杨非
 * @date 2026年03月17日 14:25
 */
@Configuration
public class SwaggerConfig {


    @Bean
    public OpenAPI customOpenAPI(){
        return new OpenAPI().info(
                new Info()
                        .title("葱花springboot+vue脚手架")
                        .version("1.0")
                        .description("接口文档")
                        .contact(new Contact().name("葱花").url("www.baidu.com"))
        );
    }
}
