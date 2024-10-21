import java.util.HashSet;
import java.util.Set;

public class Solution2 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode nodeA = headA;
        ListNode nodeB = headB;
        int lenA = 0, lenB = 0, maxLength = 0;

        while (nodeA.next != null || nodeB.next != null) {

            if (nodeA.next != null) {
                nodeA = nodeA.next;
                lenA++;
            }
            if (nodeB.next != null) {
                nodeB = nodeB.next;
                lenB++;
            }
            maxLength++;
        }
        int diff = Math.abs(lenA - lenB);

        ListNode longerNode = (lenA > lenB) ? headA : headB;
        ListNode shorterNode = (lenA > lenB) ? headB : headA;

        for (int i = 0; i <= maxLength; i++) {
            if (longerNode == shorterNode) {
                return longerNode;
            }
            longerNode = longerNode.next;
            if (i >= diff) {
                shorterNode = shorterNode.next;
            }
        }

        return null;
    }
}