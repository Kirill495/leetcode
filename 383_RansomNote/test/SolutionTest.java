import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("testData")
    public void testSolutions(String ransomNome, String magazine, Boolean result) {
        assertEquals(result, new Solution().canConstruct(ransomNome, magazine));
    }

    @ParameterizedTest
    @MethodSource("testData")
    public void testSolutions2(String ransomNome, String magazine, Boolean result) {
        assertEquals(result, new Solution().canConstruct2(ransomNome, magazine));
    }

    private static Stream<Arguments> testData() {
        return Stream.of(Arguments.of("aa", "aab", true),
                Arguments.of("aa", "ab", false),
                Arguments.of("bsadf", "abscdfgrted", true));
    }
}