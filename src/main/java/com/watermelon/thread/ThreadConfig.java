package com.watermelon.thread;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by ljianf on 2017/11/3.
 * �����첽Ҫʵ��AsynConfigurer�ӿ�
 */
@Configuration
@ComponentScan("com.watermelon.thread")
@EnableAsync//����ʹ��Spring�첽����
public class ThreadConfig implements AsyncConfigurer{
    /**
     * ����һ�������̳߳ص�����ִ����
     * ���첽�������Զ�ע��
     * @return  Executor
     */
    @Override
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(5);
        executor.setMaxPoolSize(10);
        executor.setQueueCapacity(25);
        executor.initialize();
        return executor;
    }

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return null;
    }
}
