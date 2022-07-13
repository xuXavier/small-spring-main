package com.xw.springframeword.beans.factory.support;

import com.xw.springframeword.beans.BeansException;
import com.xw.springframeword.beans.factory.config.BeanDefinition;

public abstract  class AbstractAutowireCapableBeanFactory extends  AbstractBeanFactory{


    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition)  {
        Object bean =null;
        try {
            bean=beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        addSingleton(beanName,bean);
        return bean;
    }

}
