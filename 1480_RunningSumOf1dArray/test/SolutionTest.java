import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

	@Test
	public void testShouldSumArrayValues() {
		Solution solution = new Solution();
		int[] input  = {1, 2, 3, 4, 5, 6};
		int[] output = {1, 3, 6, 10, 15, 21};
		int[] result = solution.runningSum(input);
		assertArrayEquals(output, result);
	}
}