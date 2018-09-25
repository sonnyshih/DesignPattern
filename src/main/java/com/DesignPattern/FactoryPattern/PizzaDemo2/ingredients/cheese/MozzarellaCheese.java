package com.DesignPattern.FactoryPattern.PizzaDemo2.ingredients.cheese;

import com.DesignPattern.FactoryPattern.PizzaDemo2.base.ingredients.Cheese;

public class MozzarellaCheese implements Cheese {
    @Override
    public String getName() {
        return "Mozzarella Cheese";
    }
}
