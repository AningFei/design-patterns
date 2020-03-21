package com.fei.design.pattern.structure.decorator.decorator;

import com.fei.design.pattern.structure.decorator.dto.MenuDTO;

public class MenuDecorator extends MenuDTO {

    private  MenuDTO menuDTO ;

    public MenuDecorator(MenuDTO menuDTO) {
        this.menuDTO = menuDTO;
    }

    @Override
    public String getMenus() {
        return menuDTO.getMenus();
    }

    @Override
    public String getFeatures() {
       return menuDTO.getFeatures();
    }
}
