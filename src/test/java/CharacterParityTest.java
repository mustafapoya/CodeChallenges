import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterParityTest {

    @Test
    void code() {
        assertEquals("odd", CharacterParity.code('5'));
        assertEquals("even", CharacterParity.code('8'));
        assertEquals("not a digit", CharacterParity.code('q'));
    }
}