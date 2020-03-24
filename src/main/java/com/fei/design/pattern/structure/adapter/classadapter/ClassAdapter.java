package com.fei.design.pattern.structure.adapter.classadapter;

import com.fei.design.pattern.structure.adapter.dto.Target;
import com.fei.design.pattern.structure.adapter.dto.Adaptee;

/**
 * @Author Aning
 * @Date 2020/3/24 2:12 下午
 * @Version 1.0
 */
public class ClassAdapter extends Adaptee implements Target {
    @Override
    public void request() {
        System.out.println("类适配模式调用");
        super.actionMethod();
    }
}
