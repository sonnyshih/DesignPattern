package com.DesignPattern.CompositePattern.MenuDemo;

import com.DesignPattern.CompositePattern.MenuDemo.base.Menu;
import com.DesignPattern.CompositePattern.MenuDemo.base.MenuComponent;
import com.DesignPattern.CompositePattern.MenuDemo.base.MenuItem;

/* ##### Composite Pattern 合成模式 ##### */
public class MenuDemo {

    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu =getPancakeHouseMenu();
        MenuComponent dinerMenu = getDinerMenu();
        MenuComponent cafeMenu = getCafeMenu();

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();

        waitress.printVegetarianMenu();
    }

    private static MenuComponent getPancakeHouseMenu(){
        MenuComponent menuComponent = new Menu("PANCAKE HOUSE MENU", "Breakfast");;
        menuComponent.add(new MenuItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs", true, 2.99));
        menuComponent.add(new MenuItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99));
        menuComponent.add(new MenuItem("Blueberry Pancake", "Pancakes made with fresh blueberries", true, 3.49));
        menuComponent.add(new MenuItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59));
        return menuComponent;
    }

    private static MenuComponent getDinerMenu(){
        MenuComponent menuComponent = new Menu("DINER MENU", "Launch");
        menuComponent.add(new MenuItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99));
        menuComponent.add(new MenuItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99));
        menuComponent.add(new MenuItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29));
        menuComponent.add(new MenuItem("Hotdog", "A hot dog, with saurkraut, relish, onions,topped with cheese", false, 3.05));

        return menuComponent;
    }

    private static MenuComponent getCafeMenu(){
        MenuComponent menuComponent = new Menu("CAFE MENU", "Dinner");
        menuComponent.add(new MenuItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato, and fries", true, 3.99));
        menuComponent.add(new MenuItem("Soup of the day", "A cup of the soup of the day, with a side salad", false, 3.69));
        menuComponent.add(new MenuItem("Burrito", "A large burrito, with whole pinto beans, salsa, guacamole", true, 3.99));

        return menuComponent;
    }
}
