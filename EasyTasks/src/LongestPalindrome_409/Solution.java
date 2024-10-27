package LongestPalindrome_409;

public class Solution {
    public int longestPalindrome(String s) {
        int[] letters = new int[58];
        for (char c : s.toCharArray()) {
            letters[c - 'A']++;
        }
        int length = 0;
        boolean oddSymbols = false;
        for (int letter : letters) {
            if (letter%2 == 0) {
                length += letter;
            } else {
                if (oddSymbols) {
                    length += (letter - 1);
                } else {
                    length += letter;
                    oddSymbols = true;
                }
            }
        }
        return length;
    }
}
