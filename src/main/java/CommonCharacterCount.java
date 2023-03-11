import java.util.HashMap;

public class CommonCharacterCount {
    public static int code(String s1, String s2) {
        char [] s1Chars = s1.toCharArray();
        char [] s2Chars = s2.toCharArray();

        HashMap<Character, Integer> s1CharCount = getCharList(s1Chars);
        HashMap<Character, Integer> s2CharCount = getCharList(s2Chars);

        System.out.println(s1CharCount);
        System.out.println(s2CharCount);

        int total = 0;

        for(Character key : s1CharCount.keySet()) {
            if(s2CharCount.containsKey(key)) {
                if(s1CharCount.get(key) < s2CharCount.get(key)) {
                    if(s2CharCount.get(key) > total)
                        total = s2CharCount.get(key);
                } else {
                    if(s1CharCount.get(key) > total)
                        total = s1CharCount.get(key);
                }
            }
        }

        return total;
    }

    public static HashMap<Character, Integer> getCharList(char [] chars) {
        HashMap<Character, Integer> wordCount = new HashMap<>();

        for(int i = 0; i < chars.length; i++) {
            if(wordCount.containsKey(chars[i])) {
                wordCount.put(chars[i], wordCount.get(chars[i]) + 1);
            } else {
                wordCount.put(chars[i], 1);
            }
        }

        return wordCount;
    }
}
