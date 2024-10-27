package firstUniqueCharacterInaString_387;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstUniqueCharacterInAStringSolutionTest {
    @ParameterizedTest
    @CsvSource(
            {"0, leetcode",
             "2, loveleetcode",
             "-1, aabb"})
    public void testUniqueCharacter(int position, String str) {
        FirstUniqueCharacterInAStringSolution s = new FirstUniqueCharacterInAStringSolution();
        assertEquals(position, s.firstUniqueChar(str));
    }

}