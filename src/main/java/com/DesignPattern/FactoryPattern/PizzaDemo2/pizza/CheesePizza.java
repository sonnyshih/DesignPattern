package com.DesignPattern.FactoryPattern.PizzaDemo2.pizza;

import com.DesignPattern.FactoryPattern.PizzaDemo2.base.Pizza;
import com.DesignPattern.FactoryPattern.PizzaDemo2.base.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory;

    public CheesePizza (PizzaIngredientFactory ingredientFactory){
        name = "Cheese Pizza";
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + ingredientFactory.getStyle() + " " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();

    }

    @Override
    public void showIngredients() {
        System.out.println("Ingredients: ");
        System.out.println(dough.getName());
        System.out.println(sauce.getName());
        System.out.println(cheese.getName());
    }
}
