package com.fei.design.pattern.factory.abstracts;

import com.fei.design.pattern.factory.abstracts.factory.AliFactory;
import com.fei.design.pattern.factory.abstracts.factory.CompanyFactory;
import com.fei.design.pattern.factory.abstracts.factory.TxFactory;

public class AbsFactoryTest {
    public static void main(String[] args) {

        CompanyFactory companyFactory = new TxFactory();


        companyFactory.createGame().play();

    }
}
