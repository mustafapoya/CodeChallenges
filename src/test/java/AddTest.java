import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTest {

    @Test
    void code() {
        assertEquals(3, Add.code(1, 2));
        assertEquals(5, Add.code(3, 2));
    }

    @Test
    void code2() {
        assertEquals(15, Add.code2(1, 2, 3, 4, 5));
        assertEquals(5, Add.code2(3, 2));
    }
}