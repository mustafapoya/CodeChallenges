public class ArrayMaximalAdjacentDifference {
    public static int code(int [] array) {
        int maxDiff = Math.abs(array[0] - array[1]);

        for(int i = 0; i < array.length-1; i++) {
            if(Math.abs(array[i] - array[i+1]) > maxDiff) {
                maxDiff = array[i] - array[i+1];
            }
        }

        return maxDiff;
    }
}
