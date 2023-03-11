import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckPalindromeTest {

    @Test
    void code() {
        assertTrue(CheckPalindrome.code("aabaa"));
        assertFalse(CheckPalindrome.code("abac"));
        assertTrue(CheckPalindrome.code("a"));
    }
}