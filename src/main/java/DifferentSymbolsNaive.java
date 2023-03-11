public class DifferentSymbolsNaive {
    public static int code(String value) {
        int count = 0;
        while (value.length() > 0) {
            value = value.replace(value.charAt(0)+"", "");
            count++;
        }
        return count;
    }
}
