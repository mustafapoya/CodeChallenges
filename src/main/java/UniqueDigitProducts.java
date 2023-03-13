import java.util.ArrayList;

public class UniqueDigitProducts {
    public static int code(int[] a) {
        ArrayList<Integer> products = new ArrayList<>();

        for(int i = 0; i < a.length; i++) {
            int product = getDigitProduct(a[i]);
            if(!products.contains(product)) {
                products.add(product);
            }
        }

        return products.size();
    }

    private static int getDigitProduct(int number) {
        String value = String.valueOf(number);
        int multiply = 1;

        for(int i = 0; i < value.length(); i++) {
            multiply *= Integer.parseInt(value.charAt(i) + "");
        }

        return multiply;
    }
}
