import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertCelsiusToFahrenheitTest {

    @Test
    void code() {
        assertEquals(-22, ConvertCelsiusToFahrenheit.code(-30));
        assertEquals(14, ConvertCelsiusToFahrenheit.code(-10));
        assertEquals(32, ConvertCelsiusToFahrenheit.code(0));
    }
}