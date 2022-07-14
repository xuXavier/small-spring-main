package com.xw.springframeword.beans.factory.support;

import com.xw.springframeword.beans.BeansException;
import com.xw.springframeword.beans.factory.BeanFactory;
import com.xw.springframeword.beans.factory.config.BeanDefinition;

public abstract  class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name, Object... args) throws BeansException {
        Object singletonbean = getSingleton(name);
        if(singletonbean!=null){
            return singletonbean;
        }
        BeanDefinition beanDefinition=getBeanDefinition(name);
        return createBean(name,beanDefinition,args);
    }

    @Override
    public Object getBean(String name) throws BeansException {
        Object singletonbean = getSingleton(name);
        if(singletonbean!=null){
            return singletonbean;
        }
        BeanDefinition beanDefinition=getBeanDefinition(name);
        return createBean(name,beanDefinition,null);
    }


    protected abstract BeanDefinition getBeanDefinition(String beanName) ;
    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition,Object[] args) ;
}
