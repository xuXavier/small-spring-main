package com.xw.springframework.beans.support;

import com.xw.springframework.beans.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xuwei
 * @data 2022/6/25
 * @Description
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {
        private Map<String,Object> singletonObjects = new HashMap<>();
        public Object getSingleton(String beanName){
                return singletonObjects.get(beanName);
        }
        protected void addSingleton(String beanName,Object singletonObject){
                singletonObjects.put(beanName,singletonObject);
        }
}
