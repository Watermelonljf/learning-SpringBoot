package com.watermelon.thread;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.jws.Oneway;

/**
 * Created by ljianf on 2017/11/3.
 * @Async�ڷ����ϱ����Ǹ��첽���񷽷�
 * ���������������еķ��������첽�ģ��첽�����Զ�ע��ThreadPoolTaskExector��Ϊִ����
 */
@Service
public class AsyncTaskService {

    @Async
    public void asyncExecute(Integer i){
        System.out.println("�첽����"+i);
    }

    @Async
    public void asyncExecutePlus(Integer i){
        System.out.println("�첽����ӣ�"+(i+1));
    }
}
