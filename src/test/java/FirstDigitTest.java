import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class FirstDigitTest {

    @Test
    void code() {
        assertEquals(1, FirstDigit.code("var_1_Int"));
        assertEquals(2, FirstDigit.code("q2q-q"));
        assertEquals(0, FirstDigit.code("0ss"));
    }
}