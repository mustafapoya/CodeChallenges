import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AllLongestStringTest {

    @Test
    void code() {
        assertArrayEquals(new String[]{"aba", "vcd", "aba"}, AllLongestString.code(new String[]{"aba", "aa", "ad", "vcd", "aba"}));
    }
}