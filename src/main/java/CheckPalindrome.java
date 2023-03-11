public class CheckPalindrome {
    public static boolean code(String value) {
        return value.equalsIgnoreCase(new StringBuilder(value).reverse().toString());
    }
}
