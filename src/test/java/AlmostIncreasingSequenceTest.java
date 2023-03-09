import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlmostIncreasingSequenceTest {

    @Test
    void code() {
        assertFalse(AlmostIncreasingSequence.code(new int[]{1, 3, 2, 1}));
        assertTrue(AlmostIncreasingSequence.code(new int[]{1, 3, 2}));
    }
}