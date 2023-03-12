import java.util.ArrayList;
import java.util.Arrays;

public class ExtractMatrixColumn {
    public static int[] code(int [][] array, int column) {
        int [] result = new int[array.length];

        for(int i = 0; i < array.length; i++) {
            result[i] = array[i][column];
        }

        return result;
    }
}
