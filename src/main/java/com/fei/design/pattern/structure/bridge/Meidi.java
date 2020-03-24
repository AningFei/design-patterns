package com.fei.design.pattern.structure.bridge;

/**
 * @Author Aning
 * @Date 2020/3/24 5:19 下午
 * @Version 1.0
 */
public class Meidi extends  Brand {
    private final  String name = "美的";

    public Meidi(ElectricAppliance electricAppliance) {
        super(electricAppliance);
    }

    @Override
    public String description() {
        return name + electricAppliance.description();
    }
}
