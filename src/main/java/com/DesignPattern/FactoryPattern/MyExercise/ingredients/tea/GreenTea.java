package com.DesignPattern.FactoryPattern.MyExercise.ingredients.tea;

import com.DesignPattern.FactoryPattern.MyExercise.base.ingredients.Tea;

public class GreenTea implements Tea {
    @Override
    public String getName() {
        return "Green Tea";
    }
}
