import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConfirmEndingTest {

    @Test
    void code() {
        assertTrue(ConfirmEnding.code("Abstraction", "action"));
        assertFalse(ConfirmEnding.code("Open sesame", "pen"));
    }
}