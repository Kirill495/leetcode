package KeyboardRow;

import java.util.*;

public class Solution {
    private static final List<Set<Character>> KEYBOARD_LINES = new ArrayList<>();
    static {
        KEYBOARD_LINES.add(Set.of('q','w','e','r','t','y','u','i','o','p','Q','W','E','R','T','Y','U','I','O','P'));
        KEYBOARD_LINES.add(Set.of('a','s','d','f','g','h','j','k','l','A','S','D','F','G','H','J','K','L'));
        KEYBOARD_LINES.add(Set.of('z', 'x', 'c', 'v', 'b', 'n', 'm', 'Z', 'X', 'C', 'V', 'B', 'N', 'M'));
    }

    public String[] findWords(String[] words) {

        List<String> result = getStrings(words);
        return result.toArray(new String[0]);
    }

    private static List<String> getStrings(String[] words) {
        List<String> result = new ArrayList<>();
        word :
        for (String word : words) {
            Set<Character> line = null;
            for (Set<Character> currentLine : KEYBOARD_LINES) {
                if (currentLine.contains(word.charAt(0))) {
                    line = currentLine;
                    break;
                }
            }
            if (line == null) {
                break;
            }

            for (char c : word.toCharArray()) {
                if (!line.contains(c)) {
                    continue word;
                }
            }
            result.add(word);
        }
        return result;
    }

}
