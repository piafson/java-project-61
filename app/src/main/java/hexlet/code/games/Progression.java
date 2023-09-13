package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;
public class Progression {
    public static void startProgression(int repeat) {
        final int maxRandBegin = 20;
        final int maxRandStep = 5;
        final int maxLength = 10;
        String userName = Engine.greeting();
        System.out.println("What number is missing in the progression?");
        for (int count = 0; count < repeat; count++) {
            Random random = new Random();
            int begin = random.nextInt(0, maxRandBegin);
            int step = random.nextInt(2, maxRandStep);
            int skip = random.nextInt(1, maxLength);
            int result = 0;
            String question = "";
            for (int i = 0; i < maxLength; i++) {
                if (i == skip) {
                    question = question + ".. ";
                    begin = begin + step;
                    result = begin;
                    continue;
                }
                begin = begin + step;
                question = question + begin + " ";
            }
            Engine.dialogue(question, Integer.toString(result), userName);
        }
        Engine.congratulation(userName);
    }
}
