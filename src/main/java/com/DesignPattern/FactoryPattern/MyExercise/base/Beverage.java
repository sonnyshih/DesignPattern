package com.DesignPattern.FactoryPattern.MyExercise.base;

import com.DesignPattern.FactoryPattern.MyExercise.base.ingredients.Milk;
import com.DesignPattern.FactoryPattern.MyExercise.base.ingredients.Sugar;
import com.DesignPattern.FactoryPattern.MyExercise.base.ingredients.Tea;

public abstract class Beverage {
    protected String name;
    protected Tea tea;
    protected Sugar sugar;
    protected Milk milk;

    public String getName() {
        return name;
    }

    public abstract void prepare();

    public abstract void showIngredients();

    public void mixIngredient(){
        System.out.println("Mixing the ingredients");
    }

    public void cup(){
        System.out.println("Place Beverage in official shop cup");
    }
}
