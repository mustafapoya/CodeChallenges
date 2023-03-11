import java.util.HashMap;

public class BishopAndPawn {
    public static boolean code(String bishop, String pawn) {
        HashMap<String, Integer> board = new HashMap<>();
        board.put("a", 1);
        board.put("b", 2);
        board.put("c", 3);
        board.put("d", 4);
        board.put("e", 5);
        board.put("f", 6);
        board.put("g", 7);
        board.put("h", 8);

        int bishopX = board.get(String.valueOf(bishop.charAt(0)));
        int bishopY = Integer.parseInt(bishop.charAt(1) + "");

        System.out.println(bishopX + ", " + bishopY);

        int pawnX = board.get(String.valueOf(pawn.charAt(0)));
        int pawnY = Integer.parseInt(pawn.charAt(1) + "");

        System.out.println(pawnX + ", " + pawnY);

        if(bishopX + bishopY == pawnY + pawnX || bishopX + pawnY == pawnX + bishopY) {
            return true;
        }

        return false;
    }
}
