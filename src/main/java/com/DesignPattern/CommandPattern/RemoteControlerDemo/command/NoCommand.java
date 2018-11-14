package com.DesignPattern.CommandPattern.RemoteControlerDemo.command;

import com.DesignPattern.CommandPattern.RemoteControlerDemo.base.Command;

public class NoCommand implements Command {
    @Override
    public void execute() {
        // do nothing.
    }

    @Override
    public void undo() {
        // do nothing.
    }
}
