package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;
public class Prime {
    public static void startPrime(int repeat) {
        final int minRand = 2;
        final int maxRand = 61;
        String userName = Engine.greeting();
        System.out.println("Answer 'yes' if given number is prime. "
                + "Otherwise answer 'no'.");
        int count = 0;
        while (count < repeat) {
            Random rand = new Random();
            int question = rand.nextInt(minRand, maxRand);
            String result = "yes";
            int tmp = 0;
            for (int i = 2; i <= question / 2; i++) {
                tmp = question % i;
                if (tmp == 0) {
                    result = "no";
                    break;
                }
            }
            Engine.dialogue(Integer.toString(question), result, userName);
            count++;
        }
        Engine.congratulation(userName);
    }
}
