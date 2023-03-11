import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlternateSumTest {

    @Test
    void code() {
        assertArrayEquals(new int[]{180, 105}, AlternateSum.code(new int[]{50, 60, 60, 45, 70}));
    }
}