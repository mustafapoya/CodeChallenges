import org.junit.jupiter.api.Test;

import javax.swing.text.html.HTML;

import static org.junit.jupiter.api.Assertions.*;

class HtmlEndTagByStartTagTest {

    @Test
    void code() {
        assertEquals("</button>", HtmlEndTagByStartTag.code("<button type='button' disabled>"));
        assertEquals("</i>", HtmlEndTagByStartTag.code("<i>"));
    }
}