import java.util.ArrayList;
import java.util.Arrays;

public class SeekAndDestroy {
    public static int[] code(int [] array1, int [] array2) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < array1.length; i++) {
            boolean contain = false;
            for(int j = 0; j < array2.length; j++) {
                if(array1[i] == array2[j]) {
                    contain = true;
                    break;
                }
            }
            if (!contain)
                result.add(array1[i]);
        }

        System.out.println();

        return result.stream().mapToInt(a -> a).toArray();
    }
}
