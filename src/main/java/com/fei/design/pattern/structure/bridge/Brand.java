package com.fei.design.pattern.structure.bridge;

/**
 * @Author Aning
 * @Date 2020/3/24 5:18 下午
 * @Version 1.0
 */
public abstract class Brand {

    protected ElectricAppliance electricAppliance;

    public Brand(ElectricAppliance electricAppliance) {
        this.electricAppliance = electricAppliance;
    }

    abstract String description();
}
