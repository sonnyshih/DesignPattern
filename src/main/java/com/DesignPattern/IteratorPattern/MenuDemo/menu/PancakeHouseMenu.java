package com.DesignPattern.IteratorPattern.MenuDemo.menu;

import com.DesignPattern.IteratorPattern.MenuDemo.Iterator.PancakeHouseMenuIterator;
import com.DesignPattern.IteratorPattern.MenuDemo.base.Menu;
import com.DesignPattern.IteratorPattern.MenuDemo.base.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {
    private ArrayList menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList();

        addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
        addItem("Blueberry Pancake", "Pancakes made with fresh blueberries", true, 3.49);
        addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59);

    }

    private void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    @Override
    public Iterator createIterator(){
        return new PancakeHouseMenuIterator(menuItems);
    }

    public ArrayList getMenuItems() {
        return menuItems;
    }
}
