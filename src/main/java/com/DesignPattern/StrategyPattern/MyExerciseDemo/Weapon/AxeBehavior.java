package com.DesignPattern.StrategyPattern.MyExerciseDemo.Weapon;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Using the Axe");
    }
}
