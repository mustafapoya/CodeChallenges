import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LateRideTest {

    @Test
    void code() {
        assertEquals(4, LateRide.code(240));
        assertEquals(14, LateRide.code(808));
    }
}