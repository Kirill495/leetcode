import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution2 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        List<Integer>[] popular = new List[nums.length];
        for (Map.Entry<Integer, Integer> e : count.entrySet()) {
            if (popular[e.getValue() - 1] == null) {
                popular[e.getValue() - 1] = new ArrayList<>();
            }
            popular[e.getValue() - 1].add(e.getKey());
        }
        int[] result = new int[k];
        int i = 0;
        for(int j = popular.length - 1; i < k; j--) {
            if (popular[j] != null) {
                for (int l = 0; l < popular[j].size() && i < k; l++) {
                    result[i++] = popular[j].get(l);
                }
            }
        }
        return result;
    }
}
