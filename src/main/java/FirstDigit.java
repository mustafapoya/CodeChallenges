public class FirstDigit {
    public static int code(String value) {
        for(int i = 0; i < value.length(); i++) {
            if(Character.isDigit(value.charAt(i))) {
                return Integer.parseInt(value.charAt(i) + "");
            }
        }
        return -1;
    }
}
