package com.fei.design.pattern.structure.proxy.dynamic.jdk.proxy;

import com.fei.design.pattern.structure.proxy.dynamic.jdk.dto.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * jdk 代理针对的是接口代理
 * 字节码重编译
 *
 */
public class MeipoJdkProxy implements InvocationHandler {

    private Person target;

    public MeipoJdkProxy(Person target) {
        this.target = target;
    }

    public Person getProxy() {
        return (Person) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(" 匹配");
        Object result= method.invoke(target,args);
        System.out.println(" 交往");
        return result;
    }
}
