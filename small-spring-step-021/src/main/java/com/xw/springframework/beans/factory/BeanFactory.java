package com.xw.springframework.beans.factory;

import com.xw.springframework.beans.BeansException;
import com.xw.springframework.beans.config.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author xuwei
 * @data 2022/6/24
 * @Description
 */
public interface BeanFactory {
    Object getBean(String beanName) throws BeansException;
}
