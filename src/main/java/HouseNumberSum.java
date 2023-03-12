import java.util.ArrayList;
import java.util.Set;

public class HouseNumberSum {
    public static int code(int [] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < array.length; i++) {
            if(list.indexOf(array[i]) == -1) {
                list.add(array[i]);
            }
        }

        return list.stream().mapToInt(a -> a).sum();
    }
}
