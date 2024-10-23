import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {
    @Test
    public void arrayContainsCloseDuplicates1() {
        Solution s = new Solution();
        assertTrue(s.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
    }

    @Test
    public void arrayContainsCloseDuplicates2() {
        Solution s = new Solution();
        assertTrue(s.containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1));
    }

    @Test
    public void arrayContainsCloseDuplicates4() {
        Solution s = new Solution();
        assertFalse(s.containsNearbyDuplicate(new int[]{1,2,3,1,2,3}, 2));
    }
}