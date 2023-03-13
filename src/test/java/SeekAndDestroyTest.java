import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeekAndDestroyTest {

    @Test
    void code() {
        assertArrayEquals(new int[]{1}, SeekAndDestroy.code(new int[]{3, 5, 1, 2, 2}, new int[]{2, 3, 5}));
        assertArrayEquals(new int[]{1, 5, 1}, SeekAndDestroy.code(new int[]{1, 2, 3, 5, 1, 2, 3}, new int[]{2, 3}));
    }
}