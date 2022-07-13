package com.xw.springframeword.beans.factory.support;

import com.xw.springframeword.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry{
    private final Map<String,Object> singletonObjects=new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }
    public void addSingleton(String beanName,Object singletonbean){
        singletonObjects.put(beanName,singletonbean);
        return ;
    }
}
