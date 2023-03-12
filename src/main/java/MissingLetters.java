import java.util.Arrays;

public class MissingLetters {
    public static String code(String value) {
        char [] chars = value.toCharArray();
        Arrays.sort(chars);

        int startChar = (int) 'a';
        int endChar   = (int) 'z';

        for(int i = startChar; i < endChar; i++) {
            if(value.indexOf((char)i) == -1) {
                return String.valueOf((char)i);
            }
        }

        return null;
    }
}
