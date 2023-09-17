package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;


public class Calc {
    public static final String GAME_QUES = "What is the result of the "
            + "expression?";
    private static final char[] CHARS = {'-', '+', '*'};

    public static void startCalc() {
        final int[] maxRand = {3, 50};
        String[][] gameInfo = new String[Engine.COUNT_ROUNDS][2];
        for (int i = 0; i < Engine.COUNT_ROUNDS; i++) {
            int randInt1 = Utils.getRand(0, maxRand[1]);
            int randInt2 = Utils.getRand(1, maxRand[1]);
            char randChar = CHARS[Utils.getRand(1, maxRand[0])];
            gameInfo[i][0] = randInt1 + " " + randChar + " " + randInt2;
            gameInfo[i][1] = Integer.toString(calculate(randChar, randInt1,
                    randInt2));
        }
        Engine.run(GAME_QUES, gameInfo);
    }
    public static int calculate(char ch, int first, int second) {
        switch (ch) {
            case ('-') -> {
                return first - second;
            }
            case ('+') -> {
                return first + second;
            }
            case ('*') -> {
                return first * second;
            }
            default -> {
                throw new RuntimeException("Operator not supported.");
            }
        }
    }
}
