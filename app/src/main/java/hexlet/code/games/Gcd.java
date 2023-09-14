package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;
public class Gcd {
    private static final int[] RANGE_RAND = {1, 100};
    private static final String GAME_QUES = "Find the greatest common divisor "
            +  "of given numbers.";
    public static void startGcd() {
        String[][] result = new String[Engine.COUNT_ROUNDS][2];
        for (int i = 0; i < Engine.COUNT_ROUNDS; i++) {
            Random random = new Random();
            int resInt = 0;
            int randInt1 =  random.nextInt(RANGE_RAND[0], RANGE_RAND[1]);
            int randInt2 = random.nextInt(RANGE_RAND[0], RANGE_RAND[1]);
            resInt = gcd(randInt1, randInt2);
            result[i][1] = Integer.toString(resInt);
            result[i][0] = randInt1 + " " + randInt2;
        }
        Engine.run(GAME_QUES, result);
    }
    public static int gcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : gcd(b, a % b);
    }
}
