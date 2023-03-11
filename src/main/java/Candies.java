public class Candies {
    public static int code(int n, int m) {
        int candy = Math.floorDiv(m, n);

        return candy * n;

    }
}
