package hexlet.code;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner in = new Scanner(System.in);
        final int choice = in.nextInt();

        switch (choice) {
            case (0) -> {
                System.out.println("Bye!");
                System.exit(0);
            }
            case (1) -> greeting();
            case (2) -> {
                String name = greeting();
                Even.checkEven(name);
            }
            default -> {
                break;
            }
        }
    }
    public static String greeting() {
        System.out.println('\n' + "Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println("Hello, " + name + "!");
        return name;
    }
}

