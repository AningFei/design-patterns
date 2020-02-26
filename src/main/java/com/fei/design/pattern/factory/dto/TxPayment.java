package com.fei.design.pattern.factory.dto;

public class TxPayment implements  Payment {

    @Override
    public void pay() {
        System.out.println("腾讯支付");
    }
}
