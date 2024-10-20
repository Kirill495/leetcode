import java.util.Map;

public class Solution {

    private final Map<Character, Integer> ONE_LETTER_NUMBERS = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);
    private final Map<String, Integer> TWO_LETTERS_NUMBERS = Map.of("IV", 4, "IX", 9, "XL", 40, "XC", 90, "CD", 400, "CM", 900);
    
    
    public int romanToInt(String s) {
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            int lengthOfSubstring = (i + 1 < s.length()) ? 2 : 1;

            String part = s.substring(i, i + lengthOfSubstring);
            int currentNumber = TWO_LETTERS_NUMBERS.getOrDefault(part, 0);
            if (currentNumber == 0) {
                char symbol = part.toCharArray()[0];
                total += ONE_LETTER_NUMBERS.getOrDefault(symbol, 0);
            } else {
                total += currentNumber;
                i++;
            }
        }
        return total;
    }
}