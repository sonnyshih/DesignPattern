package com.DesignPattern.SingletonPattern.ChocolateDemo;

public class ChocolateBoilerWithSync {

    private boolean empty;
    private boolean boiled;
    private static ChocolateBoilerWithSync instance;

    private ChocolateBoilerWithSync() {
        empty = true;
        boiled =false;
    }

    public static synchronized ChocolateBoilerWithSync getInstance() {
        if (instance == null) {
            instance = new ChocolateBoilerWithSync();
        }
        return instance;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

    public void setBoiled(boolean boiled) {
        this.boiled = boiled;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void drain(){
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public void boil(){
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

}
