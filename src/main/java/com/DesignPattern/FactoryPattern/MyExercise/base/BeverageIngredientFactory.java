package com.DesignPattern.FactoryPattern.MyExercise.base;

import com.DesignPattern.FactoryPattern.MyExercise.base.ingredients.Milk;
import com.DesignPattern.FactoryPattern.MyExercise.base.ingredients.Sugar;
import com.DesignPattern.FactoryPattern.MyExercise.base.ingredients.Tea;

public interface BeverageIngredientFactory {
    String getStyleName();
    Tea createTea();
    Sugar createSugar();
    Milk createMilk();
}
