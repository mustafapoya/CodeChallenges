import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class ShapeAreaTest {

    @Test
    void code() {
        assertEquals(5, ShapeArea.code(2));
        assertEquals(13, ShapeArea.code(3));
    }
}