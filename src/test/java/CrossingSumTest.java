import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CrossingSumTest {

    @Test
    void code() {
        assertEquals(12, CrossingSum.code(new int[][]{{1, 1, 1, 1}, {2, 2, 2, 2}, {3, 3, 3, 3}}, 1, 3));

    }
}