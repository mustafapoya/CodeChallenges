import java.util.ArrayList;

public class SumOfTwo {
    public static boolean code(int [] a, int [] b, int v) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < a.length; i++) {
            int diff = v - a[i];
            list.add(diff);
        }

        for(int i = 0; i < b.length; i++) {
            if(list.contains(b[i])) {
                return true;
            }
        }

        return false;
    }
}
