public class AllLongestString {
    public static String [] code(String [] array) {
        int length = 0;
        String result = "";

        for(String value : array) {
            if(value.length() > length) {
                length = value.length();
            }
        }

        for(String value : array) {
            if(value.length() == length) {
                result += value + ";";
            }
        }
        return result.split(";");
    }
}
