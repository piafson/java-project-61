package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final int[] RANGE_RAND = {2, 61};
    private static final String GAME_QUES = "Answer 'yes' if given number is "
            + "prime. Otherwise answer 'no'.";

    public static void startPrime() {
        String[][] gameInfo = new String[Engine.COUNT_ROUNDS][2];
        for (int i = 0; i < Engine.COUNT_ROUNDS; i++) {
            int question = Utils.getRand().nextInt(RANGE_RAND[0], RANGE_RAND[1]);
            gameInfo[i][0] = Integer.toString(question);
            gameInfo[i][1] = isPrime(question) ? "yes" : "no";
        }
        Engine.run(GAME_QUES, gameInfo);
    }
    public static boolean isPrime(int num) {
        int tmp = 0;
        for (int i = 2; i <= num / 2; i++) {
            tmp = num % i;
            if (tmp == 0) {
                return false;
            }
        }
        return true;
    }
}
