package ransomNote_383;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2Test {

    @Test
    public void testPositive() {
        Solution2 s = new Solution2();
        assertTrue(s.canConstruct("aa", "aab"));
    }

    @Test
    public void testNegative1() {
        Solution2 s = new Solution2();
        assertFalse(s.canConstruct("a", "b"));
    }

    @Test
    public void testNegative2() {
        Solution2 s = new Solution2();
        assertFalse(s.canConstruct("aa", "ab"));
    }

    @Test
    public void testNegative3() {
        Solution2 s = new Solution2();
        assertFalse(s.canConstruct("fihjjjjei", "hjibagacbhadfaefdjaeaebgi"));
    }
}