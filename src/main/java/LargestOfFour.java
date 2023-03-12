import java.util.ArrayList;

public class LargestOfFour {
    public static int [] code(int [][] array) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < array.length; i++) {
            int largest = 0;

            for(int j = 0; j < array[i].length; j++) {
                largest = largest < array[i][j] ? array[i][j] : largest;
            }
            list.add(largest);
        }

        return list.stream().mapToInt(a -> a).toArray();
    }
}
