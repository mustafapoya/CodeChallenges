import java.util.ArrayList;

public class FlattenArray {
    public static Object [] code(Object[][]array) {
        ArrayList<Object> list = new ArrayList<>();

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                list.add(array[i][j]);
            }
        }

        return list.toArray();
    }
}
