package com.fei.design.pattern.factory.method;

import com.fei.design.pattern.factory.dto.AliPayment;
import com.fei.design.pattern.factory.dto.Payment;

public class AliPaymentFactory implements PaymentFactory {
    @Override
    public Payment createPay() {
        return new AliPayment();
    }
}
