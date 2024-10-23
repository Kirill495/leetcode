import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    @ParameterizedTest
    @CsvSource({
            "egg, add, true",
            "paper, title, true",
            "foo, bar, false",
            "badc, baba, false"
    })
    public void stringsShouldBeIsomorphic(String t, String s, boolean result) {
        Solution solution = new Solution();
        if (result) {
            assertTrue(solution.isIsomorphic(t, s));
        } else {
            assertFalse(solution.isIsomorphic(t, s));
        }
    }
}