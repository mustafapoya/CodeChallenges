public class ConvertString {
    public static boolean code(String s, String t) {
        String word = "";
        int tIndex = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == t.charAt(tIndex)) {
                word += s.charAt(i) + "";
                tIndex++;

                if(word.equals(t)) {
                    return true;
                }
            }
        }

        return false;
    }
}
