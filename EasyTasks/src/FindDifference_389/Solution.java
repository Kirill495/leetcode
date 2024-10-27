package FindDifference_389;

public class Solution {
    public char findTheDifference(String s, String t) {
        int[] symbols = new int[26];
        char[] t1 = t.toCharArray();
        for (char symbol : t1) {
            symbols[symbol - 'a']++;
        }
        for (char symbol : s.toCharArray()) {
            symbols[symbol - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (symbols[i] > 0) {
                return (char) ('a' + i);
            }
        }
        return ' ';
    }
}
