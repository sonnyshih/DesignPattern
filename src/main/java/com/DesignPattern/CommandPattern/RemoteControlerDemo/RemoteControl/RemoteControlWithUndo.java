package com.DesignPattern.CommandPattern.RemoteControlerDemo.RemoteControl;

import com.DesignPattern.CommandPattern.RemoteControlerDemo.base.Command;
import com.DesignPattern.CommandPattern.RemoteControlerDemo.command.NoCommand;

public class RemoteControlWithUndo {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControlWithUndo() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

        undoCommand = noCommand;
    }

    public void setOnCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;

    }

    public void onButtonWasPushed(int slot){

        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPush(){
        undoCommand.undo();
    }

    public String toString(){
        StringBuffer stringBuffer =  new StringBuffer();
        stringBuffer.append("\n----- Remote Control -----\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("[slot " + i + "] " + onCommands[i].getClass().getName()
                    + "     " + offCommands[i].getClass().getName() + "\n");
        }

        stringBuffer.append("[undo] " + undoCommand.getClass().getName()+ "\n");

        return stringBuffer.toString();
    }
}
