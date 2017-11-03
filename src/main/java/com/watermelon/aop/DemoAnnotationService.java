package com.watermelon.aop;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by ljianf on 2017/11/3.
 */
@Service
public class DemoAnnotationService {
    @Action(name="拦截add")
    public void add(){
        System.out.println("注解Add后置通知");
    }
}
