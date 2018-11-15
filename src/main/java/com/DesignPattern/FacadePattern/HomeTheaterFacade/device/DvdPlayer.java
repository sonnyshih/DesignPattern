package com.DesignPattern.FacadePattern.HomeTheaterFacade.device;

public class DvdPlayer {
    private String name = "Dvd Player";

    public void on(){
        System.out.println(name +" turn on");
    }

    public void off() {
        System.out.println(name + " turn off");
    }

}
