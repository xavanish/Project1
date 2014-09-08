import sun.applet.Main;

import javax.crypto.Mac;

public class App {
    public static void main(String[] args) {

        System.out.println("Enter a command.\t\tType Help for a list of available commands");

        MainProgram loop = new MainProgram();
        loop.mainLoop();

    }
}
