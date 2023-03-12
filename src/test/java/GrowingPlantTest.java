import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrowingPlantTest {

    @Test
    void code() {
        assertEquals(10, GrowingPlant.code(100, 10, 910));
    }
}