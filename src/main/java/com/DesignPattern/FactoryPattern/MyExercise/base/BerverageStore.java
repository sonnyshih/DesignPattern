package com.DesignPattern.FactoryPattern.MyExercise.base;

public abstract class BerverageStore {

    public Beverage orderBeverage(String type){

        Beverage beverage = createBeverage(type);
        beverage.prepare();
        beverage.showIngredients();
        beverage.mixIngredient();
        beverage.cup();

        return beverage;
    }

    public abstract Beverage createBeverage(String type);
}
