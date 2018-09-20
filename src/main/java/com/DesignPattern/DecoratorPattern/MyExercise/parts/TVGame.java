package com.DesignPattern.DecoratorPattern.MyExercise.parts;

import com.DesignPattern.DecoratorPattern.MyExercise.base.Matrial;
import com.DesignPattern.DecoratorPattern.MyExercise.base.PartsDecorator;

public class TVGame extends PartsDecorator {

    private Matrial matrial;

    public TVGame(Matrial matrial){
        this.matrial = matrial;
    }

    @Override
    public String getDescription() {
        return matrial.getDescription() + ", TV Game";
    }

    @Override
    public double cost() {
        return 10.5 + matrial.cost();
    }
}
