import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaseInsensitivePalindromeTest {

    @Test
    void code() {
        assertTrue(CaseInsensitivePalindrome.code("AaBaa"));
        assertFalse(CaseInsensitivePalindrome.code("abac"));
    }
}