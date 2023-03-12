import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DomainTypeTest {

    @Test
    void code() {
        assertArrayEquals(new String[]{"organization", "commercial", "network", "information"},
                DomainType.code(new String[]{"en.wiki.org", "codefights.com", "happy.net", "code.info"}));
    }
}