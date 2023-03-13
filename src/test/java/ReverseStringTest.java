import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @Test
    void code() {
        assertEquals("olleh", ReverseString.code("hello"));
        assertEquals("ydwoH", ReverseString.code("Howdy"));
    }
}