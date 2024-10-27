package ransomNote_383;

import java.util.Arrays;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] noteLetters = ransomNote.toCharArray();
        char[] magazineLetters = magazine.toCharArray();
        if (noteLetters.length > magazine.length()) {
            return false;
        }
        Arrays.sort(noteLetters);
        Arrays.sort(magazineLetters);

        int i = 0;
        for (int j = 0; i < noteLetters.length && j < magazineLetters.length;) {
            if (noteLetters[i] == magazineLetters[j]) {
                i++;
                j++;
            } else if (noteLetters[i] > magazineLetters[j]) {
                j++;
            } else {
                return false;
            }
        }
        return i == noteLetters.length;
    }
}
