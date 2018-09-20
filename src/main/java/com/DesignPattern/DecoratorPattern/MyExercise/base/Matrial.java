package com.DesignPattern.DecoratorPattern.MyExercise.base;

public abstract class Matrial {
    protected String description = "Unknown Description";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
