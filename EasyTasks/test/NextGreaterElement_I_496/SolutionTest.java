package NextGreaterElement_I_496;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void nextGreaterElement1() {
        int[] nums1 = new int[] {2,4};
        int[] nums2 = new int[] {1,2,3,4};
        int[] res = new int[]{3, -1};
        Solution s = new Solution();
        assertArrayEquals(res, s.nextGreaterElement(nums1, nums2));
    }

    @Test
    public void nextGreaterElement2() {
        int[] nums1 = new int[] {4,1,2};
        int[] nums2 = new int[] {1,3,4,2};
        int[] res = new int[]{-1,3,-1};
        Solution s = new Solution();
        assertArrayEquals(res, s.nextGreaterElement(nums1, nums2));
    }
}