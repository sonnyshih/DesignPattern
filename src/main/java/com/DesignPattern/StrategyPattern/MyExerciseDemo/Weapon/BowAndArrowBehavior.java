package com.DesignPattern.StrategyPattern.MyExerciseDemo.Weapon;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Using the Bow and Arrow");
    }
}
