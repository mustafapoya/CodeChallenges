import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChunkyMonkeyTest {

    @Test
    void code() {
        assertArrayEquals(new Object[][]{{"a", "b"}, {"c", "d"}}, ChunkyMonkey.code(new Object[]{"a", "b", "c", "d"}, 2));
        assertArrayEquals(new Object[][]{{0, 1, 2, 3}, {4, 5}}, ChunkyMonkey.code(new Object[]{0, 1, 2, 3, 4, 5}, 4));
    }
}