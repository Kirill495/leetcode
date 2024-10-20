import listNode.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    Solution solution = new Solution();
    @Test
    public void listHasCycle() {
        ListNode node1 = new ListNode(0);
        node1.next = new ListNode(1);
        node1.next.next = new ListNode(2);
        node1.next.next.next = node1;

        assertTrue(solution.HasCycle(node1));
    }
}