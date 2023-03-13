import java.util.ArrayList;

public class RatingThreshold {
    public static int[] code(double threshold, int [][] ratings) {
        ArrayList<Integer> review = new ArrayList<>();

        for(int i = 0; i < ratings.length; i++) {
            int total = 0;

            for(int j = 0; j < ratings[i].length; j++) {
                total += ratings[i][j];
            }

            if(total / ratings[i].length < threshold) {
                if(i != 0)
                    review.add(i);
            }
        }

        System.out.println(review);

        return review.stream().mapToInt(a -> a).toArray();
    }
}
