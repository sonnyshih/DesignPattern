package com.DesignPattern.FactoryPattern.MyExercise.ingredients.milk;

import com.DesignPattern.FactoryPattern.MyExercise.base.ingredients.Milk;

public class GoodMilk implements Milk {
    @Override
    public String getName() {
        return "Good Milk";
    }
}
