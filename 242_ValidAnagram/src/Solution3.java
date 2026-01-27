import java.util.HashMap;
import java.util.Map;

public class Solution3 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> count = new HashMap<>();
        for (char c : s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            int val = count.getOrDefault(c, 0) - 1;
            if (val < 0) {
                return false;
            }
            count.put(c, val);
        }
        return true;
    }
}
