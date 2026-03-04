package com.yf.initializrcode;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)                   //设置当前朱姐可以标记在哪
@Retention(RetentionPolicy.RUNTIME)         //  1、SOURCE只保留CLASS文件，注解不保留
                                            //  2、CLASS保留文件和注解，不会被JVM加载
                                            //  3、runtime会加载到JVM运行时中，又会保留原文件
                                            //      会被JVM加载 class.getAnnotionbytype(Autowreid.class)，获取当前类的aotowreid注解


public @interface SpringBootApplicationCode {
}
