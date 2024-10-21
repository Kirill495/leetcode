import listNode.ListNode;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    private final Set<ListNode> readNodes = new HashSet<>();
    public boolean hasCycle(ListNode head) {
        ListNode currentNode = head;
        while (currentNode != null) {
            if (readNodes.contains(currentNode)) {
                return true;
            }
            readNodes.add(currentNode);
            currentNode = currentNode.next;
        }
        return false;
    }
}