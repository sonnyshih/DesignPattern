package com.DesignPattern.FactoryPattern.PizzaDemo2.base;

import com.DesignPattern.FactoryPattern.PizzaDemo2.base.ingredients.*;

public interface PizzaIngredientFactory {
    String getStyle();
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClams();
}
