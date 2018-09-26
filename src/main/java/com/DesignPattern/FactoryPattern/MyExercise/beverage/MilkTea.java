package com.DesignPattern.FactoryPattern.MyExercise.beverage;

import com.DesignPattern.FactoryPattern.MyExercise.base.Beverage;
import com.DesignPattern.FactoryPattern.MyExercise.base.BeverageIngredientFactory;

public class MilkTea extends Beverage {
    BeverageIngredientFactory ingredientFactory;

    public MilkTea(BeverageIngredientFactory ingredientFactory) {
        name = "Milk Tea";
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + ingredientFactory.getStyleName() + " " + name);
        tea = ingredientFactory.createTea();
        milk = ingredientFactory.createMilk();
    }

    @Override
    public void showIngredients() {
        System.out.println("Ingredients: ");
        System.out.println(tea.getName());
        System.out.println(milk.getName());
    }
}
