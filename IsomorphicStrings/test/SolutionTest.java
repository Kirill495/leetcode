import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    @ParameterizedTest

    @CsvFileSource(files = "test_input/input.csv", delimiter = ',', numLinesToSkip = 1)
    public void stringsShouldBeIsomorphic(String t, String s, boolean result) {
        Solution solution = new Solution();
        if (result) {
            assertTrue(solution.isIsomorphic(t, s));
        } else {
            assertFalse(solution.isIsomorphic(t, s));
        }
    }
}