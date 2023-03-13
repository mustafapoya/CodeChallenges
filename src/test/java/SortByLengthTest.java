import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortByLengthTest {

    @Test
    void code() {
        assertArrayEquals(new String[]{"", "a", "zz", "abc", "aaa"}, SortByLength.code(new String[]{"abc", "", "aaa", "a", "zz"}));
    }
}