import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerToStringOfFixedWidthTest {

    @Test
    void code() {
        assertEquals("34", IntegerToStringOfFixedWidth.code(1234, 2));
        assertEquals("1234", IntegerToStringOfFixedWidth.code(1234, 4));
        assertEquals("01234", IntegerToStringOfFixedWidth.code(1234, 5));
    }
}