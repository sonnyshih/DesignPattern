package com.DesignPattern.FacadePattern.HomeTheaterFacade;

import com.DesignPattern.FacadePattern.HomeTheaterFacade.device.Amplifier;
import com.DesignPattern.FacadePattern.HomeTheaterFacade.device.DvdPlayer;
import com.DesignPattern.FacadePattern.HomeTheaterFacade.device.TV;
import com.DesignPattern.FacadePattern.HomeTheaterFacade.device.TheaterLights;

public class HomeTheaterFacade {
    private Amplifier amplifier;
    private DvdPlayer dvdPlayer;
    private TheaterLights theaterLights;
    private TV tv;

    public HomeTheaterFacade(Amplifier amplifier, DvdPlayer dvdPlayer, TheaterLights theaterLights, TV tv) {
        this.amplifier = amplifier;
        this.dvdPlayer = dvdPlayer;
        this.theaterLights = theaterLights;
        this.tv = tv;
    }

    public void watchMovie(){
        System.out.println("Get ready to watch a movie...");
        amplifier.on();
        tv.on();
        dvdPlayer.on();
        theaterLights.on();
    }

    public void endMovie(){
        System.out.println("Shutting movie theater down...");
        amplifier.off();
        tv.off();
        dvdPlayer.off();
        theaterLights.off();
    }
}
