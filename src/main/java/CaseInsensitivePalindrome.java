public class CaseInsensitivePalindrome {
    public static boolean code(String value) {
        String originalLowerCase = value.toLowerCase();
        String reversedWord = new StringBuilder(originalLowerCase).reverse().toString();

        return originalLowerCase.equals(reversedWord);
    }
}
