package hexlet.code;
import java.util.Random;
import java.util.Scanner;
public class Even {
    public static void checkEven(String userName) {
        int count = 0;
        int trueCount = 0;
        System.out.println("Answer 'yes' if the number is even, otherwise "
                + "answer 'no'.");
        while (count < 3) {
            Random rand = new Random();
            int question = rand.nextInt(1000);
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            Scanner sc = new Scanner(System.in);
            String answer = sc.nextLine();

            if (!answer.equalsIgnoreCase("yes")
                    && !answer.equalsIgnoreCase("no")) {
                System.out.println("'" + answer + "'" + " is wrong answer ;(.");
            }
            if (question % 2 != 0 && answer.equalsIgnoreCase("yes")) {
                System.out.println("'yes' is wrong answer ;(. "
                        + "Correct answer was 'no'.");
                System.out.println("Let's try again, " + userName + "!");
            }
            if (question % 2 == 0 && answer.equalsIgnoreCase("no")) {
                System.out.println("'no' is wrong answer ;(. "
                        + "Correct answer was 'yes'.");
                System.out.println("Let's try again, " + userName + "!");
            }
            if (question % 2 == 0 && answer.equalsIgnoreCase("yes")
                    || question % 2 != 0 && answer.equalsIgnoreCase("no")) {
                System.out.println("Correct!");
                trueCount++;
            }
            count++;
        }
        if (trueCount == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
