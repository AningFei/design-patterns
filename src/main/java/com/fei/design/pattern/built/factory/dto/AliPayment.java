package com.fei.design.pattern.built.factory.dto;


public class AliPayment implements Payment {
    @Override
    public void pay() {

        System.out.println("阿里支付");
    }
}
