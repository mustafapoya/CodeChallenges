import java.util.Arrays;

public class LongestDigitsPrefix {
    public static String code(String value) {
        String [] parts = value.split("[a-zA-Z]");

        int max = 0;
        for(int i = 0; i < parts.length; i++) {
            if(parts[i].length() > parts[max].length()) {
                max = i;
            }
        }
        return parts[max];
    }
}
