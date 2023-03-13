import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RatingThresholdTest {

    @Test
    void code() {
        assertArrayEquals(new int[]{1}, RatingThreshold.code(3.5, new int[][]{ {3, 4}, {3, 3, 3, 4}, {4}}));
    }
}