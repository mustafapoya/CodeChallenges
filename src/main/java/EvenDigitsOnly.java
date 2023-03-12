public class EvenDigitsOnly {
    public static boolean code(int number) {
        String value = String.valueOf(number);

        for(int i = 0; i < value.length(); i++) {
            if(Integer.valueOf(value.charAt(i) + "") % 2 != 0) {
                return false;
            }
        }

        return true;
    }
}

