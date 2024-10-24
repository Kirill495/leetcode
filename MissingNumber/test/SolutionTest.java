import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void arrayMisses3(){
        Solution s = new Solution();
        assertEquals(2, s.missingNumber(new int[]{0, 1}));
        assertEquals(2, s.missingNumber(new int[]{3, 0, 1}));
        assertEquals(8, s.missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
    }
}