import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class SquareDigitsSequence {
    public static int code(int a0) {
        int count = 1;

        ArrayList<Integer> uniqueNumbers = new ArrayList<>();
        uniqueNumbers.add(a0);

        while(true) {
            count++;
            a0 = digitPower(a0);

            if(uniqueNumbers.contains(a0)) {
                return count;
            }
            uniqueNumbers.add(a0);
        }

    }

    public static int digitPower(int number) {
        int[] digits = Arrays.stream(String.valueOf(number).split("")).mapToInt(a -> Integer.parseInt(a) * Integer.parseInt(a)).toArray();

        return Arrays.stream(digits).sum();
    }
}
