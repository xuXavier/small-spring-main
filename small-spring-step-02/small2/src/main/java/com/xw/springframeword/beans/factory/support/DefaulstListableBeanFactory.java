package com.xw.springframeword.beans.factory.support;

import com.xw.springframeword.beans.BeansException;
import com.xw.springframeword.beans.factory.config.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

public class DefaulstListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry{
    private final Map<String,BeanDefinition> beanDefalutMap=new HashMap<>();
    @Override
    protected BeanDefinition getBeanDefinition(String beanName) {
        BeanDefinition beanDefinition=beanDefalutMap.get(beanName);
        if(beanDefinition==null) new BeansException("No bean name"+beanName);
        return beanDefinition;
    }

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefalutMap.put(beanName,beanDefinition);
    }
}
