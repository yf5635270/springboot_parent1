package com.yf.leonadmin.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Queue;

/**
 * @ClassName RabbitMQConfig
 * @Description TODO
 * @Author 杨非
 * @Date 2026年03月25日 00:12
 */
@Configuration
public class RabbitMQConfig {

    @Bean
    public Queue queue(){
        return new Queue("queue",true);
    }
}
