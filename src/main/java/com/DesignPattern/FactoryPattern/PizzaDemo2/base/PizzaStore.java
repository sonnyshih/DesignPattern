package com.DesignPattern.FactoryPattern.PizzaDemo2.base;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.showIngredients();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    public  abstract Pizza createPizza(String type);
}
