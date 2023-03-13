public class SeatsInTheater {
    public static int code(int nCols, int nRows, int col, int row) {
        int colDiff = nCols - col + 1;
        int rowDiff = nRows - row;

        return colDiff * rowDiff;
    }
}
