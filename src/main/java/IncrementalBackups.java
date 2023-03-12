import java.util.ArrayList;
import java.util.Collections;

public class IncrementalBackups {
    public static int [] code(int lastBackupTime, int [][] changes) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < changes.length; i++) {
            if(changes[i][0] > lastBackupTime && !list.contains(changes[i][1])) {
                list.add(changes[i][1]);
            }
        }

        Collections.sort(list);
        System.out.println(list);

        return list.stream().mapToInt(a -> a).toArray();
    }
}
