import java.util.HashSet;
import java.util.Set;

public class Main {
    public boolean containsDuplicate(int [] nums) {
        Set<Integer> n = new HashSet<>();
        for(int i : nums) {
            if (!n.add(i)) {
                return true;
            }
        }
        return false;
    }
}