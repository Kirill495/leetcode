package firstUniqueCharacterInaString_387;

public class FirstUniqueCharacterInAStringSolution {
    public int firstUniqueChar(String s) {
        int[] letters = new int[26];
        char[] symbols = s.toCharArray();
        for (char c : symbols) {
            letters[c - 'a']++;
        }
        for (int i = 0; i < symbols.length; i++) {
            if (letters[symbols[i] - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
