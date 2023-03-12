import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlattenArrayTest {

    @Test
    void code() {
        assertArrayEquals(new Object[]{"a", "b"}, FlattenArray.code(new Object[][]{{"a"}, { "b"}}));
    }
}