package ransomNote_383;

public class Solution2 {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        int[] magLetters = new int[26];

        for (char letter : magazine.toCharArray()) {
            magLetters[letter - 'a']++;
        }
        for (char letter : ransomNote.toCharArray()) {
            if (magLetters[letter - 'a']-- == 0) {
                return false;
            };
        }
        return true;
    }
}
