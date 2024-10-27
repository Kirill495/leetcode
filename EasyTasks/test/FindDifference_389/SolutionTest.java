package FindDifference_389;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
    @ParameterizedTest
    @CsvSource(value = {
            "abcd, abcde, e",
            "'',y, y"
    })
    public void findTheDifferenceTest(String s, String t, char c) {
        Solution solution = new Solution();
        Assertions.assertEquals(c, solution.findTheDifference(s, t));
    }

}