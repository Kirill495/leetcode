package longestHarmoniousSubsequence_594;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> vals = new HashMap<>();
        for (int val : nums) {
            vals.put(val, vals.getOrDefault(val, 0) + 1);
        }
        int maxLength = 0;
        for (Map.Entry<Integer, Integer> el : vals.entrySet()) {
            if ( vals.containsKey(el.getKey() + 1) && maxLength < el.getValue() + vals.get(el.getKey() + 1)) {
                maxLength = el.getValue() + vals.get(el.getKey() + 1);
            }
        }
        return maxLength;
    }
}
