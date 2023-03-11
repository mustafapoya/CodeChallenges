import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CenturyFromYearTest {

    @Test
    void code() {
        assertEquals(20, CenturyFromYear.code(1905));
        assertEquals(17, CenturyFromYear.code(1700));
    }
}