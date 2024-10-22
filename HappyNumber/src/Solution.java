import java.util.HashSet;
import java.util.Set;

public class Solution {

    public boolean isHappy(int n) {

        int currentSum = 0;
        Set<Integer> sums = new HashSet<>();

        while (true) {
            currentSum = 0;
            while (n > 0) {
                int val = n % 10;
                n = (n - val) / 10;
                currentSum += val * val;
            }
            if (currentSum == 1) {
                return true;
            } else {
                if (sums.contains(currentSum)) {
                    return false;
                } else {
                    sums.add(currentSum);
                    n = currentSum;
                }
            }
        }

    }
}
