package com.xw.springframework.beans.config;

/**
 * @author xuwei
 * @data 2022/6/24
 * @Description
 */
public class BeanDefinition {
    private Class beanClass;
    public BeanDefinition(Class beanClass){
        this.beanClass=beanClass;
    }
    public Class getBean(){
        return beanClass;
    }
}
