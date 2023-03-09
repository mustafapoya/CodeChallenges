public class AddBorder {
    public static String[] code(String [] array) {
        String star = "*".repeat(array[0].length()+2);
        String [] result = new String[array.length+2];

        result[0] = star;
        for(int i = 1, j = 0; j < array.length; i++, j++) {
            result[i] = "*" + array[j] + "*";
        }
        result[result.length-1] = star;

        return result;
    }
}
