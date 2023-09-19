package hexlet.code;

public class Engine {
    public static final int COUNT_ROUNDS = 3;

    public static void run(String question, String[][] result) {
        System.out.println('\n' + "Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = Utils.getScan();
        System.out.println("Hello, " + name + "!");
        System.out.println(question);
        for (int i = 0; i < COUNT_ROUNDS; i++) {
            System.out.println("Question: " + result[i][0]);
            System.out.print("Your answer: ");
            String answer = Utils.getScan();
            if (result[i][1].equalsIgnoreCase(answer)) {
                System.out.println("Correct!");

            } else {
                wrongAnswer(answer, result[i][1], name);
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }

    public static void wrongAnswer(String answer, String result,
                                   String userName) {
        System.out.println("'" + answer + "'" + " is wrong answer ;(. "
                + "Correct answer was " + "'" + result + "'" + ".");
        System.out.println("Let's try again, " + userName + "!");
        System.exit(0);
    }
}
