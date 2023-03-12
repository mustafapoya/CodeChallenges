import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElectionWinnerTest {

    @Test
    void code() {
        assertEquals(2, ElectionWinner.code(new int[]{2, 3, 5, 2}, 3));
    }
}