import java.util.HashMap;

public class ReflectString {
    public static String code(String value) {
        HashMap<Character, Character> reflectionLetters = new HashMap<>();

        for(int i = 'a', j = 'z'; i <= 'z'; i++, j--) {
            reflectionLetters.put((char)i, (char)j);
        }

        String result = "";
        for(int i = 0; i < value.length(); i++) {
            result += reflectionLetters.get(value.charAt(i)) + "";
        }
        return result;
    }
}
