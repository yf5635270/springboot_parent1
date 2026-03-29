package com.yf.leonadmin.rabbitmq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 * @ClassName MQReceiver
 * @Description TODO
 * @Author 杨非
 * @Date 2026年03月25日 01:00
 */
@Service
@Slf4j
public class MQReceiver {

    @RabbitListener(queues = "queue")
    public void receive(Object msg){
        log.info("接收消息："+msg);
    }
}
