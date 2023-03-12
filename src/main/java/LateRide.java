import java.util.Arrays;

public class LateRide {
    public static int code(int number) {
        int hour = number / 60;
        int minute = number % 60;
        return Arrays.stream(String.valueOf(hour).concat(String.valueOf(minute)).split(""))
                            .mapToInt(a -> Integer.parseInt(a)).sum();

    }
}
