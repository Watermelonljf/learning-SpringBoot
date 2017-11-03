package com.watermelon.thread;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.jws.Oneway;

/**
 * Created by ljianf on 2017/11/3.
 * @Async在方法上表明是个异步任务方法
 * 在类上则类中所有的方法都是异步的，异步方法自动注入ThreadPoolTaskExector作为执行器
 */
@Service
public class AsyncTaskService {

    @Async
    public void asyncExecute(Integer i){
        System.out.println("异步任务："+i);
    }

    @Async
    public void asyncExecutePlus(Integer i){
        System.out.println("异步任务加："+(i+1));
    }
}
