package com.watermelon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration������ǰ��һ��������
 * @Bean�����÷�������һ��Bean����Ϊ������
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
