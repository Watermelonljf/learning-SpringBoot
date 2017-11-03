package com.watermelon.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;

/**
 * Created by ljianf on 2017/11/3.
 */
@Target(ElementType.TYPE)//作用在类或接口上
@Retention(RetentionPolicy.RUNTIME)//保留，Runtime会被JVM保留，CLASS编译器JVM不保留，SOURCE源码级保留
@Documented
@Configuration
@ComponentScan
public @interface MyConfiguration {
    String[] value() default {};
}
