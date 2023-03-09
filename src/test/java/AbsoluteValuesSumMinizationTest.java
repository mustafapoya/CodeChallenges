import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteValuesSumMinizationTest {

    @Test
    void code() {
        assertEquals(4, AbsoluteValuesSumMinization.code(new int[]{2, 4, 7}));
        assertEquals(4, AbsoluteValuesSumMinization.code(new int[]{2, 4, 7, 6}));
        assertEquals(7, AbsoluteValuesSumMinization.code(new int[]{2, 4, 7, 6, 6}));
        assertEquals(7, AbsoluteValuesSumMinization.code(new int[]{2, 4, 7, 6, 6, 8}));
    }
}