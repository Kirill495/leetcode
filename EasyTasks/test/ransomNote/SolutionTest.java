package ransomNote;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void testPositive() {
        Solution s = new Solution();
        assertTrue(s.canConstruct("aa", "aab"));
    }

    @Test
    public void testNegative1() {
        Solution s = new Solution();
        assertFalse(s.canConstruct("a", "b"));
    }

    @Test
    public void testNegative2() {
        Solution s = new Solution();
        assertFalse(s.canConstruct("aa", "ab"));
    }

    @Test
    public void testNegative3() {
        Solution s = new Solution();
        assertFalse(s.canConstruct("fihjjjjei", "hjibagacbhadfaefdjaeaebgi"));
    }
}