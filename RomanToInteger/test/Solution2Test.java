import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


class Solution2Test {

    Solution2 solution = new Solution2();
    @ParameterizedTest
    @CsvFileSource(
            files = "test_inputs/input.csv",
            numLinesToSkip = 1, delimiter = ';')
    public void romanToIntTest(int decimal, String romanNumber) {
        assertEquals(decimal, solution.romanToInt(romanNumber));
    }
}