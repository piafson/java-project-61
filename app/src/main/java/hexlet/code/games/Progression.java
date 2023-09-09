package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;
public class Progression {
    public static void startProgression(int repeat) {
        String userName = Engine.greeting();
        System.out.println("What number is missing in the progression?");
        int count = 0;
        int trueCount = 0;
        while (count < repeat) {
            Random random = new Random();
            int begin = random.nextInt(0, 20);
            int step = random.nextInt(2, 5);
            int skip = random.nextInt(1, 10);
            int right = 0;
            String question = "";
            for (int i = 0; i < 10; i++) {
                if (i == skip) {
                    question = question + ".. ";
                    begin = begin + step;
                    right = begin;
                    continue;
                }
                begin = begin + step;
                question = question + begin + " ";
            }
            Engine.dialoge(question);
            Scanner sc = new Scanner(System.in);
            int answer = sc.nextInt();
            if (answer == right) {
                System.out.println("Correct!");
                trueCount++;
            } else {
                Engine.wrongAnswer(Integer.toString(answer),
                        Integer.toString(right), userName);
            }
            count++;
        }
        if (trueCount == repeat) {
            Engine.congratulation(userName);
        }
    }
}
