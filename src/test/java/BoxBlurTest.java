import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoxBlurTest {

    @Test
    void code() {
        assertArrayEquals(new double[][]{{1.0}}, BoxBlur.code(new int[][]{{1, 1, 1}, {1, 7, 1}, {1, 1, 1}}));
    }
}