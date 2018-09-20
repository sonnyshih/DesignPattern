package com.DesignPattern.DecoratorPattern.MyExercise;

import com.DesignPattern.DecoratorPattern.MyExercise.base.Matrial;
import com.DesignPattern.DecoratorPattern.MyExercise.car.BMWCar;
import com.DesignPattern.DecoratorPattern.MyExercise.car.Bens;
import com.DesignPattern.DecoratorPattern.MyExercise.car.FordCar;
import com.DesignPattern.DecoratorPattern.MyExercise.parts.AudioSystem;
import com.DesignPattern.DecoratorPattern.MyExercise.parts.AutoWindows;
import com.DesignPattern.DecoratorPattern.MyExercise.parts.TVGame;

public class CarShop {

    public static void main(String[] args) {
        Matrial fordCar = new FordCar();
        System.out.println(fordCar.getDescription() + " $" + fordCar.cost());

        Matrial bens = new Bens();
        bens = new AudioSystem(bens);
        bens = new AutoWindows(bens);
        System.out.println(bens.getDescription() + " $" + bens.cost());

        Matrial bmw = new BMWCar();
        bmw = new AudioSystem(bmw);
        bmw = new AutoWindows(bmw);
        bmw = new TVGame(bmw);
        System.out.println(bmw.getDescription() + " $" + bmw.cost());
    }
}
