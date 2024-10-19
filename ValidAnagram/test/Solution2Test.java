import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2Test {

    Solution2 solution = new Solution2();

    @Test
    void isAnagram1() {
        assertTrue(solution.isAnagram("car", "rac"));
    }

    @Test
    void isAnagram2() {
        assertFalse(solution.isAnagram("carh", "race"));
    }
}