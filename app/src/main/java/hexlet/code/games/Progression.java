package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;
public class Progression {
    private static final int[] RANGE_RAND = {5, 10, 20};
    public static String gameQues = "What number is missing in the progression?";
    public static void startProgression() {
        String[][] result = new String[Engine.COUNT_ROUNDS][2];
        for (int i = 0; i < Engine.COUNT_ROUNDS; i++) {
            Random random = new Random();
            int begin = random.nextInt(0, RANGE_RAND[2]);
            int step = random.nextInt(2, RANGE_RAND[0]);
            int skip = random.nextInt(1, RANGE_RAND[1]);
            int resInt = 0;
            result[i][0] = "";
            for (int j = 0; j < RANGE_RAND[1]; j++) {
                if (j == skip) {
                    result[i][0] = result[i][0] + ".. ";
                    begin = begin + step;
                    resInt = begin;
                    result[i][1] = Integer.toString(resInt);
                    continue;
                }
                begin = begin + step;
                result[i][0] = result[i][0] + begin + " ";
            }
        }
        Engine.run(gameQues, result);
    }
}
