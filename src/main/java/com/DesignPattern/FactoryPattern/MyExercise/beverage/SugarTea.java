package com.DesignPattern.FactoryPattern.MyExercise.beverage;

import com.DesignPattern.FactoryPattern.MyExercise.base.Beverage;
import com.DesignPattern.FactoryPattern.MyExercise.base.BeverageIngredientFactory;

public class SugarTea extends Beverage {
    private BeverageIngredientFactory ingredientFactory;

    public SugarTea(BeverageIngredientFactory ingredientFactory) {
        name = "Sugar Tea";
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + ingredientFactory.getStyleName() + " " + name);
        tea = ingredientFactory.createTea();
        sugar = ingredientFactory.createSugar();
    }

    @Override
    public void showIngredients() {
        System.out.println("Ingredients: ");
        System.out.println(tea.getName());
        System.out.println(sugar.getName());
    }
}
