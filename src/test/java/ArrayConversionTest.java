import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayConversionTest {

    @Test
    void code() {
        assertEquals(186, ArrayConversion.code(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
    }
}