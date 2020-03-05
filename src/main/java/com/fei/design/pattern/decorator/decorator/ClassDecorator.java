package com.fei.design.pattern.decorator.decorator;

import com.fei.design.pattern.decorator.dto.MenuDTO;

public class ClassDecorator extends  MenuDecorator {
    public ClassDecorator(MenuDTO menuDTO) {
        super(menuDTO);
    }

    @Override
    public String getMenus() {
        return super.getMenus()+"$$" +"Class";
    }

    @Override
    public String getFeatures() {
        return super.getFeatures()+"$$" +"展示课程";
    }
}
