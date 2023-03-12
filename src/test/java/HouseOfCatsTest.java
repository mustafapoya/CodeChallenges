import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseOfCatsTest {

    @Test
    void code() {
        assertArrayEquals(new int[]{1, 3}, HouseOfCats.code(6));
        assertArrayEquals(new int[]{1}, HouseOfCats.code(2));
    }
}