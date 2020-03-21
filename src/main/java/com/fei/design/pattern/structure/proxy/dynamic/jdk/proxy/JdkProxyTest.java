package com.fei.design.pattern.structure.proxy.dynamic.jdk.proxy;

import com.fei.design.pattern.structure.proxy.dynamic.jdk.dto.ZhangSanPerson;

public class JdkProxyTest {
    public static void main(String[] args) {

        MeipoJdkProxy meipoJdkProxy=new MeipoJdkProxy(new ZhangSanPerson());
        meipoJdkProxy.getProxy().findLove();
    }
}
