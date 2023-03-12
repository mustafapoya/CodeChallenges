import java.lang.reflect.Array;
import java.util.Arrays;

public class ExtractEachKth {
    public static int[] code(int [] array, int k) {
        return Arrays.stream(array).filter((value) -> value % k != 0).toArray();
    }
}
