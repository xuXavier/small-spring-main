package com.xw.springframeword.beans.test;

import com.xw.springframeword.beans.factory.config.BeanDefinition;
import com.xw.springframeword.beans.factory.support.DefaulstListableBeanFactory;


public class test {
    public static void main(String[] args) {

        DefaulstListableBeanFactory beanFactory = new DefaulstListableBeanFactory();
        BeanDefinition beanDefinition=new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService",beanDefinition);
        UserService userService= (UserService) beanFactory.getBean("userService");
        userService.query();
    }
}
