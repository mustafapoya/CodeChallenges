import java.util.HashMap;

public class ChessBoardCellColor {
    public static boolean code(String cell1, String cell2) {
        HashMap<String, Integer> board = new HashMap<>();
        board.put("a", 1);
        board.put("b", 2);
        board.put("c", 3);
        board.put("d", 4);
        board.put("e", 5);
        board.put("f", 6);
        board.put("g", 7);
        board.put("h", 8);

        int total1 = board.get(cell1.charAt(0)+"") + Integer.parseInt(cell1.charAt(1) + "");
        int total2 = board.get(cell2.charAt(0)+"") + Integer.parseInt(cell2.charAt(1) + "");

        return total1 % 2 == total2 % 2;
    }
}
