import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepositProfitTest {

    @Test
    void code() {
        assertEquals(3, DepositProfit.code(100, 20, 170));
    }
}