package hexlet.code;
import java.util.Random;
public class Utils {
    private static final Random RAND = new Random();

    public static Random getRand() {
        return RAND;
    }
}
