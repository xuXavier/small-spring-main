package com.xw.springframework.beans.config;

/**
 * @author xuwei
 * @data 2022/6/25
 * @Description
 */
public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
}
