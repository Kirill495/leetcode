import listNode.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution2Test {

    Solution2 s = new Solution2();
    @ParameterizedTest
    @CsvFileSource(files = "testsource/input.csv", delimiter = ';')
    public void listsAreCycled(String headStr, int pos, boolean isCycled) {
        int[] head = Arrays.stream(headStr.split(",")).mapToInt(Integer::valueOf).toArray();
        ListNode node = prepareList(head, pos);
        if (isCycled) {
            assertTrue(s.hasCycle(node));
        } else {
            assertFalse(s.hasCycle(node));
        }
    }

    private ListNode prepareList(int[] head, int pos) {

        ListNode cycledNode = null, headNode = null, newNode = null, prevNode = null;

        for (int i = 0; i < head.length; i++) {
            newNode = new ListNode(head[i]);

            if (i == pos) {
                cycledNode = newNode;
            }
            if (i == 0) {
                headNode = newNode;
            } else {
                if (prevNode != null) {
                    prevNode.next = newNode;
                }
            }
            prevNode = newNode;
        }
        if (cycledNode != null) {
            newNode.next = cycledNode;
        }
        return headNode;
    }

}