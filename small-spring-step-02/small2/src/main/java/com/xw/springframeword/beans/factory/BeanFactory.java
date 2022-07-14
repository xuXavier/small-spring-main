package com.xw.springframeword.beans.factory;

import com.xw.springframeword.beans.BeansException;

public interface BeanFactory {
    public Object getBean(String name);
    public Object getBean(String name,Object... args) throws BeansException;
}
