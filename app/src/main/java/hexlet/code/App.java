package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner in = new Scanner(System.in);
        final int choice = in.nextInt();

        switch (choice) {
            case (0) -> Engine.bye();
            case (1) -> Engine.greeting();
            case (2) -> Even.checkEven();
            case (3) -> Calc.calculate();
            case (4) -> Gcd.calcGcd();
            default -> {
                break;
            }
        }
    }
}

