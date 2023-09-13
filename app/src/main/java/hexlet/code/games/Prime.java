package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;
public class Prime {
    public static void startPrime(int repeat) {
        final int[] rangeRand = {2, 61};
        String userName = Engine.greeting();
        System.out.println("Answer 'yes' if given number is prime. "
                + "Otherwise answer 'no'.");
        for (int count = 0; count < repeat; count++) {
            Random rand = new Random();
            int question = rand.nextInt(rangeRand[0], rangeRand[1]);
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
        }
        Engine.congratulation(userName);
    }
}
