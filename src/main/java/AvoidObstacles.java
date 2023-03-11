import java.util.Arrays;

public class AvoidObstacles {
    public static int code(int [] array) {
        Arrays.sort(array);
        int largeValue = array[array.length-1];

        for(int i = 1; i <= largeValue; i++) {
            int count = 0;
            for(int value: array) {
                if(value % i == 0) {
                    count++;
                }
            }
            if(count == 0) {
                return i;
            }
        }

        return -1;
    }
}
