import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareDigitsSequenceTest {

    @Test
    void code() {
        assertEquals(9, SquareDigitsSequence.code(16));
        assertEquals(4, SquareDigitsSequence.code(103));
    }
}