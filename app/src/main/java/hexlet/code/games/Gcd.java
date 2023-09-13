package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;
public class Gcd {
    public static void startGcd(int repeat) {
        final int minRand = 1;
        final int maxRand = 100;
        String userName = Engine.greeting();
        System.out.println("Find the greatest common divisor of given numbers.");
        for (int count = 0; count < repeat; count++) {
            Random random = new Random();
            int result = 0;
            int randInt1 =  random.nextInt(minRand, maxRand);
            int randInt2 = random.nextInt(minRand, maxRand);
            result = gcd(randInt1, randInt2);
            String question = randInt1 + " " + randInt2;
            Engine.dialogue(question, Integer.toString(result), userName);
        }
        Engine.congratulation(userName);
    }
    public static int gcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : gcd(b, a % b);
    }
}
