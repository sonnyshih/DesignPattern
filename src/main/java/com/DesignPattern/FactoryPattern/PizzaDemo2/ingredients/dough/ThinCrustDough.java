package com.DesignPattern.FactoryPattern.PizzaDemo2.ingredients.dough;

import com.DesignPattern.FactoryPattern.PizzaDemo2.base.ingredients.Dough;

public class ThinCrustDough implements Dough {

    @Override
    public String getName() {
        return "Thin Crust Dough";
    }
}
