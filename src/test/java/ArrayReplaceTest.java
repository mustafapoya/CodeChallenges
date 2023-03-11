import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayReplaceTest {

    @Test
    void code() {
        assertArrayEquals(new int []{3, 2, 3}, ArrayReplace.code(new int[]{1, 2, 1}, 1, 3));
    }
}