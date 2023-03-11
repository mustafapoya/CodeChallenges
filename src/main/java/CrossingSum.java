public class CrossingSum {
    public static int code(int[][] array, int a, int b) {
        int total = 0;
        for(int i = 0; i < array[a].length; i++) {
            total += array[a][i];
        }

        for(int i = 0; i < array.length; i++) {
            total += i != a ? array[i][b] : 0;
        }

        return total;
    }
}
