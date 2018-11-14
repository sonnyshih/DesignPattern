package com.DesignPattern.CommandPattern.RemoteControlerDemo.Device;

public class Light {

    private String location = "";

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " Light turn on");
    }

    public void off() {
        System.out.println(location + " Light turn off");
    }
}
