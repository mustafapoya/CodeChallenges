public class FirstNotRepeatingCharacter {
    public static char code(String value) {
        for(int i = 0; i < value.length(); i++) {
            if(value.indexOf(value.charAt(i)) == value.lastIndexOf(value.charAt(i))) {
                return value.charAt(i);
            }
        }
        return '_';
    }
}
