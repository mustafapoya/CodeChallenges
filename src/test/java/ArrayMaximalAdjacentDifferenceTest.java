import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayMaximalAdjacentDifferenceTest {

    @Test
    void code() {
        assertEquals(3, ArrayMaximalAdjacentDifference.code(new int[]{2, 4, 1, 0}));
        assertEquals(6, ArrayMaximalAdjacentDifference.code(new int[]{3, 7, 1, 2}));
    }
}