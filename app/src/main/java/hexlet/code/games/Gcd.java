package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Gcd {
    public static void startGcd(int repeat) {
        String userName = Engine.greeting();
        System.out.println("Find the greatest common divisor of given numbers.");
        int count = 0;
        int trueCount = 0;
        while (count < repeat) {
            Random random = new Random();
            int result = 0;
            int randInt1 =  random.nextInt(1, 100);
            int randInt2 = random.nextInt(1, 100);
            result = gcd(randInt1, randInt2);
            String question = randInt1 + " " + randInt2;
            Engine.dialoge(question);
            Scanner sc = new Scanner(System.in);
            int answer = sc.nextInt();
            if (result == answer) {
                System.out.println("Correct!");
                trueCount++;
            } else {
                Engine.wrongAnswer(Integer.toString(answer),
                        Integer.toString(result), userName);
            }
            count++;
        }
        if (trueCount == repeat) {
            Engine.congratulation(userName);
        }
    }
    public static int gcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : gcd(b, a % b);
    }
}
