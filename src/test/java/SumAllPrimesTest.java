import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumAllPrimesTest {

    @Test
    void code() {
        assertEquals(17, SumAllPrimes.code(10));
        assertEquals(73156, SumAllPrimes.code(977));
    }
}