import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstNotRepeatingCharacterTest {

    @Test
    void code() {
        assertEquals('c', FirstNotRepeatingCharacter.code("abacabad"));
        assertEquals('_', FirstNotRepeatingCharacter.code("abacabaabacaba"));
    }
}