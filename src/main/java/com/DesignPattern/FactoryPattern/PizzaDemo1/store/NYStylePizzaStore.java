package com.DesignPattern.FactoryPattern.PizzaDemo1.store;

import com.DesignPattern.FactoryPattern.PizzaDemo1.base.Pizza;
import com.DesignPattern.FactoryPattern.PizzaDemo1.base.PizzaStore;
import com.DesignPattern.FactoryPattern.PizzaDemo1.pizza.NYStyleCheesePizza;

public class NYStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {

        switch (type) {
            case "cheese":
                return new NYStyleCheesePizza();

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
