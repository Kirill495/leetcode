import java.util.HashSet;
import java.util.Set;

public class SolutionRecursion {
    Set<Integer> sums = new HashSet<>();
    public boolean isHappy(int n) {
        if (n == 1) {
            return true;
        } else if (sums.contains(n)) {
            return false;
        }
        sums.add(n);
        int sum = 0;
        while (n >= 1) {
            int a = n % 10;
            sum += a*a;
            n = (n - a) / 10;
        }

        return isHappy(sum);
    }
}