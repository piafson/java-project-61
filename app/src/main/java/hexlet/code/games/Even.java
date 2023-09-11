package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;
public class Even {

    public static void startEven(int repeat) {
        final int minRand = 4;
        final int maxRand = 1000;
        String userName = Engine.greeting();
        int count = 0;
        System.out.println("Answer 'yes' if the number is even, otherwise "
                + "answer 'no'.");
        while (count < repeat) {
            Random rand = new Random();
            int question = rand.nextInt(minRand, maxRand);
            String result = question % 2 == 0 ? "yes" : "no";
            Engine.dialogue(Integer.toString(question), result, userName);
            count++;
        }
        Engine.congratulation(userName);
    }
}
