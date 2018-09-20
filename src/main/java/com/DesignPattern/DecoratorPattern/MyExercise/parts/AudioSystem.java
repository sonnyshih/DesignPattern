package com.DesignPattern.DecoratorPattern.MyExercise.parts;

import com.DesignPattern.DecoratorPattern.MyExercise.base.Matrial;
import com.DesignPattern.DecoratorPattern.MyExercise.base.PartsDecorator;

public class AudioSystem extends PartsDecorator {

    private Matrial matrial;

    public AudioSystem (Matrial matrial){
        this.matrial = matrial;
    }

    @Override
    public String getDescription() {
        return matrial.getDescription() + ", Audio System";
    }

    @Override
    public double cost() {
        return 10 + matrial.cost();
    }
}
