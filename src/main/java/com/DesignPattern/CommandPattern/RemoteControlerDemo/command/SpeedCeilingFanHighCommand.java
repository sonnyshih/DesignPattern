package com.DesignPattern.CommandPattern.RemoteControlerDemo.command;

import com.DesignPattern.CommandPattern.RemoteControlerDemo.Device.SpeedCeilingFan;
import com.DesignPattern.CommandPattern.RemoteControlerDemo.base.Command;

import static com.DesignPattern.CommandPattern.RemoteControlerDemo.Device.SpeedCeilingFan.*;

public class SpeedCeilingFanHighCommand implements Command {
    private SpeedCeilingFan speedCeilingFan;
    private int preSpeed;

    public SpeedCeilingFanHighCommand(SpeedCeilingFan speedCeilingFan) {
        this.speedCeilingFan = speedCeilingFan;

    }

    @Override
    public void execute() {
        preSpeed = speedCeilingFan.getSpeed();
        speedCeilingFan.high();

    }

    @Override
    public void undo() {

        switch (preSpeed) {
            case HIGH:
                speedCeilingFan.high();
                break;

            case MEDIUM:
                speedCeilingFan.medium();
                break;

            case LOW:
                speedCeilingFan.low();
                break;

            case OFF:
            default:
                speedCeilingFan.off();
                break;
        }

    }
}
