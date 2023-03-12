import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncrementalBackupsTest {

    @Test
    void code() {
        assertArrayEquals(new int[]{1, 3, 5}, IncrementalBackups.code(461620205,
                    new int[][]{{461620203, 1}, {461620204, 2}, {461620205, 6}, {461620206, 5},
                                 {461620207, 3}, {461620207, 5}, {461620208, 1}}));
    }

}