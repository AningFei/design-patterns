package com.fei.design.pattern.factory.simple;

import com.fei.design.pattern.factory.dto.AliPayment;
import com.fei.design.pattern.factory.dto.Payment;
import com.fei.design.pattern.factory.dto.TxPayment;

public class SimpleFactory {

    public Payment createPay( int type) {
        Payment payment=null;
        if (1==type){
            payment= new AliPayment();
        }
        if (2==type){
            payment=  new TxPayment();
        }
        return  payment;
    }
}
