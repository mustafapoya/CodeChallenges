import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsCloseNumsTest {

    @Test
    void code() {
        assertTrue(ContainsCloseNums.code(new int[]{0, 1, 2, 3, 5, 2}, 3));
        assertTrue(ContainsCloseNums.code(new int[]{0, 1, 2, 3, 5, 2}, 2));
    }
}