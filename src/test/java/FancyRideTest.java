import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FancyRideTest {

    @Test
    void code() {
        assertEquals("UberXL", FancyRide.code(30, new double[]{0.3, 0.5, 0.7, 1, 1.3}));
    }
}