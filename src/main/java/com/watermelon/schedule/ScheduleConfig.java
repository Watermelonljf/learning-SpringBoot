package com.watermelon.schedule;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by ljianf on 2017/11/3.
 * 定时任务配置
 */
@Configuration
@ComponentScan("com.watermelon.schedule")
@EnableScheduling
public class ScheduleConfig {

}
