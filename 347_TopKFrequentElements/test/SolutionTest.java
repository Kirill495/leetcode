import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {
    @Test
    public void testSolution() {
        Solution s = new Solution();
        int[] result = s.topKFrequent(new int[]{1,1,1,2,2,3}, 2);
        Set<Integer> set = Arrays.stream(result).boxed().collect(Collectors.toSet());
        assertTrue(set.contains(1));
        assertTrue(set.contains(2));
    }

    @Test
    public void testSolution1() {
        Solution s = new Solution();
        int[] result = s.topKFrequent(new int[]{1}, 1);
        Set<Integer> set = Arrays.stream(result).boxed().collect(Collectors.toSet());
        assertTrue(set.contains(1));
    }

    @Test
    public void testSolution2() {
        Solution s = new Solution();
        int[] result = s.topKFrequent(new int[]{1,2,1,2,1,2,3,1,3,2}, 2);
        Set<Integer> set = Arrays.stream(result).boxed().collect(Collectors.toSet());
        assertTrue(set.contains(1));
        assertTrue(set.contains(2));
    }
}