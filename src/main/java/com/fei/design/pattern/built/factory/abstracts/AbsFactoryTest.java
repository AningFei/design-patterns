package com.fei.design.pattern.built.factory.abstracts;

import com.fei.design.pattern.built.factory.abstracts.factory.CompanyFactory;
import com.fei.design.pattern.built.factory.abstracts.factory.TxFactory;

public class AbsFactoryTest {
    public static void main(String[] args) {

        CompanyFactory companyFactory = new TxFactory();


        companyFactory.createGame().play();

    }
}
