package intersectionOfTwoArrays349;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> numbers = new HashMap<>();
        int val;
        for (int i = 0; i < Math.max(nums1.length, nums2.length); i++) {
            if (i < nums1.length) {
                val = nums1[i];
                if (numbers.containsKey(val)) {
                    numbers.put(val, numbers.get(val) | 1);
                } else {
                    numbers.put(val, 1);
                }
            }
            if (i < nums2.length) {
                val = nums2[i];
                if (numbers.containsKey(val)) {
                    numbers.put(val, numbers.get(val) | 2);
                } else {
                    numbers.put(val, 2);
                }
            }
        }
        return numbers.entrySet().stream().filter(el -> el.getValue() == 3).mapToInt(Map.Entry::getKey).toArray();
    }
}
