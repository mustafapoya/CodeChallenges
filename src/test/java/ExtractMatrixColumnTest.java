import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExtractMatrixColumnTest {

    @Test
    void code() {
        assertArrayEquals(new int[]{1, 0, 3},
                ExtractMatrixColumn.code(new int[][]{{1, 1, 1, 2}, {0, 5, 0, 4}, {2, 1, 3, 6}}, 2));
    }
}