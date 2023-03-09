public class Add {
    public static int code(int number1, int number2) {
        return number1 + number2;
    }

    public static int code2(int ... numbers) {
        int result = 0;
        for(int number: numbers) {
            result += number;
        }
        return result;
    }
}
