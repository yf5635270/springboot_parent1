package com.yf.controller;

import com.yf.entity.MyResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

/**
 * @author 杨非
 * @date 2026年03月11日 14:48
 */
@RestController
public class WcOrderController {


    private static final Logger log = LoggerFactory.getLogger(WcOrderController.class);

    @RequestMapping("wcorderget")
    public void wcorderget(){
        System.out.println("===============开始====================");
        log.info("【线程：{} 操作：{}】 响应内容:{} ",Thread.currentThread().getId(),
                "客户端异模拟发送请求");
        String url = "http://localhost:8080/yangfei/user/1";
        WebClient webClient = WebClient.create(url);
        Mono<MyResult> mono = webClient.get().retrieve().bodyToMono(MyResult.class);

        mono.subscribe(MyResult ->  log.info("【线程：{} 操作：{}】 响应内容:{} ",Thread.currentThread().getId(),
                "客户端异步收到服务端响应的请求"
                ,MyResult));
    }
}
