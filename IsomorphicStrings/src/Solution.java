import java.util.HashMap;
import java.util.Map;

public class Solution {

    public boolean isIsomorphic(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        if (s1.length != t1.length) {
            return false;
        }
        Map<Character, Character> readSymbolsS = new HashMap<>();
        Map<Character, Character> readSymbolsT = new HashMap<>();
        for (int i = 0; i < s1.length; i++) {
            if ((readSymbolsS.containsKey(s1[i]) && readSymbolsS.get(s1[i]) != t1[i])
                || (readSymbolsT.containsKey(t1[i]) && readSymbolsT.get(t1[i]) != s1[i])) {
                return false;
            }
            readSymbolsT.put(t1[i], s1[i]);
            readSymbolsS.put(s1[i], t1[i]);
        }
        return true;
    }
}