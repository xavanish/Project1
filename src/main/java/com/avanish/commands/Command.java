package com.avanish.commands;

/**
 * Created by koriel on 08/09/14.
 */
public abstract class Command {

    private String command;

    public void doProcess() {
        System.out.println(command);
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

}
