import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixElementsSumTest {

    @Test
    void code() {
        assertEquals(9, MatrixElementsSum.code(new int[][]{{0, 1, 1, 2}, {0, 5, 0, 0}, {2, 0, 3, 3}}));
    }
}