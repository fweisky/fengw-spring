package org.fengw.spring.test;

import org.fengw.spring.service.IAccessService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * &#64;Conditional 注解示例<br/>
 *
 * @author Feng Wei
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:spring-config.xml")
public class ConditionalTest {

    @Autowired
    private IAccessService service;

    /**
     * 测试条件注解
     */
    @Test
    public void test() {
        service.connect();
    }
}
