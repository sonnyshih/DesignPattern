package com.DesignPattern.CommandPattern.RemoteControlerDemo.command;

import com.DesignPattern.CommandPattern.RemoteControlerDemo.Device.Stereo;
import com.DesignPattern.CommandPattern.RemoteControlerDemo.base.Command;

public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
