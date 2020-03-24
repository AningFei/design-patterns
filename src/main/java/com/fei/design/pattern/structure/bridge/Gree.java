package com.fei.design.pattern.structure.bridge;

/**
 * @Author Aning
 * @Date 2020/3/24 5:19 下午
 * @Version 1.0
 */
public class Gree extends  Brand {
    private final  String name = "格力";

    public Gree(ElectricAppliance electricAppliance) {
        super(electricAppliance);
    }

    @Override
    public String description() {
        return name + electricAppliance.description();
    }
}
