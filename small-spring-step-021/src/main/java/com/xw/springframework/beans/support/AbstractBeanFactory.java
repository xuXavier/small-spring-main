package com.xw.springframework.beans.support;

import com.xw.springframework.beans.BeansException;
import com.xw.springframework.beans.config.BeanDefinition;
import com.xw.springframework.beans.factory.BeanFactory;

/**
 * @author xuwei
 * @data 2022/6/25
 * @Description
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {
        public Object getBean(String name)throws BeansException{
            Object bean = getSingleton(name);
            if(bean!=null)
                return bean;
            BeanDefinition beanDefinition =getBeanDefintion(name);
            return carateBean(name,beanDefinition);
        }
        protected abstract BeanDefinition getBeanDefintion(String beanName)throws BeansException;
        protected abstract Object carateBean(String beanName,BeanDefinition beanDefinition)throws BeansException;
}
