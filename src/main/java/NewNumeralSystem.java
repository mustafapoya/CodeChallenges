import java.util.ArrayList;

public class NewNumeralSystem {
    public static String [] code(String number) {
        ArrayList<String> list = new ArrayList<>();
        int startCharCount = 65;
        int endCharCount = number.charAt(0);

        while(startCharCount <= endCharCount) {
            String value = (char)startCharCount + " + " + (char) endCharCount;
            list.add(value);
            startCharCount++;
            endCharCount--;
        }
        System.out.println(list);
        return list.stream().toArray(String[]::new);
    }
}
