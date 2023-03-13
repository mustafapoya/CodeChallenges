import java.util.Arrays;

public class SortByHeight {
    public static int[] code(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == -1) {
                continue;
            }
            int smallest = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j] && array[j] != -1) {
                    smallest = j;
                    int temp = array[i];
                    array[i] = array[smallest];
                    array[smallest] = temp;
                    System.out.println("swap");
                }
            }
        }

        return array;
    }
}
