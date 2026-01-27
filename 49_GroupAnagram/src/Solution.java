import java.util.*;

public class Solution {
    public List<List<String>> groupAnagram(String[] strs) {
        Map<Map<Character, Integer>, List<String>> a = new HashMap<>();
        for(String str : strs) {
            Map<Character, Integer> strStat = buildStat(str);
            if (a.containsKey(strStat)) {
                a.get(strStat).add(str);
            } else {
                List<String> b = new ArrayList<>();
                b.add(str);
                a.put(strStat, b);
            }
        }
        return a.values().stream().toList();
    }

    private Map<Character, Integer> buildStat(String str) {
        Map<Character, Integer> stat = new HashMap<>();
        for (char c : str.toCharArray()) {
            stat.put(c, stat.getOrDefault(c, 0) + 1);
        }
        return stat;
    }
}
