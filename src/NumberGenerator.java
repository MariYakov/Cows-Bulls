import java.util.Random;
public class NumberGenerator {
    public String generateString() {
        Random random = new Random();
        String generateString = "";

        while (generateString.length() < 4) {
            int x = random.nextInt(10);
            if (!generateString.contains(Integer.toString(x))) {
                generateString = generateString + x;
            }
        }
        return generateString;
    }
}
