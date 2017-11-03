package com.watermelon.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by ljianf on 2017/11/3.
 */
@RunWith(SpringJUnit4ClassRunner.class) //在Junit环境下提供Spring TestContext framework功能
@ContextConfiguration(classes = {TestConfig.class})//加载配置类
@ActiveProfiles("prod")//声明活动的profile
public class BeanTest {
    @Autowired
    TestBean testBean;

    @Test
    public void productBean(){
        String exp = "生产环境bean";
        String act = testBean.getContent();
        Assert.assertEquals(exp,act);
    }
}
