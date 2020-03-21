package com.fei.design.pattern.built.factory.method;

import com.fei.design.pattern.built.factory.dto.Payment;
import com.fei.design.pattern.built.factory.dto.TxPayment;

public class TxPaymentFactory implements PaymentFactory {
    @Override
    public Payment createPay() {
        return new TxPayment();
    }
}
