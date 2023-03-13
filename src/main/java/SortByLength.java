import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortByLength {
    public static String [] code(String [] array) {
        List<String> value = Arrays.asList(array);
        value.sort(Comparator.comparingInt(String::length));
        return value.toArray(String[]::new);
    }
}
