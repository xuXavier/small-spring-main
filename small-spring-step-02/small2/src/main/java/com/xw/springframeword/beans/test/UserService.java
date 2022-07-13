package com.xw.springframeword.beans.test;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class UserService {
    private String name;
    public UserService(String name){
        this.name=name;
    }
    public void query(){
        System.out.println("hello");
    }
}
