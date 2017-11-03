package com.watermelon.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;

/**
 * Created by ljianf on 2017/11/3.
 */
@Target(ElementType.TYPE)//���������ӿ���
@Retention(RetentionPolicy.RUNTIME)//������Runtime�ᱻJVM������CLASS������JVM��������SOURCEԴ�뼶����
@Documented
@Configuration
@ComponentScan
public @interface MyConfiguration {
    String[] value() default {};
}
