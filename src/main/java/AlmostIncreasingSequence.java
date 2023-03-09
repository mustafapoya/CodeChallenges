public class AlmostIncreasingSequence {
    public static boolean code(int [] numbers) {
        int count = 0;
        for(int i = 0; i < numbers.length-1; i++) {
            if(numbers[i] >= numbers[i+1]) {
                count++;
            }
        }
        return count < 2;
    }
}
