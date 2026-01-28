import java.util.*;

public class Solution1 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> c = new HashMap<>();
        for (int num : nums) {
            c.put(num, c.getOrDefault(num, 0) + 1);
        }
        List<Integer>[] counts = new ArrayList[nums.length];
        for(Map.Entry<Integer, Integer> entry : c.entrySet()) {
            if (counts[entry.getValue()-1] == null) {
                counts[entry.getValue()-1] = new ArrayList<>();
            }
            counts[entry.getValue()-1].add(entry.getKey());
        }
        int i = 0;
        int[] result = new int[k];
        for (int j = counts.length - 1; i < k; j--) {
            if (counts[j] == null) {
                continue;
            }
            for(int el : counts[j]) {
                result[i++] = el;
                if (i == k) {
                    break;
                }
            }
        }
        return result;
    }
}
