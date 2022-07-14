package com.xw.springframeword.beans.factory.support;

import com.xw.springframeword.beans.BeansException;
import com.xw.springframeword.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

public abstract  class AbstractAutowireCapableBeanFactory extends  AbstractBeanFactory{
    private InstantiationStrategy instantiationStrategy = new CglibSubclassingInstantiationStrategy();

    public InstantiationStrategy getInstantiationStrategy() {
        return instantiationStrategy;
    }

    public void setInstantiationStrategy(InstantiationStrategy instantiationStrategy) {
        this.instantiationStrategy = instantiationStrategy;
    }

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition,Object[] args)  throws BeansException{
        Object bean =null;
        bean=createBeanInstance(beanDefinition,beanName,args);
        addSingleton(beanName,bean);
        return bean;
    }
    public Object createBeanInstance(BeanDefinition beanDefinition,String beanName,Object[] args){
        Constructor constructorToUse = null;
        Class<?> beanClass = beanDefinition.getBeanClass();
        Constructor<?>[] declaredConstructors = beanClass.getDeclaredConstructors();
        for (Constructor ctor : declaredConstructors) {
            if (null != args && ctor.getParameterTypes().length == args.length) {
                constructorToUse = ctor;
                break;
            }
        }
        return getInstantiationStrategy().instantiate(beanDefinition, beanName, constructorToUse, args);
    }

}
