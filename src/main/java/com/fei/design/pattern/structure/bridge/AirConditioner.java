package com.fei.design.pattern.structure.bridge;

/**
 * @Author Aning
 * @Date 2020/3/24 5:16 下午
 * @Version 1.0
 */
public class AirConditioner implements  ElectricAppliance {
    private final String name = "空调";

    @Override
    public String description() {
        return name;
    }
}
