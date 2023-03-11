public class DepositProfit {
    public static double code(double deposit, double rate, double threshold) {
        int year = 0;

        double account = deposit;

        while(threshold > account) {
            account += account * (rate / 100);
            year++;
        }

        return year;
    }
}
