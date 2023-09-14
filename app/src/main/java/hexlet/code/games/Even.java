package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;
public class Even {
    private static final int[] RANGE_RAND = {4, 1000};
    public static String gameQues = "Answer 'yes' if the number is even, otherwise"
            + " answer 'no'.";
    public static void startEven() {
        String[][] result = new String[Engine.COUNT_ROUNDS][2];
        for (int i = 0; i < Engine.COUNT_ROUNDS; i++) {
            Random rand = new Random();
            int resInt = rand.nextInt(RANGE_RAND[0], RANGE_RAND[1]);
            result[i][0] = Integer.toString(resInt);
            result[i][1] = resInt % 2 == 0 ? "yes" : "no";
        }
        Engine.run(gameQues, result);
    }
}
