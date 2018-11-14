package com.DesignPattern.CommandPattern.RemoteControlerDemo.command;

import com.DesignPattern.CommandPattern.RemoteControlerDemo.Device.Stereo;
import com.DesignPattern.CommandPattern.RemoteControlerDemo.base.Command;

public class StereoOffCommand implements Command {
    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }
}
