import java.util.ArrayList;

public class FirstDuplicate {
    public static int code(int [] array) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < array.length; i++) {
            if(list.indexOf(array[i]) != -1) {
                return array[i];
            } else {
                list.add(array[i]);
            }
        }

        return -1;
    }
}
