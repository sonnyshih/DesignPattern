package com.DesignPattern.FactoryPattern.PizzaDemo1.pizza;

import com.DesignPattern.FactoryPattern.PizzaDemo1.base.Pizza;

public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
