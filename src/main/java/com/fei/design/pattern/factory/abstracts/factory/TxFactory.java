package com.fei.design.pattern.factory.abstracts.factory;

import com.fei.design.pattern.factory.dto.Game;
import com.fei.design.pattern.factory.dto.Payment;
import com.fei.design.pattern.factory.dto.TxGame;
import com.fei.design.pattern.factory.dto.TxPayment;

public class TxFactory implements CompanyFactory {


    @Override
    public Payment createPay() {
        return new TxPayment();
    }


    @Override
    public Game createGame() {
        return new TxGame();
    }
}
