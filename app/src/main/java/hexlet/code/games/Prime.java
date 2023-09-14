package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;
public class Prime {
    private static final int[] RANGE_RAND = {2, 61};
    private static final String GAME_QUES = "Answer 'yes' if given number is "
            + "prime. Otherwise answer 'no'.";
    public static void startPrime() {
        String[][] result = new String[Engine.COUNT_ROUNDS][2];
        for (int i = 0; i < Engine.COUNT_ROUNDS; i++) {
            Random rand = new Random();
            int question = rand.nextInt(RANGE_RAND[0], RANGE_RAND[1]);
            result[i][0] = Integer.toString(question);
            result[i][1] = "yes";
            int tmp = 0;
            for (int j = 2; j <= question / 2; j++) {
                tmp = question % j;
                if (tmp == 0) {
                    result[i][1] = "no";
                    break;
                }
            }
        }
        Engine.run(GAME_QUES, result);
    }
}
