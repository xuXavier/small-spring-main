package com.xw.springframework.test.bean;

import com.xw.springframework.BeanDefinition;

import com.xw.springframework.BeanFactory;
import org.junit.Test;

/**
 * @author xuwei
 * @data 2022/6/24
 * @Description
 */
public class ApiTest {
    @Test
    public void test() {
        //1 初始化beanFactory
        BeanFactory beanFactory = new BeanFactory();
        //2 注入bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("UserService", beanDefinition);


        //3 获取bean
        UserService userService = (UserService) beanFactory.getBean("UserService");
        userService.queryUserInfo();
    }
}
