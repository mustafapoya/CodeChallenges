import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncloseInBracketsTest {

    @Test
    void code() {
        assertEquals("(abacaba)", EncloseInBrackets.code("abacaba"));
    }
}