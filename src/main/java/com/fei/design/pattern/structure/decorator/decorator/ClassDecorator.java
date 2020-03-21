package com.fei.design.pattern.structure.decorator.decorator;

import com.fei.design.pattern.structure.decorator.dto.MenuDTO;


public class ClassDecorator extends MenuDecorator {
    public ClassDecorator(MenuDTO menuDTO) {
        super(menuDTO);
    }

    @Override
    public String getMenus() {
        return super.getMenus() + "$$" + "Class";
    }

    @Override
    public String getFeatures() {
        return super.getFeatures() + "$$" + "展示课程";
    }
}
