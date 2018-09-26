package com.DesignPattern.FactoryPattern.MyExercise.factory;

import com.DesignPattern.FactoryPattern.MyExercise.base.BeverageIngredientFactory;
import com.DesignPattern.FactoryPattern.MyExercise.base.ingredients.Milk;
import com.DesignPattern.FactoryPattern.MyExercise.base.ingredients.Sugar;
import com.DesignPattern.FactoryPattern.MyExercise.base.ingredients.Tea;
import com.DesignPattern.FactoryPattern.MyExercise.ingredients.milk.HelloMilk;
import com.DesignPattern.FactoryPattern.MyExercise.ingredients.suguar.CubeSugar;
import com.DesignPattern.FactoryPattern.MyExercise.ingredients.tea.OolongTea;

public class TaiwanIngredientFactory implements BeverageIngredientFactory {
    @Override
    public String getStyleName() {
        return "Taiwan Style";
    }

    @Override
    public Tea createTea() {
        return new OolongTea();
    }

    @Override
    public Sugar createSugar() {
        return new CubeSugar();
    }

    @Override
    public Milk createMilk() {
        return new HelloMilk();
    }
}
