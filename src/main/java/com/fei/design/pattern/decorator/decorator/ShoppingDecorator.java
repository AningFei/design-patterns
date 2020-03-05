package com.fei.design.pattern.decorator.decorator;

import com.fei.design.pattern.decorator.dto.MenuDTO;

public class ShoppingDecorator extends  MenuDecorator {
    public ShoppingDecorator(MenuDTO menuDTO) {
        super(menuDTO);
    }

    @Override
    public String getMenus() {

        return   super.getMenus()+"&&"+"shopping";

    }

    @Override
    public String getFeatures() {
        return   super.getFeatures()+"&&"+"购买物品";
    }
}
