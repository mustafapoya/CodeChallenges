import java.util.ArrayList;

public class CompareRanges {
    public static String[] code(int[] array) {

        ArrayList<String> list = new ArrayList<>();

        int startIndex = 0;
        int endIndex = 0;
        // -1, 0, 1, 2, 6, 7, 9
        for (int i = 1; i < array.length; i++) {
            if (array[i] - 1 == array[i - 1]) {
                endIndex++;
            } else {
                list.add(array[startIndex] + "->" + array[endIndex]);
                startIndex = i;
                endIndex = i;
            }
        }

        if (endIndex == array.length - 1) {
            list.add(startIndex != endIndex ? array[startIndex] + "->" + array[endIndex] : array[endIndex] + "");
        }

        String[] result = new String[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
