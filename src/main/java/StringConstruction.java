import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class StringConstruction {
    public static int code(String a, String b) {
        HashMap<Character, Integer> aCount = getAlphabetCount(a);
        HashMap<Character, Integer> bCount = getAlphabetCount(b);

        ArrayList<Integer> count = new ArrayList<>();

        for(char key : aCount.keySet()) {
            if(bCount.containsKey(key)) {
                count.add(Math.round(bCount.get(key) / aCount.get(key)));
            } else {
                return 0;
            }
        }

        return Collections.min(count);
    }

    public static HashMap<Character, Integer> getAlphabetCount(String word) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            if (map.containsKey(word.charAt(i))) {
                map.put(word.charAt(i), map.get(word.charAt(i)) + 1);
            } else {
                map.put(word.charAt(i), 1);
            }
        }

        return map;
    }
}
