import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class inputCommand {
    private String[] commandList = {"Exit", "Run", "Restart", "Sleep", "Kill", "Play"};


    @Override
    public String toString() {
        return "inputCommand{" +
                "commandList=" + Arrays.toString(commandList) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof inputCommand)) return false;

        inputCommand that = (inputCommand) o;

        if (!Arrays.equals(commandList, that.commandList)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(commandList);
    }


    
    public void runCommand() {
        Scanner in = new Scanner(System.in);



        System.out.println("Enter your command.\t Type 'Help' for available commands");
        String enterCm = in.nextLine();


        if (enterCm.equals("Help")) {
            for (String n : commandList) {
                System.out.print(n + " ");
            }
            enterCm = in.nextLine();
        }

        if (enterCm.equals("Exit")) {
            System.out.println("Now Exiting.");

        } else if (enterCm.equals("Run")) {
            System.out.println("Now Running.");

        } else if (enterCm.equals("Sleep")) {
            System.out.println("Now Sleeping.");

        } else if (enterCm.equals("Restart")) {
            System.out.println("Restarted.\n");
            runCommand();

        } else if (enterCm.equals("Kill")) {
            System.out.println("Now Killing.");

        } else if (enterCm.equals("Play")) {
            System.out.println("Now Playing");
        }


    }

}


