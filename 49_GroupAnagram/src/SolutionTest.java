import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    @Test
    void testGroupAnagram_1() {
        Solution s = new Solution();
        String[] input = new String[]{"act", "pots", "tops", "cat", "stop", "hat"};
        List<List<String>> output = s.groupAnagram(input);
        assertEquals(3, output.size());
        List<List<String>> res = output.stream().sorted(Comparator.comparingInt(List::size)).toList();
        assertTrue(res.get(0).contains("hat"));

        assertTrue(res.get(1).contains("act"));
        assertTrue(res.get(1).contains("cat"));

        assertTrue(res.get(2).contains("stop"));
        assertTrue(res.get(2).contains("pots"));
        assertTrue(res.get(2).contains("tops"));
    }

    @Test
    void testGroupAnagram_2() {
        Solution s = new Solution();
        String[] input = new String[]{"x"};
        List<List<String>> output = s.groupAnagram(input);
        assertEquals(1, output.size());
        assertTrue(output.getFirst().contains("x"));
    }

    @Test
    void testGroupAnagram_3() {
        Solution s = new Solution();
        String[] input = new String[]{""};
        List<List<String>> output = s.groupAnagram(input);
        assertEquals(1, output.size());
        assertTrue(output.getFirst().contains(""));
    }
}