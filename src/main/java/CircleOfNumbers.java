public class CircleOfNumbers {
    public static int code(int n, int firstNumber) {
        int [] numArray = new int[n];
        int halfWay = n / 2;

        for(int i = 0; i < n; i++) {
            numArray[i] = i;
        }

        if(firstNumber < halfWay) {
            return numArray[firstNumber + halfWay];
        } else {
            return numArray[firstNumber - halfWay];
        }
    }
}
