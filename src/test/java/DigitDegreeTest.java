import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitDegreeTest {

    @Test
    void code() {
        assertEquals(0, DigitDegree.code(5));
        assertEquals(1, DigitDegree.code(10));
        assertEquals(2, DigitDegree.code(91));
    }
}