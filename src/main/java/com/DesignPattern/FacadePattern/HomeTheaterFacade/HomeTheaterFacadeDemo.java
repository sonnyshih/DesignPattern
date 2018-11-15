package com.DesignPattern.FacadePattern.HomeTheaterFacade;

import com.DesignPattern.FacadePattern.HomeTheaterFacade.device.Amplifier;
import com.DesignPattern.FacadePattern.HomeTheaterFacade.device.DvdPlayer;
import com.DesignPattern.FacadePattern.HomeTheaterFacade.device.TV;
import com.DesignPattern.FacadePattern.HomeTheaterFacade.device.TheaterLights;

/* Facade Pattern (表象模式) */
public class HomeTheaterFacadeDemo {

    public static void main(String[] args) {

        Amplifier amplifier = new Amplifier();
        DvdPlayer dvdPlayer = new DvdPlayer();
        TheaterLights theaterLights = new TheaterLights();
        TV tv = new TV();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amplifier, dvdPlayer, theaterLights, tv);
        homeTheaterFacade.watchMovie();
        homeTheaterFacade.endMovie();
    }
}
