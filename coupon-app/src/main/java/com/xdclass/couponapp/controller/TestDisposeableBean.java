package com.xdclass.couponapp.controller;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

@Component
public class TestDisposeableBean implements DisposableBean {

    @Override
    public void destroy(){
        System.out.println("测试TestDisposableBean已经销毁");
    }

}
