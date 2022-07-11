package com.xw.springframework.beans;

import java.beans.Beans;

/**
 * @author xuwei
 * @data 2022/6/25
 * @Description
 */
public class BeansException extends RuntimeException{
    public BeansException(String msg){
        super(msg);
    }
    public BeansException(String msg,Throwable cause){
        super(msg,cause);
    }
}
