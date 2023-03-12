import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingLettersTest {

    @Test
    void code() {
        assertEquals("a", MissingLetters.code("bce"));
        assertEquals("d", MissingLetters.code("abce"));
        assertEquals("i", MissingLetters.code("abcdefghjklmno"));
        assertEquals(null, MissingLetters.code("abcdefghijklmnopqrstuvwxyz"));
    }
}