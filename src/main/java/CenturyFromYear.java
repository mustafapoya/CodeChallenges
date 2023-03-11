public class CenturyFromYear {
    public static int code(int year) {
        int century = year / 100;

        return year % 100 == 0 ? century : century + 1;
    }
}
