import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlphabeticShiftTest {

    @Test
    void code() {
        assertEquals("dsbaz", AlphabeticShift.code("crazy"));
    }
}