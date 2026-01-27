

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Solution3Test {

    Solution3 solution = new Solution3();

    @Test
    public void car_and_rac_isAnagram() {
        assertTrue(solution.isAnagram("car", "rac"));
    }

    @Test
    public void differentLengthStringsAreNotAnagram() {
        assertFalse(solution.isAnagram("ert", "wert"));
    }
}