package com.xw.springframework;

/**
 * @author xuwei
 * @data 2022/6/24
 * @Description
 */
public class BeanDefinition {
    private Object bean;
    public BeanDefinition(Object bean){
        this.bean=bean;
    }
    public Object getBean(){
        return bean;
    }
}
