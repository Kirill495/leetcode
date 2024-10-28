package DistributeCandies_575;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void testCandies1() {
        int[] candyType = new int[] {1,1,2,2,3,3};
        Solution s = new Solution();
        assertEquals(3, s.distributeCandies(candyType));
    }
    @ParameterizedTest
    @CsvSource({"1 1 2 3, 2",
            "1 1 2 3, 2",
            "6 6 6 6, 1"})
    public void testCandies2(String input, int output) {
        int[] numInput = Arrays.stream(input.split(" "))
                .mapToInt(Integer::valueOf)
                .toArray();
        Solution s = new Solution();
        assertEquals(output, s.distributeCandies(numInput));

    }

}