package com.watermelon.thread;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by ljianf on 2017/11/3.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ThreadConfig.class);
        AsyncTaskService bean = context.getBean(AsyncTaskService.class);
        for(int i=0;i<100;i++){
            bean.asyncExecute(i);
            bean.asyncExecutePlus(i);
        }
    }
}
