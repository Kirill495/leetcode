import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] toSum_(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }

    public int[] toSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int val = target - nums[i];
            int ind = map.getOrDefault(val,-1);
            if (ind >=0) {
                return (i > ind) ? new int[]{ind, i} : new int[]{i, ind};
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }
}
