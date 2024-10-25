package intersectionOfTwoArrays349;

import java.util.*;

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> numbers1 = new HashMap<>();
        Map<Integer, Integer> numbers2 = new HashMap<>();
        for (int i = 0; i < Math.max(nums1.length, nums2.length); i++) {
            if (i < nums1.length) {
                int num1 = nums1[i];
                numbers1.put(num1, numbers1.getOrDefault(num1, 0) + 1);
            }
            if (i < nums2.length) {
                int num2 = nums2[i];
                numbers2.put(num2, numbers2.getOrDefault(num2, 0) + 1);
            }
        }
        List<Integer> res = new ArrayList<>();
        for (Map.Entry<Integer, Integer> el : numbers1.entrySet()) {
            if (numbers2.containsKey(el.getKey())) {
                res.add(el.getKey());
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
