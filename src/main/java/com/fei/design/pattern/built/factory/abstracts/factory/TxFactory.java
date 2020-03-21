package com.fei.design.pattern.built.factory.abstracts.factory;

import com.fei.design.pattern.built.factory.dto.Game;
import com.fei.design.pattern.built.factory.dto.Payment;
import com.fei.design.pattern.built.factory.dto.TxGame;
import com.fei.design.pattern.built.factory.dto.TxPayment;

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
