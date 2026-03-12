package com.yf.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 * @author 杨非
 * @date 2026年03月12日 16:03
 */
public class TimeInterceptor implements HandlerInterceptor {

    LocalDateTime begin;

    Logger logger = LoggerFactory.getLogger(TimeInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //开始时间
        begin = LocalDateTime.now();
        logger.info("记录当前请求: "+request.getRequestURI()+"; 开始时间 :"+begin+" 毫秒 ;");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
        //结束时间
        LocalDateTime end = LocalDateTime.now();

        Duration duration = Duration.between(begin,end);
        Long l = duration.toMillis();
        logger.info("记录当前请求: "+request.getRequestURI()+"; 执行时间 :"+l+" 毫秒 ;");
    }
}
