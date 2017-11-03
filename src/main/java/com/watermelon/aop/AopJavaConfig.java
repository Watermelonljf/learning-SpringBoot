package com.watermelon.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by ljianf on 2017/11/3.
 */
@Configuration
@ComponentScan("com.watermelon.aop")
@EnableAspectJAutoProxy//����Spring��AspectJ��֧��
public class AopJavaConfig {
}
