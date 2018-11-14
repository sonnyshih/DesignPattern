package com.DesignPattern.CommandPattern.RemoteControlerDemo.Device;

public class CeilingFan {

    private String location = "";

    public CeilingFan(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " Ceiling Fan turn on.");
    }

    public void off() {
        System.out.println(location + " Ceiling Fan turn off.");
    }
}
