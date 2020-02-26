package com.fei.design.pattern.factory.abstracts.factory;

import com.fei.design.pattern.factory.abstracts.dto.Game;
import com.fei.design.pattern.factory.abstracts.dto.Payment;

public interface CompanyFactory {

    Payment createPay();

    Game createGame();

}
