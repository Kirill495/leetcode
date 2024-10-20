import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "3, III",
            "58, LVIII",
            "44, XLIV",
            "1994, MCMXCIV"
    })
    public void convertInput(int decimal, String romanNumber) {
        assertEquals(decimal, solution.romanToInt(romanNumber));
    }

}