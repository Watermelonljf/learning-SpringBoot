package com.watermelon.applicationevent;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by ljianf on 2017/11/3.
 * ʵ��ApplicationListener���ͱ�ʶ��Ҫ�������¼��ࣨ�̳�ApplicationEvent��
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {
    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg = demoEvent.getMsg();
        System.out.println("�ְ��յ���Ϣ��"+msg);
    }
}
