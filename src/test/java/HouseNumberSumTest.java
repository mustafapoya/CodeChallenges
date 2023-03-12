import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseNumberSumTest {

    @Test
    void code() {
        assertEquals(11, HouseNumberSum.code(new int[]{5, 1, 2, 3, 0, 1, 5, 0, 2}));
    }
}