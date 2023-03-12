public class IsTandemRepeat {
    public static boolean code(String value) {
        return value.substring(0, value.length()/2).equals(value.substring(value.length()/2));
    }
}
