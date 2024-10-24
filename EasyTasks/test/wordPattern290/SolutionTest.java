package wordPattern290;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {
    @ParameterizedTest
    @CsvSource({
        "abba, dog cat cat dog, true",
        "abba, dog dog dof dog, false",
        "abba, dog cat cat fish, false"
    })
    public void testWordPattern(String pattern, String str, boolean res) {
        Solution s = new Solution();
        if (res) {
            assertTrue(s.wordPattern(pattern, str));
        } else {
            assertFalse(s.wordPattern(pattern, str));
        }
    }

}