package com.fei.design.pattern.structure.adapter.objectadapter;

import com.fei.design.pattern.structure.adapter.dto.Adaptee;
import com.fei.design.pattern.structure.adapter.dto.Target;

/**
 * @Author Aning
 * @Date 2020/3/24 2:17 下午
 * @Version 1.0
 */
public class ObjectAdapter implements Target {

    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        System.out.println("对象适配者模式");
        adaptee.actionMethod();
    }
}
