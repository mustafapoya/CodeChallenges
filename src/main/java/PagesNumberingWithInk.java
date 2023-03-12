public class PagesNumberingWithInk {
    public static int code(int current, int numberOfDigits) {
        while(numberOfDigits >= String.valueOf(current).length()) {
            numberOfDigits -= String.valueOf(current).length();

            if(numberOfDigits >= String.valueOf(current).length()) {
                current++;
            }
        }

        return current;
    }
}
