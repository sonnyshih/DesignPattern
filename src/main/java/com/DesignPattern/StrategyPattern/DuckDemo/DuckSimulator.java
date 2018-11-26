package com.DesignPattern.StrategyPattern.DuckDemo;

import com.DesignPattern.StrategyPattern.DuckDemo.Duck.Duck;
import com.DesignPattern.StrategyPattern.DuckDemo.Duck.MallarDuck;
import com.DesignPattern.StrategyPattern.DuckDemo.Duck.ModeDuck;
import com.DesignPattern.StrategyPattern.DuckDemo.fly.FlyRocketPowered;

/* ##### Strategy Pattern 策略模式 ##### */
public class DuckSimulator {

    public static void main(String[] args) {

        // Mallar Duck
        Duck mallarDuck = new MallarDuck();
        mallarDuck.display();
        mallarDuck.performQuack();
        mallarDuck.performFly();
        mallarDuck.swim();

        System.out.println("#############\n");

        // Mode Duck
        Duck modeDuck = new ModeDuck();
        modeDuck.display();
        modeDuck.performFly();
        modeDuck.setFlyBehavior(new FlyRocketPowered());
        modeDuck.performFly();
    }
}
