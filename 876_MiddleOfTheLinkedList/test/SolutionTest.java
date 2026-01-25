import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("generateInputs")
    public void middleNode(int middleVal, String input) {
        int[] inputVals = Stream.of(input.split(", "))
                .mapToInt(Integer::parseInt).toArray();
        Solution.ListNode node = generateNodes(inputVals);
        assertEquals(middleVal, new Solution().middleNode(node).val);
    }

    private static Stream<Arguments> generateInputs() {
        return Stream.of(
                Arguments.of(3, "1, 2, 3, 4, 5"),
                Arguments.of(4, "1, 2, 3, 4, 5, 6")
        );
    }

    Solution.ListNode generateNodes(int... vals) {
        Solution.ListNode next = null;
        for (int i = vals.length - 1; i >= 0; i--) {
            next = new Solution.ListNode(vals[i], next);
        }
        return next;
    }
}