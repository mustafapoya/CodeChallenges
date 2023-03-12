import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsTandemRepeatTest {

    @Test
    void code() {
        assertTrue(IsTandemRepeat.code("tandemtandem"));
        assertFalse(IsTandemRepeat.code("qqq"));
        assertFalse(IsTandemRepeat.code("2w2ww"));
    }
}