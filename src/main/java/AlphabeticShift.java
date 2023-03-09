public class AlphabeticShift {
    public static String code(String value) {
        String result = "";
        for(int i = 0; i < value.length(); i++) {
            result += "" + (value.charAt(i) == 'z' ? "a" : (char) (value.charAt(i) + 1));
        }

        return result;
    }
}
