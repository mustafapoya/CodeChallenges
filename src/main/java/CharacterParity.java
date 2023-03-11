public class CharacterParity {
    public static String code(char symbol) {
        return !Character.isDigit(symbol) ? "not a digit" : Integer.parseInt(symbol + "") % 2 == 0 ? "even" : "odd";
    }
}
