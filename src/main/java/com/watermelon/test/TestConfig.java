package com.watermelon.test;

import com.watermelon.annotation.MyConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

/**
 * Created by ljianf on 2017/11/3.
 */
@MyConfiguration("com.watermelon.test")
public class TestConfig {

    @Bean
    @Profile("dev")
    public TestBean devTestBean(){
        return new TestBean("��������bean");
    }

    @Bean
    @Profile("prod")
    public TestBean prodTestBean(){
        return new TestBean("��������bean");
    }
}
