import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidTimeTest {

    @Test
    void code() {
        assertTrue(ValidTime.code("13:58"));
        assertFalse(ValidTime.code("25:51"));
        assertFalse(ValidTime.code("02:76"));
    }
}