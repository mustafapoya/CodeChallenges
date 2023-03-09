public class AbsoluteValuesSumMinization {
    public static int code(int[] numbers) {
        boolean isEven = numbers.length % 2 == 0;

        return isEven ? numbers[numbers.length / 2 - 1] : numbers[Math.floorDiv(numbers.length, 2)];
    }

}
