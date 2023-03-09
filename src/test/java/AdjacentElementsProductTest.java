import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdjacentElementsProductTest {

    @Test
    void code() {
        assertEquals(21, AdjacentElementsProduct.code(new int[]{3, 6, -2, -5, 7, 3}));
    }
}