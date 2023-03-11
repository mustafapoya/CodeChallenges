import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommonCharacterCountTest {

    @Test
    void code() {
        assertEquals(3, CommonCharacterCount.code("aabcc", "adcaa"));
    }
}