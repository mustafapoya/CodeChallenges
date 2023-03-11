import java.util.Arrays;

public class AlphabetSubSequence {
    public static boolean code(String value) {

        for(int i = 0; i < value.length()-1; i++) {
            if(value.indexOf(value.charAt(i)) != value.lastIndexOf(value.charAt(i)) || value.charAt(i) > value.charAt(i+1)) {
                return false;
            }
        }

        return true;
    }
}
