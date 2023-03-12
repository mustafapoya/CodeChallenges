import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindClosestPairTest {

    @Test
    void code() {
        assertEquals(2, FindClosestPair.code(new int[]{1, 0, 2, 4, 3, 0}, 5));
        assertEquals(-1, FindClosestPair.code(new int[]{2, 3, 7}, 8));
    }
}