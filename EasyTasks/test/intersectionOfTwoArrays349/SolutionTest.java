package intersectionOfTwoArrays349;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void testIntersection1() {
        Solution s = new Solution();
        int[] a = new int[] {1,2,2,1};
        int[] b = new int[]{2, 2};
        assertArrayEquals(new int[]{2}, s.intersection(a, b));
    }

    @Test
    public void testIntersection2() {
        Solution s = new Solution();
        int[] a = new int[] {4,9,5};
        int[] b = new int[] {9,4,9,8,4};
        int[] res = s.intersection(a, b);
        Arrays.sort(res);
        assertArrayEquals(new int[]{4,9}, res);
    }

}