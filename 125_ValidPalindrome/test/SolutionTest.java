import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    Solution s = new Solution();
    @ParameterizedTest
    @MethodSource("testData")
    public void testCase1(boolean result, String testString) {
        assertEquals(result, s.isPalindrome(testString));
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(true, "A man, a plan, a canal: Panama"),
                Arguments.of(false, "race a car"),
                Arguments.of(true, " "),
                Arguments.of(true, ",."),
                Arguments.of(false, "0P")
        );
    }
}