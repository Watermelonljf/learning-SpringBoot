package com.watermelon.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by ljianf on 2017/11/3.
 */
@Service
public class SchedulingService {

    private SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    /**
     * 每隔一分钟执行一次
     */
    @Scheduled(fixedRate = 1000)
    public void reportCurrentTime(){
        System.out.println(dateFormat.format(new Date()));
    }

    /**
     * 每天11.25分执行
     */
    @Scheduled(cron = "0 25 11 ? * *")
    public void fixTimeExe(){
        System.out.println(dateFormat.format(new Date()));
    }


}
