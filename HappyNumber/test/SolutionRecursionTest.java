import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionRecursionTest {

    @ParameterizedTest
    @CsvSource({
            "2, false",
            "19,true"
    })
    public void testIsHappy(int value, boolean isHappy) {
        SolutionRecursion s = new SolutionRecursion();
        if (isHappy) {
            assertTrue(s.isHappy(value));
        } else {
            assertFalse(s.isHappy(value));
        }
    }
}