import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChessBoardCellColorTest {

    @Test
    void code() {
        assertTrue(ChessBoardCellColor.code("a1", "c3"));
        assertFalse(ChessBoardCellColor.code("a1", "h3"));
    }
}