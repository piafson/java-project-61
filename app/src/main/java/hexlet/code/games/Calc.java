package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Scanner;
import java.util.Random;

public class Calc {
    public static void startCalc(int repeat) {
        final int[] maxRandChars = {100, 3};
        final int maxRandSum = 50;
        final int[] maxRandMult = {10, 20};
        String userName = Engine.greeting();
        System.out.println("What is the result of the expression?");
        int count = 0;
        int trueCount = 0;
        while (count < repeat) {
            Random rand = new Random();
            int result = 0;
            int randInt1 = 0;
            int randInt2 = 0;
            int randIntChar = rand.nextInt(maxRandChars[0]);
            char[] chars = {'-', '+', '*'};
            char randChar = chars[rand.nextInt(maxRandChars[1])];

            if (randChar == '+') {
                randInt1 = rand.nextInt(maxRandSum);
                randInt2 = rand.nextInt(maxRandSum);
                result = randInt1 + randInt2;
                String question = randInt1 + " " + randChar + " " + randInt2;
                Engine.dialoge(question);
                Scanner sc = new Scanner(System.in);
                int answer = sc.nextInt();
                result = randInt1 + randInt2;
                if (result == answer) {
                    System.out.println("Correct!");
                    trueCount++;
                } else {
                    Engine.wrongAnswer(Integer.toString(answer),
                            Integer.toString(result), userName);
                }
            }
            if (randChar == '-') {
                randInt1 = rand.nextInt(maxRandSum);
                randInt2 = rand.nextInt(maxRandSum);
                result = randInt1 + randInt2;
                String question = randInt1 + " " + randChar + " " + randInt2;
                Engine.dialoge(question);
                Scanner sc = new Scanner(System.in);
                int answer = sc.nextInt();
                result = randInt1 - randInt2;
                if (result == answer) {
                    System.out.println("Correct!");
                    trueCount++;
                } else {
                    Engine.wrongAnswer(Integer.toString(answer),
                            Integer.toString(result), userName);
                }
            }
            if (randChar == '*') {
                randInt1 = rand.nextInt(2, maxRandMult[1]);
                randInt2 = rand.nextInt(2, maxRandMult[0]);
                result = randInt1 + randInt2;
                String question = randInt1 + " " + randChar + " " + randInt2;
                Engine.dialoge(question);
                Scanner sc = new Scanner(System.in);
                int answer = sc.nextInt();
                result = randInt1 * randInt2;
                if (result == answer) {
                    System.out.println("Correct!");
                    trueCount++;
                } else {
                    Engine.wrongAnswer(Integer.toString(answer),
                            Integer.toString(result), userName);
                }
            }
            count++;
        }
        if (trueCount == repeat) {
            Engine.congratulation(userName);
        }
    }
}
