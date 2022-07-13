package com.xw.springframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author xuwei
 * @data 2022/6/24
 * @Description
 */
public class BeanFactory {
    private Map<String,BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();
    public Object getBean(String name){
        System.out.println("bean");
        return beanDefinitionMap.get(name).getBean();
    }
    public void registerBeanDefinition(String name,BeanDefinition bean){
        beanDefinitionMap.put(name,bean);
    }
}
