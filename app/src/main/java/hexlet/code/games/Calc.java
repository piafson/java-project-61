package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    public static String gameQues = "What is the result of the expression?";
    public static void startCalc() {
        final int[] maxRand = {3, 50};
        final int[] maxRandMult = {10, 20};
        String[][] result = new String[Engine.COUNT_ROUNDS][2];
        for (int i = 0; i < Engine.COUNT_ROUNDS; i++) {
            Random rand = new Random();
            int randInt1 = rand.nextInt(maxRand[1]);
            int randInt2 = rand.nextInt(maxRand[1]);
            char[] chars = {'-', '+', '*'};
            char randChar = chars[rand.nextInt(maxRand[0])];
            result[i][0] = randInt1 + " " + randChar + " " + randInt2;
            if (randChar == '+' || randChar == '-') {
                int resInt = randChar == '+' ? (randInt1 + randInt2)
                        : (randInt1 - randInt2);
                result[i][1] = Integer.toString(resInt);
            }
            if (randChar == '*') {
                randInt1 = rand.nextInt(2, maxRandMult[1]);
                randInt2 = rand.nextInt(2, maxRandMult[0]);
                result[i][0] = randInt1 + " " + randChar + " " + randInt2;
                int resInt = randInt1 * randInt2;
                result[i][1] = Integer.toString(resInt);
            }
        }
        Engine.run(gameQues, result);
    }
}
