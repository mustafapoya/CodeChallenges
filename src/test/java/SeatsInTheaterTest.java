import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeatsInTheaterTest {

    @Test
    void code() {
        assertEquals(96, SeatsInTheater.code(16, 11, 5, 3));
    }
}