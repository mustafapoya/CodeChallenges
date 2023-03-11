import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayMaxConsecutiveSumTest {

    @Test
    void code() {
        assertEquals(8, ArrayMaxConsecutiveSum.code(new int[]{2, 3, 5, 1, 6}, 2));
        assertEquals(12, ArrayMaxConsecutiveSum.code(new int[]{2, 3, 5, 1, 6}, 3));
    }
}