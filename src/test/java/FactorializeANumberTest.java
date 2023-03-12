import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorializeANumberTest {

    @Test
    void code() {
        assertEquals(120, FactorializeANumber.code(5));
        assertEquals(3628800, FactorializeANumber.code(10));
    }
}