import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Map<Character, Integer> counts = new HashMap<>();
        for (int i = 0; i < s1.length; i++) {
            counts.put(s1[i], counts.getOrDefault(s1[i], 0) + 1);
            counts.put(t1[i], counts.getOrDefault(t1[i], 0) - 1);
        }
        return counts.values().stream().noneMatch(x -> x != 0);
    }
}
