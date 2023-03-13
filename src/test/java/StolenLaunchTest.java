import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StolenLaunchTest {

    @Test
    void code() {
        assertEquals("you'll never guess it: 2390", StolenLaunch.code("you'll n4v4r 6u4ss 8t: cdja"));
    }
}