package com.fei.design.pattern.built.factory.abstracts.factory;

import com.fei.design.pattern.built.factory.dto.Game;
import com.fei.design.pattern.built.factory.dto.Payment;

public interface  CompanyFactory {



     Payment createPay();

     Game createGame();

}
