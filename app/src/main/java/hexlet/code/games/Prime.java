package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Prime {
    public static void startPrime(int repeat) {
        final int minRand = 2;
        final int maxRand = 61;
        String userName = Engine.greeting();
        System.out.println("Answer 'yes' if given number is prime. "
                + "Otherwise answer 'no'.");
        int count = 0;
        int trueCount = 0;
        while (count < repeat) {
            Random rand = new Random();
            int question = rand.nextInt(minRand, maxRand);
            String right = "yes";
            int tmp = 0;
            for (int i = 2; i <= question / 2; i++) {
                tmp = question % i;
                if (tmp == 0) {
                    right = "no";
                    break;
                }
            }
            Engine.dialoge(Integer.toString(question));
            Scanner sc = new Scanner(System.in);
            String answer = sc.nextLine();
            if (answer.equalsIgnoreCase(right)) {
                System.out.println("Correct!");
                trueCount++;
            } else {
                Engine.wrongAnswer(answer, right, userName);
            }
            count++;
        }
        if (trueCount == repeat) {
            Engine.congratulation(userName);
        }
    }
}
