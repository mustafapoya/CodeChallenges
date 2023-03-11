import java.util.ArrayList;
import java.util.Arrays;

public class ChunkyMonkey {
    public static Object[][] code(Object [] array, int size) {
        ArrayList<ArrayList<Object>> nested = new ArrayList<>();

        int count = 0;

        while(count < array.length) {
            int tmp = count + size;
            nested.add(new ArrayList<>(Arrays.asList(Arrays.copyOfRange(array, count, tmp > array.length ? array.length : tmp))));
            count = tmp;
        }

        Object [][] result = new Object[nested.size()][];

        for(int i = 0; i < nested.size(); i++) {
            result[i] = new Object[nested.get(i).size()];
            System.out.println(nested);
            for(int j = 0; j < nested.get(i).size(); j++) {
                result[i][j] = nested.get(i).get(j);
            }
        }

        return result;
    }
}
