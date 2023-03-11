public class ArrayMaxConsecutiveSum {
    public static int code(int [] array, int k) {
        int max = 0;

        for(int i = 0; i <= array.length-k; i++) {
            int sum = 0;
            for(int j = i; j < i+k; j++) {
                sum += array[j];
            }
            max = sum > max ? sum : max;
        }

        return max;
    }
}
