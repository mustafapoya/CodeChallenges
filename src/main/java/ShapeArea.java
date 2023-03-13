public class ShapeArea {
    public static int code(int number) {
        int area = 1;

        for(int i = 1; i < number; i++) {
            area += 4 * i;
        }

        return area;
    }
}
