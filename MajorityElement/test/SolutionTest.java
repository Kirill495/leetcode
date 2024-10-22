import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void calcMajorFrequencyElement() {
        int[] nums = new int[]{2, 2, 1, 1, 1, 2, 2};
        Solution s = new Solution();
        assertEquals(2, s.majorityElement(nums));
    }

}