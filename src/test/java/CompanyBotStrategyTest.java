import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyBotStrategyTest {

    @Test
    void code() {
        assertEquals(4.5, CompanyBotStrategy.code(new int[][]{{3, 1}, {6, 1}, {4, 1}, {5, 1}}));
        assertEquals(5, CompanyBotStrategy.code(new int[][]{{4, 1}, {4, -1}, {0, 0}, {6, 1}}));
        assertEquals(0, CompanyBotStrategy.code(new int[][]{{4, -1}, {0, 0}, {5, -1}}));
    }
}