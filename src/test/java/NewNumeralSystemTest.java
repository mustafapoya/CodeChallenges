import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NewNumeralSystemTest {

    @Test
    void code() {
        assertArrayEquals(new String []{"A + G", "B + F", "C + E", "D + D"}, NewNumeralSystem.code("G"));
    }
}