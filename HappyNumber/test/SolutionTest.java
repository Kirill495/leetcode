import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @ParameterizedTest
    @CsvSource({
            "2, false",
            "19,true"
    })
    public void testIsHappy(int value, boolean isHappy) {
        Solution s = new Solution();
        if (isHappy) {
            assertTrue(s.isHappy(value));
        } else {
            assertFalse(s.isHappy(value));
        }
    }
}