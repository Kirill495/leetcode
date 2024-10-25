package intersectionOfTwoArrays349;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Solution3Test {
    @Test
    public void testIntersection1() {
        Solution3 s = new Solution3();
        int[] a = new int[] {1,2,2,1};
        int[] b = new int[]{2, 2};
        assertArrayEquals(new int[]{2}, s.intersection(a, b));
    }

    @Test
    public void testIntersection2() {
        Solution3 s = new Solution3();
        int[] a = new int[] {4,9,5};
        int[] b = new int[] {9,4,9,8,4};
        int[] res = s.intersection(a, b);
        Arrays.sort(res);
        assertArrayEquals(new int[]{4,9}, res);
    }
}