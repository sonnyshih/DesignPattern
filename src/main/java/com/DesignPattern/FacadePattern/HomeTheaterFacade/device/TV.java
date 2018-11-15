package com.DesignPattern.FacadePattern.HomeTheaterFacade.device;

public class TV {
    private String name = "TV";

    public void on(){
        System.out.println(name +" turn on");
    }

    public void off() {
        System.out.println(name + " turn off");
    }

}
