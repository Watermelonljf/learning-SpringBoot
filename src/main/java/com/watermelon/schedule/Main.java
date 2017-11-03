package com.watermelon.schedule;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by ljianf on 2017/11/3.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScheduleConfig.class);
    }
}
