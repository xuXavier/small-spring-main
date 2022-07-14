package com.xw.springframeword.beans.factory.support;

import com.xw.springframeword.beans.BeansException;
import com.xw.springframeword.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

//抽取出接口，功能就是用来对有参bean实例化的
public interface InstantiationStrategy {
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor,Object[] args)throws BeansException;
}
