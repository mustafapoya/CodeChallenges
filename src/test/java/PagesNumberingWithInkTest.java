import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PagesNumberingWithInkTest {

    @Test
    void code() {
        assertEquals(5, PagesNumberingWithInk.code(1, 5));
        assertEquals(22, PagesNumberingWithInk.code(21, 5));
        assertEquals(10, PagesNumberingWithInk.code(8, 4));
    }
}