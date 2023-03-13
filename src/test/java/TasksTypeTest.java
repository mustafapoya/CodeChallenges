import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TasksTypeTest {

    @Test
    void code() {
        assertArrayEquals(new int[]{2, 3, 0}, TasksType.code(new int[]{1, 2, 3, 4, 5}, 2));

    }
}