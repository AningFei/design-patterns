package com.fei.design.pattern.factory.abstracts.dto;

public class TxGame implements Game {
    @Override
    public void play() {
        System.out.println("TX  GAME");
    }
}
