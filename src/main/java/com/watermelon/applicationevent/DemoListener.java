package com.watermelon.applicationevent;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by ljianf on 2017/11/3.
 * 实现ApplicationListener泛型标识需要监听的事件类（继承ApplicationEvent）
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {
    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg = demoEvent.getMsg();
        System.out.println("爸爸收到消息："+msg);
    }
}
