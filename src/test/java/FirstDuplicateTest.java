import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstDuplicateTest {

    @Test
    void code() {
        assertEquals(3, FirstDuplicate.code(new int[]{2, 1, 3, 5, 3, 2}));
        assertEquals(-1, FirstDuplicate.code(new int[]{2, 4, 3, 5, 1}));
        assertEquals(4, FirstDuplicate.code(new int[]{2, 3, 5, 1, 4, 4}));
    }
}