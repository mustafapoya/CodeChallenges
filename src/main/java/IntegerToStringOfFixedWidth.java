public class IntegerToStringOfFixedWidth {
    public static String code(int number, int width) {
        String value = String.valueOf(number);

        for(int i = 0; i < width - value.length(); i++) {
            value = "0" + value;
        }

        return value.substring(value.length()-width);
    }
}
