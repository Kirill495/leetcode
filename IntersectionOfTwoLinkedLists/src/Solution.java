import java.util.HashSet;
import java.util.Set;

public class Solution {
    private final Set<ListNode> readNodes = new HashSet<>();

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        readNodes.clear();
        ListNode nodeA = headA, nodeB = headB;
        while (nodeA != null || nodeB != null) {
            if ((nodeA == nodeB) || readNodes.contains(nodeA)) {
                return nodeA;
            } else if (readNodes.contains(nodeB)) {
                return nodeB;
            }
            readNodes.add(nodeA);
            readNodes.add(nodeB);
            if (nodeA != null) {
                nodeA = nodeA.next;
            }
            if (nodeB != null) {
                nodeB = nodeB.next;
            }
        }
        return null;
    }
}