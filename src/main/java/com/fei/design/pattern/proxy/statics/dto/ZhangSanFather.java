package com.fei.design.pattern.proxy.statics.dto;

public class ZhangSanFather  implements  Person{


    private  ZhangSanPerson zhangSanPerson;

    public ZhangSanFather(ZhangSanPerson zhangSanPerson) {
        this.zhangSanPerson = zhangSanPerson;
    }

    @Override
    public void findLove() {
        System.out.println("zhao  meipo");
        System.out.println("pipei");
        this.zhangSanPerson.findLove();
        System.out.println("jiaowang");
    }
}
