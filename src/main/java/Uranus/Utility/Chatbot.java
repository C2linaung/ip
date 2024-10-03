package Uranus.Utility;

import java.util.Scanner;

public class Chatbot {
    protected static final Scanner in = new Scanner(System.in);

    // Constructor for chatbot
    public Chatbot() {
        Ui.printWelcomeMessage();
        Ui.printFunctions();
        TaskList.manageTasks();
    }
}
