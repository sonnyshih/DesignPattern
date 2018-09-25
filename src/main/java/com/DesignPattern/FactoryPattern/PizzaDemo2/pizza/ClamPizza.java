package com.DesignPattern.FactoryPattern.PizzaDemo2.pizza;

import com.DesignPattern.FactoryPattern.PizzaDemo2.base.Pizza;
import com.DesignPattern.FactoryPattern.PizzaDemo2.base.PizzaIngredientFactory;

public class ClamPizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        name = "Clam Pizza";
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Prepare " + ingredientFactory.getStyle() + " " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clams = ingredientFactory.createClams();

    }

    @Override
    public void showIngredients() {
        System.out.println("Ingredients: ");
        System.out.println(dough.getName());
        System.out.println(sauce.getName());
        System.out.println(cheese.getName());
        System.out.println(clams.getName());
    }
}
