package com.DesignPattern.CommandPattern.RemoteControlerDemo;

import com.DesignPattern.CommandPattern.RemoteControlerDemo.Device.*;
import com.DesignPattern.CommandPattern.RemoteControlerDemo.RemoteControl.RemoteControl;
import com.DesignPattern.CommandPattern.RemoteControlerDemo.RemoteControl.RemoteControlWithUndo;
import com.DesignPattern.CommandPattern.RemoteControlerDemo.RemoteControl.SimpleRemoteControl;
import com.DesignPattern.CommandPattern.RemoteControlerDemo.base.Command;
import com.DesignPattern.CommandPattern.RemoteControlerDemo.command.*;

/* ##### Command Pattern 命令模式 ##### */
public class RemoteControlDemo {

    public static void main(String[] args) {
//        useSimpleRemoteControlDemo();

//        multiDeviceRemoteControlDemo();

//        multiDeviceRemoteControlWithUndoDemo();

//        speedCeilFanRemoteControlDemo();

        batchRemoteControlDemo();
    }

    public static void useSimpleRemoteControlDemo(){
        Light light = new Light("");
        LightOnCommand lightOn = new LightOnCommand(light);

        GarageDoor garageDoor = new GarageDoor("");
        GarageDoorUpCommand doorUp = new GarageDoorUpCommand(garageDoor);

        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();

        simpleRemoteControl.setCommand(lightOn);
        simpleRemoteControl.buttonWasPressed();

        simpleRemoteControl.setCommand(doorUp);
        simpleRemoteControl.buttonWasPressed();
    }

    public static void multiDeviceRemoteControlDemo(){
        RemoteControl remoteControl = new RemoteControl();

        // Living Room Light
        Light livingRoomLight = new Light("Living Room");
        LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);

        // Kitchen Light
        Light kitchenLight = new Light("Kitchen Room");
        LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenLight);

        // Ceiling Fan in Living Room
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        CeilingFanOnCommand ceilingFanOnCommand = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        // Garage Door
        GarageDoor garageDoor = new GarageDoor("");
        GarageDoorUpCommand garageDoorUpCommand = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDownCommand = new GarageDoorDownCommand(garageDoor);

        // Stereo
        Stereo stereo = new Stereo("Living Room");
        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        remoteControl.setOnCommand(0, livingRoomLightOnCommand, livingRoomLightOffCommand);
        remoteControl.setOnCommand(1, kitchenLightOnCommand, kitchenLightOffCommand);
        remoteControl.setOnCommand(2, ceilingFanOnCommand, ceilingFanOffCommand);
        remoteControl.setOnCommand(3, stereoOnWithCDCommand, stereoOffCommand);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);

        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);

        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);

    }

    private static void multiDeviceRemoteControlWithUndoDemo(){
        RemoteControlWithUndo remoteControlWithUndo = new RemoteControlWithUndo();

        // Living Room Light
        Light livingRoomLight = new Light("Living Room");
        LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);

        remoteControlWithUndo.setOnCommand(0, livingRoomLightOnCommand, livingRoomLightOffCommand);

        remoteControlWithUndo.onButtonWasPushed(0);
        remoteControlWithUndo.offButtonWasPushed(0);
        System.out.println(remoteControlWithUndo);
        remoteControlWithUndo.undoButtonWasPush();

        remoteControlWithUndo.offButtonWasPushed(0);
        remoteControlWithUndo.onButtonWasPushed(0);
        System.out.println(remoteControlWithUndo);
        remoteControlWithUndo.undoButtonWasPush();

    }

    private static void speedCeilFanRemoteControlDemo(){
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        SpeedCeilingFan ceilingFan = new SpeedCeilingFan("Living Room");


        SpeedCeilingFanHighCommand ceilingFanHigh = new SpeedCeilingFanHighCommand(ceilingFan);
        SpeedCeilingFanMediumCommand ceilingFanMedium = new SpeedCeilingFanMediumCommand(ceilingFan);
        SpeedCeilingFanOffCommand ceilingFanOff = new SpeedCeilingFanOffCommand(ceilingFan);

        remoteControl.setOnCommand(0, ceilingFanMedium, ceilingFanOff);
        remoteControl.setOnCommand(1, ceilingFanHigh, ceilingFanOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPush();

        remoteControl.onButtonWasPushed(1);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPush();
    }

    private static void batchRemoteControlDemo(){

        // Living Room Light
        Light livingRoomLight = new Light("Living Room");
        LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);

        // Ceiling Fan in Living Room
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        CeilingFanOnCommand ceilingFanOnCommand = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        // Stereo
        Stereo stereo = new Stereo("Living Room");
        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        Command[] partOn = {livingRoomLightOnCommand, ceilingFanOnCommand, stereoOnWithCDCommand};
        Command[] partOff = {livingRoomLightOffCommand, ceilingFanOffCommand, stereoOffCommand};

        MarcoCommand partOnMarco = new MarcoCommand(partOn);
        MarcoCommand partOffMarco = new MarcoCommand(partOff);

        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
        remoteControl.setOnCommand(0, partOnMarco, partOffMarco);

        System.out.println(remoteControl);
        System.out.println("----- Pushing Macro On -----");
        remoteControl.onButtonWasPushed(0);

        System.out.println("----- Pushing Macro Off -----");
        remoteControl.offButtonWasPushed(0);

        System.out.println("----- Pushing Undo -----");
        remoteControl.undoButtonWasPush();
    }
}
