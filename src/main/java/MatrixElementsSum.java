import java.util.ArrayList;

public class MatrixElementsSum {
    public static int code(int[][] matrix) {
        int priceTotal = 0;
        ArrayList<Integer> bannedIndex = new ArrayList<>();

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == 0) {
                    bannedIndex.add(j);
                } else if(bannedIndex.indexOf(j) == -1) {
                    priceTotal += matrix[i][j];
                }
            }
        }

        return priceTotal;
    }
}
