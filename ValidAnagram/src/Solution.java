public class Solution {
    public boolean isAnagram(String s, String t) {
        int [] count = new int[26];
        byte init = (byte) 'a';
        byte[] s1 = s.getBytes();
        byte[] t1 = t.getBytes();
        for (int i = 0; i < s.length(); i++) {
            count[s1[i] - init]++;
            count[t1[i] - init]--;
        }
        for (int b : count) {
            if (b != 0) {
                return false;
            }
        }
        return true;
    }
}