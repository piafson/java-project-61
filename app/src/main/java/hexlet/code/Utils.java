package hexlet.code;
import java.util.Random;
import java.util.Scanner;
public class Utils {
    private static final Random RAND = new Random();
    private static final Scanner SCANNER = new Scanner(System.in);

    public static int getRand(int min, int max) {
        return RAND.nextInt(min, max);
    }

    public static String getScan() {
        return SCANNER.nextLine();
    }
}
