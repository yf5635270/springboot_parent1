package com.yf.leonadmin.rabbitmq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName MQSender
 * @Description TODO
 * @Author 杨非
 * @Date 2026年03月25日 00:42
 */
@Service
@Slf4j
public class MQSender {

    @Autowired
    private RabbitTemplate rabbitTemplate;


    public  void send(Object msg){
        log.info("发消息:"+msg);
        rabbitTemplate.convertAndSend("queue",msg);
    }
}
