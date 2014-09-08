package com.avanish;

import com.avanish.commands.Command;
import com.avanish.commands.GenericCommand;

import java.util.Scanner;

/**
 * Created by koriel on 08/09/14.
 */
public class Handler {

    private static final String EXIT_COMMAND = "exit";

    private Scanner in = new Scanner(System.in);
    private String enterCm;

    public void doRun() {

        while(true) {

            System.out.print("Enter command:$ ");
            enterCm = in.nextLine();

            if(enterCm.toLowerCase().equals(EXIT_COMMAND)) {
                break;
            }

            Command command = new GenericCommand(enterCm);
            command.doProcess();
        }

    }


}
