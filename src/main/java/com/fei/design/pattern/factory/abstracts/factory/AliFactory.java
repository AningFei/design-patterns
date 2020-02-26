package com.fei.design.pattern.factory.abstracts.factory;

import com.fei.design.pattern.factory.abstracts.dto.AliGame;
import com.fei.design.pattern.factory.abstracts.dto.AliPayment;
import com.fei.design.pattern.factory.abstracts.dto.Game;
import com.fei.design.pattern.factory.abstracts.dto.Payment;

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
