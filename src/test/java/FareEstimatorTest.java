import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FareEstimatorTest {

    @Test
    void code() {
        assertArrayEquals(new double[]{13.7, 23.1, 28.1, 38},
                FareEstimator.code(30, 7,
                        new double[]{0.2, 0.35, 0.4, 0.45}, new double[]{1.1, 1.8, 2.3, 3.5}));
    }
}