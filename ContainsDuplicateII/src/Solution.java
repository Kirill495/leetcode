import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Set<Integer> content = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                content.remove(nums[i - k - 1]);
            }
            if (content.contains(nums[i])) {
                return true;
            }
            content.add(nums[i]);
        }

        return false;
    }
}