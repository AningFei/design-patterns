package com.fei.design.pattern.structure.proxy.statics.dto;

public class StaticProxyTest {
    public static void main(String[] args) {
        ZhangSanPerson zhangSanPerson=new ZhangSanPerson();
        ZhangSanFather zhangSanFather=new ZhangSanFather(zhangSanPerson);

        zhangSanFather.findLove();

    }
}
