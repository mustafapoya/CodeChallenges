import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProperNounCorrectionTest {

    @Test
    void code() {
        assertEquals("Paris", ProperNounCorrection.code("pARiS"));
        assertEquals("John", ProperNounCorrection.code("John"));
    }
}