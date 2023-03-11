import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompareRangesTest {

    @Test
    void code() {
        assertArrayEquals(new String[]{"-1->2", "6->7", "9"}, CompareRanges.code(new int[]{-1, 0, 1, 2, 6, 7, 9}));
        assertArrayEquals(new String[]{"1->3", "5->8", "10->12"}, CompareRanges.code(new int[]{1, 2, 3, 5, 6, 7, 8, 10, 11, 12}));

    }
}