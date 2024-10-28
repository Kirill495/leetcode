package longestHarmoniousSubsequence_594;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @ParameterizedTest
    @CsvSource({
            "1 3 2 2 5 2 3 7, 5",
            "1 2 3 4, 2",
            "1 1 1 1, 0",
            "1 1 1 1 1 1 1 1 0, 9"
    })
    void testFindLHS(String inputStr, int resLength) {
        int[] input = Arrays.stream(inputStr.split(" ")).mapToInt(Integer::valueOf).toArray();
        Solution s = new Solution();
        assertEquals(resLength, s.findLHS(input));
    }
}