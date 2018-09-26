package com.DesignPattern.FactoryPattern.MyExercise.factory;

import com.DesignPattern.FactoryPattern.MyExercise.base.BeverageIngredientFactory;
import com.DesignPattern.FactoryPattern.MyExercise.base.ingredients.Milk;
import com.DesignPattern.FactoryPattern.MyExercise.base.ingredients.Sugar;
import com.DesignPattern.FactoryPattern.MyExercise.base.ingredients.Tea;
import com.DesignPattern.FactoryPattern.MyExercise.ingredients.milk.GoodMilk;
import com.DesignPattern.FactoryPattern.MyExercise.ingredients.suguar.BlackSugar;
import com.DesignPattern.FactoryPattern.MyExercise.ingredients.tea.GreenTea;

public class JapanIngredientFactory implements BeverageIngredientFactory {
    @Override
    public String getStyleName() {
        return "Japan Style";
    }

    @Override
    public Tea createTea() {
        return new GreenTea();
    }

    @Override
    public Sugar createSugar() {
        return new BlackSugar();
    }

    @Override
    public Milk createMilk() {
        return new GoodMilk();
    }
}
