package com.watermelon.aop;

import java.lang.annotation.*;

/**
 * Created by ljianf on 2017/11/3.
 */
//ֻ�����ڷ�����
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
