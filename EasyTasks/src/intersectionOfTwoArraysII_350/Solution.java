package intersectionOfTwoArraysII_350;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> n1 = new HashMap<>();

        for (int num : nums1) {
            n1.put(num, n1.getOrDefault(num, 0) + 1);
        }
        List<Integer> a = new ArrayList<>();
        for (int num : nums2) {
            if (n1.getOrDefault(num, 0) != 0) {
                a.add(num);
                n1.put(num, n1.get(num) - 1);
            }
        }
        int[] res = new int[a.size()];
        for (int i = 0; i < a.size(); i++) {
            res[i] = a.get(i);
        }
        return res;
//        return a.stream().mapToInt(Integer::intValue).toArray();
    }
}
