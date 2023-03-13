import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwitchLightsTest {

    @Test
    void code() {
        assertArrayEquals(new int[]{0, 1, 0, 1, 0}, SwitchLights.code(new int[]{1, 1, 1, 1, 1}));
    }
}