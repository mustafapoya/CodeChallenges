import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayPreviousLessTest {

    @Test
    void code() {
        assertArrayEquals(new int[]{-1, 3, -1, 2, 4}, ArrayPreviousLess.code(new int[]{3, 5, 2, 4, 5}));
    }
}