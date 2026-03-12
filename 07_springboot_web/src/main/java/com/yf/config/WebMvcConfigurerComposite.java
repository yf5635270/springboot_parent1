package com.yf.config;

import com.yf.interceptor.TimeInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author 杨非
 * @date 2026年03月12日 16:20
 */
@Configuration
public class WebMvcConfigurerComposite implements WebMvcConfigurer {

    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(new TimeInterceptor())      //添加拦截器
                .addPathPatterns("/**")                     //拦截所有/*
                .excludePathPatterns("/pages/**");          //设置排除的映射规则
    }

}
