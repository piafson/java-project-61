package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;
public class Even {

    public static void startEven(int repeat) {
        final int[] rangeRand = {4, 1000};
        String userName = Engine.greeting();
        System.out.println("Answer 'yes' if the number is even, otherwise "
                + "answer 'no'.");
        for (int count = 0; count < repeat; count++) {
            Random rand = new Random();
            int question = rand.nextInt(rangeRand[0], rangeRand[1]);
            String result = question % 2 == 0 ? "yes" : "no";
            Engine.dialogue(Integer.toString(question), result, userName);
        }
        Engine.congratulation(userName);
    }
}
