import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void checkContaintsDuplicate() {
        Main m = new Main();
        assertTrue(m.containsDuplicate(new int[]{1, 2, 3, 1}));
        assertFalse(m.containsDuplicate(new int[]{1, 2, 3, 4}));
    }

}