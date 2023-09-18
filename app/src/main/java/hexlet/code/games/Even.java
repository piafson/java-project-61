package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final int[] RANGE_RAND = {4, 1000};
    private static final String GAME_QUES = "Answer 'yes' if the number is even"
            + ", otherwise answer 'no'.";

    public static void startEven() {
        String[][] gameInfo = new String[Engine.COUNT_ROUNDS][2];
        for (int count = 0; count < Engine.COUNT_ROUNDS; count++) {
            int resInt = Utils.getRand(RANGE_RAND[0], RANGE_RAND[1]);
            gameInfo[count][0] = Integer.toString(resInt);
            gameInfo[count][1] =  isEven(resInt) ? "yes" : "no";
        }
        Engine.run(GAME_QUES, gameInfo);
    }
    public static boolean isEven(int num) {
        return (num % 2 == 0);
    }
}
