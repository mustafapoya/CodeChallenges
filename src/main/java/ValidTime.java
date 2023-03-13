public class ValidTime {
    public static boolean code(String time) {
        String [] parts = time.split(":");

        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);

        return (hour > 0 && hour < 23) && (minute > 0 && minute < 59);
    }
}
