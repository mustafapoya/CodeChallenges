import java.util.ArrayList;
import java.util.Collections;

public class HouseOfCats {
    public static int[] code(int legs) {
        ArrayList<Integer> peopleCount = new ArrayList<>();

        if(legs == 2) {
            return new int[]{1};
        }

        while (legs >= 0) {
            peopleCount.add(legs / 2);
            legs -= 4;
        }

        Collections.reverse(peopleCount);
        return peopleCount.stream().mapToInt(a -> a).toArray();
    }
}
