import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortByHeightTest {

    @Test
    void code() {
        assertArrayEquals(new int[]{-1, 150, 160, 170, -1, -1, 180, 190},
                            SortByHeight.code(new int[]{-1, 150, 190, 170, -1, -1, 160, 180}));
    }
}