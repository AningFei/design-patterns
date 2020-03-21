package com.fei.design.pattern.built.factory.abstracts.factory;

import com.fei.design.pattern.built.factory.dto.AliGame;
import com.fei.design.pattern.built.factory.dto.AliPayment;
import com.fei.design.pattern.built.factory.dto.Game;
import com.fei.design.pattern.built.factory.dto.Payment;

public class AliFactory implements CompanyFactory {


        @Override
        public Payment createPay() {
            return new AliPayment();
    }


    @Override
    public Game createGame() {
        return new AliGame();
    }
}
