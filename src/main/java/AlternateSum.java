public class AlternateSum {
    public static int[] code(int[] values) {
        int eventSum = 0, oddSum = 0;

        for (int i = 0; i < values.length; i++) {
            if (i % 2 == 0) {
                eventSum += values[i];
            } else {
                oddSum += values[i];
            }
        }

        return new int[]{eventSum, oddSum};
    }
}
