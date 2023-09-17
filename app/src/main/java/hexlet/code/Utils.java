package hexlet.code;
import java.util.Random;
public class Utils {
    private static final Random RAND = new Random();

    public static int getRand(int min, int max) {
        return RAND.nextInt(min, max);
    }
}
