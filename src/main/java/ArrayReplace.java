public class ArrayReplace {
    public static int [] code(int [] array, int find, int replace) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] == find) {
                array[i] = replace;
            }
        }
        return array;
    }
}
