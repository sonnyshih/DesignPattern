package com.DesignPattern.FactoryPattern.MyExercise.beverage;

import com.DesignPattern.FactoryPattern.MyExercise.base.Beverage;
import com.DesignPattern.FactoryPattern.MyExercise.base.BeverageIngredientFactory;

public class NormalTea extends Beverage {
    BeverageIngredientFactory ingredientFactory;

    public NormalTea(BeverageIngredientFactory ingredientFactory) {
        name = "Normal Tea";
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + ingredientFactory.getStyleName() + " " + name);
        tea = ingredientFactory.createTea();
    }

    @Override
    public void showIngredients() {
        System.out.println("Ingredients: ");
        System.out.println(tea.getName());
    }
}
