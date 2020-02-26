package com.fei.design.pattern.factory.abstracts.factory;

import com.fei.design.pattern.factory.abstracts.dto.Game;
import com.fei.design.pattern.factory.abstracts.dto.Payment;

public abstract class CompanyFactory {



    abstract Payment createPay();

    abstract Game createGame();

}
