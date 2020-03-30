package com.fei.design.pattern.action.template;

/**
 * @Author Aning
 * @Date 2020/3/28 5:28 下午
 * @Version 1.0
 */
public abstract  class BaseTemplate {

    public  void getPrice1(){

        //1. 获取商品
        System.out.println("h获取商品");
        //计算价格
        caculate();
    }

    protected   abstract  void caculate();
}
