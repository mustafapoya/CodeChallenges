import java.util.ArrayList;
import java.util.HashMap;

public class ProCategorization {
    public static String code(String[] pros, String[][] preferences) {
        HashMap<String, ArrayList<String>> prosPreferences = new HashMap<>();

        for(int i = 0; i < pros.length; i++) {
            for(int j = 0; j < preferences[i].length;j ++) {
                if(prosPreferences.containsKey(preferences[i][j])) {
                    prosPreferences.get(preferences[i][j]).add(pros[i]);
                } else {
                    ArrayList<String> list = new ArrayList<>();
                    list.add(pros[i]);
                    prosPreferences.put(preferences[i][j], list);
                }
            }
        }

        System.out.println(prosPreferences);
        return prosPreferences.toString();
    }
}
