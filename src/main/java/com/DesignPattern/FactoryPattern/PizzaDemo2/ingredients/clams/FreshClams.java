package com.DesignPattern.FactoryPattern.PizzaDemo2.ingredients.clams;

import com.DesignPattern.FactoryPattern.PizzaDemo2.base.ingredients.Clams;

public class FreshClams implements Clams {
    @Override
    public String getName() {
        return "Fresh Clams";
    }
}
