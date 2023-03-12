public class Fermactor {
    public static int[] code(int number) {
        for(int i = 1; i < number; i++) {
            for(int j = 1; j < i; j++) {
                int total = (int) (Math.pow(i, 2) - Math.pow(j, 2));

                if(total == number) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{0, 0};
    }
}
