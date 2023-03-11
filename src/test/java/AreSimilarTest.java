import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreSimilarTest {

    @Test
    void code() {
        assertTrue(AreSimilar.code(new int[]{1, 2, 3}, new int[]{1, 2, 3}));
        assertTrue(AreSimilar.code(new int[]{1, 2, 3}, new int[]{2, 1, 3}));
        assertFalse(AreSimilar.code(new int[]{1, 2, 2}, new int[]{2, 1, 1}));
    }
}