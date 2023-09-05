package hexlet.code;
import java.util.Scanner;
public class Cli {
    public static String greeting() {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        in.close();
        return "Hello, " + name + "!";
    }
}
