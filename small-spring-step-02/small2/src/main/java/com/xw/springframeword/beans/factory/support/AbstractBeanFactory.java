package com.xw.springframeword.beans.factory.support;

import com.xw.springframeword.beans.factory.BeanFactory;
import com.xw.springframeword.beans.factory.config.BeanDefinition;

public abstract  class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name) {
        Object singletonbean = getSingleton(name);
        if(singletonbean!=null){
            return singletonbean;
        }
        BeanDefinition beanDefinition=getBeanDefinition(name);
        return createBean(name,beanDefinition);
    }
    protected abstract BeanDefinition getBeanDefinition(String beanName) ;
    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) ;
}
