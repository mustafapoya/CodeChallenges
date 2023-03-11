import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlphabetSubSequenceTest {

    @Test
    void code() {
        assertFalse(AlphabetSubSequence.code("effg"));
        assertFalse(AlphabetSubSequence.code("cdce"));
        assertTrue(AlphabetSubSequence.code("ace"));
        assertTrue(AlphabetSubSequence.code("bxz"));
        assertFalse(AlphabetSubSequence.code("zab"));
    }
}