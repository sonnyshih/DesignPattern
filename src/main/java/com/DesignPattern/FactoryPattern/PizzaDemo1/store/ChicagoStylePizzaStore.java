package com.DesignPattern.FactoryPattern.PizzaDemo1.store;

import com.DesignPattern.FactoryPattern.PizzaDemo1.base.Pizza;
import com.DesignPattern.FactoryPattern.PizzaDemo1.base.PizzaStore;
import com.DesignPattern.FactoryPattern.PizzaDemo1.pizza.ChicagoStyleCheesePizza;

public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new ChicagoStyleCheesePizza();

            case "veggie":
                break;

            case "clam":
                break;

            case "pepperoni":
                break;
        }

        return null;

    }
}
