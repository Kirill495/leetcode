package wordPattern290;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public boolean wordPattern(String pattern, String s) {
        char[] patternSymbols = pattern.toCharArray();
        String[] words = s.split(" ");
        if (words.length != patternSymbols.length) {
            return false;
        }
        Map<Character, String> symbolsMapping = new HashMap<>();
        Set<String> processedWords = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            int j = i % patternSymbols.length;
            if (!processedWords.contains(words[i])) {
                symbolsMapping.putIfAbsent(patternSymbols[j], words[i]);
                processedWords.add(words[i]);
            }
            if (!symbolsMapping.containsKey(patternSymbols[j])
                || !symbolsMapping.get(patternSymbols[j]).equals(words[j])) {
                return false;
            }

        }
        return true;
    }
}
