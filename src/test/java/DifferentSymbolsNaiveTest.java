import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DifferentSymbolsNaiveTest {

    @Test
    void code() {
        assertEquals(3, DifferentSymbolsNaive.code("cabca"));
    }
}