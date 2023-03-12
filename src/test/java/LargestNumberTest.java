import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestNumberTest {

    @Test
    void code() {
        assertEquals(99, LargestNumber.code(2));
        assertEquals(999, LargestNumber.code(3));
    }
}