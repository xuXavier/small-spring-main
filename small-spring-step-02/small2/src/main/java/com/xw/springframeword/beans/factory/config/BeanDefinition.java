package com.xw.springframeword.beans.factory.config;

public class BeanDefinition {
    private Class bean;
    public BeanDefinition(Class bean){
        this.bean=bean;
    }
    public BeanDefinition(){}

    public Class getBeanClass() {
        return bean;
    }
    public void setBeanClass(Class bean){
        this.bean=bean;
    }
}
