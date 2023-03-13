public class SumAllPrimes {
    public static int code(int number) {
        int sum = 0;

        for(int i = 2; i <= number; i++) {
            for(int j = 2; j <= i; j++) {
                if(i == j) {
                    sum += i;
                }

                if(i % j == 0) {
                    break;
                }
            }
        }

        return sum;
    }
}
