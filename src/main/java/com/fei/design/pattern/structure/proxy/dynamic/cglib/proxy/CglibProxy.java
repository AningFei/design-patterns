package com.fei.design.pattern.structure.proxy.dynamic.cglib.proxy;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {


    public <T> T getProxy(Class<T> cls) {
        Enhancer enhancer = new Enhancer();
        //继承被代理类
        enhancer.setSuperclass(cls);
        //设置回调
        enhancer.setCallback(this);
        return (T) enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("匹配");
        Object object =methodProxy.invokeSuper(o,objects) ;
        System.out.println("交往");
        return object;
    }
}
