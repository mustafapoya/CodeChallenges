import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeRearrangingTest {

    @Test
    void code() {
        assertTrue(PalindromeRearranging.code("aabb"));
        assertTrue(PalindromeRearranging.code("aacbb"));
    }
}