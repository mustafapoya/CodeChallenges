import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOddFibonacciNumsTest {

    @Test
    void code() {
        assertEquals(10, SumOddFibonacciNums.code(10));
        assertEquals(1785, SumOddFibonacciNums.code(1000));
        assertEquals(4613732, SumOddFibonacciNums.code(4000000));
    }
}