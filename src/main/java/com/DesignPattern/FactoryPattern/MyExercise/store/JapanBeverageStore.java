package com.DesignPattern.FactoryPattern.MyExercise.store;

import com.DesignPattern.FactoryPattern.MyExercise.base.BerverageStore;
import com.DesignPattern.FactoryPattern.MyExercise.base.Beverage;
import com.DesignPattern.FactoryPattern.MyExercise.base.BeverageIngredientFactory;
import com.DesignPattern.FactoryPattern.MyExercise.beverage.MilkTea;
import com.DesignPattern.FactoryPattern.MyExercise.beverage.NormalTea;
import com.DesignPattern.FactoryPattern.MyExercise.beverage.SugarTea;
import com.DesignPattern.FactoryPattern.MyExercise.factory.JapanIngredientFactory;

public class JapanBeverageStore extends BerverageStore {

    BeverageIngredientFactory ingredientFactory;

    public JapanBeverageStore(){
        ingredientFactory = new JapanIngredientFactory();
    }

    @Override
    public Beverage createBeverage(String type) {
        switch (type) {
            case "milk tea":
                return new MilkTea(ingredientFactory);

            case "normal tea":
                return new NormalTea(ingredientFactory);

            case "sugar tea":
                return new SugarTea(ingredientFactory);
        }
        return null;
    }
}
