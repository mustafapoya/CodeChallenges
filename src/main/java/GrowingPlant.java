public class GrowingPlant {
    public static int code(int upSpeed, int downSpeed, int desireSpeed) {
        return desireSpeed / (upSpeed - downSpeed);
    }
}
