public class ArrayChange {
    public static int code(int[] array) {
        int count = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] >= array[i + 1]) {
                int diff = (array[i] + 1) - array[i + 1];
                array[i + 1] = array[i] + 1;
                count += diff;
            }
        }

        return count;
    }
}
