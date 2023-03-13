public class PigLatin {
    public static String code(String value) {
        String vowel = "aeiou";
        if(vowel.contains(value.charAt(0) + "")) {
            return value + "way";
        } else {
            int index = 0;
            for(int i = 0; i < value.length(); i++) {
                if(vowel.contains(value.charAt(i) + "")) {
                    index = i;
                    break;
                }
            }
            return value.substring(index, value.length()) + value.substring(0, index) + "ay";
        }
    }
}
