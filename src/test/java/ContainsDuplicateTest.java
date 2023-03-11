import com.sun.source.tree.AssertTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {

    @Test
    void code() {
        assertTrue(ContainsDuplicate.code(new int[]{1, 2, 3, 1}));
        assertFalse(ContainsDuplicate.code(new int[]{3, 1}));

    }
}