import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreEquallyStrongTest {

    @Test
    void code() {
        assertTrue(AreEquallyStrong.code(10, 15, 15, 10));
        assertTrue(AreEquallyStrong.code(15, 10, 15, 10));
        assertFalse(AreEquallyStrong.code(15, 10, 15, 9));
    }
}