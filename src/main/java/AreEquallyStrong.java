public class AreEquallyStrong {
    public static boolean code(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
        int yourWeak = yourLeft <= yourRight ? yourLeft : yourRight;
        int yourStrong = yourLeft >= yourRight ? yourLeft : yourRight;

        int fWeak = friendsLeft <= friendsRight ? friendsLeft : friendsRight;
        int fStrong = friendsLeft >= friendsRight ? friendsLeft : friendsRight;

        return yourStrong == fStrong && yourWeak == fWeak;
    }
}
