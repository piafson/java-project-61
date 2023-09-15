package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {
    private static final int[] RANGE_RAND = {1, 100};
    private static final String GAME_QUES = "Find the greatest common divisor "
            +  "of given numbers.";

    public static void startGcd() {
        String[][] gameInfo = new String[Engine.COUNT_ROUNDS][2];
        for (int i = 0; i < Engine.COUNT_ROUNDS; i++) {
            int resInt = 0;
            int randInt1 =  Utils.getRand().nextInt(RANGE_RAND[0],
                    RANGE_RAND[1]);
            int randInt2 = Utils.getRand().nextInt(RANGE_RAND[0],
                    RANGE_RAND[1]);
            resInt = gcd(randInt1, randInt2);
            gameInfo[i][1] = Integer.toString(resInt);
            gameInfo[i][0] = randInt1 + " " + randInt2;
        }
        Engine.run(GAME_QUES, gameInfo);
    }
    public static int gcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : gcd(b, a % b);
    }
}
