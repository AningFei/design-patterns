package com.fei.design.pattern.factory.method;

import com.fei.design.pattern.factory.dto.AliPayment;
import com.fei.design.pattern.factory.dto.Payment;
import com.fei.design.pattern.factory.dto.TxPayment;

public class TxPaymentFactory implements  MethodFactory {
    @Override
    public Payment createPay() {
        return new TxPayment();
    }
}
