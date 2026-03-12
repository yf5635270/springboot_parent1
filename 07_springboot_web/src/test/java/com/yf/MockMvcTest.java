package com.yf;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.assertj.MockMvcTester;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * @author 杨非
 * @date 2026年03月12日 12:53
 */

@SpringBootTest
@AutoConfigureMockMvc
public class MockMvcTest {


    @Autowired
    MockMvc mockMvc;


    @Test
    void testMockMVCGet() throws Exception{
        // 发起一个模拟请求，不依赖网络，不依赖WEB服务，不需要启动web应用
        mockMvc.perform(
                MockMvcRequestBuilders.get("/user/{id}",1)   //发送了GET请求
                        .accept(MediaType.APPLICATION_JSON)//设置响应的文本类型
        )
        //响应断言
                .andExpect(MockMvcResultMatchers.status().isOk())   //断言状态为200
                .andExpect(MockMvcResultMatchers.jsonPath("$.data.username").value("小王"))
                .andDo(MockMvcResultHandlers.print());
    }


    @Test
    void testMockMVCPost() throws Exception{

        String userJson = "{\n" +
                "\"username\":\"杨非1\",\n"+
                "\"address\":\"南宁1\"\n"+
                "}";
        // 发起一个模拟请求，不依赖网络，不依赖WEB服务，不需要启动web应用
        mockMvc.perform(
                        MockMvcRequestBuilders.post("/user/addUser")   //发送了GET请求
                                .accept(MediaType.APPLICATION_JSON)//设置响应的文本类型
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(userJson)
                )
                //响应断言
                .andExpect(MockMvcResultMatchers.status().isOk())   //断言状态为200
                .andExpect(MockMvcResultMatchers.jsonPath("$.data.length()").value(5))
                .andDo(MockMvcResultHandlers.print());
    }


    @Test
    void testMockMVCPostDate() throws Exception{

        String userJson = "{\n" +
                "\"username\":\"杨非1\",\n"+
                "\"address\":\"南宁1\",\n"+
                // "\"birthday\":\"2020-01-08\"\n"+     //默认格式化
                "\"birthday\":\"2020/01/08\"\n"+        //需要修改配置文件format
                "}";
        // 发起一个模拟请求，不依赖网络，不依赖WEB服务，不需要启动web应用
        mockMvc.perform(
                        MockMvcRequestBuilders.post("/user/addUser")   //发送了GET请求
                                .accept(MediaType.APPLICATION_JSON)//设置响应的文本类型
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(userJson)
                )
                //响应断言
                .andExpect(MockMvcResultMatchers.status().isOk())   //断言状态为200
                // .andExpect(MockMvcResultMatchers.jsonPath("$.data.length()").value(5))
                .andDo(MockMvcResultHandlers.print());
    }
}
