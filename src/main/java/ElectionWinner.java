import java.util.Arrays;

public class ElectionWinner {
    public static int code(int[] votes, int k) {
        int running = 0;
        int maxVote = max(votes);

        Arrays.sort(votes);

        if(votes[votes.length-1] != votes[votes.length-2] && k == 0) {
            return 1;
        }

        for(int i = votes.length-1; i >= 0; i--) {
            if(maxVote - votes[i] < k) {
                running++;
            }
        }

        return running;
    }

    public static int max(int [] array) {
        int max = array[0];

        for(int i = 1; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
