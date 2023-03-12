import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncorrectPasswordAttemptsTest {

    @Test
    void code() {
        assertTrue(IncorrectPasswordAttempts.code("1111", new String[]{"1111", "4444", "9999", "3333", "8888", "2222", "7777", "0000", "6666", "7285","5555", "1111"}));
    }
}