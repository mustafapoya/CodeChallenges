import java.util.ArrayList;
import java.util.Arrays;

public class BoxBlur {
    public static double[][] code(int[][] image) {
        ArrayList<ArrayList<Double>> list = new ArrayList<>();

        for(int y = 0; y < image.length-2; y++) {
            ArrayList<Double> line = new ArrayList<>();

            for(int x = 0; x < image[y].length-2; x++) {
                int sum = 0;
                int count = 0;

                for(int a = y; a < y + 3; a++) {
                    for(int b = x; b < x + 3; b++) {
                        sum += image[a][b];
                        count++;
                    }
                }
                line.add(Math.floor(sum / count));
            }

            list.add(line);
        }

        double [][] results = new double[list.size()][];

        for(int i = 0; i < list.size(); i++) {
            results[i] = new double[list.get(i).size()];
            for(int j = 0; j < list.get(i).size(); j++) {
                results[i][j] = list.get(i).get(j);
            }
        }

        return results;
    }
}
