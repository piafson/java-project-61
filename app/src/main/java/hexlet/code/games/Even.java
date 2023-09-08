package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;
public class Even {
    public static void checkEven() {
        String userName = Engine.greeting();
        int count = 0;
        int trueCount = 0;
        System.out.println("Answer 'yes' if the number is even, otherwise "
                + "answer 'no'.");
        while (count < 3) {
            Random rand = new Random();
            int question = rand.nextInt(1000);
            Engine.dialoge(Integer.toString(question));
            Scanner sc = new Scanner(System.in);
            String answer = sc.nextLine();

            if (question % 2 != 0 && answer.equalsIgnoreCase("yes")) {
                Engine.wrongAnswer("yes", "no", userName);
            }
            if (question % 2 == 0 && answer.equalsIgnoreCase("no")) {
                Engine.wrongAnswer("no", "yes", userName);
            }
            if (question % 2 == 0 && answer.equalsIgnoreCase("yes")
                    || question % 2 != 0 && answer.equalsIgnoreCase("no")) {
                System.out.println("Correct!");
                trueCount++;
            }
            if (!answer.equalsIgnoreCase("yes")
                    && !answer.equalsIgnoreCase("no")) {
                Engine.wrongAnswer(answer, "yes/no", userName);
            }
            count++;
        }
        if (trueCount == 3) {
            Engine.congratulation(userName);
        }
    }
}
