import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestOfFourTest {

    @Test
    void code() {
        assertArrayEquals(new int[]{5, 27, 39, 1001}, LargestOfFour.code(new int[][]{{4, 5, 1, 3}, {13, 27, 18, 26}, {32, 35, 37, 39}, {1000, 1001, 857, 1}}));
        assertArrayEquals(new int[]{9, 35, 97, 1000000}, LargestOfFour.code(new int[][]{{4, 9, 1, 3}, {13, 35, 18, 26}, {32, 35, 97, 39}, {1000000, 1001, 857, 1}}));
    }
}