package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    public static void startCalc(int repeat) {
        final int[] maxRand = {3, 50};
        final int[] maxRandMult = {10, 20};
        String userName = Engine.greeting();
        System.out.println("What is the result of the expression?");
        for (int count = 0; count < repeat; count++) {
            Random rand = new Random();
            int randInt1 = rand.nextInt(maxRand[1]);
            int randInt2 = rand.nextInt(maxRand[1]);
            char[] chars = {'-', '+', '*'};
            char randChar = chars[rand.nextInt(maxRand[0])];
            String question = randInt1 + " " + randChar + " " + randInt2;
            if (randChar == '+' || randChar == '-') {
                int result = randChar == '+' ? randInt1 + randInt2
                        : randInt1 - randInt2;
                Engine.dialogue(question, Integer.toString(result), userName);
            }
            if (randChar == '*') {
                randInt1 = rand.nextInt(2, maxRandMult[1]);
                randInt2 = rand.nextInt(2, maxRandMult[0]);
                question = randInt1 + " " + randChar + " " + randInt2;
                int result = randInt1 * randInt2;
                Engine.dialogue(question, Integer.toString(result), userName);
            }
        }
        Engine.congratulation(userName);
    }
}
