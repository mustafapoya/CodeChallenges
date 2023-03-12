import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxMultipleTest {

    @Test
    void code() {
        assertEquals(9, MaxMultiple.code(3, 10));
        assertEquals(8, MaxMultiple.code(4, 10));
    }
}