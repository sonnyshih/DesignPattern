package com.DesignPattern.CommandPattern.RemoteControlerDemo.Device;

public class GarageDoor {

    private String location = "";

    public GarageDoor(String location) {
        this.location = location;
    }

    public void up() {
        System.out.println(location + " Garage Door is Open");
    }

    public void down() {
        System.out.println(location + " Garage Door is Close");
    }

    public void lightOn() {
        System.out.println(location + " Garage light is on");
    }

    public void lightOff() {
        System.out.println(location + " Garage light is off");
    }
}
