import java.util.HashMap;

public class PalindromeRearranging {
    public static boolean code(String value) {
        HashMap<Character, Integer> map = new HashMap<>();
        int oddCount = 0;

        for(int i = 0; i < value.length(); i++) {
            if(map.containsKey(value.charAt(i))) {
                map.replace(value.charAt(i), map.get(value.charAt(i))+1);
            } else {
                map.put(value.charAt(i), 1);
            }
        }

        for(char key: map.keySet()) {
            if(map.get(key) % 2 != 0) {
                oddCount++;
            }
        }
        return oddCount > 1 ? false : true;
    }
}
