import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MainProgram implements Commands {

    public static String[] commandsList = {"Help", "Exit", "Run", "Restart", "Sleep", "Kill", "Play", "Start"};

    Scanner in = new Scanner(System.in);
    String enterCm = in.nextLine();

    public String getEnterCm() {
        return enterCm;
    }

    public void setEnterCm(String enterCm) {
        this.enterCm = enterCm;
    }

    @Override
    public void exit() {
        System.out.println("Now Exiting.");
        System.exit(0);
    }

    @Override
    public void kill() {
        System.out.println("Now Killing.");
        enterCm = in.nextLine();
    }

    @Override
    public void help() {
        for (String n : commandsList) {
            System.out.print(n + " ");
        }
        System.out.println();
        enterCm = in.nextLine();
    }

    @Override
    public void play() {
        System.out.println("Now Playing");
        enterCm = in.nextLine();
    }

    @Override
    public void start() {
        System.out.println("Now Starting");
        enterCm = in.nextLine();
    }

    @Override
    public void restart() {
        System.out.println("Restarted.\n");
        enterCm = in.nextLine();

    }

    @Override
    public void sleep() {
        System.out.println("Now Sleeping.");
        enterCm = in.nextLine();
    }

    @Override
    public void run() {
        System.out.println("Now Running.");
        enterCm = in.nextLine();

    }

    public void mainLoop() {
        while (!enterCm.equals(null)) {

            while (enterCm.equals(commandsList[0])) {
                help();
            }
            while (enterCm.equals(commandsList[1])) {
                exit();
            }
            while (enterCm.equals(commandsList[2])) {
                run();
            }
            while (enterCm.equals(commandsList[3])) {
                restart();
            }
            while (enterCm.equals(commandsList[4])) {
                sleep();
            }
            while (enterCm.equals(commandsList[5])) {
                kill();
            }
            while (enterCm.equals(commandsList[7])) {
                start();
            }

            System.out.println("Invalid Command.\t\tType Help for a list of available commands");
            enterCm = in.nextLine();
        }
    }
}
