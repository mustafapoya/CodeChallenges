import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompareIntegersTest {

    @Test
    void code() {
        assertEquals("less", CompareIntegers.code(12, 13));
        assertEquals("greater", CompareIntegers.code(875, 799));
        assertEquals("equal", CompareIntegers.code(1000, 1000));
    }
}