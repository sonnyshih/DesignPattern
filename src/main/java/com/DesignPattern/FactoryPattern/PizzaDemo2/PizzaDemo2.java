package com.DesignPattern.FactoryPattern.PizzaDemo2;

import com.DesignPattern.FactoryPattern.PizzaDemo2.store.ChicagoStylePizzaStore;
import com.DesignPattern.FactoryPattern.PizzaDemo2.store.NYPizzaStore;

public class PizzaDemo2 {

    public static void main(String[] args) {
        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        nyPizzaStore.orderPizza("clam");

        System.out.println("");

        ChicagoStylePizzaStore chicagoStylePizzaStore = new ChicagoStylePizzaStore();
        chicagoStylePizzaStore.orderPizza("cheese");
    }
}
