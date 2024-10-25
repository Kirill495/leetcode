package intersectionOfTwoArrays349;

import java.util.*;

public class Solution3 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> a = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            a.add(nums1[i]);
        }
        Set<Integer> b = new HashSet<>();
        for (int i = 0; i < nums2.length; i++) {
            if (a.contains(nums2[i])) {
                b.add(nums2[i]);
            }
        }
        int[] res = new int[b.size()];

        int i = 0;
        for(int val : b) {
            res[i++] = val;
        }
        return res;
    }
}
