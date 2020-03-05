package com.fei.design.pattern.decorator.decorator;

import com.fei.design.pattern.decorator.dto.DaoHang;
import com.fei.design.pattern.decorator.dto.MenuDTO;

public class DecoratorTest {
    public static void main(String[] args) {
        MenuDTO menuDTO=new DaoHang();

        MenuDecorator menuDecorator= new ClassDecorator(menuDTO);

        menuDecorator =new ShoppingDecorator(menuDecorator);

        menuDecorator =new ShoppingDecorator(menuDecorator);

       System.out.println(menuDecorator.getMenus());

        System.out.println(menuDecorator.getFeatures());
    }
}
