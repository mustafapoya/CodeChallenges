import java.util.Arrays;

public class ArrayConversion {

    public static int code(int[] array) {
        boolean isOdd = true;

        while(array.length != 1) {
            int index = 0;
            int[] result = new int[array.length];

            for (int i = 0; i < array.length - 1; i+=2) {
                result[index++] = isOdd ? array[i] + array[i + 1] : array[i] * array[i + 1];
            }
            isOdd = !isOdd;
            array = Arrays.copyOfRange(result, 0, index);
            System.out.println(Arrays.toString(Arrays.copyOfRange(result, 0, index)));
        }
        return array[0];
    }

}
