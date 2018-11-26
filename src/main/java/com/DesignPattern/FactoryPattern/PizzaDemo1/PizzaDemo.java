package com.DesignPattern.FactoryPattern.PizzaDemo1;

import com.DesignPattern.FactoryPattern.PizzaDemo1.base.Pizza;
import com.DesignPattern.FactoryPattern.PizzaDemo1.base.PizzaStore;
import com.DesignPattern.FactoryPattern.PizzaDemo1.store.ChicagoStylePizzaStore;
import com.DesignPattern.FactoryPattern.PizzaDemo1.store.NYStylePizzaStore;

/* ##### Factory Pattern 工廠模式 ##### */
public class PizzaDemo {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");



    }
}
