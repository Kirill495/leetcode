package FindAllNumbersDisappearedInAnArray;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    public void findDisappearedNumbersTest1() {
        int[] nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> output = List.of(5, 6);
        Solution s = new Solution();
        List<Integer> res = s.findDisappearedNumbers(nums);
        assertEquals(output, res);
    }

    @Test
    public void findDisappearedNumbersTest2() {
        int[] nums = new int[]{1, 1};
        List<Integer> output = List.of(2);
        Solution s = new Solution();
        List<Integer> res = s.findDisappearedNumbers(nums);
        assertEquals(output, res);
    }
}