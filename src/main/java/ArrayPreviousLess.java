import java.util.Arrays;

public class ArrayPreviousLess {
    public static int [] code(int [] array) {
        int [] result = new int[array.length];

        for(int i = array.length-1; i >= 0; i--) {
            for(int j = i; j >= 0; j--) {
                if(array[i] > array[j]) {
                    result[i] = array[j];
                    break;
                } else if(j == 0) {
                    result[i] = -1;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(result));
        return result;
    }
}
