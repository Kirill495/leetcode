public class Solution2 {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] symbolsS = new int[256];
        int[] symbolsT = new int[256];

        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        for(int i = 0; i < s1.length; i++) {
            if (symbolsS[s1[i]] != symbolsT[t1[i]]) {
                return false;
            }
            symbolsS[s1[i]] = i + 1;
            symbolsT[t1[i]] = i + 1;
        }
        return true;
    }
}
