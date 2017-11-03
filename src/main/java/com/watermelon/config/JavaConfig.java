package com.watermelon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration表明当前是一个配置类
 * @Bean表明该方法返回一个Bean名称为方法名
 * Created by ljianf on 2017/11/3.
 */
@Configuration
public class JavaConfig {


    @Bean
    public FunctionService  functionService(){
        return new FunctionService();
    }

    @Bean
    public UseFunctionService useFunctionService(){
        UseFunctionService useFunctionService = new UseFunctionService();
        useFunctionService.setFunctionService(functionService());
        return useFunctionService;
    }
}
