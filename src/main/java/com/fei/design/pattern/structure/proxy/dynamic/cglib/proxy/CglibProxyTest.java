package com.fei.design.pattern.structure.proxy.dynamic.cglib.proxy;

import com.fei.design.pattern.structure.proxy.dynamic.cglib.dto.ZhangSanPerson;


public class CglibProxyTest {

    public static void main(String[] args) {

        CglibProxy cglibProxy = new CglibProxy();
        cglibProxy.getProxy(ZhangSanPerson.class).findLove();


    }
}
