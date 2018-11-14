package com.DesignPattern.CommandPattern.RemoteControlerDemo.Device;

public class SpeedCeilingFan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    private String location;
    private int speed;

    public SpeedCeilingFan(String location) {
        this.location = location;
        this.speed = OFF;
    }

    public void high(){
        speed = HIGH;
        System.out.println(location + " Ceiling Fan is on high");
    }

    public void medium(){
        speed = MEDIUM;
        System.out.println(location + " Ceiling Fan is on medium");
    }

    public void low(){
        speed = LOW;
        System.out.println(location + " Ceiling Fan is on low");
    }

    public void off(){
        speed = OFF;
        System.out.println(location + " Ceiling Fan is on off");
    }

    public int getSpeed() {
        return speed;
    }
}
