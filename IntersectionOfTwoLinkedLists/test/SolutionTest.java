import org.junit.Test;
import org.junit.platform.engine.support.hierarchical.Node;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void checkIntersection() {
        int[] sourceA = new int[]{4, 1, 8, 4, 5};
        int[] sourceB = new int[]{5, 6, 1, 8, 4, 5};
        Map<String, ListNode> lists = generateNodes(sourceA, sourceB, 2, 3);
        Solution2 s = new Solution2();
        assertNotNull(s.getIntersectionNode(lists.get("headA"), lists.get("headB")));
    }

    @Test
    public void checkIntersection2() {
        int[] sourceA = new int[]{2, 6, 4};
        int[] sourceB = new int[]{1, 5};
        Map<String, ListNode> lists = generateNodes(sourceA, sourceB, 3, 2);
        Solution2 s = new Solution2();
        assertNull(s.getIntersectionNode(lists.get("headA"), lists.get("headB")));
    }

    private Map<String, ListNode> generateNodes(int[] sourceA, int[] sourceB, int skipA, int skipB) {

        ListNode headA = new ListNode(sourceA[0]);
        ListNode headB = new ListNode(sourceB[0]);
        ListNode nodeA = headA, nodeB = headB;
        ListNode commonNode = null;

        for (int i = 1; i < sourceA.length; i++) {
            nodeA.next = new ListNode(sourceA[i]);
            nodeA = nodeA.next;
            if (i == skipA) {
                commonNode = nodeA;
            }
        }

        for (int i = 1; i < skipB; i++) {
            nodeB.next = new ListNode(sourceB[i]);
            nodeB = nodeB.next;
        }
        nodeB.next = commonNode;

        return Map.of("headA", headA, "headB", headB);

    }
}