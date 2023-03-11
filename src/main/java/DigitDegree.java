public class DigitDegree {
    public static int code(int n) {
        int count = 0;
        int currentNumber = n;

        if(n <= 9) {
            return count;
        } else {
            while(true) {
                count++;
                currentNumber = getDigit(currentNumber);
                System.out.println(currentNumber);
                if(currentNumber <= 9) {
                    break;
                }
            }
        }
        return count;
    }

    public static int getDigit(int number) {
        String [] value = String.valueOf(number).split("");
        int result = 0;
        for(int i = 0; i < value.length; i++) {
            result += Integer.parseInt(value[i]);
        }
        return result;
    }
}
