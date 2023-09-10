package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;
public class Even {
    public static void startEven(int repeat) {
        String userName = Engine.greeting();
        int count = 0;
        int trueCount = 0;
        System.out.println("Answer 'yes' if the number is even, otherwise "
                + "answer 'no'.");
        while (count < repeat) {
            Random rand = new Random();
            int question = rand.nextInt(4, 1000);
            Engine.dialoge(Integer.toString(question));
            Scanner sc = new Scanner(System.in);
            String answer = sc.nextLine();
            String right = question % 2 == 0 ? "yes" : "no";

            if (question % 2 != 0 && answer.equalsIgnoreCase("yes")) {
                Engine.wrongAnswer("yes", right, userName);
            }
            if (question % 2 == 0 && answer.equalsIgnoreCase("no")) {
                Engine.wrongAnswer("no", right, userName);
            }
            if (question % 2 == 0 && answer.equalsIgnoreCase("yes")
                    || question % 2 != 0 && answer.equalsIgnoreCase("no")) {
                System.out.println("Correct!");
                trueCount++;
            }
            if (!answer.equalsIgnoreCase("yes")
                    && !answer.equalsIgnoreCase("no")) {
                Engine.wrongAnswer(answer, right, userName);
            }
            count++;
        }
        if (trueCount == repeat) {
            Engine.congratulation(userName);
        }
    }
}
