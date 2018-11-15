package com.DesignPattern.FacadePattern.HomeTheaterFacade.device;

public class Amplifier {
    private String name = "Amplifier";

    public void on(){
        System.out.println(name +" turn on");
    }

    public void off() {
        System.out.println(name + " turn off");
    }
}
