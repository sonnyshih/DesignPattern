package com.DesignPattern.IteratorPattern.MenuDemo;

import com.DesignPattern.IteratorPattern.MenuDemo.menu.CafeMenu;
import com.DesignPattern.IteratorPattern.MenuDemo.menu.DinerMenu;
import com.DesignPattern.IteratorPattern.MenuDemo.menu.PancakeHouseMenu;
/* ##### Iterator Pattern 反覆器模式 ##### */
public class MenuDemo {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
        waitress.printMenu();
    }
}
