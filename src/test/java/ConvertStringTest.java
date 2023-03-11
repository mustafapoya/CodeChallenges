import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertStringTest {

    @Test
    void code() {
        assertTrue(ConvertString.code("ceoydefthf5iyg5h5yts", "codefights"));
        assertFalse(ConvertString.code("addbyca", "abcd"));
    }
}