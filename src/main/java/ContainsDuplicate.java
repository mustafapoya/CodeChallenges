import java.util.Arrays;

public class ContainsDuplicate {
    public static boolean code(int [] array) {
        Arrays.sort(array);

        for(int i = 0; i < array.length-1; i++) {
            if(array[i] == array[i+1]) {
                return true;
            }
        }

        return false;
    }
}
