import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("inputData")
    void numberOfSteps(int num, int steps) {
        assertEquals(steps, new Solution().numberOfSteps(num));
    }

    @ParameterizedTest
    @MethodSource("inputData")
    void numberOfSteps1(int num, int steps) {
        assertEquals(steps, new Solution().numberOfSteps_1(num));
    }

    private static Stream<Arguments> inputData() {
        return Stream.of(Arguments.of(14, 6), Arguments.of(8, 4));
    }
}