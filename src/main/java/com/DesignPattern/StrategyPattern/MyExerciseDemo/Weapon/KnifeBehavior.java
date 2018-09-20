package com.DesignPattern.StrategyPattern.MyExerciseDemo.Weapon;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Using the knife");
    }
}
