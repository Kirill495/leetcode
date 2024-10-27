package LongestPalindrome_409;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @ParameterizedTest
    @CsvSource(value = {"abcccccdd, 7",
    "a, 1"})
    public void longestPalindromeTest(String str, int length) {
//        for (char i = 'A'; i < 'z'; i++) {
//            System.out.println(i + " : " + (int) i);
//        }
        Solution s = new Solution();
        assertEquals(length, s.longestPalindrome(str));

    }

}