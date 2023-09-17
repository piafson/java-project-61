package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final int[] RANGE_RAND = {5, 10, 20};
    public static final String GAME_QUES = "What number is missing in the "
            + "progression?";

    public static void startProgression() {
        String[][] gameInfo = new String[Engine.COUNT_ROUNDS][2];
        for (int i = 0; i < Engine.COUNT_ROUNDS; i++) {
            int begin = Utils.getRand(0, RANGE_RAND[2]);
            int step = Utils.getRand(2, RANGE_RAND[0]);
            int skip = Utils.getRand(1, RANGE_RAND[1]);
            gameInfo[i][0] = "";
            int[] progression = generateProgression(begin, step, RANGE_RAND[1]);
            for (int j = 0; j < progression.length; j++) {
                if (j == skip) {
                    gameInfo[i][0] = gameInfo[i][0] + ".. ";
                    gameInfo[i][1] = Integer.toString(progression[j]);
                    continue;
                }
                gameInfo[i][0] = gameInfo[i][0] + progression[j] + " ";
            }
        }
        Engine.run(GAME_QUES, gameInfo);
    }
    public static int[] generateProgression(int begin, int step, int len) {
        int[] progression = new int[len];
        for (int i = 0; i < progression.length; i++) {
            progression[i] = begin + step * i;
        }
        return progression;
    }
}
