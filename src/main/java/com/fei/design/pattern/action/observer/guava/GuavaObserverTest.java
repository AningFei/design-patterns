package com.fei.design.pattern.action.observer.guava;

import com.google.common.eventbus.EventBus;

/**
 * @Author Aning
 * @Date 2020/3/30 6:53 下午
 * @Version 1.0
 */
public class GuavaObserverTest {
    public static void main(String[] args) {

        EventBus eventBus=new EventBus();
        GuavaEvent guavaEvent=new GuavaEvent();
        eventBus.register(guavaEvent);
        eventBus.post("逗比");
    }
}
