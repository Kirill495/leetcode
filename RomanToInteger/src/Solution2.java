import java.util.Map;

public class Solution2 {

    private static final Map<Character, Integer> ROMAN_NUMBERS =
            Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);

    public int romanToInt(String s) {

        char currentChar;
        int currentNumber, prevNumber = 0, total = 0;
        char[] s1 = s.toCharArray();
        for (int i = s.length() - 1; i >= 0; i--) {
            currentChar = s1[i];
            currentNumber = ROMAN_NUMBERS.get(currentChar);
            if (currentNumber < prevNumber) {
                total -= currentNumber;
            } else {
                total += currentNumber;
            }
            prevNumber = currentNumber;
        }

        return total;
    }
}
