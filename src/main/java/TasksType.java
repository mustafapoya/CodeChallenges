public class TasksType {
    public static int [] code(int [] deadlines, int day) {
        int today = 0;
        int upcoming = 0;
        int later = 0;

        for(int i = 0; i < deadlines.length; i++) {
            if(deadlines[i] <= day) {
                today++;
            } else if(deadlines[i] >= day + 1 && deadlines[i] <= day + 7) {
                upcoming++;
            } else {
                later++;
            }
        }

        return new int[]{today, upcoming, later};
    }

}
