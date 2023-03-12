public class FactorializeANumber {
    public static int code(int number) {
        int total = 1;

        for(int i = 1; i <= number; i++) {
            total *= i;
        }

        return total;
    }
}
