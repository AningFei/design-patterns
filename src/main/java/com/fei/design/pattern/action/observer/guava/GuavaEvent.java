package com.fei.design.pattern.action.observer.guava;

import com.google.common.eventbus.Subscribe;

/**
 * @Author Aning
 * @Date 2020/3/30 6:50 下午
 * @Version 1.0
 */
public class GuavaEvent {
    @Subscribe
    public  void subscribe(String str){

        System.out.println("执行subscribe方法，传入的参数是："+str);
    }
}
