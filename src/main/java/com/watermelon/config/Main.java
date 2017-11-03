package com.watermelon.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by ljianf on 2017/11/3.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.sayHello("java config"));
        context.close();
    }
}
