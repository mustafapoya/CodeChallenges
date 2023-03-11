import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayChangeTest {

    @Test
    void code() {
        assertEquals(3, ArrayChange.code(new int[]{1, 1, 1}));
    }
}