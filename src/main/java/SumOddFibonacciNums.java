public class SumOddFibonacciNums {
    public static int code(int number) {
        int result = 0;
        int previous = 0;
        int current = 1;

        while(current <= number) {
            if(current % 2 != 0) {
                result += current;
            }

            int nextCurrent = previous + current;
            previous = current;
            current = nextCurrent;

        }

        return result;
    }
}
