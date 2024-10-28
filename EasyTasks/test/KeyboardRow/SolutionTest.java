package KeyboardRow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        String[] input = new String[] {"Hello", "Alaska", "Dad", "Peace"};
        String[] output = new String[]{"Alaska", "Dad"};
        assertArrayEquals(output, s.findWords(input));
    }

}