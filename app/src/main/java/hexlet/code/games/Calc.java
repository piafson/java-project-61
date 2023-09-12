package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    public static void startCalc(int repeat) {
        final int[] maxRandChars = {100, 3};
        final int maxRandSum = 50;
        final int[] maxRandMult = {10, 20};
        String userName = Engine.greeting();
        System.out.println("What is the result of the expression?");
        int count = 0;
        while (count < repeat) {
            Random rand = new Random();
            int randInt1 = rand.nextInt(maxRandSum);
            int randInt2 = rand.nextInt(maxRandSum);
            int randIntChar = rand.nextInt(maxRandChars[0]);
            char[] chars = {'-', '+', '*'};
            char randChar = chars[rand.nextInt(maxRandChars[1])];
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
            count++;
        }
        Engine.congratulation(userName);
    }
}
