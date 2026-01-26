import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Long> letters = magazine.chars().mapToObj(c -> (Character)((char) c)).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        for(char letter : ransomNote.toCharArray()) {
            if (letters.getOrDefault(letter, 0L) <= 0) {
                return false;
            }
            letters.put(letter, letters.get(letter) - 1);
        }
        return true;
    }

    public boolean canConstruct2(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        int[] letters = new int[26];
        for (char letter : magazine.toCharArray()) {
            letters[letter - 'a']++;
        }
        for(char letter : ransomNote.toCharArray()) {
            if (letters[letter - 'a'] == 0) {
                return false;
            }
            letters[letter - 'a']--;
        }
        return true;
    }
}
