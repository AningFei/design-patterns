package com.fei.design.pattern.structure.bridge;

/**
 * @Author Aning
 * @Date 2020/3/24 5:17 下午
 * @Version 1.0
 */
public class WaterHeater implements  ElectricAppliance {
    private final String name = "热水器";

    @Override
    public String description() {
        return name;
    }
}
