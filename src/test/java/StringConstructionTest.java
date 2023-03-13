import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringConstructionTest {

    @Test
    void code() {
        assertEquals(2, StringConstruction.code("abc", "abccba"));

    }
}