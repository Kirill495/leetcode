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
            if (nodeA != null) {
                readNodes.add(nodeA);
                nodeA = nodeA.next;
            }
            if (nodeB != null) {
                readNodes.add(nodeB);
                nodeB = nodeB.next;
            }
        }
        return null;
    }
}