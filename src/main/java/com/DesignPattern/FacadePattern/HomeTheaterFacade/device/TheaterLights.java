package com.DesignPattern.FacadePattern.HomeTheaterFacade.device;

public class TheaterLights {
    private String name = "Theater Lights";

    public void on(){
        System.out.println(name +" turn on");
    }

    public void off() {
        System.out.println(name + " turn off");
    }

}
