import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PigLatinTest {

    @Test
    void code() {
        assertEquals("oveglay", PigLatin.code("glove"));
        assertEquals("eightway", PigLatin.code("eight"));
    }
}