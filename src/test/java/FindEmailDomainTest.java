import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindEmailDomainTest {

    @Test
    void code() {
        assertEquals("example.com", FindEmailDomain.code("prettyandsimple@example.com"));
        assertEquals("example.org", FindEmailDomain.code("<>[]:,;@\\\"!#$%&*+-/=?^_{}| ~.a\\\"@example.org"));
    }
}