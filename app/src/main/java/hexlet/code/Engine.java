package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void bye() {
        System.out.println("Bye!");
        System.exit(0);
    }
    public static String greeting() {
        System.out.println('\n' + "Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println("Hello, " + name + "!");
        return name;
    }
    public static void congratulation(String userName) {
        System.out.println("Congratulations, " + userName + "!");
    }
    public static void dialoge(String question) {
        System.out.println("Question: " + question);
        System.out.print("Your answer: ");
    }
    public static void wrongAnswer(String answer, String result,
                                   String userName) {
        System.out.println("'" + answer + "'" + " is wrong answer ;(. "
                + "Correct answer was " + "'" + result + "'" + ".");
        System.out.println("Let's try again, " + userName + "!");
    }
}
