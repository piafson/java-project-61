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
    public static void dialogue(String question, String result,
                                String userName) {
        System.out.println("Question: " + question);
        System.out.print("Your answer: ");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        if (result.equalsIgnoreCase(answer)) {
            System.out.println("Correct!");
        } else {
            Engine.wrongAnswer(answer, result, userName);
        }
    }
    public static void wrongAnswer(String answer, String result,
                                   String userName) {
        System.out.println("'" + answer + "'" + " is wrong answer ;(. "
                + "Correct answer was " + "'" + result + "'" + ".");
        System.out.println("Let's try again, " + userName + "!");
        System.exit(0);
    }
}
