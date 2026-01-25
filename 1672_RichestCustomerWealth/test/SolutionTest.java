import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("provideTestData")
    public void testMaximumWealth(int[][] inputData, int expected) {
        int result = new Solution().maximumWealth(inputData);
        assertEquals(expected, result);
	}

	private static Stream<Arguments> provideTestData() {
		return Stream.of(
				arguments(new int[][]{{10, 15, 10}, {20, 1, 0}, {12, 23, 2}}, 37),
				arguments(new int[][]{{1, 5, 2}, {2, 7, 8}, {6, 3, 9}}, 18)
		);
	}

}