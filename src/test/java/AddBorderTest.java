import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddBorderTest {

    @Test
    void code() {
        assertArrayEquals(new String[]{"*****", "*abc*", "*ded*", "*****"}, AddBorder.code(new String[]{"abc", "ded"}));
    }
}