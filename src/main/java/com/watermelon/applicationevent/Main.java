package com.watermelon.applicationevent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by ljianf on 2017/11/3.
 */
public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher publisher = context.getBean(DemoPublisher.class);
        publisher.pulish("SB¶ù×Ó");
        context.close();
    }
}
