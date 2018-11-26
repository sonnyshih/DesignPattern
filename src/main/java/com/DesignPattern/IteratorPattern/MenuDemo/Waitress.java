package com.DesignPattern.IteratorPattern.MenuDemo;

import com.DesignPattern.IteratorPattern.MenuDemo.base.Menu;
import com.DesignPattern.IteratorPattern.MenuDemo.base.MenuItem;

import java.util.Iterator;

public class Waitress {
    private Menu pancakeHouseMenu;
    private Menu dinerMenu;
    private Menu cafeMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu(){
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeIterator);

        Iterator dinerIterator = dinerMenu.createIterator();
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);

        Iterator cafeInterator = cafeMenu.createIterator();
        System.out.println("\nDINNER");
        printMenu(cafeInterator);
    }

    private void printMenu(Iterator iterator){
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
