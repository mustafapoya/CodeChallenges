public class ContainsCloseNums {
    public static boolean code(int [] array, int k) {
        for(int i = 0; i < array.length-1; i++) {
            if(Math.abs(array[i] - array[i+1]) > k) {
                return false;
            }
        }
        return true;
    }
}
