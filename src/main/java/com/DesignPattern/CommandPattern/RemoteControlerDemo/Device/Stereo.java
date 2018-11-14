package com.DesignPattern.CommandPattern.RemoteControlerDemo.Device;

public class Stereo {
    private String location = "";

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " Stereo turns on.");
    }

    public void off() {
        System.out.println(location + " Stereo turns off.");
    }

    public void setCd() {
        System.out.println(location + " Stereo is set for CD input.");
    }

    public void setDvd() {
        System.out.println(location + " Stereo is set for DVD input");
    }

    public void setRadio() {
        System.out.println(location + " Stereo is set for Radio");
    }

    public void setVolume(int volume) {
        System.out.println(location + " Stereo volume set to " + volume);

    }
}
