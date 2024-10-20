import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyHashSetTest {

    MyHashSet set;

    @BeforeEach
    public void tuneTheTest() {
        set = new MyHashSet();
    }

    @AfterEach
    public void deTuneTheTest() {
        set = null;
    }

    @Test
    public void addAndRemoveOrdinaryNumber() {

        int number = 100;
        assertFalse(set.contains(number));
        set.add(number);
        assertTrue(set.contains(number));
        set.remove(number);
        assertFalse(set.contains(number));
    }

    @Test
    public void addAndRemoveZero() {
        int number = 0;
        assertFalse(set.contains(number));
        set.add(number);
        assertTrue(set.contains(number));
        set.remove(number);
        assertFalse(set.contains(number));
    }

    @Test
    public void addAndRemoveMillionOfNumbers() {
        for (int i = 0; i < 1_000_000; i++) {
            set.add(i);
        }
        for (int i = 0; i < 1_000_000; i++) {
            assertTrue(set.contains(i));
        }
        for (int i = 0; i < 1_000_000; i++) {
            set.remove(i);
        }
        for (int i = 0; i < 1_000_000; i++) {
            assertFalse(set.contains(i));
        }
    }


}