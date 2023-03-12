import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenDigitsOnlyTest {

    @Test
    void code() {
        assertTrue(EvenDigitsOnly.code(248622));
        assertFalse(EvenDigitsOnly.code(642386));
    }
}