public class CompanyBotStrategy {
    public static double code(int[][] array) {
        double time = 0;
        double correctness = 0;

        for(int i = 0; i < array.length; i++) {
            if(array[i][1] == 1) {
                time += array[i][0];
                correctness += array[i][1];
            }
        }

        return correctness != 0 ? time / correctness : 0.0;
    }

}
