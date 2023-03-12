import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FermactorTest {

    @Test
    void code() {
        assertArrayEquals(new int[]{4, 1}, Fermactor.code(15));
    }
}