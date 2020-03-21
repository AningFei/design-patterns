package com.fei.design.pattern.built.factory.method;

import com.fei.design.pattern.built.factory.dto.AliPayment;
import com.fei.design.pattern.built.factory.dto.Payment;

public class AliPaymentFactory implements PaymentFactory {
    @Override
    public Payment createPay() {
        return new AliPayment();
    }
}
