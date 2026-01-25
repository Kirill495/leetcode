import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    @ParameterizedTest
    @CsvSource({"10, '1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz'",
            "15, '1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz'"})
    public void testSolution(int number, String resultString) {
        String[] result = resultString.split(" ");
        assertArrayEquals(result, new Solution().fizzBuzz(number).toArray(new String[0]));
    }

    @ParameterizedTest
    @CsvSource({"10, '1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz'",
            "15, '1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz'"})
    public void testSolution0(int number, String resultString) {
        String[] result = resultString.split(" ");
        assertArrayEquals(result, new Solution().fizzBuzz0(number).toArray(new String[0]));
    }

}