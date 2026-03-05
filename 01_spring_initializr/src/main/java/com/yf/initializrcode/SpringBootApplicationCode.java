package com.yf.initializrcode;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigurationExcludeFilter;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.TypeExcludeFilter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

import java.lang.annotation.*;

@Target(ElementType.TYPE)                   //设置当前朱姐可以标记在哪
@Retention(RetentionPolicy.RUNTIME)         //  1、SOURCE只保留CLASS文件，注解不保留
                                            //  2、CLASS保留文件和注解，不会被JVM加载
                                            //  3、runtime会加载到JVM运行时中，又会保留原文件
                                            //      会被JVM加载 class.getAnnotionbytype(Autowreid.class)，获取当前类的aotowreid注解
@Documented                                 //回生成注解信息
@Inherited                                  //是否会被继承
@SpringBootConfiguration                    //标注在某个类上，表示这是一个Spring Boot的配置类
@EnableAutoConfiguration                    //开启自动配置功能，会帮我们自动取加载 自动配置类:
                                            //里面的@AutoConfigurationPackage会将当前配置类所在包保存在basepackges的bean中。供spring内部使用
@ComponentScan(excludeFilters = {@ComponentScan.Filter(type = FilterType.CUSTOM,classes = TypeExcludeFilter.class),
        @ComponentScan.Filter(type = FilterType.CUSTOM,classes = AutoConfigurationExcludeFilter.class)})
                                            //TypeExcludeFilte springboot对外提供的扩展类，可以供我们去按照我们的方式进行排除
                                            //扫描包，相当于以前的XML配置中的<context:commonent-scan> 但是并没有指定basepackage,如果没有指定spring会
                                            //扫描当前配置类所在的包
                                            //AutoConfigurationExcludeFilter 排除所有配置类并且是自动配置类中里面的其中一个
public @interface SpringBootApplicationCode {
}
