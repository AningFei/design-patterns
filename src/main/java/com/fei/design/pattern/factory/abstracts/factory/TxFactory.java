package com.fei.design.pattern.factory.abstracts.factory;

import com.fei.design.pattern.factory.abstracts.dto.Game;
import com.fei.design.pattern.factory.abstracts.dto.Payment;
import com.fei.design.pattern.factory.abstracts.dto.TxGame;
import com.fei.design.pattern.factory.abstracts.dto.TxPayment;

public class TxFactory extends CompanyFactory {


    @Override
    public Payment createPay() {
        return new TxPayment();
    }


    @Override
    public Game createGame() {
        return new TxGame();
    }
}
