import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExtractEachKthTest {

    @Test
    void code() {
        assertArrayEquals(new int[]{1, 2, 4, 5, 7, 8, 10},
                ExtractEachKth.code(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 3));
    }
}