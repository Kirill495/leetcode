import java.util.*;

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> vals = new HashMap<>();
        TreeMap<Integer, Set<Integer>> counts = new TreeMap<>();
        for (int num : nums) {
            if (vals.containsKey(num)) {
                int count = vals.get(num);
                counts.get(count).remove(num);
                count++;
                vals.put(num,  count);
                counts.putIfAbsent(count, new HashSet<>());
                counts.get(count).add(num);
            } else {
                vals.put(num, 1);
                counts.putIfAbsent(1, new HashSet<>());
                counts.get(1).add(num);
            }
        }
        int i = 0;
        int[] result = new int[k];
        for (Map.Entry<Integer, Set<Integer>> entry : counts.descendingMap().entrySet()) {
            for (int j :entry.getValue()) {
                result[i++] = j;
                if (i == k) {
                    return result;
                }
            }
        }
        return result;
    }
}
