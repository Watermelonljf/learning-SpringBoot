package com.watermelon.aop;

import org.springframework.stereotype.Service;

/**
 * Created by ljianf on 2017/11/3.
 */
@Service
public class DemoMethodService {
    public void add(){
        System.out.println("方法规则切点add");
    }
}
