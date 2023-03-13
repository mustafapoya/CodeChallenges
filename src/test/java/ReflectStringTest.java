import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReflectStringTest {

    @Test
    void code() {
        assertEquals("mznv", ReflectString.code("name"));
    }
}