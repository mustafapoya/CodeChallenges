public class StolenLaunch {
    public static String code(String value) {
        String result = "";
        for(int i = 0; i < value.indexOf(':'); i++) {
            if(Character.isDigit(value.charAt(i))) {
                result += "" + (char) (97 + Integer.parseInt(value.charAt(i) + ""));
            } else {
                result += value.charAt(i);
            }
        }

        for(int i = value.indexOf(':'); i < value.length(); i++) {
            if(Character.isLetter(value.charAt(i))) {
                result += value.charAt(i) - 'a';
            } else {
                result += value.charAt(i);
            }
        }

        System.out.println(result);

        return result;
    }
}
