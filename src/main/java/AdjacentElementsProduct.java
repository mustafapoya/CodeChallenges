public class AdjacentElementsProduct {
    public static int code(int [] numbers) {
        int max = numbers[0] * numbers[1];

        for(int i = 1; i < numbers.length-1; i++) {
            if(numbers[i] * numbers[i+1] > max) {
                max = numbers[i] * numbers[i+1];
            }
        }
        return max;
    }
}
