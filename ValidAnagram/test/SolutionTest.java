import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void car_and_rac_isAnagram() {
        assertTrue(solution.isAnagram("car", "rac"));
    }

    @Test
    public void differentLengthStringsAreNotAnagram() {
        assertFalse(solution.isAnagram("ert", "wert"));
    }
}