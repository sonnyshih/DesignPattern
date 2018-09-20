package com.DesignPattern.StrategyPattern.MyExerciseDemo.Character;

import com.DesignPattern.StrategyPattern.MyExerciseDemo.Weapon.WeaponBehavior;

public abstract class Character {
    protected WeaponBehavior weaponBehavior;

    public abstract void display();

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public void performWeapon(){
        weaponBehavior.useWeapon();
    }
}
