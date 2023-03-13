import org.junit.jupiter.api.Test;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

import static org.junit.jupiter.api.Assertions.*;

class ProCategorizationTest {

    @Test
    void code() {
        assertEquals("{House cleaning=[Jack, Maria], Computer lessons=[Leon, Maria], Data recovery service=[Leon], Computer repair=[Jack, Leon], Handyman=[Jack]}",

                ProCategorization.code(
                        new String[]{"Jack", "Leon", "Maria"},
                        new String[][]{
                                {"Computer repair", "Handyman", "House cleaning"},
                                {"Computer lessons", "Computer repair", "Data recovery service"},
                                {"Computer lessons", "House cleaning"}}
                ));
    }
}