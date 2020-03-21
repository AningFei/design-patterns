package com.fei.design.pattern.built.factory.dto;

public class TxGame implements Game {
    @Override
    public void play() {
        System.out.println("TX  GAME");
    }
}
