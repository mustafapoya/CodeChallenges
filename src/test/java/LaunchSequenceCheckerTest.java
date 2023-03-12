import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LaunchSequenceCheckerTest {

    @Test
    void code() {
        assertTrue(LaunchSequenceChecker.code(
                new String[]{"stage_1", "stage_2", "dragon", "stage_1", "stage_2", "dragon"},
                new int[]{1, 10, 11, 2, 12, 111}));

        assertFalse(LaunchSequenceChecker.code(
                new String[]{"stage_1", "stage_1", "stage_2", "dragon"},
                new int[]{2, 1, 12, 111}));
    }
}