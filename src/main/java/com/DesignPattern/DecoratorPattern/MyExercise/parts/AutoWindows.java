package com.DesignPattern.DecoratorPattern.MyExercise.parts;

import com.DesignPattern.DecoratorPattern.MyExercise.base.Matrial;
import com.DesignPattern.DecoratorPattern.MyExercise.base.PartsDecorator;

public class AutoWindows extends PartsDecorator {

    private Matrial matrial;

    public AutoWindows(Matrial matrial){
        this.matrial = matrial;
    }

    @Override
    public String getDescription() {
        return matrial.getDescription() + ", Auto Windows";
    }

    @Override
    public double cost() {
        return 99.9 + matrial.cost();
    }
}
