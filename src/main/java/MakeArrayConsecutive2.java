import java.util.Arrays;

public class MakeArrayConsecutive2 {
    public static int code(int [] statuses) {
        Arrays.sort(statuses);
        int min = statuses[0];
        int max = statuses[statuses.length-1];

        int count = 0;
        for(int i = min; i < max; i++) {
            boolean missed = true;
            for(int j = 0; j < statuses.length-1; j++) {
                if(i == statuses[j]) {
                    missed = false;
                    break;
                }
            }
            if(missed) {
                count++;
            }
        }

        System.out.println(count);

        return count;
    }
}
