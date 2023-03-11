import java.util.Arrays;
import java.util.Collections;

public class AreSimilar {
    public static boolean code(int[] a, int[] b) {
        int[] c = new int[a.length];
        int[] d = new int[b.length];

        if (Arrays.toString(a).equals(Arrays.toString(b))) {
            return true;
        }

        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                c[index] = a[i];
                d[index] = a[i];
                index++;
            }
        }

        if(index == 2 && (Arrays.toString(c).equals(Arrays.toString(d)))) {
            return true;
        } else {
            return false;
        }
    }

    public static void reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }
}
